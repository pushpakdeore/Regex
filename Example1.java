package pushpak46Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example1 {
    public static void main(String[] args) {
        //1
        String regex = "a*b*";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher("aaaaaabbbb");
        boolean n =m.matches();
        System.out.println(n);

        //2
        boolean b =Pattern.matches("a*b*","ab");
        System.out.println(b);

        //3
        boolean b1= Pattern.compile(".*a").matcher("java").matches();
        System.out.println(b1);

    }
}
