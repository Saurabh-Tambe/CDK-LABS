//PROBLEM STATEMENT:Write a program to display the message, “Welcome to Basic Java”. To do this, define a string array greeting, store each word (say Welcome) in the separate array element of array greeting and then display the above message using the array.


public class lab3 {
	public static void main(String[] args)
	{
String[] greetings=new String[4];

greetings[0]="Welcome";
greetings[1]="to";
greetings[2]="Basic";
greetings[3]="Java";
	 

	for(int i=0;i<4;i++)
    {
		System.out.print(greetings[i]+" ");
	}
	}
}
