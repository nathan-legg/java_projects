import java.util.Scanner;

public class Calculator {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        double fnum, snum, answer;
        int option;
        System.out.println("Enter first number: ");
        fnum = sc.nextDouble();
        System.out.println("Enter second number: ");
        snum = sc.nextDouble();

        System.out.println("Add(1)\nSubtract(2)\nMultiply(3)\nDivide(4)\nSelect your option: ");
        option = sc.nextInt();

        switch (option) {
            case 1:
                answer = fnum + snum;
                System.out.println("\n" + fnum + " + " + snum + " = " + answer);
                break;
            case 2:
                answer = fnum - snum;
                System.out.println("\n" + fnum + " - " + snum + " = " + answer);
                break;
            case 3:
                answer = fnum * snum;
                System.out.println("\n" + fnum + " * " + snum + " = " + answer);
                break;
            case 4:
                answer = fnum / snum;
                System.out.println("\n" + fnum + " / " + snum + " = " + answer);
                break;
            default:
                System.out.println("\nInvalid option was selected");
                break;
        }

    }

}
