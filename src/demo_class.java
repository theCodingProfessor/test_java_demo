package src;

import java.util.Scanner;

public class demo_class {

  public static void main(String[] args) {

    System.out.println("\n\tLab 12: GitHub Demo; Clinton Garwood");

    Traveler start_travels = new Traveler();
    System.out.println("\t\tNew Traveler object Created");

    int user_selection = 0;
    Scanner get_selection = new Scanner(System.in);
    while (user_selection != 3){
      System.out.println("\t\t1) Add New City");
      System.out.println("\t\t2) Print City List");
      System.out.println("\t\t3) Exit");
      System.out.print("\t\tPlease make a selection: ");
      user_selection = get_selection.nextInt();
      if(user_selection == 1){
        start_travels.add_city();
      } else if (user_selection == 2) {
        start_travels.print_cities();
      }
    }

    System.out.println("\n\tEnd of Lab 12");
  }
}
