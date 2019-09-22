package domaci_2_09082019;

import java.util.Scanner;


public class HelloWorld
{

  public static void main(String[] args)
  { 
    Scanner sc= new Scanner(System.in);
      int a,b=5;
         System.out.println("Uneti vrednosti 1,2 ili 3");

    //Unosi se neka vrednost u a
    a=sc.nextInt();
    switch(a){
      case 1://neke komande
      System.out.println(a+5);
      break;
      case 2:System.out.println(a+6);
      break;
      case 3:
      System.out.println(a+7);
      break;
      default :
                                   System.out.println("Uneti samo vrednosti 1,2 ili 3");
    
    }
    
  }
}
