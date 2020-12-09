import java.lang.Math;

public class players {

  // define private vars at start
  // note: all private vars are abbreviated
  private int hp; // healthpoints of player
  private String nm; // name of player
  private boolean tm; // which team the player is on. True for Elves, false for Yetis.

  // constructor method
  public players(String name, String team) {
    setTeam(team);
    setName(name);
  }

  // setName() method sets the player's name (duh)
  public void setName(String name_var) {
    nm = name_var;
  }

  // setTeam() method sets the player's team from String team_var
  public void setTeam(String team_var) {
    if (team_var.equals("elves")) {
      tm = true;
    } else {
      tm = false;
    }
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

}
