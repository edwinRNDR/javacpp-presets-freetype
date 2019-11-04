import org.bytedeco.javacpp.*;
import org.bytedeco.freetype.*;
class Demo {
    public static void main(String[] args) {

        FT_Library lib;
        int result = FT_Init_FreeType(lib);
        System.out.println(result);
    }
}