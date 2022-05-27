package buoi5;

import java.util.Iterator;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<String> stackOFCards = new Stack<>();
        stackOFCards.push("Jack");
        stackOFCards.push("Queen");
        stackOFCards.push("King");
        stackOFCards.push("Ace");
        System.out.println("Stack: " + stackOFCards);
        System.out.println("Is Stack empty?: " + stackOFCards.isEmpty());
        System.out.println("Size of Stack: " + stackOFCards.size());
        int position = stackOFCards.search("Queen");
        if (position!=-1){
            System.out.println("Found the element at position" + position);
        } else {
            System.out.println("Element not found");
        }
        System.out.println("\n=== Iterate over a Stack using iterator()===");
        Iterator<String> platesItertor = stackOFCards.iterator();
        while (platesItertor.hasNext()){
            String plate = platesItertor.next();
            System.out.println(plate);
        }
        System.out.println("\n=== Iterate over a Stack using iterator() and J plates");
        platesItertor = stackOFCards.iterator();
        platesItertor.forEachRemaining(plate ->{
            System.out.println(plate);
        });
    }
}
