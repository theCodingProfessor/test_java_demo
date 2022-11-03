package src;

import java.util.ArrayList;
import java.util.Scanner;

/** Demo Class for GitHub Lab
 * @version 1
 * @author Clinton Garwood
 */
public class Traveler {

  /** Integer tallies total miles traveled
   */
  public int getMiles_traveled() {
    return miles_traveled;
  }

  public String getCity_name() {
    return city_name;
  }

  public ArrayList<String> getCities_visited() {
    return cities_visited;
  }

  /** Tracks Total Miles Traveled */
  int miles_traveled = 0;

  /** Takes the name of a city */
  String city_name = "";

  public void setMiles_traveled(int miles_traveled) {
    this.miles_traveled = miles_traveled;
  }

  public void setCity_name(String city_name) {
    this.city_name = city_name;
  }

  public void setCities_visited(String new_city) {
    this.cities_visited.add(new_city);
  }

  /** Keeps a list of cities visited */
  ArrayList<String> cities_visited = new ArrayList<>();

  /** overwrites the default constructor */
  Traveler(){}

  /**
   * Adds a new city to the list of cities visited, and
   * updates the total miles given by the user
   * */
  public void add_city(){
    System.out.println("\n\t\tNew City Visit Input");
    Scanner get_data = new Scanner(System.in);
    System.out.print("\t\tPlease enter the name of the city: ");
    String city_name = get_data.nextLine();
    System.out.print("\t\tPlease enter the miles to that city (in miles as integer): ");
    int add_miles = get_data.nextInt();
    setCity_name(city_name);
    int update_miles = getMiles_traveled() + add_miles;
    setMiles_traveled(update_miles);
    setCities_visited(getCity_name());
    System.out.println("\t\tThis city has been added to the list. \n");
  }

  /**
   * Adds a new city to the list of cities visited, and
   * updates the total miles given by the user
   * */
  public void print_cities(){
    System.out.println("\n\tCities Visited: ");
      getCities_visited().forEach((n) -> System.out.print("\t\t" + n));
      System.out.println("\n\t\tTotal Miles Traveled: " + getMiles_traveled() + "\n");
    }

  }
