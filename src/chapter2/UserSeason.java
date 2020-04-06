package chapter2;

import java.util.Scanner;

public class UserSeason {

    public static void main(String arg[]){

        Scanner scanner = new Scanner(System.in);

        //1. Ask user for a season of year.
        System.out.println("Enter the season of the year");
        String season = scanner.next();

        //2.Ask user to enter whole number.
        System.out.println("Enter whole number");
        int number = scanner.nextInt();


        //3. Ask user for a adjective.
        System.out.println("Enter adjective");
        String adjective = scanner.next();

        scanner.close();

        //4.Display result.
        System.out.println("on a " + adjective + " " + season + " day, I drink a minimum of " + number + " cups of coffee");
    }
}
