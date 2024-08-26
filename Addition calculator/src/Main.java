import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Skriv in ett tal som jag kan addera: ");

        String input = scanner.nextLine();

        int sum = 0;

        for (int i = 0; i < input.length(); i++) {

            char digitChar = input.charAt(i);

            if (Character.isDigit(digitChar)) {
                int digit = Character.getNumericValue(digitChar);
                sum += digit;
            }

        }
        System.out.println("Summan av siffrorna i "+ input + " är " + sum);

        scanner.close();



    }
}