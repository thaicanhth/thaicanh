package buoi00002;

public class Main {
    /**
      * @param args the command line arguments
      */
public static void main(String[] args) {
         // TODO code application logic here
         MyTranIntArray myTranIntArray = new MyTranIntArray(50);
         myTranIntArray.add(3);
         myTranIntArray.add(7);
         myTranIntArray.add(6);
         myTranIntArray.add(-2);

         myTranIntArray.sort(); // [-2, 3, 6, 7]

         // Prints [-2, 3, 6, 7]
         for (int i = 0; i < myTranIntArray.size(); i++) {
             System.out.println(myTranIntArray.get(i));
             }
         // Prints [-2, 3, 6, 7]
         System.out.println(myTranIntArray);

         }
 }
