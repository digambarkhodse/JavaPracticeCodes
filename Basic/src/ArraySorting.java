import java.util.TreeSet;

public class ArraySorting {
    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 7, 1, 9};
        int size = arr.length;
int temp=0;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

            }
            }

        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }


        int[] arr1 = {3, 5, 2, 7, 1, 9};
        TreeSet<Integer>tr=new TreeSet<>();
        for (int i = 0; i < arr1.length; i++) {
           tr.add(arr1[i]) ;
        }

        System.out.println("using treeSet "+tr);
    }

}
