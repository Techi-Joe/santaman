/*
This is a public class used for verifying
user inputs and passing them to the appropiate methods!
*/

import java.util.Scanner;

public class userInteraction {

  // define private vars at start
  // note: all private vars are abbreviated
  private String usr_in; // var for storing user text input
  private boolean valid = false; // stores if last input was validated

  // input method is a void method that varifies an entered String
  // and saves it to usr_in. For qualifications, check valid_in()
  public void input(int qualifications) {
    Scanner input = new Scanner(System.in);
    String user_in = input.nextLine();
    while(valid == false) {
      if (valid_in(user_in, qualifications) == true) {
        valid = true;
        usr_in = user_in;
      } else {
        System.out.println("invalid input! Please try again.");
        valid = false;
        String user_input = input.nextLine();
      }
    }
  }

  // valid_in private boolean method returns true if input meets
  // certain qualifications
  private boolean valid_in(String in, int qual) {
    // qualifications is represented by an integer that switches
    // between different scalable checks on proper input
    switch(qual) {
      case 0:
        // case 0 is
        break;
      default:
        // default is basic checks for simple y/n statements
        if ((in.toLowerCase() == "y") || (in.toLowerCase() == "n")) {
          return true;
        }
    }
    return false; // returns false if not valid
  }
}
