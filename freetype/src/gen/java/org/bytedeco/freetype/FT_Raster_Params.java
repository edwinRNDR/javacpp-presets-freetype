// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.freetype;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.freetype.global.freetype.*;



  /**************************************************************************
   *
   * \struct:
   *   FT_Raster_Params
   *
   * \description:
   *   A structure to hold the parameters used by a raster's render function,
   *   passed as an argument to \FT_Outline_Render.
   *
   * \fields:
   *   target ::
   *     The target bitmap.
   *
   *   source ::
   *     A pointer to the source glyph image (e.g., an \FT_Outline).
   *
   *   flags ::
   *     The rendering flags.
   *
   *   gray_spans ::
   *     The gray span drawing callback.
   *
   *   black_spans ::
   *     Unused.
   *
   *   bit_test ::
   *     Unused.
   *
   *   bit_set ::
   *     Unused.
   *
   *   user ::
   *     User-supplied data that is passed to each drawing callback.
   *
   *   clip_box ::
   *     An optional clipping box.  It is only used in direct rendering mode.
   *     Note that coordinates here should be expressed in _integer_ pixels
   *     (and not in 26.6 fixed-point units).
   *
   * \note:
   *   An anti-aliased glyph bitmap is drawn if the \FT_RASTER_FLAG_AA bit
   *   flag is set in the {@code flags} field, otherwise a monochrome bitmap is
   *   generated.
   *
   *   If the \FT_RASTER_FLAG_DIRECT bit flag is set in {@code flags}, the raster
   *   will call the {@code gray_spans} callback to draw gray pixel spans.  This
   *   allows direct composition over a pre-existing bitmap through
   *   user-provided callbacks to perform the span drawing and composition.
   *   Not supported by the monochrome rasterizer.
   */
  @Properties(inherit = org.bytedeco.freetype.presets.freetype.class)
public class FT_Raster_Params extends Pointer {
      static { Loader.load(); }
      /** Default native constructor. */
      public FT_Raster_Params() { super((Pointer)null); allocate(); }
      /** Native array allocator. Access with {@link Pointer#position(long)}. */
      public FT_Raster_Params(long size) { super((Pointer)null); allocateArray(size); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public FT_Raster_Params(Pointer p) { super(p); }
      private native void allocate();
      private native void allocateArray(long size);
      @Override public FT_Raster_Params position(long position) {
          return (FT_Raster_Params)super.position(position);
      }
  
    public native @Const FT_Bitmap target(); public native FT_Raster_Params target(FT_Bitmap setter);
    public native @Const Pointer source(); public native FT_Raster_Params source(Pointer setter);
    public native int flags(); public native FT_Raster_Params flags(int setter);
    public native FT_SpanFunc gray_spans(); public native FT_Raster_Params gray_spans(FT_SpanFunc setter);
    public native FT_SpanFunc black_spans(); public native FT_Raster_Params black_spans(FT_SpanFunc setter);  /* unused */
    public native FT_Raster_BitTest_Func bit_test(); public native FT_Raster_Params bit_test(FT_Raster_BitTest_Func setter);     /* unused */
    public native FT_Raster_BitSet_Func bit_set(); public native FT_Raster_Params bit_set(FT_Raster_BitSet_Func setter);      /* unused */
    public native Pointer user(); public native FT_Raster_Params user(Pointer setter);
    public native @ByRef FT_BBox clip_box(); public native FT_Raster_Params clip_box(FT_BBox setter);

  }