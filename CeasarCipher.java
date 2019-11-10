
import java.lang.*;
import java.util.*;
import java.time.*;
import java.util.regex.*;
public class CeasarCipher {
     
    public static void main(String[] arg) throws InterruptedException {
        try {
            //Time Method
                LocalDate date = LocalDate.now();
                LocalTime time = LocalTime.now();
                System.out.println("Date: " + date);
                System.out.println("");
                System.out.println("Time: " + time);
                System.out.println("");
                System.out.println("Loading Code");
                Thread.sleep(3000);
                int n = 0;
                while (n < 500) {
                    System.out.println("");
                    n++;
                }
            
            //Input Method
            Scanner input = new Scanner(System.in);

            

            System.out.print("Do u want to encrypt (type 1) or Decrypt (type 2): ");
            int choise = input.nextInt();
            System.out.println("Loading");
            int encrypt = 1;
            int decrypt = 2;
            Thread.sleep(3000);
            if (choise == encrypt) {
                //Replace Method Encrypt
                System.out.print("Type Sentence (use _ for space): ");
                    //input
                String s1 = input.next();
                String str = new String(s1.toLowerCase());
                    //Converter
                System.out.println(str.replaceAll("a", "x").replaceAll("b", "y").replaceAll("c", "z").replaceAll("d", "a").replaceAll("e", "b").replaceAll("f", "c").replaceAll("g", "d").replaceAll("h", "e").replaceAll("i", "f").replaceAll("j", "g").replaceAll("k", "h").replaceAll("l", "i").replaceAll("m", "j").replaceAll("n", "k").replaceAll("o", "l").replaceAll("p", "m").replaceAll("q", "n").replaceAll("r", "o").replaceAll("s", "p").replaceAll("t", "q").replaceAll("u", "r").replaceAll("v", "s").replaceAll("w", "t").replaceAll("x", "u").replaceAll("y", "v").replaceAll("z", "w"));
                    //End
                System.exit(0);
            }
            if (choise == decrypt) {
                //Replace Method Decrypt
                System.out.print("Type Sentence (use _ for space): ");
                    //Input
                String s1 = input.next();
                String str = new String(s1.toLowerCase());
                    //Converter
                System.out.println(str.replaceAll("x", "a").replaceAll("y", "b").replaceAll("z", "c").replaceAll("a", "d").replaceAll("b", "e").replaceAll("c", "f").replaceAll("d", "g").replaceAll("e", "h").replaceAll("f", "i").replaceAll("g", "j").replaceAll("h", "k").replaceAll("i", "l").replaceAll("j", "m").replaceAll("k", "n").replaceAll("l", "o").replaceAll("m", "p").replaceAll("n", "q").replaceAll("o", "r").replaceAll("p", "s").replaceAll("q", "t").replaceAll("r", "u").replaceAll("v", "s").replaceAll("t", "w").replaceAll("u", "x").replaceAll("v", "y").replaceAll("w", "z"));
                    //End
                System.exit(0);
            }
        }
        catch(Exception e) {
            System.out.println("Something Went Wrong, Error Code 1");
            System.exit(1);
        }
    }
        //Replace Method Core        (Regular Expresion)
        public String replaceAll(String regex, String replace_str) {
            return replace_str;
        }

}
