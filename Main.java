import java.util.Scanner;
/**
 * Creates a hollow box of astericks
 * @author Jaden Ramcharan
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // creates scanner for user input
    Scanner input = new Scanner(System.in);

    //Gets number from user
    System.out.println("Please enter a number between 1 and 10");
    int userNum = input.nextInt();


    //loop for vertical astericks
    for(int i = 1; i <= userNum; i++){
      for(int j = 1; j <= userNum; j++){
        if(i == 1 || i == userNum || j == 1 || j == userNum){
          System.out.print("*");
        }else{
          System.out.print(" ");
        }
      }
      System.out.println("");
    }
  }
}
