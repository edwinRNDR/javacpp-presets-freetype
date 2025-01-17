// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.dnnl;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.dnnl.global.dnnl.*;

/** \endcond
 <p>
 *  Implements primitive descriptor and primitive for concat.
 * 
 *  Creates an out-of-place primitive descriptor for concatenation of \p n
 *  inputs by \p concat_dimension with resulting \p output_desc memory
 *  descriptor. \p output_desc can be NULL or specified with the
 *  #dnnl::memory::format_tag::any format kind--in this case, the appropriate memory
 *  format would be chosen automatically. */
@Namespace("dnnl") @Properties(inherit = org.bytedeco.dnnl.presets.dnnl.class)
public class concat extends primitive {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public concat(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public concat(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public concat position(long position) {
        return (concat)super.position(position);
    }

    public static class primitive_desc extends primitive_desc_base {
        static { Loader.load(); }
    
            
            
                public primitive_desc() { super((Pointer)null); allocate(); }
                private native void allocate();
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public primitive_desc(Pointer p) { super(p); }
        /** Native array allocator. Access with {@link Pointer#position(long)}. */
        public primitive_desc(long size) { super((Pointer)null); allocateArray(size); }
        private native void allocateArray(long size);
        @Override public primitive_desc position(long position) {
            return (primitive_desc)super.position(position);
        }
    

        public primitive_desc(@Const @ByRef memory.desc dst, int concat_dimension,
                        @StdVector memory.desc srcs, @Const @ByRef engine aengine,
                        @Const @ByRef(nullValue = "dnnl::primitive_attr()") primitive_attr aattr) { super((Pointer)null); allocate(dst, concat_dimension, srcs, aengine, aattr); }
        private native void allocate(@Const @ByRef memory.desc dst, int concat_dimension,
                        @StdVector memory.desc srcs, @Const @ByRef engine aengine,
                        @Const @ByRef(nullValue = "dnnl::primitive_attr()") primitive_attr aattr);
        public primitive_desc(@Const @ByRef memory.desc dst, int concat_dimension,
                        @StdVector memory.desc srcs, @Const @ByRef engine aengine) { super((Pointer)null); allocate(dst, concat_dimension, srcs, aengine); }
        private native void allocate(@Const @ByRef memory.desc dst, int concat_dimension,
                        @StdVector memory.desc srcs, @Const @ByRef engine aengine);

        public primitive_desc(int concat_dimension,
                        @StdVector memory.desc srcs, @Const @ByRef engine aengine,
                        @Const @ByRef(nullValue = "dnnl::primitive_attr()") primitive_attr aattr) { super((Pointer)null); allocate(concat_dimension, srcs, aengine, aattr); }
        private native void allocate(int concat_dimension,
                        @StdVector memory.desc srcs, @Const @ByRef engine aengine,
                        @Const @ByRef(nullValue = "dnnl::primitive_attr()") primitive_attr aattr);
        public primitive_desc(int concat_dimension,
                        @StdVector memory.desc srcs, @Const @ByRef engine aengine) { super((Pointer)null); allocate(concat_dimension, srcs, aengine); }
        private native void allocate(int concat_dimension,
                        @StdVector memory.desc srcs, @Const @ByRef engine aengine);

        /** Initializes a primitive descriptor for concat from a C primitive
         *  descriptor \p pd. */
        public primitive_desc(dnnl_primitive_desc pd) { super((Pointer)null); allocate(pd); }
        private native void allocate(dnnl_primitive_desc pd);

        /** Queries destination memory descriptor. */
        public native @ByVal memory.desc dst_desc();
    }

    public concat() { super((Pointer)null); allocate(); }
    private native void allocate();

    public concat(@Const @ByRef primitive_desc pd) { super((Pointer)null); allocate(pd); }
    private native void allocate(@Const @ByRef primitive_desc pd);
}
