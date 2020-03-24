package com.ttsprojectjava;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        // print the valid characters for input
        AsciiChars.printNumbers();
        AsciiChars.printUpperCase();
        AsciiChars.printLowerCase();
	// write your code here
        System.out.println("Hello! What's your name lad?");
        String userName = userInput.nextLine();
        System.out.printf("Hey %s! \nLike to answer a few questions to get your" +
                " lottery numbers sent from the future?(yes, no)", userName);
        String continueOne = userInput.nextLine();
            if (continueOne.equals("yes") || continueOne.equals("y")) {
                    RunGame();
                    //Would you like to again
                    //if no then exit
            } else {
                System.out.println("Come back later to change your future and dreams!");
                System.exit(0);
            }
        System.out.println("Would you like to go again?");
        String continueTwo = userInput.nextLine();
        if (continueTwo.equals("yes") || continueTwo.equals("y")) {
            RunGame();
            //Would you like to again
            //if no then exit
        } else {
            System.out.println("Come back later to change your future and dreams!");
            System.exit(0);
        }
    }

    public static void RunGame(){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Do you have a red car? (yes, no)");
        String redCar = userInput.nextLine();
        System.out.println("What is the name of your favorite pet? (ex: Snuffles, Kitty)");
        String petName = userInput.nextLine();
        System.out.println("What is the age of that pet? (ex:1, 2, 3,...)");
        int petAge = userInput.nextInt();
        System.out.println("What is your ultimate lucky number? (ex:1, 2, 3,..)");
        int luckyNumber = userInput.nextInt();
        System.out.println("You have a favorite quarterback? (yes, no)");
        String favQb = userInput.next();
        if (favQb.equals("yes")) {
            System.out.println("What's his jersey number? (ex:1, 2, 3,..)");
        } else {
            System.out.println("All good. What's the jersey number of any" +
                    " favorite athlete of yours? (ex:1, 2, 3,..)");
        }
        int qbNum = userInput.nextInt();
        System.out.println("What is the two-digit model year of your car or dream car? (ex:98, 99, 01, 02,..)");
        int carYear = userInput.nextInt();
        System.out.println("What is the name of your favorite actor or actress? (ex:John, Emma,..)");
        String movieStar = userInput.next();
        int starX = Character.getNumericValue(movieStar.charAt(0));
        int starY = Character.getNumericValue(movieStar.charAt(movieStar.length() - 1));
        System.out.println("Enter number between 1 and 50.");
        int randNumb = userInput.nextInt();
        System.out.println("Awesome! Let me get those numbers for you!");
        //Generating output
        final int lottoOne = (int)(Math.random() * 65 + 1);
        while (lottoOne == (int) (Math.random() * 65 + 1)) {
            System.out.print(qbNum + " " + petAge + " " + luckyNumber);
            if (lottoOne > 65){
                System.out.print(lottoOne - 65);
            }
        }
        final int lottoTwo = (int)(Math.random() * 65 + 1);
        while (lottoTwo == (int) (Math.random() * 65 + 1)) {
            System.out.print(starX + 33);
            if (lottoTwo > 65){
                System.out.print(lottoTwo - 65);
            }
        }
        final int lottoThree = (int)(Math.random() * 65 + 1);
        while (lottoThree == (int) (Math.random() * 65 + 1)) {
            System.out.print(starY);
            if (lottoThree > 65){
                System.out.print(lottoThree - 65);
            }
        }
        final int lottoFour = (int)(Math.random() * 65 + 1);
        while (lottoFour == (int) (Math.random() * 65 + 1)) {
            System.out.print(petAge + carYear);
            if (lottoFour > 65){
                System.out.print(lottoFour - 65);
            }
        }
        final int lottoFive = (int)(Math.random() * 65 + 1);
        while (lottoFive == (int) (Math.random() * 65 + 1)) {
            System.out.print(randNumb + lottoThree);
            if (lottoFive > 65){
                System.out.print(lottoFive - 65);
            }
        }
        final int lottoMagic = (int)(Math.random() * 75 + 1);
        while (lottoOne == (int) (Math.random() * 75 + 1)) {
            System.out.print(qbNum * lottoThree);
            if (lottoMagic > 75){
                System.out.print(lottoMagic - 75);
            }
        }
        System.out.printf("%s, %s, %s, %s, %s Magic Ball: %s\n",
                lottoOne, lottoTwo, lottoThree, lottoFour, lottoFive, lottoMagic);

    }
}
