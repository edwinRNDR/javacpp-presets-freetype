// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.freetype;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.freetype.global.freetype.*;



  /**************************************************************************
   *
   * \functype:
   *   FT_Alloc_Func
   *
   * \description:
   *   A function used to allocate {@code size} bytes from {@code memory}.
   *
   * \input:
   *   memory ::
   *     A handle to the source memory manager.
   *
   *   size ::
   *     The size in bytes to allocate.
   *
   * @return :
   *   Address of new memory block.  0~in case of failure.
   *
   */
  @Properties(inherit = org.bytedeco.freetype.presets.freetype.class)
public class FT_Alloc_Func extends FunctionPointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public    FT_Alloc_Func(Pointer p) { super(p); }
      protected FT_Alloc_Func() { allocate(); }
      private native void allocate();
      public native Pointer call( FT_Memory memory,
                      @Cast("unsigned int") int size );
  }