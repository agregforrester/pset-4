import java.util.Scanner;

        public class Exercise5 {
            public static void main(String[] args) {
                Scanner in = new Scanner(System.in);

                System.out.println("Diameter : ");
                double diameter = in.nextDouble();

                double radius = diameter / 2;
                double area = radius * radius * 3.1415;

                double circumference = diameter * 3.1415;

                System.out.println(" ");
                System.out.printf("Area          : %,.2f", area);
                System.out.println(" ");
                System.out.printf("Circumference : %,.2f", circumference);
                in.close();
            }
        }
