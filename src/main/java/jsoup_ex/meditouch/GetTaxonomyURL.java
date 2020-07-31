package jsoup_ex.meditouch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class GetTaxonomyURL {

	private static void getURLXpathJSoup() throws IOException {
		String url = "https://www.nucc.org/index.php/code-sets-mainmenu-41/provider-taxonomy-mainmenu-40/csv-mainmenu-57";
		Document doc = Jsoup.connect(url).get();
		System.out.println(doc.select("#main > div:nth-of-type(2) > div > div > div:nth-of-type(3) > div > ul:nth-of-type(1) > li > a").attr("href"));
	}
	private static void getURLJsoup() throws IOException {
		String url = "https://www.nucc.org/index.php/code-sets-mainmenu-41/provider-taxonomy-mainmenu-40/csv-mainmenu-57";
		Document doc = Jsoup.connect(url).get();
		Elements links = doc.select("a[href$=.csv]");
		List<String> list = new ArrayList<>();
		links.forEach(e -> {
			list.add(e.attr("href"));
		});

		list.sort((x, y) -> {
		Integer a = Integer.parseInt(x.replaceAll("\\D+", ""));
		Integer b = Integer.parseInt(y.replaceAll("\\D+", ""));
			return b.compareTo(a);
		});
		list.forEach(System.out::println);
		//System.out.println(list.get(0));
	}
	private static void getURLWithoutJsoup() throws Exception {

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
		//getURLWithoutJsoup();
		//getURLXpathJSoup();
		getURLJsoup();
	}
}
