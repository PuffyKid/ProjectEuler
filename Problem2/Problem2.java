public class Problem2{

	public static void main(String [] args){

		final int UPPER_BOUND = 4000000;
		
		int sum = 2;
		//every 3rd term will be even.
		for(int i = 1,j = 2, isEven = 1 ; j < UPPER_BOUND; sum += (isEven == 0 )? j : 0 , isEven = (isEven ==2)?0:isEven+1){
			//Swap i and j
			i = i ^ j;
			j = i ^ j;
			i = i ^ j;

			j = i + j;
		}
		System.out.println(sum);
	}
}
