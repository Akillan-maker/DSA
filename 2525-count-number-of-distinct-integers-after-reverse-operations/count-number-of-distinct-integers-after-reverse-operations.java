class Solution {

    public static int reverse(int num) {

        int rev=0;
        while(num > 0){
            rev*=10;
            int digit=num%10;
            rev+=digit;
            num/=10;
        }
        return rev;
    }

    public int countDistinctIntegers(int[] nums) {
                
        HashSet<Integer> set=new HashSet<>();

        for(int i=0;i<nums.length;i++){
            int temp=reverse(nums[i]);
            set.add(temp);
            set.add(nums[i]);
        }
        return set.size();
    }
}