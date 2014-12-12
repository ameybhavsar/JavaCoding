package Question1_3;

import java.util.HashMap;
import java.util.Map;

public class CheckAnagramsbyHashMap {

	public static boolean checkAnagrams(String str1, String str2){

		if(str1.length() != str2.length()){
			return false;
		}

		Map<Character, Integer> anagramMap = new HashMap<Character, Integer>();
		for(int i=0;i<str1.length();i++){
			char inputChar = str1.charAt(i);
			if(anagramMap.containsKey(str1.charAt(i))){
				int count = anagramMap.get(inputChar);
				anagramMap.put(inputChar, count+1);

			}
			else{
				anagramMap.put(inputChar,1);
			}
		}

		for(int i=0;i<str2.length();i++){
			char inputChar =str2.charAt(i);
			if(anagramMap.containsKey(inputChar)){
				int count = anagramMap.get(inputChar);
				anagramMap.put(inputChar, count-1);
				if(count<0){
					return false;
				}
			}
			else{
				return false;
			}
		}

		/*for(Character c : anagramMap.keySet()){
			if(anagramMap.get(c)!=0){
				return false;
			}
		}*/
		return true;

	}

	public static void main(String[] args) {
		boolean result = CheckAnagramsbyHashMap.checkAnagrams("amey", "yema");
		boolean result1 = CheckAnagramsbyHashMap.checkAnagrams("apple", "ppale");
		boolean result2 = CheckAnagramsbyHashMap.checkAnagrams("goat", "toas");
		System.out.println("Is Amey anagram of yema: "+result);
		System.out.println("Is apple anagram of ppale: "+result1);
		System.out.println("Is goat anagram of toad: "+result2);
	}

}
