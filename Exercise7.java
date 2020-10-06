import java.util.Scanner;

        public class hexagon {
            public static void main(String[] args) {
                Scanner in = new Scanner(System.in);

                System.out.println("Length : ");
                double length = in.nextDouble();

                double perimeter = length * 6;
                double heightOfTriangle = (length / 2) * Math.sqrt(3);
                double areaOfHexagon = 6 * (0.5 * (length * heightOfTriangle));

                System.out.println(" ");
                System.out.printf("Area      : %,.2f", areaOfHexagon);
                System.out.println(" ");
                System.out.printf("Perimeter : %,.2f", perimeter);
                in.close();
            }
        }
