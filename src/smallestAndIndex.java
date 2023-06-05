import java.util.*;

public class smallestAndIndex {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[7];
        int temp = Integer.MAX_VALUE;

        int index = 0;

        for (int i = 0; i < 7; i++) {
            int num = sc.nextInt();
            arr[i] = num;
        }

        for (int i = 0; i < 7; i++) {

            if (arr[i] < temp) {
                temp = arr[i];
                index = i;
            }

        }
        System.out.println("smallest:" + temp);
        System.out.println("Index:" + index);
        print(arr);
        sc.close();
    }

    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
    }
}
