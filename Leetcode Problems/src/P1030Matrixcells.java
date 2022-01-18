import java.util.Arrays;

public class P1030Matrixcells {
    public static void main(String[] args) {
        int rows  = 2;
        int cols  = 2;
        int rCenter = 0;
        int cCenter  = 1;
        int arr[][] = new int [rows * cols][2];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int boxnumber = i * cols + j;
                arr[boxnumber][0] = i;
                arr[boxnumber][1] = j;
            }
        }
        Arrays.sort(arr,(a,b)->{
            int dist1 = Math.abs(a[0] - rCenter) + Math.abs(a[1] - cCenter);
            int dist2 = Math.abs(b[0] - rCenter) + Math.abs(b[1] - cCenter);

            return  dist1 - dist2;
        });

        for (int[] row : arr){

            // converting each row as string
            // and then printing in a separate line
            System.out.println(Arrays.toString(row));
    }

    }
}
