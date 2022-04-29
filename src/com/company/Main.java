package com.company;
import java.util.Scanner;
public class Main
{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String Player1 = "";
        String Player2 = "";
        String trash = "";
        String Continue = "";
        boolean turn = false;
        while (Continue != "N") {
            do {
                System.out.println("Player one, make your move. ");
                Player1 = in.nextLine();
                //System.out.println(Player1);
                if (Player1.equalsIgnoreCase("R")) {
                    System.out.println("Player one chose Rock!");
                } else if (Player1.equalsIgnoreCase("P")) {
                    System.out.println("Player one chose Paper!");
                } else if (Player1.equalsIgnoreCase("S")) {
                    System.out.println("Player one chose Sissors!");
                } else {
                    System.out.println("That is not a valid input.");
                    trash = in.nextLine();
                }
            }
            while (!true);
            do {
                System.out.println("Player two, make your move. ");
                Player2 = in.nextLine();
                //System.out.println(Player1);
                if (Player2.equalsIgnoreCase("R")) {
                    System.out.println("Player two chose Rock!");
                } else if (Player2.equalsIgnoreCase("P")) {
                    System.out.println("Player two chose Paper!");
                } else if (Player2.equalsIgnoreCase("S")) {
                    System.out.println("Player two chose Sissors!");
                } else {
                    System.out.println("That is not a valid input.");
                    trash = in.nextLine();
                }
            }
            while (!true);
            if (Player1.equals(Player2)) {
                System.out.println("It is a tie!");
            } else if (Player1.equalsIgnoreCase("R")) {
                if (Player2.equalsIgnoreCase("S")) {
                    System.out.println("Player one wins!");
                } else if (Player2.equalsIgnoreCase("P")) {
                    System.out.println("Player two wins!");
                } else if (Player1.equalsIgnoreCase("P")) {
                    if (Player2.equalsIgnoreCase("R")) {
                        System.out.println("Player one wins!");
                    } else if (Player2.equalsIgnoreCase("S")) {
                        System.out.println("Player two wins!");
                    } else if (Player1.equalsIgnoreCase("S")) {
                        if (Player2.equalsIgnoreCase("P")) {
                            System.out.println("Player one wins!");
                        } else if (Player2.equalsIgnoreCase("R")) {
                            System.out.println("Player two wins!");
                        }
                    }
                }
            }

            System.out.println("Would you like to continue, Y or N?");
            Continue = in.nextLine();
            if (Continue.equalsIgnoreCase("Y")) {
                System.out.println("Have a good day!");
            } else {
                System.out.println("Have a good day!");
                break;
            }
        }
    }


}
