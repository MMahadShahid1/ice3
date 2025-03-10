import java.util.Scanner;

public class InclassExercise3{
    public static void main (String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("First name: ");
        String fName = input.nextLine();
        System.out.print("Last name: ");
        String lName = input.nextLine();

        System.out.println("Hello " + fName + " " + lName);
        input.close();
    }

}