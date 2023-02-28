import java.util.Scanner;
public class AnimalPicker
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        boolean statement = true;
        while(statement)
        {       
            //Andrew was here                                            
        System.out.println("Which animal would you like to see: a dog, a cat, fish, or batman");
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
        else if (animal.equalsIgnoreCase("fish"))
        {
            System.out.println("          /\"*._         _\n      .-*\'`    `*-.._.-\'/\n    < * ))     ,       ( \n      `*-._`._(__.--*\"`.\\");
            statement = false;                                              
        }
        else if (animal.equalsIgnoreCase("batman"))
        {
            System.out.println("         _____       _____\n     ,-\'``_.-\'` \\   / `\'-._``\'-.\n   ,`   .\'      |`-\'|      `.   `.\n ,`    (    /\\  |   |  /\\    )    `.\n/       `--\'  `-\'   `-\'  `--\'       \\\n|                                   |\n\\      .--.  ,--.   ,--.  ,--.      /\n `.   (    \\/ lt.\\ /    \\/    )   ,\'\n   `._ `--.___    V    ___.--\' _,\'\n      `\'----\'`         `\'----\'` ");
            statement = false;                                              
        }
        else
        {
            System.out.println("Invalid Input");
        }
        }
    }
}