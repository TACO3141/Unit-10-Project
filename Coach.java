public class Coach
{
  private String role;

  public Coach(String firstName, String lastName, String role)
  {
    super(firstName, lastName);
    this.role = role;
  }

  public String toString()
  {
    String toReturn = "";
    toReturn = toReturn + lastName + ", " + firstName + "\n   Role: " + role;
    return toReturn;
  }
}
