import java.util.Scanner;

class MarsGame
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the Mars character creator");

        System.out.println("What is your name?");
        String name = input.nextLine(); //Get user input

        System.out.println("What is your favorite color?");
        String color = input.nextLine(); //Get user input

        System.out.println("What is your pets name?");
        String petName = input.nextLine(); //Get user input

        System.out.println("What is your gender?");
        String gender = input.nextLine(); //Get user input

        System.out.println("What is your age?");
        String age = input.nextLine(); //Get user input

        System.out.println("Welcome " + name + 
        "\nGender: " + gender + 
        "\nAge: " + age + 
        "\nCodename: " + petName + 
        "\nUniform Color: " + color);
    }
}