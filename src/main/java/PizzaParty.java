import java.util.Scanner;

public class PizzaParty {
    public static void main(String[] args){

        System.out.print("How many people? ");
        Scanner input1 = new Scanner(System.in);
        int people = input1.nextInt();

        System.out.print("How many pizzas do you have? ");
        Scanner input2 = new Scanner(System.in);
        int pizzaAmount = input2.nextInt();

        System.out.print("How many slices per pizza? ");
        Scanner input3 = new Scanner(System.in);
        int slices = input3.nextInt();

        int serving = (pizzaAmount * slices) / people;
        int leftover =  (pizzaAmount * slices) % people;

        System.out.printf("%d people with %d pizzas\n", people, pizzaAmount);
        System.out.printf("Each person gets %d pieces of pizza.\n", serving);
        System.out.printf("There are %d leftover pieces.", leftover);
    }
}
