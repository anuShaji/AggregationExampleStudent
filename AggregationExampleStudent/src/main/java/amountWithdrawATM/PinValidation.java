package amountWithdrawATM;

import java.util.Scanner;


public class PinValidation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pins pn = new Pins();

        System.out.print("Enter your PIN: ");
        int enteredPin = sc.nextInt();

        if (pn.validatePin(enteredPin)) {
            pn.setPin(enteredPin);
            System.out.println("PIN is validated. You can proceed with transactions.");
        } else {
            System.out.println("Invalid PIN. Transaction aborted.");
        }

        sc.close();
    }
}
