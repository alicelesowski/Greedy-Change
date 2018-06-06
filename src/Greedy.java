
public final class Greedy {
	
	
	
	//public static void main(String[] args) {
		
	//int[] array = {25,10,5,1};
	//int num = 42;
	//int[] total = calculate(array, num);
	
	
	public static int print(int[] array) {
		//int totalCoins;
		int num = 42;
		int[] total = calculate(array, num);
	for (int i=0; i<array.length; i++) {
		if(total[i]>0) {
			if(array[i]==25) {
				System.out.println(total[i] +  " Quarter(s)");
			}
			else if(array[i]==10) {
				System.out.println(total[i] +  " Dime(s)");
			}
			else if(array[i]==5) {
				System.out.println(total[i] +  " Nickle(s)");
			}
			else {
				System.out.println(total[i] +  " Pennie(s)");
			}
			//System.out.println(total[i] + "=" + array[i]);
		}
		
		//System.out.println("Lowest Number of Coins: " + totalCoins);
	
		//return totalCoins;
	}
	return getCoinTotal(total);
}
	public static int[] calculate(int[] coins, int x){
			if(coins.length==0){
			throw new IllegalArgumentException("Array of size 0 is not allowed");
			}
		int[] change = new int[coins.length];
		for(int i = 0; i<coins.length; i++) {
			while(x>=coins[i]) {
				change[i]++;
				x = x - coins[i];
			}	
	}return change;
}	
	public static int getCoinTotal(int[] coins){
		int x = 0;
		for (int i=0; i<coins.length; i++) {
			if(coins[i]>0) {
				x = x + coins [i];
			}
			
		}return x;
	}
	}
