// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.freetype;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.freetype.global.freetype.*;



  /**************************************************************************
   *
   * \struct:
   *   FT_BBox
   *
   * \description:
   *   A structure used to hold an outline's bounding box, i.e., the
   *   coordinates of its extrema in the horizontal and vertical directions.
   *
   * \fields:
   *   xMin ::
   *     The horizontal minimum (left-most).
   *
   *   yMin ::
   *     The vertical minimum (bottom-most).
   *
   *   xMax ::
   *     The horizontal maximum (right-most).
   *
   *   yMax ::
   *     The vertical maximum (top-most).
   *
   * \note:
   *   The bounding box is specified with the coordinates of the lower left
   *   and the upper right corner.  In PostScript, those values are often
   *   called (llx,lly) and (urx,ury), respectively.
   *
   *   If {@code yMin} is negative, this value gives the glyph's descender.
   *   Otherwise, the glyph doesn't descend below the baseline.  Similarly,
   *   if {@code ymax} is positive, this value gives the glyph's ascender.
   *
   *   {@code xMin} gives the horizontal distance from the glyph's origin to the
   *   left edge of the glyph's bounding box.  If {@code xMin} is negative, the
   *   glyph extends to the left of the origin.
   */
  @Properties(inherit = org.bytedeco.freetype.presets.freetype.class)
public class FT_BBox extends Pointer {
      static { Loader.load(); }
      /** Default native constructor. */
      public FT_BBox() { super((Pointer)null); allocate(); }
      /** Native array allocator. Access with {@link Pointer#position(long)}. */
      public FT_BBox(long size) { super((Pointer)null); allocateArray(size); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public FT_BBox(Pointer p) { super(p); }
      private native void allocate();
      private native void allocateArray(long size);
      @Override public FT_BBox position(long position) {
          return (FT_BBox)super.position(position);
      }
  
    public native @Cast("FT_Pos") long xMin(); public native FT_BBox xMin(long setter);
    public native @Cast("FT_Pos") long yMin(); public native FT_BBox yMin(long setter);
    public native @Cast("FT_Pos") long xMax(); public native FT_BBox xMax(long setter);
    public native @Cast("FT_Pos") long yMax(); public native FT_BBox yMax(long setter);

  }