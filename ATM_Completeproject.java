import java.util.*;
import java.text.BreakIterator;
public class ATM_Completeproject{
    public static void main(String[] args){
        int pin = 12345;
        int balance = 10000;
        
        int AddAmount = 0;
        int TakeAmount = 0;

        String name;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your pin number");
        int password = scanner.nextInt();

        if(password==pin)
        {
            System.out.println("Enter your name");
            name = scanner.next();
            System.out.println("Welcome " +name);
            while (true) 
            {
                System.out.println("Press 1 to check your balance");
                System.out.println("Press 2 to add amount");
                System.out.println("Press 3 to take amount");
                System.out.println("Press 4 to take receipt");
                System.out.println("Press 5 to Exit");

                int opt = scanner.nextInt();
                switch (opt) {
                    case 1:
                         System.out.println("Your current balance is " +balance);
                         break;
                        
                    case 2:
                         System.out.println("How much amount did you want to ADD to your Account");
                         AddAmount=scanner.nextInt();
                         System.out.println("Sucessfully creditied");
                         balance = AddAmount + balance;
                         break;
                    case 3:
                         System.out.println("How much amount did you wnat to take");
                         TakeAmount=scanner.nextInt();
                         if(TakeAmount>balance)
                         {
                            System.out.println("Your balance is insufficient");
                            System.out.println("Try less than your available balance");
                         }
                         else
                         {
                            System.out.println("Successfully Taken");
                            balance=balance-TakeAmount;
                    
                         }
                         break;
                    case 4:
                    
                        System.out.println("Welcome to All in One Mini ATM");
                        System.out.println("Available balance is "+balance);
                        System.out.println("Amount deposited "+AddAmount);
                        System.out.println("Amount taken "+TakeAmount);
                        System.out.println("Thanks for Coming");
                    break;
                        default:
                        System.out.println("Press the number below 5");
                        break;
                    

                    
                    
                }
                if(opt ==5)
                {
                    System.out.println("ThankYou");
                    break;
                }
                
            }

        }
        else
        {
            System.out.println("Wrong pin number");
        }

    }
}

