// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.freetype;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.freetype.global.freetype.*;



  /**************************************************************************
   *
   * \functype:
   *   FT_Raster_ResetFunc
   *
   * \description:
   *   FreeType used to provide an area of memory called the 'render pool'
   *   available to all registered rasterizers.  This was not thread safe,
   *   however, and now FreeType never allocates this pool.
   *
   *   This function is called after a new raster object is created.
   *
   * \input:
   *   raster ::
   *     A handle to the new raster object.
   *
   *   pool_base ::
   *     Previously, the address in memory of the render pool.  Set this to
   *     {@code NULL}.
   *
   *   pool_size ::
   *     Previously, the size in bytes of the render pool.  Set this to 0.
   *
   * \note:
   *   Rasterizers should rely on dynamic or stack allocation if they want to
   *   (a handle to the memory allocator is passed to the rasterizer
   *   constructor).
   */
  @Properties(inherit = org.bytedeco.freetype.presets.freetype.class)
public class FT_Raster_ResetFunc extends FunctionPointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public    FT_Raster_ResetFunc(Pointer p) { super(p); }
      protected FT_Raster_ResetFunc() { allocate(); }
      private native void allocate();
      public native void call( FT_Raster raster,
                            @Cast("unsigned char*") BytePointer pool_base,
                            @Cast("unsigned long") long pool_size );
  }