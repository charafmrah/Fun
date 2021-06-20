import java.util.Arrays;

//which one came first the egg or the chicken? well this is java's solution:

public class eggOrChicken {
	
	public static void main(String[] args) {	
		
		String[] x = {"🥚", "🐓"};
		
		Arrays.sort(x);
		
		for (int i = 0; i < x.length; i++) 
			System.out.println(x[i]);

	}

}
