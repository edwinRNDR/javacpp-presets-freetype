// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.onnxruntime;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.onnxruntime.global.onnxruntime.*;


@Properties(inherit = org.bytedeco.onnxruntime.presets.onnxruntime.class)
public class OrtCustomOpApi extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public OrtCustomOpApi() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public OrtCustomOpApi(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public OrtCustomOpApi(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public OrtCustomOpApi position(long position) {
        return (OrtCustomOpApi)super.position(position);
    }

  /*
   * These allow reading node attributes during kernel creation
  */
  public static class KernelInfoGetAttribute_float_OrtKernelInfo_BytePointer_FloatPointer extends FunctionPointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public    KernelInfoGetAttribute_float_OrtKernelInfo_BytePointer_FloatPointer(Pointer p) { super(p); }
      protected KernelInfoGetAttribute_float_OrtKernelInfo_BytePointer_FloatPointer() { allocate(); }
      private native void allocate();
      public native OrtStatus call(@Const OrtKernelInfo info, @Cast("const char*") BytePointer name, FloatPointer out);
  }
  public native KernelInfoGetAttribute_float_OrtKernelInfo_BytePointer_FloatPointer KernelInfoGetAttribute_float(); public native OrtCustomOpApi KernelInfoGetAttribute_float(KernelInfoGetAttribute_float_OrtKernelInfo_BytePointer_FloatPointer setter);
  public static class KernelInfoGetAttribute_int64_OrtKernelInfo_BytePointer_LongPointer extends FunctionPointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public    KernelInfoGetAttribute_int64_OrtKernelInfo_BytePointer_LongPointer(Pointer p) { super(p); }
      protected KernelInfoGetAttribute_int64_OrtKernelInfo_BytePointer_LongPointer() { allocate(); }
      private native void allocate();
      public native OrtStatus call(@Const OrtKernelInfo info, @Cast("const char*") BytePointer name, @Cast("int64_t*") LongPointer out);
  }
  public native KernelInfoGetAttribute_int64_OrtKernelInfo_BytePointer_LongPointer KernelInfoGetAttribute_int64(); public native OrtCustomOpApi KernelInfoGetAttribute_int64(KernelInfoGetAttribute_int64_OrtKernelInfo_BytePointer_LongPointer setter);
  public static class KernelInfoGetAttribute_string_OrtKernelInfo_BytePointer_BytePointer_SizeTPointer extends FunctionPointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public    KernelInfoGetAttribute_string_OrtKernelInfo_BytePointer_BytePointer_SizeTPointer(Pointer p) { super(p); }
      protected KernelInfoGetAttribute_string_OrtKernelInfo_BytePointer_BytePointer_SizeTPointer() { allocate(); }
      private native void allocate();
      public native OrtStatus call(@Const OrtKernelInfo info, @Cast("const char*") BytePointer name, @Cast("char*") BytePointer out, @Cast("size_t*") SizeTPointer size);
  }
  public native KernelInfoGetAttribute_string_OrtKernelInfo_BytePointer_BytePointer_SizeTPointer KernelInfoGetAttribute_string(); public native OrtCustomOpApi KernelInfoGetAttribute_string(KernelInfoGetAttribute_string_OrtKernelInfo_BytePointer_BytePointer_SizeTPointer setter);

  public static class GetTensorTypeAndShape_OrtValue_PointerPointer extends FunctionPointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public    GetTensorTypeAndShape_OrtValue_PointerPointer(Pointer p) { super(p); }
      protected GetTensorTypeAndShape_OrtValue_PointerPointer() { allocate(); }
      private native void allocate();
      public native OrtStatus call(@Const OrtValue value, @Cast("OrtTensorTypeAndShapeInfo**") PointerPointer out);
  }
  public native GetTensorTypeAndShape_OrtValue_PointerPointer GetTensorTypeAndShape(); public native OrtCustomOpApi GetTensorTypeAndShape(GetTensorTypeAndShape_OrtValue_PointerPointer setter);

  public static class GetTensorShapeElementCount_OrtTensorTypeAndShapeInfo_SizeTPointer extends FunctionPointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public    GetTensorShapeElementCount_OrtTensorTypeAndShapeInfo_SizeTPointer(Pointer p) { super(p); }
      protected GetTensorShapeElementCount_OrtTensorTypeAndShapeInfo_SizeTPointer() { allocate(); }
      private native void allocate();
      public native OrtStatus call(@Const OrtTensorTypeAndShapeInfo info, @Cast("size_t*") SizeTPointer out);
  }
  public native GetTensorShapeElementCount_OrtTensorTypeAndShapeInfo_SizeTPointer GetTensorShapeElementCount(); public native OrtCustomOpApi GetTensorShapeElementCount(GetTensorShapeElementCount_OrtTensorTypeAndShapeInfo_SizeTPointer setter);
  public static class GetTensorElementType_OrtTensorTypeAndShapeInfo_IntPointer extends FunctionPointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public    GetTensorElementType_OrtTensorTypeAndShapeInfo_IntPointer(Pointer p) { super(p); }
      protected GetTensorElementType_OrtTensorTypeAndShapeInfo_IntPointer() { allocate(); }
      private native void allocate();
      public native OrtStatus call(@Const OrtTensorTypeAndShapeInfo arg0, @Cast("ONNXTensorElementDataType*") IntPointer out);
  }
  public native GetTensorElementType_OrtTensorTypeAndShapeInfo_IntPointer GetTensorElementType(); public native OrtCustomOpApi GetTensorElementType(GetTensorElementType_OrtTensorTypeAndShapeInfo_IntPointer setter);

  public static class GetDimensionCount_OrtTensorTypeAndShapeInfo_SizeTPointer extends FunctionPointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public    GetDimensionCount_OrtTensorTypeAndShapeInfo_SizeTPointer(Pointer p) { super(p); }
      protected GetDimensionCount_OrtTensorTypeAndShapeInfo_SizeTPointer() { allocate(); }
      private native void allocate();
      public native OrtStatus call(@Const OrtTensorTypeAndShapeInfo info, @Cast("size_t*") SizeTPointer out);
  }
  public native GetDimensionCount_OrtTensorTypeAndShapeInfo_SizeTPointer GetDimensionCount(); public native OrtCustomOpApi GetDimensionCount(GetDimensionCount_OrtTensorTypeAndShapeInfo_SizeTPointer setter);
  public static class GetDimensions_OrtTensorTypeAndShapeInfo_LongPointer_long extends FunctionPointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public    GetDimensions_OrtTensorTypeAndShapeInfo_LongPointer_long(Pointer p) { super(p); }
      protected GetDimensions_OrtTensorTypeAndShapeInfo_LongPointer_long() { allocate(); }
      private native void allocate();
      public native OrtStatus call(@Const OrtTensorTypeAndShapeInfo info, @Cast("int64_t*") LongPointer dim_values, @Cast("size_t") long dim_values_length);
  }
  public native GetDimensions_OrtTensorTypeAndShapeInfo_LongPointer_long GetDimensions(); public native OrtCustomOpApi GetDimensions(GetDimensions_OrtTensorTypeAndShapeInfo_LongPointer_long setter);
  public static class SetDimensions_OrtTensorTypeAndShapeInfo_LongPointer_long extends FunctionPointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public    SetDimensions_OrtTensorTypeAndShapeInfo_LongPointer_long(Pointer p) { super(p); }
      protected SetDimensions_OrtTensorTypeAndShapeInfo_LongPointer_long() { allocate(); }
      private native void allocate();
      public native OrtStatus call(OrtTensorTypeAndShapeInfo info, @Cast("const int64_t*") LongPointer dim_values, @Cast("size_t") long dim_count);
  }
  public native SetDimensions_OrtTensorTypeAndShapeInfo_LongPointer_long SetDimensions(); public native OrtCustomOpApi SetDimensions(SetDimensions_OrtTensorTypeAndShapeInfo_LongPointer_long setter);
  public static class GetTensorMutableData_OrtValue_PointerPointer extends FunctionPointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public    GetTensorMutableData_OrtValue_PointerPointer(Pointer p) { super(p); }
      protected GetTensorMutableData_OrtValue_PointerPointer() { allocate(); }
      private native void allocate();
      public native OrtStatus call(OrtValue value, @Cast("void**") PointerPointer data);
  }
  public native GetTensorMutableData_OrtValue_PointerPointer GetTensorMutableData(); public native OrtCustomOpApi GetTensorMutableData(GetTensorMutableData_OrtValue_PointerPointer setter);

  public static class ReleaseTensorTypeAndShapeInfo_OrtTensorTypeAndShapeInfo extends FunctionPointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public    ReleaseTensorTypeAndShapeInfo_OrtTensorTypeAndShapeInfo(Pointer p) { super(p); }
      protected ReleaseTensorTypeAndShapeInfo_OrtTensorTypeAndShapeInfo() { allocate(); }
      private native void allocate();
      public native void call(OrtTensorTypeAndShapeInfo input);
  }
  public native ReleaseTensorTypeAndShapeInfo_OrtTensorTypeAndShapeInfo ReleaseTensorTypeAndShapeInfo(); public native OrtCustomOpApi ReleaseTensorTypeAndShapeInfo(ReleaseTensorTypeAndShapeInfo_OrtTensorTypeAndShapeInfo setter);

  public static class KernelContext_GetInputCount_OrtKernelContext_SizeTPointer extends FunctionPointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public    KernelContext_GetInputCount_OrtKernelContext_SizeTPointer(Pointer p) { super(p); }
      protected KernelContext_GetInputCount_OrtKernelContext_SizeTPointer() { allocate(); }
      private native void allocate();
      public native OrtStatus call(@Const OrtKernelContext context, @Cast("size_t*") SizeTPointer out);
  }
  public native KernelContext_GetInputCount_OrtKernelContext_SizeTPointer KernelContext_GetInputCount(); public native OrtCustomOpApi KernelContext_GetInputCount(KernelContext_GetInputCount_OrtKernelContext_SizeTPointer setter);
  public static class KernelContext_GetInput_OrtKernelContext_long_PointerPointer extends FunctionPointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public    KernelContext_GetInput_OrtKernelContext_long_PointerPointer(Pointer p) { super(p); }
      protected KernelContext_GetInput_OrtKernelContext_long_PointerPointer() { allocate(); }
      private native void allocate();
      public native OrtStatus call(@Const OrtKernelContext context, @Cast("size_t") long index, @Cast("const OrtValue**") PointerPointer out);
  }
  public native KernelContext_GetInput_OrtKernelContext_long_PointerPointer KernelContext_GetInput(); public native OrtCustomOpApi KernelContext_GetInput(KernelContext_GetInput_OrtKernelContext_long_PointerPointer setter);
  public static class KernelContext_GetOutputCount_OrtKernelContext_SizeTPointer extends FunctionPointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public    KernelContext_GetOutputCount_OrtKernelContext_SizeTPointer(Pointer p) { super(p); }
      protected KernelContext_GetOutputCount_OrtKernelContext_SizeTPointer() { allocate(); }
      private native void allocate();
      public native OrtStatus call(@Const OrtKernelContext context, @Cast("size_t*") SizeTPointer out);
  }
  public native KernelContext_GetOutputCount_OrtKernelContext_SizeTPointer KernelContext_GetOutputCount(); public native OrtCustomOpApi KernelContext_GetOutputCount(KernelContext_GetOutputCount_OrtKernelContext_SizeTPointer setter);
  public static class KernelContext_GetOutput_OrtKernelContext_long_LongPointer_long_PointerPointer extends FunctionPointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public    KernelContext_GetOutput_OrtKernelContext_long_LongPointer_long_PointerPointer(Pointer p) { super(p); }
      protected KernelContext_GetOutput_OrtKernelContext_long_LongPointer_long_PointerPointer() { allocate(); }
      private native void allocate();
      public native OrtStatus call(OrtKernelContext context, @Cast("size_t") long index, @Cast("const int64_t*") LongPointer dim_values, @Cast("size_t") long dim_count, @Cast("OrtValue**") PointerPointer out);
  }
  public native KernelContext_GetOutput_OrtKernelContext_long_LongPointer_long_PointerPointer KernelContext_GetOutput(); public native OrtCustomOpApi KernelContext_GetOutput(KernelContext_GetOutput_OrtKernelContext_long_LongPointer_long_PointerPointer setter);
}
