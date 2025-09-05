import java.util.Scanner;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i < n; i++){
		    arr[i] = sc.nextInt();
		}
		int k = sc.nextInt();
		
		int left = 0, sum = 0, best = 0;
		for(int right = 0; right < n; right++){
		    sum += arr[right];
		    while(sum > k){
		        sum -= arr[left];
		        left++;
		    }
		    best = Math.max(sum, right - left + 1);
		}
		
		System.out.println(best);

	}
}
