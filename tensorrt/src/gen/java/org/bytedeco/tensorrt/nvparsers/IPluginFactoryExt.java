// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorrt.nvparsers;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;
import org.bytedeco.tensorrt.nvinfer.*;
import static org.bytedeco.tensorrt.global.nvinfer.*;

import static org.bytedeco.tensorrt.global.nvparsers.*;


/**
 *  \class IPluginFactoryExt
 * 
 *  \brief Plugin factory used to configure plugins with added support for TRT versioning.
 *  */
@Namespace("nvcaffeparser1") @Properties(inherit = org.bytedeco.tensorrt.presets.nvparsers.class)
public class IPluginFactoryExt extends IPluginFactory {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IPluginFactoryExt(Pointer p) { super(p); }

    
    
    //!
    //!
    //!
    public native int getVersion();

    /**
     *  \brief A user implemented function that determines if a layer configuration is provided by an IPluginExt.
     * 
     *  @param layerName Name of the layer which the user wishes to validate.
     *  */
    public native @Cast("bool") boolean isPluginExt(String layerName);
    public native @Cast("bool") boolean isPluginExt(@Cast("const char*") BytePointer layerName);
}
