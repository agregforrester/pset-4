import java.util.Scanner;

        public class Exercise9 {
            public static void main(String[] args) {
                Scanner in = new Scanner(System.in);

                System.out.println("First Name : ");
                String first = in.next();
                in.nextLine();

                System.out.println("Middle Name : ");
                String middle = in.next();
                in.nextLine();

                System.out.println("Last Name : ");
                String last = in.next();

                String firstSubstring = first.substring(0, 1);
                String middleSubstring = middle.substring(0, 1);
                String lastSubstring = last.substring(0, 1);

                String lastString = firstSubstring + middleSubstring + lastSubstring;
                String result = lastString.toUpperCase();

                System.out.println(" ");
                System.out.println(result + ".");
                in.close();
            }
        }
