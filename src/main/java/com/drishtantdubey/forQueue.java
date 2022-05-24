package com.drishtantdubey;

import java.util.*;

public class forQueue {
    public static void main(String[] args) {
        {/*
        Queues are like waiting people in the line for billing
        Inserting Happens on the tail of the queue.
        Removal happens on the head of Queue.
        The Popping happens on the principle Of FIFO which is
        First In First Out.

                Throws exception    Returns special value
        Insert      add(e)              offer(e)
        Remove      remove()            poll()
        Examine     element()           peek()

        */}
        System.out.println("Create the Stack:\nEnter y for Yes\nEnter n for No");
        Scanner queue_choice = new Scanner(System.in);
        char queue_choice_input = queue_choice.next().charAt(0);
        switch (queue_choice_input){
            case 'y':
            case 'Y':
                System.out.println("Creating Queue");
                Queue<Integer> queue = new LinkedList<>();
                createQueue(queue);
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

    public static void createQueue(Queue<Integer> input_queue){
        System.out.println("Do a Stack Function In their No.s :\n(1.) Add\n(2.) Remove\n(3.) Poll\n(4.) Element\n(5.) Peek\n(6.) Quit");
        Scanner queue_func = new Scanner(System.in);
        int queue_func_input = queue_func.nextInt();
        switch (queue_func_input) {
            case 1:
                input_queue= queue_add(input_queue);
                createQueue(input_queue);
                break;
            case 2:
                input_queue= queue_remove(input_queue);
                createQueue(input_queue);
                break;
            case 3:
                input_queue= queue_poll(input_queue);
                createQueue(input_queue);
                break;
            case 4:
                input_queue= queue_element(input_queue);
                createQueue(input_queue);
                break;
            case 5:
                input_queue= queue_peek(input_queue);
                createQueue(input_queue);
                break;
            case 6:
                System.out.println("Okay You Are Quiting");
                break;
            default:
                System.out.println("Wrong Input Renter");
                createQueue(input_queue);
                break;
        }
    }
    public static Queue<Integer> queue_add(Queue<Integer> input_queue_pram) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Add Element");
        int queue_input = scanner.nextInt();
        System.out.println("Executing Adding");
        input_queue_pram.add(queue_input);
        System.out.println(input_queue_pram.toString());
        return(input_queue_pram);
    }
    public static Queue<Integer> queue_remove(Queue<Integer> input_queue_pram) {
        System.out.println("Executing Remove");
        input_queue_pram.remove();
        System.out.println(input_queue_pram.toString());
        return(input_queue_pram);
    }
    public static Queue<Integer> queue_poll(Queue<Integer> input_queue_pram) {
        System.out.println("Executing Poll");
        input_queue_pram.poll();
        System.out.println(input_queue_pram.toString());
        return(input_queue_pram);
    }
    public static Queue<Integer> queue_element(Queue<Integer> input_queue_pram) {
        System.out.println("Executing Empty");
        int element_element = input_queue_pram.element();
        System.out.println(element_element);
        System.out.println(input_queue_pram.toString());
        return(input_queue_pram);
    }
    public static Queue<Integer> queue_peek(Queue<Integer> input_queue_pram) {
        System.out.println("Executing Peek");
        int peek_element = input_queue_pram.peek();
        System.out.println(peek_element);
        System.out.println(input_queue_pram.toString());
        return (input_queue_pram);
    }
}
