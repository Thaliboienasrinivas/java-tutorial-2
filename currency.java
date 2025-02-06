import java.util.Scanner;

public class CurrencyConverter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter amount in USD: ");
        double usdAmount = input.nextDouble();

        double exchangeRate = 82.50;

        double inrAmountDouble = usdAmount * exchangeRate;

        int inrAmountInt = (int) inrAmountDouble;

        System.out.println(usdAmount + " USD is equal to " + inrAmountDouble + " INR (double)");
        System.out.println(usdAmount + " USD is equal to " + inrAmountInt + " INR (int - rounded)");

        byte b = 10;
        int i = b;
        double d = i;
        System.out.println("\nWidening Conversions:");
        System.out.println("byte to int: " + b + " -> " + i);
        System.out.println("int to double: " + i + " -> " + d);

        double d2 = 123.78;
        int i2 = (int) d2;
        byte b2 = (byte) i2;
        System.out.println("\nNarrowing Conversions:");
        System.out.println("double to int: " + d2 + " -> " + i2);
        System.out.println("int to byte: " + i2 + " -> " + b2);

        input.close();
    }
}
