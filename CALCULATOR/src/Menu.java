import java.util.List;
import java.util.Scanner;

public class Menu 
{
    public void run()
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
    
        this.navegator();
    }

    public void navegator()
    {
        Scanner scanner = new Scanner(System.in);
        int iterator;
        
        do
        {
            iterator   = scanner.nextInt();

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

                    System.out.println("Square");
                    break;

                default:
                    
                    System.out.println("Invalid choice, please try again");
                    break;
            }

        }while(iterator != 0);

        scanner.close();
    }
    

    public void getSum()
    {
        Scanner iterator = new Scanner(System.in);
        Scanner noYesNav = new Scanner(System.in);
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
            
            do
            {
                System.out.println("Want sum again?[Y/N]");                    

                noYes = noYesNav.next().toUpperCase();

            } while (!noYes.equals("N"));
        
        } while(noYes != "N");
        
        iterator.close();
    }
    
    public void getLess()
    {
        Scanner iterator = new Scanner(System.in);
        Scanner noYesNav = new Scanner(System.in);
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
            
            do
            {
                System.out.println("Want sum again?[Y/N]");                    

                noYes = noYesNav.next().toUpperCase();

            } while (!noYes.equals("N"));
        
        } while(noYes != "N");
        
        iterator.close();
    }

    public void getMultiple()
    {
        Scanner iterator = new Scanner(System.in);
        Scanner noYesNav = new Scanner(System.in);
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
            
            do
            {
                System.out.println("Want sum again?[Y/N]");                    

                noYes = noYesNav.next().toUpperCase();

            } while (!noYes.equals("N"));
        
        } while(noYes != "N");
        
        iterator.close();
    }

    public void getDivide()
    {
        Scanner iterator = new Scanner(System.in);
        Scanner noYesNav = new Scanner(System.in);
        int firstNumber, secondNumber;
        float result;
        String noYes;
        boolean isValid = true;

        do
        {        
            System.out.println("Type the numbers do you want sum:");

            firstNumber = iterator.nextInt();

            System.out.println("Type the second number");

            secondNumber = iterator.nextInt();        
            result       = firstNumber / secondNumber;


            System.out.println(firstNumber + " - " + secondNumber  + " = " + result);        
            
            do
            {
                System.out.println("Want sum again?[Y/N]");                    

                noYes = noYesNav.next().toUpperCase();

            } while (!noYes.equals("N"));
        
        } while(noYes != "N");
        
        iterator.close();
    }
}
