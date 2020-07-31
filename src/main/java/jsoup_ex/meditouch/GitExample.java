package jsoup_ex.meditouch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Arrays;

public class GitExample {

	public static void main(String[] args) throws IOException
	{
		ProcessBuilder pb = new ProcessBuilder(Arrays.asList("cmd","/d","dir"));
		pb.redirectErrorStream(true);
		Process proc = pb.start();
		Reader reader = new InputStreamReader(proc.getInputStream());
		BufferedReader bf = new BufferedReader(reader);
		String s;
		while ((s = bf.readLine()) != null) {
			System.out.println(s);
		}
	}

}
