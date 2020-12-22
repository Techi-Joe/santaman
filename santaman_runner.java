/*
Santaman is a text-based game written for the Christmas of 2020.
Developed by Techi-Joe!
*/

public class santaman_runner {
  public static void main(String args[]) {
    // userInteraction class abbreviated to inter
    userInteraction inter = new userInteraction();
    System.out.print("Name: ");
    inter.input(100);
    players john = new players(inter.getUserInput(), "elves", 25);
    System.out.println(john);

  }
}
