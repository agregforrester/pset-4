import java.util.Scanner;

        public class Exercise6 {
            public static void main(String[] args) {
                Scanner in = new Scanner(System.in);

                System.out.print("Length : ");
                double length = in.nextDouble();
                in.nextLine();

                System.out.print("Width : ");
                double width = in.nextDouble();

                double area = length * width;
                double perimeter = (2 * length) + (2 * width);
                double diagonal = Math.sqrt((length * length) + (width * width));

                System.out.println(" ");
                System.out.printf("Area      : %,.2f", area);
                System.out.println(" ");
                System.out.printf("Perimeter : %,.2f", perimeter);
                System.out.println(" ");
                System.out.printf("Diagonal  : %,.2f", diagonal);
                in.close();
            }
        }
