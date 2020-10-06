import java.util.Scanner;

        public class Exercise1 {
            public static void main(String[] args) {
                Scanner in = new Scanner(System.in);

                System.out.print("Temperature : ");
                double temperature = in.nextDouble();
                in.nextLine();

                System.out.print("Wind Speed : ");
                double windSpeed = in.nextDouble();


                double windChill = 35.74 + (0.6215 * temperature) + (((0.4275 * temperature) - 35.75) * (Math.pow(windSpeed, 0.16)));

                System.out.println(" ");
                System.out.printf("Wind Chill : %,.2f", windChill);
                in.close();
            }
        }
