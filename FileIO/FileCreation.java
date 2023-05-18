import java.io.*;

class Demo 
{
	public static void main(String[] args) throws IOException
	{
		File f = new File("D:\\Cyber.txt");
		if(f.createNewFile())
			{
				System.out.println("File Successfully Created");
			}
			else
				{
					System.out.println("File is Already Exist");
				}
	}
}
/*
Exception handeled by using throws keyword, 
There are another way to handeled by using throws keyword
*/