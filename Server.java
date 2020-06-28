import java.io.*;
import java.net.*;
class  Server
{
	public static void main(String args[]) throws Exception
	{
		ServerSocket ss = new ServerSocket(9999);
		Socket s = ss.accept();
		System.out.println("Connection Established");
		InputStream is = s.getInputStream();
		BufferedReader br = new BufferedReader(new InputStreamReader(is));
		OutputStream os = s.getOutputStream();
		PrintStream ps = new PrintStream(os);
		BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
		while(true)
		{
			String str1,str2;
			while((str1=br.readLine())!=null)
			{
				System.out.println(str1);
				str2 = kb.readLine();
				ps.println(str2);
			}
			kb.close();
			br.close();
			ps.close();
			ss.close();
			s.close();
			System.exit(0);
		}
	}
}