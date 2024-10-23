import java.util.Scanner;
public class reverseNumber{
public static void revNum(int number){
  if ( number<10){
    System.out.print(number);
    return;
  }
  else{
    System.out.print(number%10);
    revNum(number/10);
  }
  
}

  public static void  main(String[] args){
    System.out.print("Enter the number that you want to reverse: ");  
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    System.out.print("The reverse of the given number is: ");  
    //method calling  
    revNum(num);
  }
}
  
