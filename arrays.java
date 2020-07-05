
public class arrays {

	public static void main(String[] args) {

		//part 1
		int[] ages = new int[] {3, 9, 23, 64, 2, 8, 28, 93, 103};
		
		System.out.println(ages[ages.length-1] - ages[0]);
		
		int sum = 0;
			for (int age : ages) {
				sum += age;
				
			}
				System.out.println(sum / ages.length);
			

		//part 2
		String[] names = new String[6];
				
		names[0] = "Sam";
		names[1] = "Tommy";
		names[2] = "Tim";
		names[3] = "Sally";
		names[4] = "Buck";
		names[5] = "Bob";
		
		double averageLetters = 0;
		for(String name : names) {
		averageLetters += name.length();
		}
			System.out.println(averageLetters / names.length);
		
		String combinedNames = ""; 
		for (String name : names){
		combinedNames += name + " ";
		}
			System.out.println(combinedNames);	
			
			
		//part 5
			int[] nameLengths = new int[names.length];
			for (int x = 0; x < names.length; x++) {
				nameLengths[x] = names[x].length();
				
				
		//part 6
			int sumOfNameLengths = 0;
			for (int name : nameLengths) {
			sumOfNameLengths += name;
			}
			System.out.println(sumOfNameLengths);	
	}			
	
		//part 12 inputs	
		boolean isHotOutside = true;
		double moneyInPocket = 11.50;	
		System.out.println(willBuyDrink(isHotOutside, moneyInPocket) );	
			
	}
	
	
		//part 7
		public static String selfConcatenate(String word, int n) {	
		String wordRepeat = "";
		for (int i = 0; i < n; i++) {
			wordRepeat += word;
		}
		return wordRepeat;
		
}
		//Part 8
		public static String fullName(String firstName, String lastName) {
		String fullName = firstName + " " + lastName;
		return fullName;
		}
		
		
		//Part 9 
		public static boolean greaterSum(int[] numbers) {
			int sum = 0;
			for (int number : numbers) {
				sum += number; 
			}
			return sum > 100;
		}
		
		//Part 10: Write a method that takes an array of double and returns the average of all the elements in the array.
		public static double arrayAverage(double[] numbers) {	
			double sum = 0;
			for (double number : numbers) {
				sum += number;
			} 
			return sum / numbers.length;
		}
		
		//part 11
		public static boolean arrayAveragerGreaterThan(double[] numbers1, double[] numbers2) {
			double sum1 = 0;
			double sum2 = 0;
			for (double number : numbers1) {
				sum1 += number;
			}
			for (double number : numbers2) {
				sum2 += number;
			}
			return sum1 / numbers1.length > sum2 / numbers2.length;
			
		}
			
		//part 12
		public static boolean willBuyDrink(boolean x, double y) {
			return x && y > 10.50;
		}
		
		//part 13
		//incomplete
		
		
}