import java.util.Scanner;

public class Dateable {

    public static void main(String[] args) {
        System.out.println("Welcome to the minimum age you can date calculator. Please enter your age below," + "\n" + "followed by the return/enter key:" + "\n");
        Scanner myObj = new Scanner(System.in);

        int userAge = myObj.nextInt();
        double userAgeDouble = userAge;
        double userdateableAge = userAgeDouble/2 + 7;
        System.out.println("\n" + userAge + "-year olds should date somebody who is at least " + userdateableAge + " years old" + "\n\nCredit: Thanks to Jim Cohoon at The University of Virginia");

    }
}
