
import java.util.Arrays;

public class TestMethod {
    public static void main(String[] args) {
        //System.out.println(Arrays.toString(arrayBefore4(new int[]{1,4,2,4,7,6,7,8})));
        //System.out.println(expectedOneAndFour(new int[]{0,2,1,6,3,4}));
    }

    public int[] arrayBefore4(int array[]){
        int n = 0;
        int k = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] == 4){
                k = i;
                n = n + 1;
            }
        }
        if (n == 0){
            throw new RuntimeException();
        }
        int array1[] = new int[array.length - k - 1];
        for (int i = 0; i < array1.length; i++){
            array1[i] = array[k + 1 + i];
        }
        return array1;
    }

    public boolean expectedOneAndFour(int array[]){
        int n = 0;
        int k = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] == 1){
                n = n + 1;
            }
            if (array[i] == 4){
                k = k + 1;
            }
        }
        if (n >= 1 && k >= 1){
            return true;
        } else {
            return false;
        }
    }

}
