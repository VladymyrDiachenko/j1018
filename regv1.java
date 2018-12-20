
public class regv1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String text = "People  will...    never       regret it";
		String[] words = text.split("\\s*(\\s)|\n");
		for(String word : words){
			System.out.println(word);
		}

	}

}
