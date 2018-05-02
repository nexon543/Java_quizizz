package Java8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import javax.swing.text.AbstractDocument.BranchElement;

public class Exception {
	public static void tryWithResources() throws IOException {
		MyFile f=new MyFile("file.txt");
		f.createNewFile();
		try(MyBufferedReader br=new MyBufferedReader(new FileReader("file.txt"));MyBufferedReader br1=new MyBufferedReader(new FileReader("file.txt"))) {
			throw new IndexOutOfBoundsException();
		}
		catch(FileNotFoundException ex) {
			System.out.println("Exception from resources: "+ex.toString());
			Throwable [] thr = ex.getSuppressed();
			System.out.println(thr.length);
		}
		catch (IOException ex) {
			System.out.println("Exception from resources: "+ex.toString());
			Throwable [] thr = ex.getSuppressed();
			System.out.println(thr.length);
		}
		catch (IndexOutOfBoundsException ex) {
			System.out.println("Exception from try: "+ex.toString());
			ex.printStackTrace();
			Throwable [] thr = ex.getSuppressed();
			System.out.println(thr.length);
			thr[1].printStackTrace();
			thr[0].printStackTrace();
			throw ex;
			}
	}
	public static void main(String[] args) {
		try {
		tryWithResources();
		}
		catch (IndexOutOfBoundsException ex) {
			System.out.println("Rethrown Exception: "+ex.toString());
			Throwable [] thr = ex.getSuppressed();
			System.out.println(thr.length);
			thr[1].printStackTrace();
			thr[0].printStackTrace();
		}
		catch (IOException ex) {}
	}
}

class MyFile extends File{
	public MyFile(String pathname) {
		super(pathname);
		// TODO Auto-generated constructor stub
	}

	public void close() throws IOException{
		throw new IOException();
	}
}
class MyBufferedReader extends BufferedReader {
	public MyBufferedReader(Reader in) {
		super(in);
	}

	public void close() throws IOException {
		throw new IOException();
	}
}
