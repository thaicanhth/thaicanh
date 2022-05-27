package buoi2;

public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyStaticArray msa = new MyStaticArray();
        msa.setMyStaticArray(new int[5]);
        msa.enterArray();
        msa.displayArray();
        msa.displayArrayReverse();
        msa.displayArrayForEach();
        System.out.println("index  of the found item =" + msa.findValueInArray(6));
    }
}
