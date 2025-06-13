class Solution {
    public boolean isHappy(int n) {

         HashSet<Integer> seen = new HashSet<>();
        int result = n;

        while (result != 1) {
            int temp = result;
            int sum = 0;

            while (temp > 0) {
                int digit = temp % 10;
                sum += digit * digit;
                temp /= 10;
            }

            if (seen.contains(sum)) {
                return false;
            }
            seen.add(sum);
            result = sum;
        }
        return true;
    }
}