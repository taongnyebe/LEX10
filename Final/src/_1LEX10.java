import java.io.*;

public class _1LEX10 {

	public static void main(String[] args) 
	{
		try 
		{
			BufferedReader br = new BufferedReader(
					new FileReader("C:\\Users\\ACER NITRO 5\\eclipse-workspace\\Final\\Test\\_1LEX10\\out.txt"));
			
			BufferedWriter bw = new BufferedWriter(
					new FileWriter("C:\\Users\\ACER NITRO 5\\eclipse-workspace\\Final\\Test\\_1LEX10\\in.txt"));
			
			String placeholder;
			
			while((placeholder = br.readLine()) != null)
			{
				
				bw.write(placeholder.replaceAll(" ", "_"));
			}
			
			br.close();
			bw.close();
		}
		catch(Exception ex)
		{
			return;
		}

	}

}
