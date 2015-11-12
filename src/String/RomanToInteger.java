package String;
import java.util.*;
/*
 * Given a roman numeral, convert it to an integer.

Input is guaranteed to be within the range from 1 to 3999.

Subscribe to see which companies asked this question
 */
public class RomanToInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    public int romanToInt(String s) {
    	if(s == null || s.length() == 0){
    		return 0;
    	}
    	Map<Character,Integer> map=new HashMap<Character,Integer>();
    	map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int result=0;
        for(int i=0;i<s.length()-1;++i){
        	if(map.get(s.charAt(i))<map.get(s.charAt(i+1))){
        		result-=map.get(s.charAt(i));
        	}else{
        		result+=map.get(s.charAt(i));
        	}
        }
        result+=map.get(s.charAt(s.length()-1));
        return result;
    }

}
