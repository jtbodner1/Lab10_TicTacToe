import java.util.Scanner;

public class SafeInput {
    public static int getRangedInt(Scanner console, String prompt, int low, int high) {
        int result;
        do {
            System.out.print(prompt + " [" + low + " - " + high + "]: ");
            while (!console.hasNextInt()) {
                console.next();
                System.out.print(prompt + " [" + low + " - " + high + "]: ");
            }
            result = console.nextInt();
        } while (result < low || result > high);
        console.nextLine(); // Clear the buffer
        return result;
    }

    public static boolean getYNConfirm(Scanner console, String prompt) {
        String response;
        System.out.print(prompt + " [Y/N]: ");
        response = console.nextLine().trim().toLowerCase();
        return response.equals("y");
    }
}
