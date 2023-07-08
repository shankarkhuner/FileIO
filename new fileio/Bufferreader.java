

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.FileNotFoundException;


class BufferReader 
{
	public static void main(String[] args) throws IOException, FileNotFoundException
	{
		FileReader fr = new FileReader("D:\\Cyber5.txt");
		BufferedReader br = new BufferedReader(fr);
		FileWriter fw = new FileWriter("D:\\Success5.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		int info;
		while((info=br.read())!=-1)
		{
			System.out.println(" "+(char)info);
			bw.write(info);
		}
		fr.close();
		br.close();
		bw.close();
		fw.close();
	}
}
