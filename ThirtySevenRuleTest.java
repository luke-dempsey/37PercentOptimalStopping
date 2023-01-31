package ldemp2020;

public class ThirtySevenRuleTest {
	
	public static void main(String[] args) {
		System.out.println("Test");
		
		ThirtySevenRule test = new ThirtySevenRule();
		
		int[] data = test.makeNums();
		
		System.out.println(test.printNums(data));
		System.out.println("/nACTUAL");
		System.out.println(test.findHighest(data));
		System.out.println("/nGUESS");
		System.out.println(test.guess(data));
				
		
		
	}

}
