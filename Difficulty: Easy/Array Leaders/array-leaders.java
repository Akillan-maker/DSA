class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here\
        int max=Integer.MIN_VALUE;
        ArrayList<Integer> arr1=new ArrayList<>();
        
        for(int i=arr.length-1;i>=0;i--){
              if(max<arr[i]){
                  max=arr[i];
              }
              if(arr[i]>=max){
                  arr1.add(arr[i]);
              }
        }
        Collections.reverse(arr1);
        return arr1;
    }
}
