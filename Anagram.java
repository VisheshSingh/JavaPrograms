import java.util.Arrays;
public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word = "Vishesh";
		String anagram = "heshvis";
		
		System.out.println("word and ana are anagram: "+ ana(word,anagram));
	}

	public static boolean ana(String word,String anagram)
	{
		String w = sortChars(word);
		String a = sortChars(anagram);
		
		return w.equals(a);
	}
	
	public static String sortChars(String words)
	{
		char[] ch = words.toLowerCase().toCharArray();
		Arrays.sort(ch);
		return String.valueOf(ch);
		
	}
}
