 import java.util.Scanner;
public class Stack {
 int top=-1;
 int count=5;
 int[] arr=new int[count];
 
 boolean isempty()
 {
	 if(top==-1)
		 return true;
	 else
		 return false;
 }
 boolean isfull()
 {
	if (top == count )
	{
		return true;
	}
	else
	{
		return false;
	}
	 
 }
 
 void push(int data)
 {
	 
	 if(isfull())
	 {
		 System.out.println("Stack Full");
		 
	 }
	 else
	 {
		top++;
		arr[top]=data;
		System.out.println("Element Added!!");
	 }
 }
 int pop ()  
 {   
     if(top == -1)   
     {  
         System.out.println("Underflow");
         return 0;  
     }  
     else  
     {  
    	 int ele=arr[top -- ];
         System.out.println("popped element:"+ele);
         return 1;   

     }    
 } 
 
 void display ()  
 {  
	 if(isempty())
	 {
	     System.out.println("Stack Empty");  

	 }
	 else
	 {
     System.out.println("Printing stack element");  
     for(int i = top; i>=0;i--)  
     {  
         System.out.println(arr[i]);  
     }  
	 }
 }  
 
 void top()
 {
	 
 System.out.println("Top Element:"+arr[top]);
 }
	public static void main(String[] args) {
		
		  int choice=0;  
		    Scanner sc = new Scanner(System.in);  
		    Stack s = new Stack();  
		    System.out.println("Stack operations using array\n");  
		  
		    while(choice != 5)  
		    {  
		        System.out.println("\nChose one from the below options...\n");  
		        System.out.println("\n1.Push\n2.Pop\n3.Show\n4.Top element\n5.Exit");  
		        System.out.println("\n Enter your choice \n");        
		        choice = sc.nextInt();  
		        switch(choice)  
		        {  
		            case 1:  
		            {  
		            	System.out.println("Enter data");
		            	int data=sc.nextInt();
		                s.push(data);  
		                break;  
		            }  
		            case 2:  
		            {  
		                s.pop();  
 		                break;  
		            }  
		            case 3:  
		            {  
		                s.display();  
		                break;  
		            } 
		            case 4:
		            {
		            	s.top();
		            	break;
		            	
		            }
		            case 5:   
		            {  
		                
		                System.exit(0);  
		                break;   
		            }  
		            default:  
		            {  
		                System.out.println("Please Enter valid choice ");  
		            }   
		        };  
		    }  
		
 
	}

}

