import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tariffA = scanner.nextInt();
        int internetB = scanner.nextInt();
        int additionalCostC = scanner.nextInt();
        int plansToSpendD = scanner.nextInt();

        if (plansToSpendD > internetB) {
            int difference = plansToSpendD - internetB;
            int additionalCost = difference * additionalCostC;
            System.out.println(tariffA + additionalCost);
        } else {
            System.out.println(tariffA);
        }
    }
}