

//Charectar Orianted Stream Channel:-

import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileWriter;



class CharectarChannel
{
	public static void main(String[] args) throws FileNotFoundException, IOException
	{
		FileReader fr = new FileReader("D:\\cyber3.txt");
		FileWriter fw = new FileWriter("D:\\Success3.txt");
		int info;

		while((info=fr.read())!=-1)
		{
			System.out.println(" "+(char)info);
			fw.write(info);
		}
		fr.close();
		fw.close();
	}
}
