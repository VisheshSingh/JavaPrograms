import java.util.Random;
public class countDiceRoll {
	public static void main(String[] args) {
		
		Random rand = new Random();
		int freq [] = new int[7];
		
		for(int roll=1;roll<=50;roll++){
			++freq[1+rand.nextInt(6)];
		}
		
		System.out.println("Face\tFrequency");
		
		for(int f=1;f<freq.length;f++){
			System.out.println(f+"\t"+freq[f]);
		}
	}
}
