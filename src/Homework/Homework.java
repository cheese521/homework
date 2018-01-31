package Homework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Homework {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file=new File("C:\\Users\\10031\\Desktop\\neuedu\\122.txt");
		InputStream is=new FileInputStream(file);
		byte[] b=new byte[(int)file.length()];
		is.read(b);
		
		File newfile=new File("C:\\Users\\10031\\Desktop\\neuedu\\123.txt");
		OutputStream out=new FileOutputStream(newfile);
		String abcd=new String(b);
		out.write(abcd.getBytes());
		out.close();
		
	}

}
