import java.io.*;
import java.util.*;
import java.sql.Timestamp;

public class Message extends User
{
       String  user1;
        Timestamp time = new Timestamp(System.currentTimeMillis());
        public String txt()
        {
         System.out.println( " Write the message you want to send");
         Scanner scan= new Scanner(System.in);
          String txt =scan.nextLine();
          return txt;
            
        }
    public void getlikes()
    {
    
    }
    
    public void ReplyMessage()
    {
        ReplyMessage rp= new ReplyMessage();
       ArrayList<String> allmessages = new ArrayList<String>(); 
       System.out.println(rp);
       System.out.println (allmessages);
     
        
    }
}
