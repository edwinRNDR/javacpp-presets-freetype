// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.onnx;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.onnx.global.onnx.*;

// -------------------------------------------------------------------

@Namespace("onnx") @NoOffset @Properties(inherit = org.bytedeco.onnx.presets.onnx.class)
public class TypeProto_Map extends MessageLite {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TypeProto_Map(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public TypeProto_Map(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public TypeProto_Map position(long position) {
        return (TypeProto_Map)super.position(position);
    }

  public TypeProto_Map() { super((Pointer)null); allocate(); }
  private native void allocate();

  public TypeProto_Map(@Const @ByRef TypeProto_Map from) { super((Pointer)null); allocate(from); }
  private native void allocate(@Const @ByRef TypeProto_Map from);

  public native @ByRef @Name("operator =") TypeProto_Map put(@Const @ByRef TypeProto_Map from);
//   #if LANG_CXX11
//   #endif
  public native @Const @ByRef UnknownFieldSet unknown_fields();
  public native UnknownFieldSet mutable_unknown_fields();

  public static native @Cast("const google::protobuf::Descriptor*") Pointer descriptor();
  public static native @Const @ByRef TypeProto_Map default_instance();

  public static native void InitAsDefaultInstance();  // FOR INTERNAL USE ONLY
  public static native @Const TypeProto_Map internal_default_instance();
  @MemberGetter public static native int kIndexInFileMessages();
  public static final int kIndexInFileMessages = kIndexInFileMessages();

  public native void Swap(TypeProto_Map other);
  

  // implements Message ----------------------------------------------

  public native TypeProto_Map New();

  public native TypeProto_Map New(Arena arena);
  public native void CopyFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void MergeFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void CopyFrom(@Const @ByRef TypeProto_Map from);
  public native void MergeFrom(@Const @ByRef TypeProto_Map from);
  public native void Clear();
  public native @Cast("bool") boolean IsInitialized();

  public native @Cast("size_t") long ByteSizeLong();
//   #if GOOGLE_PROTOBUF_ENABLE_EXPERIMENTAL_PARSER
//   #else
  public native @Cast("bool") boolean MergePartialFromCodedStream(
        CodedInputStream input);
//   #endif  // GOOGLE_PROTOBUF_ENABLE_EXPERIMENTAL_PARSER
  public native void SerializeWithCachedSizes(
        CodedOutputStream output);
  public native @Cast("google::protobuf::uint8*") BytePointer InternalSerializeWithCachedSizesToArray(
        @Cast("google::protobuf::uint8*") BytePointer target);
  public native @Cast("google::protobuf::uint8*") ByteBuffer InternalSerializeWithCachedSizesToArray(
        @Cast("google::protobuf::uint8*") ByteBuffer target);
  public native @Cast("google::protobuf::uint8*") byte[] InternalSerializeWithCachedSizesToArray(
        @Cast("google::protobuf::uint8*") byte[] target);
  public native int GetCachedSize();

  public native @ByVal @Cast("google::protobuf::Metadata*") Pointer GetMetadata();

  // nested types ----------------------------------------------------

  // accessors -------------------------------------------------------

  // optional .onnx.TypeProto value_type = 2;
  public native @Cast("bool") boolean has_value_type();
  public native void clear_value_type();
  @MemberGetter public static native int kValueTypeFieldNumber();
  public static final int kValueTypeFieldNumber = kValueTypeFieldNumber();
  public native @Const @ByRef TypeProto value_type();
  public native TypeProto release_value_type();
  public native TypeProto mutable_value_type();
  public native void set_allocated_value_type(TypeProto value_type);

  // optional int32 key_type = 1;
  public native @Cast("bool") boolean has_key_type();
  public native void clear_key_type();
  @MemberGetter public static native int kKeyTypeFieldNumber();
  public static final int kKeyTypeFieldNumber = kKeyTypeFieldNumber();
  public native @Cast("google::protobuf::int32") int key_type();
  public native void set_key_type(@Cast("google::protobuf::int32") int value);
}
