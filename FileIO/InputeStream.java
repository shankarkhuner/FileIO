
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileOutputStream;




class ReadWriteInputStream

{
	public static void main(String[] args) throws FileNotFoundException,IOException
	{
		FileInputStream fis = new FileInputStream("D:\\Cyber.txt");
		FileOutputStream fos = new FileOutputStream("D:\\Success.txt");
		int info;
		while((info=fis.read())!=-1)
			{
				System.out.println(" "+(char)info);
				fos.write(info);
			}
			fis.close();
			fos.close();

		
	}
}
/*
FileIO :- System.out.println();
*/