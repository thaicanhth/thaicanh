package buoi03;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<>();
        placesToVisit.add("AAA");
        placesToVisit.add("Ca Mau");
        placesToVisit.add("Vinh");
        placesToVisit.add("Ho Chi Minh");
        placesToVisit.add("Da Nang");
        placesToVisit.add("Ha Nội");
        placesToVisit.addLast("XXX");
        printList(placesToVisit);
        placesToVisit.remove("Ha Noi");
        System.out.println("" + placesToVisit);
    }
    private static void printList(LinkedList<String> myPlacesTovisit) {
        int index = 1;
        Iterator<String> myPointer = myPlacesTovisit.iterator();
        while (myPointer.hasNext()) {
            System.out.println(index + " - Now we at airport " + myPointer.next());
            index++;
        }
        System.out.println("========================");
    }
    private static boolean addInOrder(LinkedList<String> myPlacesToVisit, String newCity) {
        ListIterator<String> listIterator = myPlacesToVisit.listIterator();
        while (listIterator.hasNext()) {
            int comparisonValue = listIterator.next().compareTo(newCity);
            if (comparisonValue == 0) {
                System.out.println(newCity + " is already included as a destination ");
                return false;
            } else if (comparisonValue > 0) {
                listIterator.previous();
                listIterator.add(newCity);
                ;
                return true;
            }
        }
        listIterator.add(newCity);
        return true;
    }
}

