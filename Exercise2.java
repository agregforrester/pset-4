import java.util.Scanner;

        public class Exercise2 {
            public static void main(String[] args) {
                Scanner in = new Scanner(System.in);

                System.out.print("Inches : ");
                double input = in.nextDouble();

                double miles = input / 63360;
                int realMiles = (int) miles;
                double amountAfterMiles = input - (realMiles * 63360);

                double feet = amountAfterMiles / 12;
                int realFeet = (int) feet;
                double amountAfterFeet = amountAfterMiles - (realFeet * 12);

                double inches = amountAfterFeet / 1;
                int realInches = (int) inches;


                System.out.println(" ");
                System.out.println("Miles  : " + realMiles);
                System.out.println("Feet   : " + realFeet);
                System.out.println("Inches : " + realInches);
                in.close();
            }
        }
