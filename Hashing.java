//main public class
public class Hashing {
    //hash table size  
    static final int s = 17;
    //main method
    public static void main(String[] args) {
    //array of numbers
        int[] array = {6, 12, 34, 29, 28, 11, 23, 7, 0, 33, 30, 45};
        //insert the numbers into the hash table
        int[] hashTable = new int[s];
        for (int i = 0; i < array.length; i++) {
            insertion(hashTable, array[i]);
        }
        //print the hash table
        System.out.println("\nThe hashtable is: ");
        for (int i = 0; i < s; i++){
            System.out.println(i + " ==> " + hashTable[i]);
        }
}
    //method for the hash table
    private static void insertion(int[] hashTable, int num) {
        //get index of number
        int index = num % s;
        //apply linear probing for collisions
        while(hashTable[index] != 0)
            index = (index + 1) % s;
        //insert number
        hashTable[index] = num;
    }
}
