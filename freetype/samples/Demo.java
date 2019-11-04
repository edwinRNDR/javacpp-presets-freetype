import org.bytedeco.javacpp.*;
import org.bytedeco.freetype.*;

import static org.bytedeco.freetype.global.freetype.*;

class Demo {
    public static void main(String[] args) {

        FT_Library lib = new FT_Library();
        int result = FT_Init_FreeType(lib);
        System.out.println(result);
        FT_Face face = new FT_Face();
        int faceResult = FT_New_Face(lib, "font.ttf", 0, face);
        System.out.println(faceResult);
        FT_FaceRec a = new FT_FaceRec(face);
        System.out.println(a.num_glyphs());

        Character g = 'A';

        int glyph_index = FT_Get_Char_Index( face,  (int)('A'));

        System.out.println("glyph index: " + glyph_index);
        FT_Load_Glyph(face, glyph_index, (int)FT_LOAD_NO_BITMAP | (int)FT_LOAD_NO_SCALE);

        FT_Outline_Funcs callbacks = new FT_Outline_Funcs();

        FT_Outline_LineToFunc lineToFunc = new FT_Outline_LineToFunc() {
            @Override
            public int call(FT_Vector to, Pointer user) {
                System.out.println("line to!" + to.x() + ", " + to.y());
                return 0;
            }
        };

        FT_Outline_MoveToFunc moveToFunc = new FT_Outline_MoveToFunc() {
            @Override
            public int call(FT_Vector to, Pointer user) {
                System.out.println("move to!" + to.x() + ", " + to.y());
                return 0;
            }
        };

        FT_Outline_ConicToFunc conicToFunc = new FT_Outline_ConicToFunc() {
            @Override
            public int call(FT_Vector control, FT_Vector to, Pointer user) {
                System.out.println("conic to!" + to.x() + ", " + to.y());
                return 0;
            }
        };

        FT_Outline_CubicToFunc cubicToFunc = new FT_Outline_CubicToFunc() {
            @Override
            public int call(FT_Vector control1, FT_Vector control2, FT_Vector to, Pointer user) {
                System.out.println("cubic to!" + to.x() + ", " + to.y());
                return 0;
            }
        };


        FT_GlyphSlotRec glyphSlotRec = new FT_GlyphSlotRec(a.glyph());
        System.out.println(glyphSlotRec);
        System.out.println(glyphSlotRec.face());
        System.out.println(face);
        System.out.println(glyphSlotRec.format());
        System.out.println("glyph index" + glyphSlotRec.glyph_index());
        FT_Outline outline = glyphSlotRec.outline();


        System.out.println("number of contours:" + outline.n_contours());

        callbacks.line_to(lineToFunc);
        callbacks.conic_to(conicToFunc);
        callbacks.cubic_to(cubicToFunc);
        callbacks.move_to(moveToFunc);
        int decompRes = FT_Outline_Decompose(outline, callbacks, null);
        System.out.println("decompres: " + decompRes);


    }
}