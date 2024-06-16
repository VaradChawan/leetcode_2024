//Removing duplicate from sorted array
package LeetcodeProblems;

public class RemoveDuplicatesFromSortedArray {

    
        public static int removeDuplicates(int[] nums) {
            if(nums==null || nums.length==0){
                return 0;
            }
    
            int j=0;
            for(int i=1;i<nums.length;i++){
            if(nums[i] != nums[j]){
                j++;
                nums[j]= nums[i];
            }
    
            }
            //count
            return j+1;
        }
    

    public static void main(String[] args) {
        int nums[]= {1,1,2};
        int dup=removeDuplicates(nums); 
        System.out.println(dup);
    }
}
