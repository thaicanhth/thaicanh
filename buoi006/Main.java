//package buoi006;
//
//public class Main {
//    public static void main(String[] args) {
//        // TODO code application logic here
//        Scanner in = new Scanner(System.in);
//        // Khai bao 1 hang doi, de chua cac ky tu cua xau
//        Queue myQueue = new LinkedList();// Dung collection nhe, co san trong java
//        // Khai bao 1 chuoi testString
//        String testString="";
//        System.out.println("ENter a string to check: ");
//        String inputString = in.nextLine();
//
//        // Tach tung ky tu ra, add vao myQueue
//        // Chieu dao nguoc
//        for (int i = inputString.length() - 1; i >= 0; i--) {
//            myQueue.add(inputString.charAt(i));
//        }
//        System.out.println(""+myQueue);// In ra de coi
//        // Muc dich cua test String la lay tung phan tu cua myQueue
//        // Nhet vao theo chieu nguoc lai
//        // remove() trong queue de xoa 1 phan tu o front.
//        // Khac la ko quang loi neu nhu queue Empty-> nho nhe
//        while (!myQueue.isEmpty()) {
//            testString = testString + myQueue.remove();
//        }
//        // Sau do so sanh testString co bang xau goc ko.
//        // Kieu la lay dao, roi lay lai, roi so sanh xau goc
//        if (inputString.equals(testString)) {
//            System.out.println(inputString+ " THis is a palindrom");
//        } else {
//            System.out.println(inputString+ " THis is NOT a palindrom");
//        }
//
//    }
//}
//palindrom