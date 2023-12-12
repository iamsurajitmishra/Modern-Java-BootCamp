package bootcamp.dsa.java.array;
/*
   Incase we are given a row no 'r' and column no 'c'
   We need to find out the value at position nCr.
 */

public class PascalsTriangle {
    public static void main(String[] args) {
        int r = 5;
        int c = 3;
        int element = pascalsTriangle(5,3);
        System.out.println("The element at position (r,c) is "+ element);
    }

    public static  long ncr(int n, int r){
        long res = 1;
        for (int i = 0;i<r;i++){
            res = res * (n-i);
            res = res/(i+1);
        }
        return res;
    }
    public static int pascalsTriangle(int r, int c){
        int element = (int) ncr(r-1,c-1);
        return element;
    }
}
