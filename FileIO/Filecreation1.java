import java.io.*;

class UsingThrowsKeyword 
{
	public static void main(String[] args) 
	{
		File c = new File("d:\\Success.txt");
		try{
		if(c.createNewFile())
			{
				System.out.println("file Create");
			}
			else
				{
					System.out.println("file is already Exist");
				}
		}
		catch(IOException i)
			{
				System.out.println("Exception Modidied");
			}
	}
}
