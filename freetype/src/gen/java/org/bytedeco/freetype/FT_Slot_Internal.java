// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.freetype;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.freetype.global.freetype.*;



  /**************************************************************************
   *
   * \type:
   *   FT_Slot_Internal
   *
   * \description:
   *   An opaque handle to an {@code FT_Slot_InternalRec} structure, used to model
   *   private data of a given \FT_GlyphSlot object.
   */
  @Name("FT_Slot_InternalRec_") @Opaque @Properties(inherit = org.bytedeco.freetype.presets.freetype.class)
public class FT_Slot_Internal extends Pointer {
      /** Empty constructor. Calls {@code super((Pointer)null)}. */
      public FT_Slot_Internal() { super((Pointer)null); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public FT_Slot_Internal(Pointer p) { super(p); }
  }
