package jsoup_ex.meditouch;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class PageSource {

	private static void getSource() throws Exception {

		URL yahoo = new URL(
				"https://www.nucc.org/index.php/code-sets-mainmenu-41/provider-taxonomy-mainmenu-40/csv-mainmenu-57");
		BufferedReader in = new BufferedReader(new InputStreamReader(yahoo.openStream()));
		String inputLine;
		String tmp = "";
		while ((inputLine = in.readLine()) != null)
			tmp = tmp + inputLine;
		String s = tmp.substring(tmp.indexOf("current version"), tmp.indexOf("Previous versions"));
		System.out.println(s.split("href=")[1].split(">")[0].replace("\"", ""));
		in.close();
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		getSource();

	}

}
