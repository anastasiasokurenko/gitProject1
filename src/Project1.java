public class Project1 {
    // Create a program that uses an array to store a list of
    //temperatures for a week, and then uses a loop to find
    //the highest and lowest temperature for the week.

        public static void main(String[] args) {
            double[] temperatures = {21.5, 22.0, 20.5, 19.0, 18.5, 17.0, 16.5};

            double highest = temperatures[0];
            double lowest = temperatures[0];

            for (int i = 1; i < temperatures.length; i++) {
                if (temperatures[i] > highest) {
                    highest = temperatures[i];
                }
                if (temperatures[i] < lowest) {
                    lowest = temperatures[i];
                }
            }

            System.out.println("The highest temperature for the week is: " + highest);
            System.out.println("The lowest temperature for the week is: " + lowest);
        }

    }

