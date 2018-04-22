import java.util.Scanner;

public class IsPalindrome {
	public static boolean isPal(String s){
    	 
      char c=' ';
	  StackArrayBased stack = new StackArrayBased();
	  QueueArrayBased q = new QueueArrayBased();
	  
      //String reverseString="";
      
	 int length = s.length();
	
	  for ( int i = 0; i < length; i++ ){
		  c = s.charAt(i);
		  q.enqueue(c);
		  stack.push(c);
	   }
      while (!q.isEmpty()){
    	  if (q.dequeue()!= stack.pop())
    	  return false;
      }
      return true;
	}
      public static void main(String[] args)
      {
	  Scanner sc = new Scanner(System.in);

      System.out.println("Enter a string to check if it is a palindrome:");
      String inputString = sc.nextLine();
      if (isPal(inputString))
         System.out.println("Input string is a palindrome.");
      else
         System.out.println("Input string is not a palindrome.");
      }

   }
