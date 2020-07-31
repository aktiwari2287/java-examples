package jsoup_ex.meditouch;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws IOException {
		String url = "https://www.nucc.org/index.php/code-sets-mainmenu-41/provider-taxonomy-mainmenu-40/csv-mainmenu-57";
		Document doc = Jsoup.connect(url).get();
		System.out.println(doc.select("#main > div:nth-of-type(2) > div > div > div:nth-of-type(3) > div > ul:nth-of-type(1) > li > a").attr("href"));
		System.out.println();
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
		//list.forEach(System.out::println);
	}
}
