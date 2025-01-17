// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.freetype;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.freetype.global.freetype.*;



  /**************************************************************************
   *
   * \struct:
   *   FT_Data
   *
   * \description:
   *   Read-only binary data represented as a pointer and a length.
   *
   * \fields:
   *   pointer ::
   *     The data.
   *
   *   length ::
   *     The length of the data in bytes.
   */
  @Properties(inherit = org.bytedeco.freetype.presets.freetype.class)
public class FT_Data extends Pointer {
      static { Loader.load(); }
      /** Default native constructor. */
      public FT_Data() { super((Pointer)null); allocate(); }
      /** Native array allocator. Access with {@link Pointer#position(long)}. */
      public FT_Data(long size) { super((Pointer)null); allocateArray(size); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public FT_Data(Pointer p) { super(p); }
      private native void allocate();
      private native void allocateArray(long size);
      @Override public FT_Data position(long position) {
          return (FT_Data)super.position(position);
      }
  
    public native @Cast("const FT_Byte*") BytePointer pointer(); public native FT_Data pointer(BytePointer setter);
    public native @Cast("FT_Int") int length(); public native FT_Data length(int setter);

  }
