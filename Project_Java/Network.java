import java.io.*;
import java.util.*;



public class Network extends menu
{
   Network net= new Network();
   public ArrayList<String> getfriends()
   {
       ArrayList<String> friends = new ArrayList<String>();
        return(friends);
    }
   public ArrayList<String> getusers()
   {
   ArrayList<String> users = new ArrayList<String>();
   return (users);
}
public void add_user(String email, String onoma)
{
       ArrayList<String> users = new ArrayList<String>();

 System.out.println( " Give username to add " );
 Scanner scan= new Scanner(System.in);
 String str=scan.nextLine();
 User user=new User();
 users.add(str);
 System.out.println( " Username added ");

 
 
}

public void remove_user(ArrayList<String> users)
{
 System.out.println( " Give username to remove" );
 Scanner scan= new Scanner(System.in);
 String str=scan.nextLine();
 users.remove(str);
 System.out.println ( " User removed" );
 
}

public void add_friend()
{
    ArrayList<String> friends= new ArrayList<String>();
  System.out.println( " Give the username of the person you want to add ");
  Scanner scan= new Scanner(System.in);
 String str=scan.nextLine();
  friends.add(str);
  System.out.println ( " You have succesfully added the user : " + str );
 
}
public void show_friend(ArrayList<String> friends)
{
    
 System.out.println( " Give the username of the person you want to see on your friend list ");
 Scanner scan= new Scanner(System.in);
 String str=scan.nextLine(); 
 // prepei na mpei mia try catch edw gia ama den yparxei o filos//
 System.out.println ( str);
 
  
    
}
public boolean are_friends( ArrayList<String> user, ArrayList<String> friends)
{
    System.out.println ( " You will have to give the two usernames so you can see if they are friends ");
System.out.println( "Give first username");
Scanner scan= new Scanner(System.in);
 String str1=scan.nextLine(); 
 System.out.println( "Give second username");
 String str2=scan.nextLine();
  Set<String> set = new HashSet<String>(friends);
 if (set.contains(str2))
  {
    System.out.println("They are friends");
  return true;
    }
 else
 {
  System.out.println("They are not friends");
   return false;


}

}
public void same_friends(ArrayList<String> friends1, ArrayList<String> friends2)
{
    int c=0;
    System.out.println( "Give the two usernames so we can find their common friends");
System.out.println( "Give first username");
Scanner scan= new Scanner(System.in);
 String str1=scan.nextLine();
 System.out.println( "Give second username");
 String str2=scan.nextLine();
 ArrayList<String> same_friends = new ArrayList<String>();
 for (int i = 0; i < friends1.size(); i++)
 {   
    for (int j = 0; j < friends2.size(); j++) 
    {
                if(friends1.get(i) == friends2.get(j)) {
                    same_friends.add(friends1.get(i));
                    c++;
                    continue;
                }

}
}

System.out.println  ( "You have"+ c + "common friends" );
for  (int i=0; i < same_friends.size(); i++)
{
     same_friends.get(i);
    
}
}

    
    
}




