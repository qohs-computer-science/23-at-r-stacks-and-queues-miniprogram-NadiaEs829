//Nadia Escamilla, 12/9/24, pd: 7, CP3
//The purpose of this class is to practice with Stacks and Queues by addding and modifying these lists
import java.util.Scanner;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

class SLLTester {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Stack<String> myStk = new Stack<String>();

    for(int i = 0; i < 5; i++){
      System.out.println("Enter a whole number");
        String num = input.nextLine();
        myStk.push(num);
    }//end for loop

    Stack<String> tempStk = new Stack<String>();
    //Part 1 - practice with Stacks - make into a method
    while(!myStk.isEmpty()){
      String first = myStk.pop();
      tempStk.push(first);
      tempStk.push(first);
      }//end while
    while(!tempStk.isEmpty()){
      String first = tempStk.pop();
      tempStk.pop();
      myStk.push(first);
      myStk.push(first);
    }//end while
    
    System.out.print("Bottom of the Stack " + myStk + " Top of the Stack ");
    while(!myStk.isEmpty()){ 
      if(myStk.equals())
    }
//Part 2 - practice with queues

  } // end main 
} // end class