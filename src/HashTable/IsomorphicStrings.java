package HashTable;
import java.util.*;
/*
 * Given two strings s and t, determine if they are isomorphic.

Two strings are isomorphic if the characters in s can be replaced to get t.

All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character but a character may map to itself.

For example,
Given "egg", "add", return true.

Given "foo", "bar", return false.

Given "paper", "title", return true.

Note:
You may assume both s and t have the same length.
 */
public class IsomorphicStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public boolean isIsomorphic(String s, String t) {
		if(s == null && t == null){
        	return true;
        }
        HashMap<Character,Character> map=new HashMap<Character,Character>();
        for(int i=0;i<s.length();++i){
        	if(!map.containsKey(s.charAt(i))){
        	    if(map.containsValue(t.charAt(i))){
        	        return false;
        	    }
        		map.put(s.charAt(i), t.charAt(i));
        	}
        	else{
        		if(map.get(s.charAt(i))!=t.charAt(i)){
        			return false;
        		}
        	}
        }
        return true;
    }
}
