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

                    System.out.println("Sum");
                    break;

                case 2:

                    System.out.println("Less");
                    break;
                
                case 3:

                    System.out.println("Multiple");
                    break;
                
                case 4:
                    
                    System.out.println("Divider");
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
}
