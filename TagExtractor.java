package practice_program;

public class TagExtractor {

	static String extract(String str) {
		String startTag = str.substring(str.indexOf("<"), str.indexOf(">") + 1);
		String endTag = str.substring(str.indexOf("</"), str.lastIndexOf(">") + 1);
		if (isValid(startTag, endTag)) {
			return str.substring(str.indexOf(startTag) + startTag.length(), str.indexOf(endTag)).trim();
		}
		else {
			return "";
		}
	}

	static boolean isValid(String start, String end) {
		end = end.replace("/", "");
		return end.equals(start);
	}

	public static void main(String[] args) {
		System.out.println(extract("<table> <a>Anand kumar</a> </table>"));

	}

}
