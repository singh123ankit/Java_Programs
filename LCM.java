import java.io.*;
import java.lang.*;
public class LCM{
	public static void main(String args[])throws IOException{
		int arr[];
		System.out.print("Enter for how many numbers you want to calculate the lcm: ");
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		int n=Integer.parseInt(br.readLine());
		arr=new int[n];
		System.out.println("Enter the numbers for which you want to calculate the lcm");
		for(int i=0;i<n;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}
		int lcm=findLcm(arr);
		System.out.println("LCM of numbers="+lcm);
	}
	public static int findLcm(int arr[]){
		int count,lcm=1,q,divisor=2;
		while(true){
			count=0;
			boolean divisible=false;
			for(int i=0;i<arr.length;i++){
				if(arr[i]==0){
					return 0;
				}
				if(arr[i]<0){
					arr[i]=arr[i]*-1;
				}
				if(arr[i]==1){
					count++;
				}
				if(arr[i]%divisor==0){
				  arr[i]=arr[i]/divisor;
				  divisible=true;
			    }
		    }
			if(divisible){
				lcm=lcm*divisor;
				divisor=2;
			}
			else{
				divisor++;
			}
			if(count==arr.length){
				return lcm;
			}
		}
	}
}