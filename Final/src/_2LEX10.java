import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class _2LEX10 {

	public static void main(String[] args) 
	{
		try 
		{
			BufferedReader br = new BufferedReader(
					new FileReader("C:\\Users\\ACER NITRO 5\\eclipse-workspace\\Final\\Test\\_2LEX10\\in.txt"));
			
			BufferedWriter bw = new BufferedWriter(
					new FileWriter("C:\\Users\\ACER NITRO 5\\eclipse-workspace\\Final\\Test\\_2LEX10\\in.txt"));
			
			String placeholder;
			
			bw.write(String.valueOf(123));
			
			while((placeholder = br.readLine()) != null)
			{
				System.out.println(placeholder);
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
