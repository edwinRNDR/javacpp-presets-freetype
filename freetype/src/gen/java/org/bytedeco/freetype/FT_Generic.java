// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.freetype;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.freetype.global.freetype.*;



  /**************************************************************************
   *
   * \struct:
   *   FT_Generic
   *
   * \description:
   *   Client applications often need to associate their own data to a
   *   variety of FreeType core objects.  For example, a text layout API
   *   might want to associate a glyph cache to a given size object.
   *
   *   Some FreeType object contains a {@code generic} field, of type {@code FT_Generic},
   *   which usage is left to client applications and font servers.
   *
   *   It can be used to store a pointer to client-specific data, as well as
   *   the address of a 'finalizer' function, which will be called by
   *   FreeType when the object is destroyed (for example, the previous
   *   client example would put the address of the glyph cache destructor in
   *   the {@code finalizer} field).
   *
   * \fields:
   *   data ::
   *     A typeless pointer to any client-specified data. This field is
   *     completely ignored by the FreeType library.
   *
   *   finalizer ::
   *     A pointer to a 'generic finalizer' function, which will be called
   *     when the object is destroyed.  If this field is set to {@code NULL}, no
   *     code will be called.
   */
  @Properties(inherit = org.bytedeco.freetype.presets.freetype.class)
public class FT_Generic extends Pointer {
      static { Loader.load(); }
      /** Default native constructor. */
      public FT_Generic() { super((Pointer)null); allocate(); }
      /** Native array allocator. Access with {@link Pointer#position(long)}. */
      public FT_Generic(long size) { super((Pointer)null); allocateArray(size); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public FT_Generic(Pointer p) { super(p); }
      private native void allocate();
      private native void allocateArray(long size);
      @Override public FT_Generic position(long position) {
          return (FT_Generic)super.position(position);
      }
  
    public native Pointer data(); public native FT_Generic data(Pointer setter);
    public native FT_Generic_Finalizer finalizer(); public native FT_Generic finalizer(FT_Generic_Finalizer setter);

  }
