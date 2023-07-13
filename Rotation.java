package Array_rotation;
public class Rotation {
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4}; 
        int B = 2; 
        
        int[] rotatedArray = rotateArray(A, B);
        for (int num : rotatedArray) {
            System.out.print(num + " ");
        }
    }

    public static int[] rotateArray(int[] A, int B) {
        int n = A.length;
        int[] rotatedArray = new int[n];
        B %= n;
        for (int i = 0; i < n; i++) {
            int newIndex = (i + B) % n;
            rotatedArray[newIndex] = A[i];
        }
        
        return rotatedArray;
    }
}