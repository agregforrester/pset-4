import java.util.Scanner;

        public class text {
            public static void main(String[] args) {
                Scanner in = new Scanner(System.in);

                System.out.println("Text : ");
                String text = in.next();

                double textLength = text.length();

                double firstSubstring = textLength / 2;
                int realFirstSubstring = (int) firstSubstring;

                String string1 = text.substring(0, realFirstSubstring);
                String string2 = text.substring(realFirstSubstring);

                String lastString = string2 + string1;
                String result = lastString.toUpperCase();

                System.out.println(" ");
                System.out.println(result + ".");
                in.close();
            }
        }