package bootcamp.dsa.java.array;

public class ArrayOperation {

    public static void main(String[] args) {
        int[] arr = {10,20,30,40};

    }

    /*
       Inserting an element at the position
     */
    public static int insert(int[] arr, int x, int pos, int cap, int n){
        if(n == cap){
            return n;
        }
        int idx = pos - 1;
        for (int i = n ; i >= idx ; i--){
            arr[i+1] = arr[i];
        }
        arr[idx] = x;
        return n+1;
    }

    /*

     */



}
