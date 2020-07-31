package jsoup_ex.meditouch;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FileDownload {

	public static void downloadFile(URL url, String outputFileName) throws IOException {
		try (InputStream in = url.openStream();
				ReadableByteChannel rbc = Channels.newChannel(in);
				FileOutputStream fos = new FileOutputStream(outputFileName)) {
			fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
		}
		System.out.println("File downloaded");
	}

	private static void convertToTxt(String input, String output) throws IOException {
		ProcessBuilder pb = new ProcessBuilder("C:\\python\\python.exe", "../meditouch/taxonomy.py", input, output);
		pb.redirectErrorStream(true);
		Process proc = pb.start();
		Reader reader = new InputStreamReader(proc.getInputStream());
		BufferedReader bf = new BufferedReader(reader);
		String s;
		while ((s = bf.readLine()) != null) {
			System.out.println(s);
		}
	}

	private static String getFileName() {
		String fileName = "nucc_taxonomy_";
		LocalDateTime currentTime = LocalDateTime.now().minusYears(1);
		int currentMonth = currentTime.getMonth().getValue();
		int version = 0;
		/*if (!(currentMonth >= 1 && currentMonth < 7)) {
			version = 1;
		}*/
		DateTimeFormatter df = DateTimeFormatter.ofPattern("yy");
		return fileName + df.format(currentTime) + version;
	}

	public static void main(String[] args) throws IOException {
		String fileName = getFileName() + ".csv";
		String url = "https://www.nucc.org/images/stories/CSV/" + fileName;
		System.out.println(url);
		URL u = new URL(url);
		downloadFile(u, fileName);
		if (Files.exists(Paths.get("../meditouch/" + fileName))) {
			convertToTxt(fileName, getFileName() + ".txt");
		} else {
			System.out.println("File has not been found");
		}

	}

}
