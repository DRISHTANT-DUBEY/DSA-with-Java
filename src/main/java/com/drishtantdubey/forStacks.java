package com.drishtantdubey;

import java.util.Scanner;
import java.util.Stack;

public class forStacks {
    public static void main(String[] args) {
        {/*
        Stacks Are Like A box of pringles you can
        use method like pushing in the data structures to enter item by push() method
        You Can peek method to just display a value in stack.
        A pop method to remove a value.
        The Popping happens on the principle Of LIFO which is
        Last In First Out.
        */}
        System.out.println("Create the Stack:\nEnter y for Yes\nEnter n for No");
        Scanner stack_choice = new Scanner(System.in);
        char stack_choice_input = stack_choice.next().charAt(0);
        switch (stack_choice_input){
            case 'y':
            case 'Y':
                System.out.println("Creating Stack");
                Stack<Integer> stack = new Stack<>() ;
                createStack(stack);
                break;
            case 'n':
            case 'N':
                System.out.println("We Understand Your Negation");
                break;
            default:
                System.out.println("Wrong Input");
                break;

        }


    }
    public static void createStack(Stack<Integer> input_stack){
        System.out.println("Do a Stack Function In their No.s :\n(1.) Push\n(2.) Pop\n(3.) Peek\n(4.) Empty\n(5.) Search\n(6.) Quit");
        Scanner stack_func = new Scanner(System.in);
        int stack_func_input = stack_func.nextInt();
        switch (stack_func_input) {
            case 1:
                input_stack= stackPush(input_stack);
                createStack(input_stack);
                break;
            case 2:
                input_stack= stackPop(input_stack);
                createStack(input_stack);
                break;
            case 3:
                input_stack= stackPeek(input_stack);
                createStack(input_stack);
                break;
            case 4:
                input_stack= stackEmpty(input_stack);
                createStack(input_stack);
                break;
            case 5:
                input_stack= stackSearch(input_stack);
                createStack(input_stack);
                break;
            case 6:
                System.out.println("Okay You Are Quiting");
                break;
            default:
                System.out.println("Wrong Input Renter");
                createStack(input_stack);
                break;
        }
    }
    public static Stack<Integer> stackPush(Stack<Integer> input_stack_pram) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Push Element");
        int stack_input = scanner.nextInt();
        System.out.println("Executing Push");
        input_stack_pram.push(stack_input);
        System.out.println(input_stack_pram.toString());
        return(input_stack_pram);
    }
    public static Stack<Integer> stackPop(Stack<Integer> input_stack_pram) {
        System.out.println("Executing Pop");
        input_stack_pram.pop();
        System.out.println(input_stack_pram.toString());
        return(input_stack_pram);
    }
    public static Stack<Integer> stackPeek(Stack<Integer> input_stack_pram) {
        System.out.println("Executing Peek");
        int peek_element = input_stack_pram.peek();
        System.out.println(peek_element);
        System.out.println(input_stack_pram.toString());
        return(input_stack_pram);
    }
    public static Stack<Integer> stackEmpty(Stack<Integer> input_stack_pram) {
        System.out.println("Executing Empty");
        input_stack_pram.empty();
        System.out.println(input_stack_pram.toString());
        return(input_stack_pram);
    }
    public static Stack<Integer> stackSearch(Stack<Integer> input_stack_pram) {
        Scanner scanner_search = new Scanner(System.in);
        System.out.println("Enter Search Element");
        int stack_input_search = scanner_search.nextInt();
        System.out.println("Executing Search");
        int item_position = input_stack_pram.search(stack_input_search);
        System.out.println("This is the item position");
        System.out.println(item_position);
        System.out.println(input_stack_pram.toString());
        return(input_stack_pram);
    }
}
