// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.freetype;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.freetype.global.freetype.*;



  /**************************************************************************
   *
   * \struct:
   *   FT_CharMapRec
   *
   * \description:
   *   The base charmap structure.
   *
   * \fields:
   *   face ::
   *     A handle to the parent face object.
   *
   *   encoding ::
   *     An \FT_Encoding tag identifying the charmap.  Use this with
   *     \FT_Select_Charmap.
   *
   *   platform_id ::
   *     An ID number describing the platform for the following encoding ID.
   *     This comes directly from the TrueType specification and gets
   *     emulated for other formats.
   *
   *   encoding_id ::
   *     A platform-specific encoding number.  This also comes from the
   *     TrueType specification and gets emulated similarly.
   */
  @Properties(inherit = org.bytedeco.freetype.presets.freetype.class)
public class FT_CharMapRec extends Pointer {
      static { Loader.load(); }
      /** Default native constructor. */
      public FT_CharMapRec() { super((Pointer)null); allocate(); }
      /** Native array allocator. Access with {@link Pointer#position(long)}. */
      public FT_CharMapRec(long size) { super((Pointer)null); allocateArray(size); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public FT_CharMapRec(Pointer p) { super(p); }
      private native void allocate();
      private native void allocateArray(long size);
      @Override public FT_CharMapRec position(long position) {
          return (FT_CharMapRec)super.position(position);
      }
  
    public native FT_Face face(); public native FT_CharMapRec face(FT_Face setter);
    public native @Cast("FT_Encoding") int encoding(); public native FT_CharMapRec encoding(int setter);
    public native @Cast("FT_UShort") short platform_id(); public native FT_CharMapRec platform_id(short setter);
    public native @Cast("FT_UShort") short encoding_id(); public native FT_CharMapRec encoding_id(short setter);

  }