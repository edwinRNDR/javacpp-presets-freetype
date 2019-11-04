#!/bin/bash
# This file is meant to be included by the parent cppbuild.sh script
if [[ -z "$PLATFORM" ]]; then
    pushd ..
    bash cppbuild.sh "$@" freetype
    popd
    exit
fi

LIBFREETYPE_VERSION=2.10.1
download https://download.savannah.gnu.org/releases/freetype/freetype-$LIBFREETYPE_VERSION.tar.gz freetype-$LIBFREETYPE_VERSION.tar.gz
mkdir -p $PLATFORM
cd $PLATFORM
mkdir -p include lib bin
INSTALL_PATH=`pwd`
echo "Decompressing archives..."
tar --totals -xzf ../freetype-$LIBFREETYPE_VERSION.tar.gz

cd freetype-$LIBFREETYPE_VERSION

case $PLATFORM in
    linux-x86)
        cd ../freetype-$LIBFREETYPE_VERSION
        echo "we are now in `pwd`"
        CC="gcc -m32" CXX="g++ -m32"
        cmake -E make_directory build
        cmake -E chdir build cmake .. -DCMAKE_INSTALL_PREFIX="$INSTALL_PATH"
        cmake --build build
        cmake --build build --target install
        cd $INSTALL_PATH/include
        mv freetype2/* .
        cd -
        ;;
    linux-x86_64)
        cd ../freetype-$LIBFREETYPE_VERSION
        echo "we are now in `pwd`"
        CC="gcc -m64" CXX="g++ -m64"
        cmake -E make_directory build
        cmake -E chdir build cmake .. -DBUILD_SHARED_LIBS:BOOL=true -DCMAKE_INSTALL_PREFIX="$INSTALL_PATH"
        cmake --build build
        cmake --build build --target install
        cd $INSTALL_PATH/include
        mv freetype2/* .
        cd freetype
        echo "we are now in `pwd`"
        patch < ../../../../ftsystem.h.patch
        cd -
        cd -
        ;;
    *)
        echo "Error: Platform \"$PLATFORM\" is not supported"
        ;;
esac

cd ../..
