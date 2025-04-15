package numberPrograms;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseNumber {

    public static void main(String [] args)
    {
       int n1=121;
       int temp=n1;
       int mod=0;
       int rev=0;
       while(n1!=0)
       {
           mod=n1%10;
           n1=n1/10;
           rev=rev*10+mod;
       }
       System.out.println(rev);
       if(temp==rev)
       {
           System.out.println("number is palindrome");
       }
       else {
           System.out.println("Not Palindrome");
       }
    }
}
