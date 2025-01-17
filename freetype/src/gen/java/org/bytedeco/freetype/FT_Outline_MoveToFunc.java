// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.freetype;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.freetype.global.freetype.*;



  /**************************************************************************
   *
   * \functype:
   *   FT_Outline_MoveToFunc
   *
   * \description:
   *   A function pointer type used to describe the signature of a 'move to'
   *   function during outline walking/decomposition.
   *
   *   A 'move to' is emitted to start a new contour in an outline.
   *
   * \input:
   *   to ::
   *     A pointer to the target point of the 'move to'.
   *
   *   user ::
   *     A typeless pointer, which is passed from the caller of the
   *     decomposition function.
   *
   * @return :
   *   Error code.  0~means success.
   */
  @Properties(inherit = org.bytedeco.freetype.presets.freetype.class)
public class FT_Outline_MoveToFunc extends FunctionPointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public    FT_Outline_MoveToFunc(Pointer p) { super(p); }
      protected FT_Outline_MoveToFunc() { allocate(); }
      private native void allocate();
      public native int call( @Const FT_Vector to,
                              Pointer user );
  }
