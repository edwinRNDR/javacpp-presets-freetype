// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.freetype;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.freetype.global.freetype.*;



  /*************************************************************************/
  /*************************************************************************/
  /*                                                                       */
  /*                    L I S T   M A N A G E M E N T                      */
  /*                                                                       */
  /*************************************************************************/
  /*************************************************************************/


  /**************************************************************************
   *
   * \section:
   *   list_processing
   *
   */


  /**************************************************************************
   *
   * \type:
   *   FT_ListNode
   *
   * \description:
   *    Many elements and objects in FreeType are listed through an \FT_List
   *    record (see \FT_ListRec).  As its name suggests, an FT_ListNode is a
   *    handle to a single list element.
   */
  @Opaque @Properties(inherit = org.bytedeco.freetype.presets.freetype.class)
public class FT_ListNodeRec_ extends Pointer {
      /** Empty constructor. Calls {@code super((Pointer)null)}. */
      public FT_ListNodeRec_() { super((Pointer)null); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public FT_ListNodeRec_(Pointer p) { super(p); }
  }