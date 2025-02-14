package lang.wrapper;

public class MyIntegerMethodMain {
    public static void main(String[] args) {
        int value = 10;
        int i1 = compareTo(value, 5);
        System.out.println("i1 = " + i1);
    }
    public static int compareTo(int value, int target){
        if (value < target){
            return -1;
        }
        else if (value > target){
            return 1;
        }
        else{
            return 0;
        }
    }
}
