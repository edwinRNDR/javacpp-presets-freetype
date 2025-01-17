// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.freetype;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.freetype.global.freetype.*;



  /**************************************************************************
   *
   * \struct:
   *   FT_Span
   *
   * \description:
   *   A structure used to model a single span of gray pixels when rendering
   *   an anti-aliased bitmap.
   *
   * \fields:
   *   x ::
   *     The span's horizontal start position.
   *
   *   len ::
   *     The span's length in pixels.
   *
   *   coverage ::
   *     The span color/coverage, ranging from 0 (background) to 255
   *     (foreground).
   *
   * \note:
   *   This structure is used by the span drawing callback type named
   *   \FT_SpanFunc that takes the y~coordinate of the span as a parameter.
   *
   *   The coverage value is always between 0 and 255.  If you want less gray
   *   values, the callback function has to reduce them.
   */
  @Properties(inherit = org.bytedeco.freetype.presets.freetype.class)
public class FT_Span extends Pointer {
      static { Loader.load(); }
      /** Default native constructor. */
      public FT_Span() { super((Pointer)null); allocate(); }
      /** Native array allocator. Access with {@link Pointer#position(long)}. */
      public FT_Span(long size) { super((Pointer)null); allocateArray(size); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public FT_Span(Pointer p) { super(p); }
      private native void allocate();
      private native void allocateArray(long size);
      @Override public FT_Span position(long position) {
          return (FT_Span)super.position(position);
      }
  
    public native short x(); public native FT_Span x(short setter);
    public native @Cast("unsigned short") short len(); public native FT_Span len(short setter);
    public native @Cast("unsigned char") byte coverage(); public native FT_Span coverage(byte setter);

  }
