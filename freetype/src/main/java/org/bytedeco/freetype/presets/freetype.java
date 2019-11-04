/*
 * Copyright (C) 2019 Edwin Jakobs
 *
 * Licensed either under the Apache License, Version 2.0, or (at your option)
 * under the terms of the GNU General Public License as published by
 * the Free Software Foundation (subject to the "Classpath" exception),
 * either version 2, or any later version (collectively, the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *     http://www.gnu.org/licenses/
 *     http://www.gnu.org/software/classpath/license.html
 *
 * or as provided in the LICENSE.txt file that accompanied this code.
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.bytedeco.freetype.presets;

import java.util.List;
import org.bytedeco.javacpp.ClassProperties;
import org.bytedeco.javacpp.LoadEnabled;
import org.bytedeco.javacpp.Loader;
import org.bytedeco.javacpp.annotation.Platform;
import org.bytedeco.javacpp.annotation.Properties;
import org.bytedeco.javacpp.tools.Info;
import org.bytedeco.javacpp.tools.InfoMap;
import org.bytedeco.javacpp.tools.InfoMapper;

/**
 *
 * @author Edwin Jakobs
 */
@Properties(
        value = {
                @Platform(
                        value = {"linux-x86", "macosx-x86", "windows-x86"},
                        compiler = "cpp11",

                        include = {
                                "<ft2build.h>",
                                "<freetype/fttypes.h>",
                                "<freetype/ftsystem.h>",
                                "<freetype/ftimage.h>",
                                "<freetype/freetype.h>"

                        },
                        link = "freetype@2.10.1"
                ),
                @Platform(value = "windows", preload = {
                        "api-ms-win-crt-locale-l1-1-0", "api-ms-win-crt-string-l1-1-0", "api-ms-win-crt-stdio-l1-1-0", "api-ms-win-crt-math-l1-1-0",
                        "api-ms-win-crt-heap-l1-1-0", "api-ms-win-crt-runtime-l1-1-0", "api-ms-win-crt-convert-l1-1-0", "api-ms-win-crt-environment-l1-1-0",
                        "api-ms-win-crt-time-l1-1-0", "api-ms-win-crt-filesystem-l1-1-0", "api-ms-win-crt-utility-l1-1-0", "api-ms-win-crt-multibyte-l1-1-0",
                        "api-ms-win-core-string-l1-1-0", "api-ms-win-core-errorhandling-l1-1-0", "api-ms-win-core-timezone-l1-1-0", "api-ms-win-core-file-l1-1-0",
                        "api-ms-win-core-namedpipe-l1-1-0", "api-ms-win-core-handle-l1-1-0", "api-ms-win-core-file-l2-1-0", "api-ms-win-core-heap-l1-1-0",
                        "api-ms-win-core-libraryloader-l1-1-0", "api-ms-win-core-synch-l1-1-0", "api-ms-win-core-processthreads-l1-1-0",
                        "api-ms-win-core-processenvironment-l1-1-0", "api-ms-win-core-datetime-l1-1-0", "api-ms-win-core-localization-l1-2-0",
                        "api-ms-win-core-sysinfo-l1-1-0", "api-ms-win-core-synch-l1-2-0", "api-ms-win-core-console-l1-1-0", "api-ms-win-core-debug-l1-1-0",
                        "api-ms-win-core-rtlsupport-l1-1-0", "api-ms-win-core-processthreads-l1-1-1", "api-ms-win-core-file-l1-2-0", "api-ms-win-core-profile-l1-1-0",
                        "api-ms-win-core-memory-l1-1-0", "api-ms-win-core-util-l1-1-0", "api-ms-win-core-interlocked-l1-1-0", "ucrtbase",
                        "vcruntime140", "msvcp140", "concrt140"}),
                @Platform(value = "windows-x86", preloadpath = {"C:/Program Files (x86)/Microsoft Visual Studio 14.0/VC/redist/x86/Microsoft.VC140.CRT/",
                        "C:/Program Files (x86)/Windows Kits/10/Redist/ucrt/DLLs/x86/"}),
                @Platform(value = "windows-x86_64", preloadpath = {"C:/Program Files (x86)/Microsoft Visual Studio 14.0/VC/redist/x64/Microsoft.VC140.CRT/",
                        "C:/Program Files (x86)/Windows Kits/10/Redist/ucrt/DLLs/x64/"})
        },
        target = "org.bytedeco.freetype",
        global = "org.bytedeco.freetype.global.freetype"
)
public class freetype implements LoadEnabled, InfoMapper {
    static { Loader.checkVersion("org.bytedeco", "freetype"); }

    @Override public void init(ClassProperties properties) {
        String platform = properties.getProperty("platform");
        List<String> preloadpaths = properties.get("platform.preloadpath");

        String vcredistdir = System.getenv("VCToolsRedistDir");
        if (vcredistdir != null && vcredistdir.length() > 0) {
            switch (platform) {
                case "windows-x86":
                    preloadpaths.add(0, vcredistdir + "\\x86\\Microsoft.VC141.CRT");
                    break;
                case "windows-x86_64":
                    preloadpaths.add(0, vcredistdir + "\\x64\\Microsoft.VC141.CRT");
                    break;
                default:
                    // not Windows
            }
        }
    }

    public void map(InfoMap infoMap) {
        infoMap.put(new Info("FT_EXPORT").annotations());
        infoMap.put(new Info("FT_BEGIN_HEADER", "FT_END_HEADER").cppTypes().annotations());

        infoMap.put(new Info("FT_OUTLINE_CONTOURS_MAX", "FT_OUTLINE_POINTS_MAX").cppTypes().annotations());

        infoMap.put(new Info("FT_Outline_MoveTo_Func", "FT_Outline_LineTo_Func", "FT_Outline_ConicTo_Func", "FT_Outline_CubicTo_Func", "FT_Raster_Span_Func").skip());


        infoMap.put(new Info("FT_GLYPH_FORMAT_NONE").skip());
        infoMap.put(new Info("FT_GLYPH_FORMAT_COMPOSITE").skip());
        infoMap.put(new Info("FT_GLYPH_FORMAT_BITMAP").skip());
        infoMap.put(new Info("FT_GLYPH_FORMAT_OUTLINE").skip());
        infoMap.put(new Info("FT_GLYPH_FORMAT_PLOTTER").skip());

        infoMap.put(new Info("ft_glyph_format_none").skip());
        infoMap.put(new Info("ft_glyph_format_bitmap").skip());
        infoMap.put(new Info("ft_glyph_format_plotter").skip());
        infoMap.put(new Info("ft_glyph_format_composite").skip());
        infoMap.put(new Info("ft_glyph_format_outline").skip());

        infoMap.put(new Info("FT_ENCODING_NONE",
                "FT_ENCODING_MS_SYMBOL",
                "FT_ENCODING_UNICODE",
                "FT_ENCODING_SJIS",
                "FT_ENCODING_PRC",
                "FT_ENCODING_BIG5",
                "FT_ENCODING_WANSUNG",
                "FT_ENCODING_JOHAB",
                "FT_ENCODING_ADOBE_STANDARD",
                "FT_ENCODING_ADOBE_EXPERT",
                "FT_ENCODING_ADOBE_CUSTOM",
                "FT_ENCODING_ADOBE_LATIN_1",
                "FT_ENCODING_OLD_LATIN_2",
                "FT_ENCODING_APPLE_ROMAN").skip());

        infoMap.put(new Info("FT_Raster_New_Func").skip());
        infoMap.put(new Info("FT_Raster_Done_Func").skip());
        infoMap.put(new Info("FT_Raster_Reset_Func").skip());
        infoMap.put(new Info("FT_Raster_Set_Mode_Func").skip());
        infoMap.put(new Info("FT_Raster_Render_Func").skip());

        infoMap.put(new Info("FT_ENCODING_GB2312").skip());
        infoMap.put(new Info("FT_ENCODING_MS_SJIS").skip());
        infoMap.put(new Info("FT_ENCODING_MS_GB2312").skip());
        infoMap.put(new Info("FT_ENCODING_MS_BIG5").skip());
        infoMap.put(new Info("FT_ENCODING_MS_WANSUNG").skip());
        infoMap.put(new Info("FT_ENCODING_MS_JOHAB").skip());

        infoMap.put(new Info("ft_encoding_none").skip());
        infoMap.put(new Info("ft_encoding_unicode").skip());
        infoMap.put(new Info("ft_encoding_symbol").skip());
        infoMap.put(new Info("ft_encoding_latin_1").skip());
        infoMap.put(new Info("ft_encoding_latin_2").skip());
        infoMap.put(new Info("ft_encoding_sjis").skip());
        infoMap.put(new Info("ft_encoding_gb2312").skip());
        infoMap.put(new Info("ft_encoding_big5").skip());
        infoMap.put(new Info("ft_encoding_wansung").skip());
        infoMap.put(new Info("ft_encoding_johab").skip());
        infoMap.put(new Info("ft_encoding_adobe_standard").skip());
        infoMap.put(new Info("ft_encoding_adobe_expert").skip());
        infoMap.put(new Info("ft_encoding_adobe_custom").skip());
        infoMap.put(new Info("ft_encoding_apple_roman").skip());



        infoMap.put(new Info("FT_FaceRec_").pointerTypes("FT_Face"));
        infoMap.put(new Info("FT_Face").valueTypes("FT_Face").pointerTypes("@Cast(\"FT_Face*\") PointerPointer", "@ByPtrPtr FT_Face"));
        infoMap.put(new Info("FT_MemoryRec").pointerTypes("FT_Memory"));
        infoMap.put(new Info("FT_Memory").valueTypes("FT_Memory").pointerTypes("@Cast(\"FT_Memory*\") PointerPointer", "@ByPtrPtr FT_Memory"));
        infoMap.put(new Info("FT_RendererRec_").pointerTypes("FT_Renderer"));
        infoMap.put(new Info("FT_Renderer").valueTypes("FT_Renderer").pointerTypes("@Cast(\"FT_Renderer*\") PointerPointer", "@ByPtrPtr FT_Renderer"));
        infoMap.put(new Info("FT_ModuleRec_").pointerTypes("FT_Module"));
        infoMap.put(new Info("FT_Module").valueTypes("FT_Module").pointerTypes("@Cast(\"FT_Module*\") PointerPointer", "@ByPtrPtr FT_Module"));

        infoMap.put(new Info("FT_CharMapRec_").pointerTypes("FT_CharMap"));
        infoMap.put(new Info("FT_CharMap").valueTypes("FT_CharMap").pointerTypes("@Cast(\"FT_CharMap*\") PointerPointer", "@ByPtrPtr FT_CharMap"));

        infoMap.put(new Info("FT_DriverRec_").pointerTypes("FT_Driver"));
        infoMap.put(new Info("FT_Driver").valueTypes("FT_Driver").pointerTypes("@Cast(\"FT_Driver*\") PointerPointer", "@ByPtrPtr FT_Driver"));

        infoMap.put(new Info("FT_StreamRec_").pointerTypes("FT_Stream"));
        infoMap.put(new Info("FT_Stream").valueTypes("FT_Stream").pointerTypes("@Cast(\"FT_Stream*\") PointerPointer", "@ByPtrPtr FT_Stream"));

        infoMap.put(new Info("FT_ListNodeRec_").pointerTypes("FT_ListNode"));
        infoMap.put(new Info("FT_ListNode").valueTypes("FT_ListNode").pointerTypes("@Cast(\"FT_ListNode*\") PointerPointer", "@ByPtrPtr FT_ListNode"));

        infoMap.put(new Info("FT_Face_InternalRec_").pointerTypes("FT_Face_Internal"));
        infoMap.put(new Info("FT_Face_Internal").valueTypes("FT_Face_Internal").pointerTypes("@Cast(\"FTFace_Internal*\") PointerPointer", "@ByPtrPtr FT_Face_Internal"));

        infoMap.put(new Info("FT_GlyphSlotRec_").pointerTypes("FT_GlyphSlot"));
        infoMap.put(new Info("FT_GlyphSlot").valueTypes("FT_GlyphSlot").pointerTypes("@Cast(\"FT_GlyphSlot*\") PointerPointer", "@ByPtrPtr FT_GlyphSlot"));


        infoMap.put(new Info("FT_LibraryRec_").pointerTypes("FT_Library"));
        infoMap.put(new Info("FT_Library").valueTypes("FT_Library").pointerTypes("@Cast(\"FT_Library*\") PointerPointer", "@ByPtrPtr FT_Library"));

        infoMap.put(new Info("FT_SizeRec_").pointerTypes("FT_Size"));
        infoMap.put(new Info("FT_Size").valueTypes("FT_Size").pointerTypes("@Cast(\"FT_Size*\") PointerPointer", "@ByPtrPtr FT_Size"));

        infoMap.put(new Info("FT_SubGlyphRec_").pointerTypes("FT_SubGlyph"));
        infoMap.put(new Info("FT_SubGlyph").valueTypes("FT_SubGlyph").pointerTypes("@Cast(\"FT_SubGlyph*\") PointerPointer", "@ByPtrPtr FT_SubGlyph"));

        infoMap.put(new Info("FT_RasterRec_").pointerTypes("FT_Raster"));
        infoMap.put(new Info("FT_Raster").valueTypes("FT_Raster").pointerTypes("@Cast(\"FT_Raster*\") PointerPointer", "@ByPtrPtr FT_Raster"));

        infoMap.put(new Info("FT_Size_InternalRec_").pointerTypes("FT_Size_Internal"));
        infoMap.put(new Info("FT_Size_Internal").valueTypes("FT_Size_Internal").pointerTypes("@Cast(\"FT_Size_Internal*\") PointerPointer", "@ByPtrPtr FT_Size_Internal"));

        infoMap.put(new Info("FT_Slot_InternalRec_").pointerTypes("FT_Slot_Internal"));
        infoMap.put(new Info("FT_Slot_Internal").valueTypes("FT_Slot_Internal").pointerTypes("@Cast(\"FT_Slot_Internal*\") PointerPointer", "@ByPtrPtr FT_Slot_Internal"));

    }

}