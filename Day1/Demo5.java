import java.util.Scanner;
import java.util.Arrays; 
public class Demo5 {
public static void main(String[ ] args) {
    System.out.println("Enter 5 String");

   String[] str=new String[5];
   Scanner sc=new Scanner(System.in);
   for(int i=0;i<5;i++)
   {
      str[i]=sc.next();
   }
 
 Arrays.sort(str);
 
System.out.println("Sorted strings:");
for(int i=0;i<5;i++)
{
 System.out.println(str[i]);
}

}
}
