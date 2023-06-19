
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.BufferedOutputStream;



class Demo
{
	public static void main(String[] args) throws FileNotFoundException, IOException
	{
		FileInputStream fis = new FileInputStream("D:\\Cyber01");
		BufferedInputStream bis = new BufferedInputStream(fis);
		FileOutputStream fos = new FileOutputStream("D:\\Success02");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		int info;
		while((info = bis.read())!=-1)
			{
			System.out.println(" "+(char)info);
			bos.write(info);
		}
		fis.close();
		bis.close();
		fos.close();
		bos.close();
	}
}
