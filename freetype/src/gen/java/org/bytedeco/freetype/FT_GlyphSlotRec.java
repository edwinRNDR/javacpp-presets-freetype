// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.freetype;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.freetype.global.freetype.*;



  /**************************************************************************
   *
   * \struct:
   *   FT_GlyphSlotRec
   *
   * \description:
   *   FreeType root glyph slot class structure.  A glyph slot is a container
   *   where individual glyphs can be loaded, be they in outline or bitmap
   *   format.
   *
   * \fields:
   *   library ::
   *     A handle to the FreeType library instance this slot belongs to.
   *
   *   face ::
   *     A handle to the parent face object.
   *
   *   next ::
   *     In some cases (like some font tools), several glyph slots per face
   *     object can be a good thing.  As this is rare, the glyph slots are
   *     listed through a direct, single-linked list using its {@code next} field.
   *
   *   glyph_index ::
   *     [Since 2.10] The glyph index passed as an argument to \FT_Load_Glyph
   *     while initializing the glyph slot.
   *
   *   generic ::
   *     A typeless pointer unused by the FreeType library or any of its
   *     drivers.  It can be used by client applications to link their own
   *     data to each glyph slot object.
   *
   *   metrics ::
   *     The metrics of the last loaded glyph in the slot.  The returned
   *     values depend on the last load flags (see the \FT_Load_Glyph API
   *     function) and can be expressed either in 26.6 fractional pixels or
   *     font units.
   *
   *     Note that even when the glyph image is transformed, the metrics are
   *     not.
   *
   *   linearHoriAdvance ::
   *     The advance width of the unhinted glyph.  Its value is expressed in
   *     16.16 fractional pixels, unless \FT_LOAD_LINEAR_DESIGN is set when
   *     loading the glyph.  This field can be important to perform correct
   *     WYSIWYG layout.  Only relevant for outline glyphs.
   *
   *   linearVertAdvance ::
   *     The advance height of the unhinted glyph.  Its value is expressed in
   *     16.16 fractional pixels, unless \FT_LOAD_LINEAR_DESIGN is set when
   *     loading the glyph.  This field can be important to perform correct
   *     WYSIWYG layout.  Only relevant for outline glyphs.
   *
   *   advance ::
   *     This shorthand is, depending on \FT_LOAD_IGNORE_TRANSFORM, the
   *     transformed (hinted) advance width for the glyph, in 26.6 fractional
   *     pixel format.  As specified with \FT_LOAD_VERTICAL_LAYOUT, it uses
   *     either the {@code horiAdvance} or the {@code vertAdvance} value of {@code metrics}
   *     field.
   *
   *   format ::
   *     This field indicates the format of the image contained in the glyph
   *     slot.  Typically \FT_GLYPH_FORMAT_BITMAP, \FT_GLYPH_FORMAT_OUTLINE,
   *     or \FT_GLYPH_FORMAT_COMPOSITE, but other values are possible.
   *
   *   bitmap ::
   *     This field is used as a bitmap descriptor.  Note that the address
   *     and content of the bitmap buffer can change between calls of
   *     \FT_Load_Glyph and a few other functions.
   *
   *   bitmap_left ::
   *     The bitmap's left bearing expressed in integer pixels.
   *
   *   bitmap_top ::
   *     The bitmap's top bearing expressed in integer pixels.  This is the
   *     distance from the baseline to the top-most glyph scanline, upwards
   *     y~coordinates being **positive**.
   *
   *   outline ::
   *     The outline descriptor for the current glyph image if its format is
   *     \FT_GLYPH_FORMAT_OUTLINE.  Once a glyph is loaded, {@code outline} can be
   *     transformed, distorted, emboldened, etc.  However, it must not be
   *     freed.
   *
   *     [Since 2.10.1] If \FT_LOAD_NO_SCALE is set, outline coordinates of
   *     OpenType variation fonts for a selected instance are internally
   *     handled as 26.6 fractional font units but returned as (rounded)
   *     integers, as expected.  To get unrounded font units, don't use
   *     \FT_LOAD_NO_SCALE but load the glyph with \FT_LOAD_NO_HINTING and
   *     scale it, using the font's {@code units_per_EM} value as the ppem.
   *
   *   num_subglyphs ::
   *     The number of subglyphs in a composite glyph.  This field is only
   *     valid for the composite glyph format that should normally only be
   *     loaded with the \FT_LOAD_NO_RECURSE flag.
   *
   *   subglyphs ::
   *     An array of subglyph descriptors for composite glyphs.  There are
   *     {@code num_subglyphs} elements in there.  Currently internal to FreeType.
   *
   *   control_data ::
   *     Certain font drivers can also return the control data for a given
   *     glyph image (e.g.  TrueType bytecode, Type~1 charstrings, etc.).
   *     This field is a pointer to such data; it is currently internal to
   *     FreeType.
   *
   *   control_len ::
   *     This is the length in bytes of the control data.  Currently internal
   *     to FreeType.
   *
   *   other ::
   *     Reserved.
   *
   *   lsb_delta ::
   *     The difference between hinted and unhinted left side bearing while
   *     auto-hinting is active.  Zero otherwise.
   *
   *   rsb_delta ::
   *     The difference between hinted and unhinted right side bearing while
   *     auto-hinting is active.  Zero otherwise.
   *
   * \note:
   *   If \FT_Load_Glyph is called with default flags (see \FT_LOAD_DEFAULT)
   *   the glyph image is loaded in the glyph slot in its native format
   *   (e.g., an outline glyph for TrueType and Type~1 formats).  [Since 2.9]
   *   The prospective bitmap metrics are calculated according to
   *   \FT_LOAD_TARGET_XXX and other flags even for the outline glyph, even
   *   if \FT_LOAD_RENDER is not set.
   *
   *   This image can later be converted into a bitmap by calling
   *   \FT_Render_Glyph.  This function searches the current renderer for the
   *   native image's format, then invokes it.
   *
   *   The renderer is in charge of transforming the native image through the
   *   slot's face transformation fields, then converting it into a bitmap
   *   that is returned in {@code slot->bitmap}.
   *
   *   Note that {@code slot->bitmap_left} and {@code slot->bitmap_top} are also used to
   *   specify the position of the bitmap relative to the current pen
   *   position (e.g., coordinates (0,0) on the baseline).  Of course,
   *   {@code slot->format} is also changed to \FT_GLYPH_FORMAT_BITMAP.
   *
   *   Here is a small pseudo code fragment that shows how to use {@code lsb_delta}
   *   and {@code rsb_delta} to do fractional positioning of glyphs:
   *
   *   <pre>{@code
   *     FT_GlyphSlot  slot     = face->glyph;
   *     FT_Pos        origin_x = 0;
   *
   *
   *     for all glyphs do
   *       <load glyph with `FT_Load_Glyph'>
   *
   *       FT_Outline_Translate( slot->outline, origin_x & 63, 0 );
   *
   *       <save glyph image, or render glyph, or ...>
   *
   *       <compute kern between current and next glyph
   *        and add it to `origin_x'>
   *
   *       origin_x += slot->advance.x;
   *       origin_x += slot->lsb_delta - slot->rsb_delta;
   *     endfor
   *   }</pre>
   *
   *   Here is another small pseudo code fragment that shows how to use
   *   {@code lsb_delta} and {@code rsb_delta} to improve integer positioning of glyphs:
   *
   *   <pre>{@code
   *     FT_GlyphSlot  slot           = face->glyph;
   *     FT_Pos        origin_x       = 0;
   *     FT_Pos        prev_rsb_delta = 0;
   *
   *
   *     for all glyphs do
   *       <compute kern between current and previous glyph
   *        and add it to `origin_x'>
   *
   *       <load glyph with `FT_Load_Glyph'>
   *
   *       if ( prev_rsb_delta - slot->lsb_delta >  32 )
   *         origin_x -= 64;
   *       else if ( prev_rsb_delta - slot->lsb_delta < -31 )
   *         origin_x += 64;
   *
   *       prev_rsb_delta = slot->rsb_delta;
   *
   *       <save glyph image, or render glyph, or ...>
   *
   *       origin_x += slot->advance.x;
   *     endfor
   *   }</pre>
   *
   *   If you use strong auto-hinting, you **must** apply these delta values!
   *   Otherwise you will experience far too large inter-glyph spacing at
   *   small rendering sizes in most cases.  Note that it doesn't harm to use
   *   the above code for other hinting modes also, since the delta values
   *   are zero then.
   */
  @Properties(inherit = org.bytedeco.freetype.presets.freetype.class)
public class FT_GlyphSlotRec extends Pointer {
      static { Loader.load(); }
      /** Default native constructor. */
      public FT_GlyphSlotRec() { super((Pointer)null); allocate(); }
      /** Native array allocator. Access with {@link Pointer#position(long)}. */
      public FT_GlyphSlotRec(long size) { super((Pointer)null); allocateArray(size); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public FT_GlyphSlotRec(Pointer p) { super(p); }
      private native void allocate();
      private native void allocateArray(long size);
      @Override public FT_GlyphSlotRec position(long position) {
          return (FT_GlyphSlotRec)super.position(position);
      }
  
    public native FT_Library library(); public native FT_GlyphSlotRec library(FT_Library setter);
    public native FT_Face face(); public native FT_GlyphSlotRec face(FT_Face setter);
    public native FT_GlyphSlot next(); public native FT_GlyphSlotRec next(FT_GlyphSlot setter);
    public native @Cast("FT_UInt") int glyph_index(); public native FT_GlyphSlotRec glyph_index(int setter); /* new in 2.10; was reserved previously */
    public native @ByRef FT_Generic generic(); public native FT_GlyphSlotRec generic(FT_Generic setter);

    public native @ByRef FT_Glyph_Metrics metrics(); public native FT_GlyphSlotRec metrics(FT_Glyph_Metrics setter);
    public native @Cast("FT_Fixed") long linearHoriAdvance(); public native FT_GlyphSlotRec linearHoriAdvance(long setter);
    public native @Cast("FT_Fixed") long linearVertAdvance(); public native FT_GlyphSlotRec linearVertAdvance(long setter);
    public native @ByRef FT_Vector advance(); public native FT_GlyphSlotRec advance(FT_Vector setter);

    public native @Cast("FT_Glyph_Format") int format(); public native FT_GlyphSlotRec format(int setter);

    public native @ByRef FT_Bitmap bitmap(); public native FT_GlyphSlotRec bitmap(FT_Bitmap setter);
    public native @Cast("FT_Int") int bitmap_left(); public native FT_GlyphSlotRec bitmap_left(int setter);
    public native @Cast("FT_Int") int bitmap_top(); public native FT_GlyphSlotRec bitmap_top(int setter);

    public native @ByRef FT_Outline outline(); public native FT_GlyphSlotRec outline(FT_Outline setter);

    public native @Cast("FT_UInt") int num_subglyphs(); public native FT_GlyphSlotRec num_subglyphs(int setter);
    public native FT_SubGlyph subglyphs(); public native FT_GlyphSlotRec subglyphs(FT_SubGlyph setter);

    public native Pointer control_data(); public native FT_GlyphSlotRec control_data(Pointer setter);
    public native long control_len(); public native FT_GlyphSlotRec control_len(long setter);

    public native @Cast("FT_Pos") long lsb_delta(); public native FT_GlyphSlotRec lsb_delta(long setter);
    public native @Cast("FT_Pos") long rsb_delta(); public native FT_GlyphSlotRec rsb_delta(long setter);

    public native Pointer other(); public native FT_GlyphSlotRec other(Pointer setter);

    public native FT_Slot_Internal internal(); public native FT_GlyphSlotRec internal(FT_Slot_Internal setter);

  }