import java.util.Scanner;

        public class Exercise10 {
            public static void main(String[] args) {
                Scanner in = new Scanner(System.in);

                System.out.print("What's your favorite city? ");
                String city = in.nextLine();

                int length = city.length();

                String upper = city.toUpperCase();

                String lower = city.toLowerCase();

                System.out.println(" ");
                System.out.println("Text   : " + city);
                System.out.println("Length : " + length);
                System.out.println("Upper  : " + upper);
                System.out.println("Lower  : " + lower);
                in.close();
            }
        }
