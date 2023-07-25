public class EqualizeArray {

    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 3, 3, 3, 6, 5, 5, 4, 7, 7,8};
        System.out.println(equalizeArray(arr));
    }

    public static int equalizeArray(int arr[]) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean unique = true;
            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == arr[j]) {
                    unique = false;
                    break;
                }
            }
            if (unique) {
                count++;
            }
        }
        return count;
    }
}