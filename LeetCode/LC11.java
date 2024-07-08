public class LC11 {
    public int maxArea(int[] height) {
        int max = 0;
        int i = 0;
        int j = height.length - 1;
        while (i < j) {
            int area = Math.min(height[i], height[j]) * (j - i);
            max = Math.max(max, area);
            if (height[i] < height[j]) {
                i++;
            } else {
                j--;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        LC11 l = new LC11();
        int[] height = {4,3,5,2,4};
        System.out.println(l.maxArea(height));
    }
}
