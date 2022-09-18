import java.io.*;
import java.util.*;
import java.sql.Timestamp;

public class ReplyMessage extends Message
{
        String  user1;
        Timestamp time2 = new Timestamp(System.currentTimeMillis());
        public String txt2()
        {
  System.out.println( " Write the message you want to send for a reply");
         Scanner scan= new Scanner(System.in);
          String txt2 =scan.nextLine();
          return txt2;
            
            
        }
        public String toString()
        {
    return "From" + user1 + "Has sent as a reply"+ txt2() + " at " + time2; 
    
        }
    
    
    
    
}
