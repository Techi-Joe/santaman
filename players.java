import java.lang.Math;

public class players {

  // define private vars at start
  // note: most private vars are abbreviated
  private int hp; // healthpoints of player
  private String nm; // name of player
  private boolean tm; // which team the player is on. True for Elves, false for Yetis
  private String fst; // see toString() method
  private String team_print; // see toString() method
  private static int num = 0; // stores the number of player objects created

  // constructor method
  public players(String name, String team, int health) {
    num++;
    setTeam(team);
    setName(name);
    setHealth(health);
  }

  // setName() method sets the player's name (duh)
  public void setName(String name_var) {
    nm = name_var;
  }

  // setTeam() method sets the player's team from String team_var
  public void setTeam(String team_var) {
    if (team_var.equals("elves")) {
      tm = true;
    } else if (team_var.equals("yetis")) {
      tm = false;
    } else {
      System.out.println("Error: team_var not updated!");
    }
  }

  // setHealth() method sets the player's health from int health_var
  public void setHealth(int health_var) {
    hp = health_var;
  }

  // getName() method returns nm
  public String getName() {
    return nm;
  }

  // getTeam() method returns tm
  public boolean getTeam() {
    return tm;
  }

  // getHeath() returns hp
  public int getHeath() {
    return hp;
  }

  // getPlayerCount() method returns the number of players
  public int getPlayerCount() {
    return num;
  }

  // toString: "Name  \n health remaining \n team"
  public String toString() {
    fst = nm.substring(0, 1); // first letter of name
    if (getTeam()) {
      team_print = "Elves";
    } else {
      team_print = "Yetis";
    }
    return fst.toUpperCase() + nm.substring(1) + "\n" + "Health: " + hp + "/50" + "\nTeam: " + team_print;
  }
}
