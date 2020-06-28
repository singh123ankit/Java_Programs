import java.lang.*;
import java.io.*;
class GCD{
	public static void main(String args[])throws IOException{
		int n,arr[];
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Enter for how many numbers do you want to calculate GCD");
		n=Integer.parseInt(br.readLine());
		arr=new int[n];
		System.out.println("Enter numbers for which you want to calculate GCD");
		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}
		int gcd=findGcd(arr);
		System.out.println("GCD of numbers="+gcd);
	}
	public static int findGcd(int arr[]){
		int result=arr[0];
		for(int i=1;i<arr.length;i++){
			result=gcd(result,arr[i]);
		}
		return result;
	}
	public static int gcd(int val1,int val2){
		if(val1==val2){
			return val1;
		}
		if(val1>val2){
			return gcd(val1-val2,val2);
		}
		else{
			return gcd(val1,val2-val1);
		}
	}
}