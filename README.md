# PCCOE_MCA_CLass_Programs
Created Repo - To upload and fetch programs !

**Java Programs** : - 

**1. Create a Java program to accept 10 numbers from user, store in an array. Find the
second largest and second smallest number from it. Use Scanner class to accept input
from user.**
\n
Source Code :- 

//
import java.util.Scanner;

public class Second_Largest_Smallest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[10];

        // Input phase
        System.out.println("Enter 10 numbers:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        scanner.close();

        // Find second largest and second smallest
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int number : numbers) {
            if (number > largest) {
                secondLargest = largest;
                largest = number;
            } else if (number > secondLargest && number != largest) {
                secondLargest = number;
            }

            if (number < smallest) {
                secondSmallest = smallest;
                smallest = number;
            } else if (number < secondSmallest && number != smallest) {
                secondSmallest = number;
            }
        }

        // Output results
        System.out.println("Second Largest Number: " + secondLargest);
        System.out.println("Second Smallest Number: " + secondSmallest);
    }
}

**3. Create a Java program to accept number of strings from user and sort them in
alphabetical order. Use String class to store accepted string from user.**
Source Code :- 
//
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

**5. Create a Java program to accept two numbers from user, find GCD and LCM of both
the numbers. Use Scanner class to accept two numbers from user.**

Source Code :- 
//
import java.util.Scanner;

public class GCDLCMCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input phase
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        scanner.close();

        // Calculate GCD and LCM
        int gcd = findGCD(num1, num2);
        int lcm = (num1 * num2) / gcd;

        // Output results
        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd);
        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);
    }

    // Function to find GCD using Euclidean algorithm
    private static int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return findGCD(b, a % b);
    }
}
