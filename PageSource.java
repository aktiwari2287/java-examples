package practice_program;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class PageSource {

	private static void getSource() throws Exception {

		URL yahoo = new URL("https://www.nucc.org/index.php/code-sets-mainmenu-41/provider-taxonomy-mainmenu-40/csv-mainmenu-57");
		BufferedReader in = new BufferedReader(new InputStreamReader(yahoo.openStream()));

		String inputLine;

		while ((inputLine = in.readLine()) != null)
			System.out.println(inputLine);

		in.close();

	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		getSource();

	}

}
