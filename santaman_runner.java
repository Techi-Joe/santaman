/*
Santaman is a text-based game written for the Christmas of 2020.
Developed by Techi-Joe!
*/

public class santaman_runner {
  public static void main(String args[]) {
    // userInteraction class abbreviated to inter
    userInteraction inter = new userInteraction();
    inter.input(0);
    players john = new players("jOHN", "elves", 25);
    System.out.println(john);

  }
}
