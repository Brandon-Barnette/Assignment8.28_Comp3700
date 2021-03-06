import static java.lang.System.*;

public class Finder {

    public static int findMax(int[] intArray) {
        if (intArray == null || intArray.length == 0) {
            return -1;
        } else {
            int result = intArray[0];
            for (int i = 0; i < intArray.length; i++) {
                if (intArray[i] > result) {
                    result = intArray[i];
                }
            }
            return result;
        }
    }

    public static int findMin(int[] intArray) {
        if (intArray == null || intArray.length == 0) {
            return -1;
        } else {
            int result = intArray[0];
            for (int i = 0; i < intArray.length; i++) {
                if (intArray[i] < result) {
                    result = intArray[i];
                }
            }
            return result;
        }
    }


    public static void main(String[] args) {
        Finder finder = new Finder();
        int[] arr = {1, 2, 3, 4, 5, 6};
        int result = finder.findMax(arr);
        int smallResult = finder.findMin(arr);
        out.println(result);
        out.println(smallResult);
    }

}
