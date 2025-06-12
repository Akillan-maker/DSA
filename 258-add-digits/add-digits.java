class Solution {
    public int addDigits(int num) {
        int result=num;
        while(result>9){
        String strNum=String.valueOf(result);
        String[] temp=strNum.split("");
        int t=0;
        for(int i=0;i<temp.length;i++){
            t+=Integer.parseInt(temp[i]);
        }
        result=t;
        }
        return result;
    }
}