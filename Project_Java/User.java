import java.io.*;
import java.util.*;

public class User extends Network
{
    
   public String email,onoma;
   
 
  
    Network user1=new Network();
   
    public User()
    {
    user1.add_user("spyrossoulis@hotmail.com","Spyros");
    ArrayList<String> arr= user1.getusers();
    ArrayList<String> arrfriends=user1.getfriends();
    user1.add_friend();
}


   
   ArrayList<String> friend_request_sent = new ArrayList<String>();
   ArrayList<String> friend_request_recieved = new ArrayList<String>();
   Wall mywall= new Wall();
   public  void sent_friend_request(ArrayList<String> friend_request_sent )
   {     String ap;
       do{
        System.out.println( "Do you want to sent a friend request?  Y/N");
       Scanner scan= new Scanner(System.in);
        ap =scan.nextLine();
        if (ap=="Y")
      {
          System.out.println( " Give username to add" );
           String str =scan.nextLine();
          friend_request_sent.add(str);
          // vale try catch gia ama o user den yparxei h vazei ton eyato tou//
          FriendRequest friendrequest= new FriendRequest();
          System.out.println ( "Your  friend request has been submited");
          System.out.println( " Here is your friend request list :");
          for(int i =0; i< friend_request_sent.size(); i++)
          { 
          System.out.println( friend_request_sent.get(i));
          
        }
    }
        
      } while ( ap == "N");
      
          
    }
  public void reply_friend_request( ArrayList<String> friend_request_recieved, String onoma)
  {
       System.out.println( onoma + "/n You  have these friend requests");
       String user2;
       int c=0;
       int b=0;
   for(int i =0; i < friend_request_recieved.size(); i++)
   {
      System.out.println( friend_request_recieved.get(i));
      }
      do
      {
    System.out.println( " Write the username of the person you want to reply on your friend request");
    Scanner scan= new Scanner(System.in);
      user2=scan.nextLine();
     if (user2.equals( user1))
     {
      System.out.println(" You gave your own name please give a name from the pending friend requests ");
        user2=scan.nextLine();
   }else{
       c=1;
    }
} while (c !=0);
      do 
      {
             System.out.println( " Write the username of the person you want to reply on your friend request");
            
          if(friend_request_recieved.contains(user2))
        {
          System.out.println( "You have already sent a friend request on that user");
         Scanner scan = new Scanner(System.in);
          user2=scan.nextLine();
        } 
        }while( b !=0);
        System.out.println( "Do you want to add the person on your friend list Y/N ?"); 
         Scanner scan = new Scanner(System.in);
          String ap2=scan.nextLine();
          if (ap2=="Y")
          {
        user1.add_friend();
            }
            else
            {
                friend_request_recieved.remove(user2);
            }
    }
    
    public void remove_friend( ArrayList<String> arrfriends)
    {
    System.out.println( " Give the username of the friend you want to remove");
      Scanner scan = new Scanner(System.in);
      String str=scan.nextLine();
      if(arrfriends.contains(str))
      {
          arrfriends.remove(str);
        }
        else
        {
            System.out.println( " You are not friends with the user :" + str );
        }
        
        
    }
    public void post()
    {
        
        
        
        
        
        
        
    }
    public int likes()
    {
      int like;
      like=0;
      System.out.println( "Do you want to like this message? Y/N");
       Scanner scan = new Scanner(System.in);
      String ap=scan.nextLine();
      if(ap=="Y")
      {
        like= like + 1;  
        }
        return like;
    }


}
    
    
  
    
    
