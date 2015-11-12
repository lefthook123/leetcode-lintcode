package binarysearch;
/*
 * You are a product manager and currently leading a team to develop a new product. Unfortunately, the latest version of your product fails the quality check. Since each version is developed based on the previous version, all the versions after a bad version are also bad.

Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one, which causes all the following ones to be bad.

You are given an API bool isBadVersion(version) which will return whether version is bad. Implement a function to find the first bad version. You should minimize the number of calls to the API.
 */
public class FirstBadVersion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int firstBadVersion(int n) {
        if(n <=1){
            return n;
        }
        long left=1,right=n;
        while(left+1<right){
            long mid=left+(right-left)/2;
            //if(isBadVersion((int)mid)){
//                right=mid;
//            }
//            else{
//                left=mid+1;
//            }
        }
//        if(isBadVersion((int)left)){
//            return (int)left;
//        }
        return (int)right;
    }
}