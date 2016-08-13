import java.util.Scanner;

public class Calculator {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int selection;
        double fnum, snum, answer;

        //Take an input from the user
        System.out.println("Select an operation.");
        System.out.println("1.Add");
        System.out.println("2.Subtract");
        System.out.println("3.Multiply");
        System.out.println("4.Divide");
        System.out.print("Enter choice(1/2/3/4): ");
        selection = sc.nextInt();

        System.out.print("Enter first number: ");
        fnum = sc.nextDouble();
        System.out.print("Enter second number: ");
        snum = sc.nextDouble();

        switch (selection) {
            case 1:
                answer = fnum + snum;
                System.out.print(fnum + " + " + snum + " = " + answer);
                break;
            case 2:
                answer = fnum - snum;
                System.out.print(fnum + " - " + snum + " = " + answer);
                break;
            case 3:
                answer = fnum * snum;
                System.out.print(fnum + " * " + snum + " = " + answer);
                break;
            case 4:
                answer = fnum / snum;
                System.out.print(fnum + " / " + snum + " = " + answer);
                break;
            default:
                System.out.print("Invalid option was selected");
                break;
        }

    }

}
