// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.onnx;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.onnx.global.onnx.*;

// -------------------------------------------------------------------

@Namespace("onnx") @NoOffset @Properties(inherit = org.bytedeco.onnx.presets.onnx.class)
public class StringStringEntryProto extends MessageLite {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public StringStringEntryProto(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public StringStringEntryProto(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public StringStringEntryProto position(long position) {
        return (StringStringEntryProto)super.position(position);
    }

  public StringStringEntryProto() { super((Pointer)null); allocate(); }
  private native void allocate();

  public StringStringEntryProto(@Const @ByRef StringStringEntryProto from) { super((Pointer)null); allocate(from); }
  private native void allocate(@Const @ByRef StringStringEntryProto from);

  public native @ByRef @Name("operator =") StringStringEntryProto put(@Const @ByRef StringStringEntryProto from);
//   #if LANG_CXX11
//   #endif
  public native @Const @ByRef UnknownFieldSet unknown_fields();
  public native UnknownFieldSet mutable_unknown_fields();

  public static native @Cast("const google::protobuf::Descriptor*") Pointer descriptor();
  public static native @Const @ByRef StringStringEntryProto default_instance();

  public static native void InitAsDefaultInstance();  // FOR INTERNAL USE ONLY
  public static native @Const StringStringEntryProto internal_default_instance();
  @MemberGetter public static native int kIndexInFileMessages();
  public static final int kIndexInFileMessages = kIndexInFileMessages();

  public native void Swap(StringStringEntryProto other);
  

  // implements Message ----------------------------------------------

  public native StringStringEntryProto New();

  public native StringStringEntryProto New(Arena arena);
  public native void CopyFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void MergeFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void CopyFrom(@Const @ByRef StringStringEntryProto from);
  public native void MergeFrom(@Const @ByRef StringStringEntryProto from);
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

  // optional string key = 1;
  public native @Cast("bool") boolean has_key();
  public native void clear_key();
  @MemberGetter public static native int kKeyFieldNumber();
  public static final int kKeyFieldNumber = kKeyFieldNumber();
  public native @StdString BytePointer key();
  public native void set_key(@StdString BytePointer value);
  public native void set_key(@StdString String value);
//   #if LANG_CXX11
//   #endif
  public native void set_key(@Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void set_key(String value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_key();
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer release_key();
  public native void set_allocated_key(@StdString @Cast({"char*", "std::string*"}) BytePointer key);

  // optional string value = 2;
  public native @Cast("bool") boolean has_value();
  public native void clear_value();
  @MemberGetter public static native int kValueFieldNumber();
  public static final int kValueFieldNumber = kValueFieldNumber();
  public native @StdString BytePointer value();
  public native void set_value(@StdString BytePointer value);
  public native void set_value(@StdString String value);
//   #if LANG_CXX11
//   #endif
  public native void set_value(@Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void set_value(String value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_value();
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer release_value();
  public native void set_allocated_value(@StdString @Cast({"char*", "std::string*"}) BytePointer value);
}
