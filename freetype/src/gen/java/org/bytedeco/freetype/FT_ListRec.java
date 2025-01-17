// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.freetype;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.freetype.global.freetype.*;



  /**************************************************************************
   *
   * \struct:
   *   FT_ListRec
   *
   * \description:
   *   A structure used to hold a simple doubly-linked list.  These are used
   *   in many parts of FreeType.
   *
   * \fields:
   *   head ::
   *     The head (first element) of doubly-linked list.
   *
   *   tail ::
   *     The tail (last element) of doubly-linked list.
   */
  @Properties(inherit = org.bytedeco.freetype.presets.freetype.class)
public class FT_ListRec extends Pointer {
      static { Loader.load(); }
      /** Default native constructor. */
      public FT_ListRec() { super((Pointer)null); allocate(); }
      /** Native array allocator. Access with {@link Pointer#position(long)}. */
      public FT_ListRec(long size) { super((Pointer)null); allocateArray(size); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public FT_ListRec(Pointer p) { super(p); }
      private native void allocate();
      private native void allocateArray(long size);
      @Override public FT_ListRec position(long position) {
          return (FT_ListRec)super.position(position);
      }
  
    public native FT_ListNode head(); public native FT_ListRec head(FT_ListNode setter);
    public native FT_ListNode tail(); public native FT_ListRec tail(FT_ListNode setter);

  }
