// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.freetype;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.freetype.global.freetype.*;



  /**************************************************************************
   *
   * \struct:
   *   FT_MemoryRec
   *
   * \description:
   *   A structure used to describe a given memory manager to FreeType~2.
   *
   * \fields:
   *   user ::
   *     A generic typeless pointer for user data.
   *
   *   alloc ::
   *     A pointer type to an allocation function.
   *
   *   free ::
   *     A pointer type to an memory freeing function.
   *
   *   realloc ::
   *     A pointer type to a reallocation function.
   *
   */
  @Properties(inherit = org.bytedeco.freetype.presets.freetype.class)
public class FT_MemoryRec_ extends Pointer {
      static { Loader.load(); }
      /** Default native constructor. */
      public FT_MemoryRec_() { super((Pointer)null); allocate(); }
      /** Native array allocator. Access with {@link Pointer#position(long)}. */
      public FT_MemoryRec_(long size) { super((Pointer)null); allocateArray(size); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public FT_MemoryRec_(Pointer p) { super(p); }
      private native void allocate();
      private native void allocateArray(long size);
      @Override public FT_MemoryRec_ position(long position) {
          return (FT_MemoryRec_)super.position(position);
      }
  
    public native Pointer user(); public native FT_MemoryRec_ user(Pointer setter);
    public native FT_Alloc_Func alloc(); public native FT_MemoryRec_ alloc(FT_Alloc_Func setter);
    public native @Name("free") FT_Free_Func _free(); public native FT_MemoryRec_ _free(FT_Free_Func setter);
    public native FT_Realloc_Func realloc(); public native FT_MemoryRec_ realloc(FT_Realloc_Func setter);
  }