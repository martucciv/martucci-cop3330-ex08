package ex08;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  Copyright 2021 Veronica Martucci
 */
import java.util.Scanner;

public class PizzaParty {
    Scanner input = new Scanner(System.in);

    public static void main(String[] args){
        PizzaParty app = new PizzaParty();
        int people = app.inputPeople();
        int pizzaAmount = app.inputPizza();
        int slices = app.inputSlices();
        int serving = app.calcServing(pizzaAmount, slices, people);
        int leftover = app.calcLeftover(pizzaAmount, slices, people);
        app.printOutput(people, pizzaAmount,serving, leftover, slices);
    }

    public int inputPeople(){
        System.out.print("How many people? ");
        return input.nextInt();
    }

    public int inputPizza(){
        System.out.print("How many pizzas do you have? ");
         return input.nextInt();
    }

    public int inputSlices(){
        System.out.print("How many slices per pizza? ");
        return input.nextInt();
    }

    public int calcServing(int pizzaAmount, int slices, int people){
        return (pizzaAmount * slices) / people;
    }

    public int calcLeftover(int pizzaAmount, int slices, int people){
        return (pizzaAmount * slices) % people;
    }

    public void printOutput(int people, int pizzaAmount, int serving, int leftover, int slices){
        System.out.printf("%d people with %d pizzas (%d slices)\n", people, pizzaAmount, (slices * pizzaAmount));
        System.out.printf("Each person gets %d pieces of pizza.\n", serving);
        System.out.printf("There are %d leftover pieces.", leftover);
    }
}
