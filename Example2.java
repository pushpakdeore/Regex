package pushpak46Regex;
//create regular expression accept only alphanumeric character only.

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example2 {
    public  static  void checkStringAgainRE(String re,String str){
        Pattern p= Pattern.compile(re);
        Matcher matcher = p.matcher(str);
        boolean m  = matcher.matches();
        System.out.println(m);
    }
    public static void main(String[] args) {
       while (true){
           System.out.print("Enter RE :");
           Scanner sc = new Scanner(System.in);
           String re = sc.nextLine();
           System.out.print("Enter your String :");
           String str = sc.nextLine();
           checkStringAgainRE(re , str);
           System.out.println("Want to exit[Y/N] : ");
           String choise = sc.nextLine();
           if (choise.equalsIgnoreCase( "y")){
               System.out.println("Exit .");
               break;
           }
       }

    }
}
