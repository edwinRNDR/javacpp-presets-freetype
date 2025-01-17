// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorrt.nvinfer;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;

import static org.bytedeco.tensorrt.global.nvinfer.*;


/**
 *  \class DynamicPluginTensorDesc
 * 
 *  Summarizes tensors that a plugin might see for an input or output.
 *  */
@Namespace("nvinfer1") @Properties(inherit = org.bytedeco.tensorrt.presets.nvinfer.class)
public class DynamicPluginTensorDesc extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public DynamicPluginTensorDesc() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public DynamicPluginTensorDesc(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DynamicPluginTensorDesc(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public DynamicPluginTensorDesc position(long position) {
        return (DynamicPluginTensorDesc)super.position(position);
    }

    /** Information required to interpret a pointer to tensor data, except that desc.dims has -1 in place of any runtime dimension. */
    public native @ByRef PluginTensorDesc desc(); public native DynamicPluginTensorDesc desc(PluginTensorDesc setter);

    /** Lower bounds on tensor’s dimensions */
    public native @ByRef Dims min(); public native DynamicPluginTensorDesc min(Dims setter);

    /** Upper bounds on tensor’s dimensions */
    public native @ByRef Dims max(); public native DynamicPluginTensorDesc max(Dims setter);
}
