package jsoup_ex.meditouch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class CallPythonScript {

	public void convertCSVToTxt() {
		
	}
	public static void main(String[] args) throws IOException, InterruptedException {


        ProcessBuilder pb =
                new ProcessBuilder("C:\\python\\python.exe","C:\\Users\\aktiwari\\practice\\meditouch\\taxonomy.py" ,"nucc_taxonomy_201.csv","nucc_taxonomy_201.txt");

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
