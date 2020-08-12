 //Accept string from user and print until user says stop

import java.util.Scanner;


class Demo7{
  public static void main(String[] args) {
    String str1;
 
    String str2="stop";
    Scanner input = new Scanner(System.in);
   
    while (true) {  
      System.out.println("Input a string");
      str1 = input.next();
     
      if (str1.equals(str2)) {
        break;
      }
      else
      {
    	  System.out.println("String is:"+str1);
    	    
    	  
    }
 
      }
    
  }
}
