import java.io.*;
public class Sample3_16 
{
	public static void main(String[] args)throws IOException
	{
		System.out.println("�п�J�@�Ӿ��");
		
		BufferedReader br =
				new BufferedReader (new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		int num = Integer.parseInt(str);
		
		System.out.println("�z��J���Ʀr�O"+ num);
	}
}
