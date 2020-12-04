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
  // and saves it to usr_in. For qualifications, use 100 for default
  public void input(int qualifications) {
    Scanner input = new Scanner(System.in)
    String user_input = input.nextLine();
    while(valid == false) {
      if (valid_in(user_input, qualifications) == true) {
        valid = true;
        usr_in = user_input;
      } else {
        System.out.println("invalid input! Please try again.")
        valid = false;
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
          break;
        }
    }
    return false; // returns false if not valid
  }


}
