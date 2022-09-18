import java.io.*;
import java.util.*;
import java.sql.Timestamp;

public class FriendRequest extends User
{
        String str;
        void User1(String email, String onoma)
        {
            this.email=email;
            this.onoma=onoma;
        }
       String user2;
       ArrayList<String> arr;
       ArrayList<String> arrfriends;
       ArrayList<String> friend_request_sent;
    Timestamp t = new Timestamp(System.currentTimeMillis());
    public String toString()
    {
        return "From "+user1+" to "+ user2+  "condition :"+ str + " Timestamp :"+ t;   
    }     
        public String condition(   ArrayList<String> arr, ArrayList<String> arrfriends)
        {
    if(arrfriends.contains(user2)) 
    {
        str="accepted";
        
        
    }
     else if (friend_request_sent.contains(user2))
    {
        str= "pending";
        
    }  else
{
 str= "rejected" ;      
            
}      
return str;
 }
   
    
    
}