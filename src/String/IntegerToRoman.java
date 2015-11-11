package String;
/*
 * Given an integer, convert it to a roman numeral.

Input is guaranteed to be within the range from 1 to 3999.

Subscribe to see which companies asked this question
 */
public class IntegerToRoman {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    public String intToRoman(int num) {
        /*I = 1;
V = 5;
X = 10;
L = 50;
C = 100;
D = 500;
M = 1000;
        */
    	if(num == 0){
    		return "";
    	}
    	String[] roman={"M","CM","D","CD","C","XC","L","XL","X","IX","V","VI","I"};
    	int[] numunit={1000,900,500,400,100,90,50,40,10,9,5,4,1};
    	StringBuffer br=new StringBuffer();
    	int i=0;
    	while(num!=0){
    		while(num>=numunit[i]){
    			br.append(roman[i]);
    			num-=numunit[i];
    		}
    		i++;
    	}
    	return br.toString();
    }

}
