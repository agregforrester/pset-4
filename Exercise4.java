import java.util.Scanner;

        public class conversion {
            public static void main(String[] args) {
                Scanner in = new Scanner(System.in);

                System.out.println("Centimeters : ");
                double input = in.nextDouble();

                double kilometers = input / 100000;
                int realKilometers = (int) kilometers;
                double amountAfterKilometers = input - (realKilometers * 100000);

                double meters = amountAfterKilometers / 100;
                int realMeters = (int) meters;
                double amountAfterMeters = amountAfterKilometers - (realMeters * 100);

                double centimeters = amountAfterMeters / 1;
                int realCentimeters = (int) centimeters;


                System.out.println(" ");
                System.out.println("Kilometers  : " + realKilometers);
                System.out.println("Meters      : " + realMeters);
                System.out.println("Centimeters : " + realCentimeters);
                in.close();
            }
        }
