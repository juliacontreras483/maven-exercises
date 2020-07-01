//public class MainTest {
//}
import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class MainTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter something: ");
        String something = sc.nextLine();
        System.out.println("You entered: \"" + something + "\"");
        System.out.println("\"" + something + "\" " + returnNumMessage(something));
        System.out.println("Flipped Case: " + StringUtils.swapCase(something));
        System.out.println("Reversed: " + StringUtils.reverse(something));
    }

    public static String returnNumMessage(String input) {
        return (StringUtils.isNumeric(input)) ? "is a number" : "is not a number";
    }
}

//    Create a new class with a main method that prompts the user for input and does the following (using the Stringutils class)
//
//        Tells whether or not what the user entered is a number
//        Flips the case of the string
//        Reverses the string
//        Example Console Output

//    Enter Something: Life, The Universe, and Everything
//        You Entered: "Life, The Universe, and Everything"
//        "Life, The Universe, and Everything" is not a number
//        Flipped Case: lIFE, tHE uNIVERSE, AND eVERYTHING
//        Reversed: gnihtyrevE dna ,esrevinU eht ,efiL