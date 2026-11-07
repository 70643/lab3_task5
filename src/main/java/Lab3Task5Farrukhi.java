import java.util.Random;

public class Lab3Task5Farrukhi {
    public static void main(String[] args) {
        Random randomFarrukhi = new Random();
        int countFarrukhi = 0;
        int minFarrukhi = 101;
        int maxFarrukhi = 0;

        System.out.print("Drawn numbers: ");

        while (countFarrukhi < 10) {
            int drawnNumberFarrukhi = randomFarrukhi.nextInt(100) + 1;
            System.out.print(drawnNumberFarrukhi + " ");

            if (drawnNumberFarrukhi < minFarrukhi) {
                minFarrukhi = drawnNumberFarrukhi;
            }
            if (drawnNumberFarrukhi > maxFarrukhi) {
                maxFarrukhi = drawnNumberFarrukhi;
            }

            countFarrukhi++;
        }

        System.out.println("\nLargest number: " + maxFarrukhi);
        System.out.println("Smallest number: " + minFarrukhi);
    }
}