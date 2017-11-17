public class Problem1{

	public static void main(String [] args){

		int [] incPattern = {3 , 2, 1, 3, 1, 2, 3};//the amount to inc is cyclic on this cycle
		final int UPPER_BOUND = 1000;
		
		int sum = 0;
		for(int i = 3,j = 1; i < UPPER_BOUND; sum += i, i += incPattern[j], j = (++j==incPattern.length)?0:j);
		System.out.println(sum);
	}
}
