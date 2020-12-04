/*
This is a public class used for verifying
user inputs and passing them to the appropiate classes.
*/

public class user_interaction {

  // define private vars at start
  // note: all private vars are abbreviated
  private String usr_in; // var for storing user text input
  private boolean valid = false; // stores if last input was valid

  // input method is a void method that varifies an entered String
  // and saves it to usr_in
  public void input(String input, int qualifications) {
    if (valid_in(input, qualifications) == true) {
      valid = true;
      usr_in = input;
    } else {
      System.out.println("invalid input! Please try again.")
      valid = false;
    }
  }

  // valid_in boolean method returns true if input meets
  // certain qualifications
  public boolean valid_in(String input, int qualifications) {
    // qualifications is represented by an integer that switches
    // between different scalable checks on proper input
    switch(qualifications) {
      case 0:
        // case 0 is for 
      default:
        // default is basic checks for simple y/n statements
        if ((input.toLowerCase() == y) || (input.toLowerCase() == n)) {
          return true;
        }
    }
    return false; // returns false if not valid
  }
}
