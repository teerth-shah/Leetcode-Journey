class Solution {
    public int mySqrt(int x) {

        int r = 0;

        while((long)(++r) * r <= x);

        return --r;
    }
}