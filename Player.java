public class Player
{
  private int jerseyNumber;
  private String position;
  private static int jnc = 0;

  public Player(String firstName, String lastName, String position)
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
    else
    {
      this.position = "goalie";
    }
    jnc++;
    jerseyNumber = jnc;
  }

  public String getPosition()
  {
    return position;
  }

  public String toString()
  {
    String toReturn = "";
    toReturn = toReturn + lastName + ", " + firstName + "\n   Jersey #: " + jerseyNumber + "\n   Position: " + position;
    return toReturn;
  }
}
