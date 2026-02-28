import java.util.List;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Menu 
{
    Scanner iterator = new Scanner(System.in);
    Scanner noYesNav = new Scanner(System.in);
    
    public void run()
    {  
        this.navegator();
    }

    public void navegator()
    {
        Scanner navegator = new Scanner(System.in);        
        int iterator;

        do
        {                                                
            System.out.println("------------------------------------------------------------");
            System.out.println("Welcome to calculator!");
            System.out.println("Please, select one option:");
            System.out.println("1. Sum");
            System.out.println("2. Less");
            System.out.println("3. Multiple");
            System.out.println("4. Divider");
            System.out.println("5. Squared");
            System.out.println("0. Exit");
            System.out.println("-------------------------------------------------------------");
           
            iterator = navegator.nextInt();

            switch (iterator) {
                case 0:
                    
                    System.out.println("Bye :)");
                    break;

                case 1:

                    this.getSum();
                    break;

                case 2:

                    this.getLess();
                    break;
                
                case 3:

                    getMultiple();                    
                    break;
                
                case 4:
                    
                    this.getDivide();
                    break;

                case 5:

                    this.getSquare();
                    break;

                default:
                    
                    System.out.println("Invalid choice, please try again");
                    break;
            }

        }while(iterator != 0);
    }
    

    public void getSum()
    {
        int firstNumber, secondNumber, result;
        String noYes;
        boolean isValid = true;
         
        do
        {
            System.out.println("Type the numbers do you want sum:");

            firstNumber = iterator.nextInt();

            System.out.println("Type the second number");

            secondNumber = iterator.nextInt();      
            result       = firstNumber + secondNumber;  
                
            System.out.println(firstNumber + " + " + secondNumber  + " = " + result);                                     
            System.out.println("Want sum again?[Y/N]");
            
            noYes = noYesNav.next().toUpperCase();

        } while (!noYes.equals("N"));            
    }
    
    public void getLess()
    {
        int firstNumber, secondNumber, result;
        String noYes;
        boolean isValid = true;      
        
        do
        {                     
            System.out.println("Type the numbers do you want less:");

            firstNumber = iterator.nextInt();

            System.out.println("Type the second number");

            secondNumber = iterator.nextInt();        
            result       = firstNumber-secondNumber;

            System.out.println(firstNumber + " - " + secondNumber  + " = " + result);  
            System.out.println("Want sum again?[Y/N]");                    

            noYes = noYesNav.next().toUpperCase();

        } while (!noYes.equals("N"));            
    }

    public void getMultiple()
    {
        int firstNumber, secondNumber, result;
        String noYes;
        boolean isValid = true;       
        
        do
        {
            System.out.println("Type the numbers do you want multiple:");

             firstNumber = iterator.nextInt();

            System.out.println("Type the second number");

            secondNumber = iterator.nextInt();        
            result       = firstNumber * secondNumber;

            System.out.println(firstNumber + " * " + secondNumber  + " = " + result); 
            System.out.println("Want sum again?[Y/N]");                    

            noYes = noYesNav.next().toUpperCase();

        } while (!noYes.equals("N"));
    }

    public void getDivide()
    {
        float firstNumber, secondNumber, result;;    
        String noYes;
        boolean isValid = true;
               
        do
        {
            System.out.println("Type the numbers do you want to divide:");

            firstNumber = iterator.nextInt();

            System.out.println("Type the second number");

            secondNumber = iterator.nextInt();        
            result       = firstNumber / secondNumber;

            System.out.println(firstNumber + " - " + secondNumber  + " = " + result);        
            System.out.println("Want sum again?[Y/N]");                    

            noYes = noYesNav.next().toUpperCase();

        } while (!noYes.equals("N"));
             
    }

    public void getSquare()
    {
        int firstNumber, result;
        String noYes;
        boolean isValid = true;
      
        do
        {
            System.out.println("Type the numbers do you want elevate to square:");

            firstNumber = iterator.nextInt();
            result      = firstNumber * firstNumber;

            System.out.println(firstNumber + " elevate "  + " = " + result);        
            
            
            System.out.println("Want sum again?[Y/N]");                    

            noYes = noYesNav.next().toUpperCase();

        } while (!noYes.equals("N"));        
    }
}
