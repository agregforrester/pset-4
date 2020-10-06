import java.util.Scanner;

        public class Exercise3 {
            public static void main(String[] args) {
                Scanner in = new Scanner(System.in);

                System.out.println("Length   : ");
                double length = in.nextDouble();
                in.nextLine();

                System.out.println("Width    : ");
                double width = in.nextDouble();
                in.nextLine();

                System.out.println("Diameter : ");
                double diameter = in.nextDouble();


                double circleArea = (diameter / 2) * (diameter / 2) * 3.1415;
                double boardArea = length * width;

                double cornholeArea = boardArea - circleArea;

                System.out.println(" ");
                System.out.printf("Surface area : %,.2f", cornholeArea);
                in.close();
            }
        }
