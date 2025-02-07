import java.util.Arrays;
import java.util.stream.IntStream;

public class TryArrays {

    public static void main(String args[]){

        int[] xy = IntStream.range(10,20).toArray();

        int[] nums = {1,4,9,2,8,6,7,10,5,3};
        String nums_s = Arrays.toString(xy);
        System.out.println("int array"+nums_s);

        Arrays.sort(nums);
        nums_s = Arrays.toString(nums);
        System.out.println("Sorted int array"+nums_s);

        int j = Arrays.binarySearch(nums,1);
        System.out.println("Binary Search array"+ j);

        int[] nums1 = new int[10];
        Arrays.fill(nums1,1);
        System.out.println("Fill = " + Arrays.toString(nums1));


    }


}
