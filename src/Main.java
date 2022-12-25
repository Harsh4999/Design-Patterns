import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        System.out.println("Hello world!");


        int nums[] = {1,2,3,2};
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                System.out.println("dup = "+ nums[i]);
                int m = i+1;
                System.out.println("missing = "+ m);
            }
        }

    }
}