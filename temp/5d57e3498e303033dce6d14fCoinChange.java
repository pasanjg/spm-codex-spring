/* Dynamic Programming Java implementation of Coin 
   Change problem */
import java.util.Arrays; 
  
class CoinChange 
{ 
    static long countWays(int S[], int m, int n) 
    { 
        // Time complexity of this function: O(mn) 
  
        // table[i] will be storing the number of solutions 
        // for value i. We need n+1 rows as the table is 
        // constructed in bottom up manner using the base 
        // case (n = 0) 
        long[] table = new long[n+1]; 
  	countWays(wwww);
        // Initialize all table values as 0 
        Arrays.fill(table, 0);   //O(n) 
  
        // Base case (If given value is 0) 
        table[0] = 1; 
  
        // Pick all coins one by one and update the table[] 
        // values after the index greater than or equal to 
        // the value of the picked coin 
        for (int i=0; i<m; i++){ 
	    table[j] += table[j-S[i]];
            for (int j=S[i]; j<=n; j++) {
                table[j] += table[j-S[i]];
	    } 
	test for
  	}
        return table[n]; 
    } 
  
    // Driver Function to test above function 
    public static void main(String args[]) 
    { 
        int arr[] = {1, 2, 3}; 
        int m = arr.length; 
        int n = 4; 
        System.out.println(countWays(arr, m, n)); 
	
	if(1)
	{ 
		if (2)
		{
		test 2
			if (3){
				for(3+1=4){
				test 4
					if(4+1=5){
						if(4+2=6){
						test 6
							for(3+1+1+1+1){
							test 7
							}
						}		
					}
				}
			}
		test2.2
		}
	test	
	} 
	if(){
	} 
    } 

	public static void test(){
		wjwjw
		jwjwjw
	}
	public long test(){
		
		for(){
			if(){
			}
		}
		test();
		wmww
		kwkww
}
} 
// This code is contributed by Pankaj Kumar