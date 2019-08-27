public class hello {
    public static class Finder {
        public static int findMax(int[] intArray) {
            int result = 0;
            for (int i = 0; i < intArray.length; i++) {
                if (intArray[i] > result) {
                    result = intArray[i];
                }
            }
            return result;
        }

        public static int findMin(int[] intArray) {
            int result = 30000000;
            for (int i = 0; i < intArray.length; i++) {
                if (intArray[i] < result) {
                    result = intArray[i];
                }
            }
            return result;
        }
    }

    /*
    public static void main(String[] args) {
        Finder finder = new Finder();
        int[] arr = {1, 2, 3, 4, 5, 6};
        int result = finder.findMax(arr);
        int smallResult = finder.findMin(arr);
        System.out.println(result);
        System.out.println(smallResult);
    }
     */
}
