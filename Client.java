import java.io.*;
import java.net.*;
class Client
{
	public static void main(String args[]) throws Exception
	{
		String str1,str2;
		Socket s = new Socket("localhost",9999);
		OutputStream os = s.getOutputStream();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		DataOutputStream dos =  new DataOutputStream(os);
		InputStream is = s.getInputStream();
		BufferedReader kb = new BufferedReader(new InputStreamReader(is));
		while(!(str1=br.readLine()).equals("exit"))
		{
			dos.writeBytes(str1+"\n");
			str2 = kb.readLine();
			System.out.println(str2);
		}
		kb.close();
		br.close();
		dos.close();
		s.close();
	}
}