public class Main {

    public static void main(String[] args) {
        for (int i = 1; i < 10000; i++) {
            int sum = 0;
            int currentNumber = i;
            int totalDigits = 0;

            int counter = i;
            while (counter > 0) {
                counter /= 10;
                totalDigits++;
            }

            while (currentNumber != 0) {
                int oneDigit = currentNumber % 10;
                sum += (int) Math.pow(oneDigit, totalDigits);
                currentNumber /= 10;
            }

            if (i == sum) {
                System.out.println("Armstrong number: " + i);
            }

        }

    }

}
