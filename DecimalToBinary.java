import java.io.*;
import java.lang.*;
class DecimalToBinary{
	public static void main(String args[])throws IOException{
		int n;
		System.out.println("Enter Decimal number:");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n=Integer.parseInt(br.readLine());
		calculate(n);
	}
	public static void calculate(int n){
		int arr[]=new int[1000];
		int index=0;
		while(n>0){
			arr[index]=n%2;
			n=n/2;
			index++;
		}
		for(int i=index-1;i>=0;i--){
			System.out.print(arr[i]+" ");
		}
	}
}