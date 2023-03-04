
//remove numbers from string
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class question {
    public static void main(String[] args) {
        String str = "megh45a";
        str = str.replaceAll("[0-9]", "");
        System.out.println(str);

    }

}
