import java.io.*;
import java.util.Scanner;


public class _3LEX10 {

	public static void main(String[] args) 
	{
		try 
		{
			Scanner scan = new Scanner(System.in);
			System.out.println("Shift Size: "); int size = scan.nextInt();
			
			System.out.println("-------------------------");
			System.out.println("!! Reminder !!");
			System.out.println("File must be saved in desktop and txt file only");
			System.out.println("Write the correct file name only");
			System.out.println("!!!!!!!!!!!!!!");
			System.out.println("File Name: ");
			String file = scan.next();
			
			// Reminder the usage of this must be accurate ad tested
			BufferedReader br = new BufferedReader(
					new FileReader("C:\\Users\\ACER NITRO 5\\eclipse-workspace\\Final\\Test\\_3LEX10\\" + file + ".txt"));
			
			BufferedWriter bw = new BufferedWriter(
					new FileWriter("C:\\Users\\ACER NITRO 5\\eclipse-workspace\\Final\\Test\\_3LEX10\\out.txt"));
			
			String placeholder;
			
			
			
			while((placeholder = br.readLine()) != null)
			{
				for (int a = 0; a < placeholder.length(); a++)
				{
					bw.write((char)(((int)placeholder.charAt(a)) + size));
				}
			}
			
			br.close();
			bw.close();
			scan.close();
		}
		catch(Exception ex)
		{
			return;
		}

	}

}
