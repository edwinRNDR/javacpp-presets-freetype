// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.freetype;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.freetype.global.freetype.*;



  /**************************************************************************
   *
   * \struct:
   *   FT_StreamRec
   *
   * \description:
   *   A structure used to describe an input stream.
   *
   * \input:
   *   base ::
   *     For memory-based streams, this is the address of the first stream
   *     byte in memory.  This field should always be set to {@code NULL} for
   *     disk-based streams.
   *
   *   size ::
   *     The stream size in bytes.
   *
   *     In case of compressed streams where the size is unknown before
   *     actually doing the decompression, the value is set to 0x7FFFFFFF.
   *     (Note that this size value can occur for normal streams also; it is
   *     thus just a hint.)
   *
   *   pos ::
   *     The current position within the stream.
   *
   *   descriptor ::
   *     This field is a union that can hold an integer or a pointer.  It is
   *     used by stream implementations to store file descriptors or {@code FILE*}
   *     pointers.
   *
   *   pathname ::
   *     This field is completely ignored by FreeType.  However, it is often
   *     useful during debugging to use it to store the stream's filename
   *     (where available).
   *
   *   read ::
   *     The stream's input function.
   *
   *   close ::
   *     The stream's close function.
   *
   *   memory ::
   *     The memory manager to use to preload frames.  This is set internally
   *     by FreeType and shouldn't be touched by stream implementations.
   *
   *   cursor ::
   *     This field is set and used internally by FreeType when parsing
   *     frames.  In particular, the {@code FT_GET_XXX} macros use this instead of
   *     the {@code pos} field.
   *
   *   limit ::
   *     This field is set and used internally by FreeType when parsing
   *     frames.
   *
   */
  @Properties(inherit = org.bytedeco.freetype.presets.freetype.class)
public class FT_StreamRec extends Pointer {
      static { Loader.load(); }
      /** Default native constructor. */
      public FT_StreamRec() { super((Pointer)null); allocate(); }
      /** Native array allocator. Access with {@link Pointer#position(long)}. */
      public FT_StreamRec(long size) { super((Pointer)null); allocateArray(size); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public FT_StreamRec(Pointer p) { super(p); }
      private native void allocate();
      private native void allocateArray(long size);
      @Override public FT_StreamRec position(long position) {
          return (FT_StreamRec)super.position(position);
      }
  
    public native @Cast("unsigned char*") BytePointer base(); public native FT_StreamRec base(BytePointer setter);
    public native @Cast("unsigned long") long size(); public native FT_StreamRec size(long setter);
    public native @Cast("unsigned long") long pos(); public native FT_StreamRec pos(long setter);

    public native @ByRef FT_StreamDesc descriptor(); public native FT_StreamRec descriptor(FT_StreamDesc setter);
    public native @ByRef FT_StreamDesc pathname(); public native FT_StreamRec pathname(FT_StreamDesc setter);
    public native FT_Stream_IoFunc read(); public native FT_StreamRec read(FT_Stream_IoFunc setter);
    public native @Name("close") FT_Stream_CloseFunc _close(); public native FT_StreamRec _close(FT_Stream_CloseFunc setter);

    public native FT_Memory memory(); public native FT_StreamRec memory(FT_Memory setter);
    public native @Cast("unsigned char*") BytePointer cursor(); public native FT_StreamRec cursor(BytePointer setter);
    public native @Cast("unsigned char*") @Name("limit") BytePointer _limit(); public native FT_StreamRec _limit(BytePointer setter);

  }