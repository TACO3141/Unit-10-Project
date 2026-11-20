public class Player
{
  private int jerseyNumber;
  private String position;
  private static int jnc = 0;
  private static int goals;
  private static int saves;
  private static int assists;

  public Player(String firstName, String lastName, String position, int goals, int saves, int assists)
  {
    super(firstName, lastName);
    if (position.equalsIgnoreCase("forward"))
    {
      this.position = position;
    }
    else if (position.equalsIgnoreCase("defense"))
    {
      this.position = position;
    }
    else if (position.equalsIgnoreCase("goalie"))
    {
      this.position = position;
    }
    else
    {
      this.position = "unknown";
    }
    jnc++;
    jerseyNumber = jnc;
    this.goals = goals;
    this.assists = assists;
    this.saves = saves;
  }

  public String getPosition()
  {
    return position;
  }

  pu
  public String toString()
  {
    String toReturn = "";
    toReturn = toReturn + lastName + ", " + firstName + "\n   Jersey #: " + jerseyNumber + "\n   Position: " + position + "\n   Goals\\Saves\\Assists: " + goals + "\\" + saves + "\\" + assists;
    return toReturn;
  }
}
