package dynamicprogramming;

public class LongestIncreasingSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static int longestIncreasingSubsequence(int[] nums){
		if(nums == null || nums.length == 0){
			return 0;
		}
		int max=0;
		int n=nums.length;
		int[] dp=new int[n];
		for(int i=0;i<n;++i){
			dp[i]=1;
			for(int j=0;j<i;++j){
				if(nums[j]<nums[i]){
					dp[i]=Math.max(dp[i], dp[j]+1);
				}
			}
			max=Math.max(max, dp[i]);
		}
		return max;
	}

}
