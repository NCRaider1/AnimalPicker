import java.util.Scanner;
public class AnimalPicker
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        boolean statement = true;
        while(statement)
        {                                                    
        System.out.println("Which animal would you like to see: a dog or a cat");
        String animal = scanner.next();                                                                  
        if (animal.equalsIgnoreCase("dog"))
        {
            System.out.println("  __      _\no\'\')}____//\n `_/      )\n (_(_/-(_/");
            statement = false;
        }
        else if (animal.equalsIgnoreCase("cat"))
        {
            System.out.println(" _._     _,-\'\"\"`-._\n(,-.`._,\'(       |\\`-/|\n    `-.-\' \\ )-`( , o o)\n ");
            statement = false;
        }
        else 
        {
            System.out.println("Invalid Input");                                                
        }
        }
    }
}