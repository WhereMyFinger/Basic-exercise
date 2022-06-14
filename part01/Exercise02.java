package part01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author Admin
 *
 */
public class Exercise02 {
	
	public static final String KHONG = "không";
	public static final String MOT = "một";
	public static final String HAI = "hai";
	public static final String BA = "ba";
	public static final String BON = "bốn";
	public static final String NAM = "năm";
	public static final String SAU = "sáu";
	public static final String BAY = "bảy";
	public static final String TAM = "tám";
	public static final String CHIN = "chín";
	public static final String MUOIF = "mười";
    public static final String MUOI = "mươi";
    public static final String LAM = "lăm";
    public static final String LE = "lẻ";
    public static final String MOTS = "mốt";
    public static final String TRAM = "trăm";
    public static final String NGHIN = "nghìn";
    public static final String TRIEU = "triệu";
    public static final String TY = "tỷ";
    public static final String SPACE = " ";
    
    public static final String[] number = {KHONG, MOT, HAI, BA,
    		BON, NAM, SAU, BAY, TAM, CHIN, MUOIF};
    
    /**
     * Function splitNum: split number into substrings containing 3 or less than 3 character
     * @param num
     * @return arrayList containing number strings splited from original number
     */
    public static ArrayList<String> splitNum(long num) {
    	ArrayList<String> arrList = new ArrayList<String>();
    	String strNum = String.valueOf(num);
    	
    	int i = strNum.length();		
    	while(i>0) {
    		if(i<3) {
    			arrList.add(strNum.substring(0, i));
    		} else {
    			arrList.add(strNum.substring(i-3, i));
    		}
    		i -= 3;
    	}
    	
    	Collections.reverse(arrList);
    	
		return arrList;
    }
    
    /**
     * Function read3Number: read a 3 digits number
     * @param strNum
     * @return a String read from a 3 digits number
     */
    public static String read3Number(String strNum) {
    	int num = Integer.parseInt(strNum);
    	
    	int unit = -1;
    	unit = num % 10;
    	num /= 10;
    	
    	int dozen = -1;
    	if(num != 0 ) {
    		dozen = num % 10;
        	num /= 10;
    	}
    	
    	int hundred = -1;
    	if(num != 0) {
    		hundred = num;
    	}
    	
    	String res = "";
    	
    	//Read hundred
    	if(hundred != -1) {
    		res += number[hundred] + SPACE + TRAM + SPACE;
    	}
    	
    	//Read dozen
    	switch(dozen) 
    	{
    		case -1:
    			break;
    		case 1:
    			res += MUOIF + SPACE;
    			break;
    		case 0:
    			res += LE + SPACE;
    			break;
    		default:
    			res += number[dozen] + SPACE;  
    			break;
    	}
    	
    	//Read unit
    	switch(unit)
    	{
    		case -1:
    			break;
    		case 0:
    			res += MUOI + SPACE;
    			break;
    		case 1:
    			res += MOT + SPACE;
    			break;
    		case 5:
    			if(dozen == -1 || dozen == 0) {
    				res += NAM + SPACE;
    			} else {
    				res += LAM + SPACE;
    			}
    			break;
    		default:
    			res += number[unit] + SPACE;
    			break;
    	}
    	
    	return res;
    }
    
    /**
     * function readNum: read a number
     * @param num
     * @return a string read from a number input
     */
    public static String readNum(long num) {
    	String result = "";
    	ArrayList<String> listNum = splitNum(num);
    	
    	while(listNum.size() != 0) {
    		switch(listNum.size() % 3)
    		{
    			case 1:
    				if(listNum.size() % 3 == 1 & listNum.size() > 3) {
    	    			result += read3Number(listNum.get(0)) + TY + SPACE;
    	    		} else {
    	    			result += read3Number(listNum.get(0)) + SPACE;
    	    		}
    				break;
    			case 2:
    				String thousand = read3Number(listNum.get(0));
    				if(!thousand.isEmpty()) {
    					result += thousand + NGHIN + SPACE;
    				}	
    				break;
    			case 0:
    				String million = read3Number(listNum.get(0));
    				if(!million.isEmpty()) {
    					result += million + TRIEU + SPACE;
    				}
    				break;
    		}
    		
    		
    		
    		listNum.remove(0);
    	}
    	
		return result;
    }
    
    public static void main(String[] args) {
    	long number;
    	Scanner scanner = new Scanner(System.in);
    	
    	System.out.println("Input number: ");
    	number = scanner.nextLong();
    	
    	System.out.println(readNum(number));
    }
}
