//Nadia Escamilla, 12/9/24, pd: 7, CP3
//The purpose of this class is to practice with Stacks and Queues by addding and modifying these lists
import java.util.Scanner;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

class SLLTester {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    Stack<Integer> myStk = new Stack<Integer>();
    System.out.println("Enter 5 whole numbers");
    for(int i = 0; i < 5; i++){
        int num = input.nextInt();
        myStk.push(num);
    }//end for loop

    Stack<Integer> tempStk = new Stack<Integer>();
    //Part 1 - practice with Stacks - make into a method
    while(!myStk.isEmpty()){
      int first = myStk.pop();
      tempStk.push(first);
      tempStk.push(first);
      }//end while
    while(!tempStk.isEmpty()){
      int first = tempStk.pop();
      tempStk.pop();
      myStk.push(first);
      myStk.push(first);
    }//end while
    
    System.out.println("Bottom of the Stack " + myStk + " Top of the Stack ");
   // while(!myStk.isEmpty()){ 
   //   if(myStk.equals())
  //  }

//Part 2 - practice with queues
Queue <Integer> myQ = new LinkedList <Integer>();
Queue <Integer> even = new LinkedList <Integer>(); //try it with even = myQ then % it to see if even or odd then add to even list

System.out.println("Enter 10 whole numbers");
    for(int x = 0; x < 10; x++){
      int num = input.nextInt();
      myQ.add(num);
    }//end for loop
    
    while(!myQ.isEmpty()){
      int first = myQ.peek();
      int remove = myQ.remove();
      if(first % 2 == 0){
        //myQ.remove();
        even.add(first);
      }//end if


    }//end while
    System.out.println(even); //works correctly
    System.out.println(myQ); //prints nothing

  } // end main 
} // end class