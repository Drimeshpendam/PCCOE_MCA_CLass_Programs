import java.util.Scanner;

public class StringSorting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input phase
        System.out.print("Enter the number of strings: ");
        int numStrings = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        String[] strings = new String[numStrings];

        for (int i = 0; i < numStrings; i++) {
            System.out.print("Enter string " + (i + 1) + ": ");
            strings[i] = scanner.nextLine();
        }

        scanner.close();

        // Sorting phase (in alphabetical order)
        for (int i = 0; i < numStrings - 1; i++) {
            for (int j = i + 1; j < numStrings; j++) {
                if (strings[i].compareTo(strings[j]) > 0) {
                    // Swap strings[i] and strings[j]
                    String temp = strings[i];
                    strings[i] = strings[j];
                    strings[j] = temp;
                }
            }
        }

        // Output sorted strings
        System.out.println("Sorted strings:");
        for (String sortedString : strings) {
            System.out.println(sortedString);
        }
    }
}
