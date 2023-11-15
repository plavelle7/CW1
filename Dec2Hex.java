import java.util.Scanner;

class Dec2Hex {

    public static void main(String args[]) {
        if (args.length == 0) {
            System.out.println("Error: Please provide a decimal number as an argument.");
            return;
        }

        try {
            int arg1 = Integer.parseInt(args[0]);
            String hexadecimal = convertToHex(arg1);
            System.out.println("Hexadecimal representation is: " + hexadecimal);
        } catch (NumberFormatException e) {
            System.out.println("Error: Input must be an integer.");
        }
    }

    private static String convertToHex(int num) {
        char ch[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        int rem;
        StringBuilder hexadecimal = new StringBuilder();

        System.out.println("Converting the Decimal Value " + num + " to Hex...");

        while (num != 0) {
            rem = num % 16;
            hexadecimal.insert(0, ch[rem]);
            num = num / 16;
        }

        return hexadecimal.toString();
    }
}



