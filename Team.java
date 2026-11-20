public class Team
{
  private ArrayList<Player> players;
  private ArrayList<Coach> coaches;

  public Team(ArrayList<Player> players, ArrayList<Coach> coaches)
  {
    this.players = players;
    this.coaches = coaches;
  }

  public String getForwards()
  {
    String toReturn = "";
    for (int i = 0; i < players.size(); i++)
    {
      if (players.get(i).getPosition().equalsIgnoreCase("forward"))
      {
        toReturn = toReturn + players.get(i).toString() + "\n";
      }
    }
    return toReturn;
  }

  public String getDefense()
  {
    String toReturn = "";
    for (int i = 0; i < players.size(); i++)
    {
      if (players.get(i).getPosition().equalsIgnoreCase("defense"))
      {
        toReturn = toReturn + players.get(i).toString() + "\n";
      }
    }
    return toReturn;
  }

  public String toString()
  {
    String toReturn = "COACHES\n";
    for (int i = 0; i < coaches.size(); i++)
    {
      toReturn = toReturn + coaches.get(i).toString() + "\n";
    }
    toReturn = toReturn + "\nPLAYERS\n";
    for (int i = 0; i < players.size(); i++)
    {
      toReturn = toReturn + players.get(i).toString() + "\n";
    }
    return toReturn;
  }
}
