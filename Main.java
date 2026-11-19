import java.util.ArrayList;
import java.util.Scanner;

public class Main{

  public static void main(String[] args){
    ArrayList<Player> players = new ArrayList<Player>();
    ArrayList<Coach> coaches = new ArrayList<Coach>();
    Scanner scan = new Scanner(System.in);
    String ins = "";
    while(!ins.equals("q")){
      System.out.println("\nWhat do you want to do?\np - add a person\nt - make a team from the current player/coach lists\nq - quit");
      ins = scan.nextLine().toLowerCase();
      if(ins.equals("p")){
        Person p;
        System.out.println("\nWhich class do you want to use?\np - Person\nu - Player\nc - Coach");
        String cls = scan.nextLine().toLowerCase();
        System.out.println("First name?");
        String fn = scan.nextLine();
        System.out.println("Last name?");
        String ln = scan.nextLine();
        if(cls.equals("u")){
          System.out.println("Position? Enter: forward or defense");
          String ps = scan.nextLine();
          p = new Player(fn, ln, ps);
          players.add((Player)p);
          System.out.println("\n" + fn + " " + ln + " was added to the players list.");
        }
        else if(cls.equals("c")){
          System.out.println("Role? Enter: HC or Assistant");
          String rl = scan.nextLine();
          p = new Coach(fn, ln, rl);
          coaches.add((Coach)p);
          System.out.println("\n" + fn + " " + ln + " was added to the coaches list.");
        }
        else{
          p = new Person(fn, ln);
          System.out.println("\nReminder: only Players and Coaches can be added to a team.");
        }
        System.out.println("\n" + p);
      }
      else if(ins.equals("t")){
        Team t = new Team(players, coaches);
        System.out.println("\nYour team is ready!\n");
        while(!ins.equals("q")){
          System.out.println("\nWhat do you want to do?\nc - see the forwards\nh - see the defence\nt = see the whole team\nq - quit");
          ins = scan.nextLine().toLowerCase();
          if(ins.equals("c"))
            System.out.println("\n" + t.getForwards());
          else if(ins.equals("h"))
            System.out.println("\n" + t.getDefense());
          else if(ins.equals("t"))
            System.out.println("\n" + t + "\n");
        }
      }
    }
  }
}
