import java.util.Scanner;

public class Pages {

    public static void main(String[] args) {
            System.out.println("Welcome to the least number of pages you should read before you give up on a book calculator. Please enter your age below," + "\n" + "followed by the return/enter key:" + "\n");
            Scanner myObj = new Scanner(System.in);

            int userAge = myObj.nextInt();
            int userPagesRead = 100 - userAge;
            System.out.println("\n" + userAge + "-year olds should read at least " + userPagesRead + " pages before giving up on a book." + "\n\nCredit: Thanks to Jim Cohoon at The University of Virginia");
    }
}
