package practice_program;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FileDownload {

	public static void downloadFile(URL url, String outputFileName) throws IOException {
		try(InputStream in = url.openStream();
			ReadableByteChannel rbc = Channels.newChannel(in);
			FileOutputStream fos = new FileOutputStream(outputFileName))
		{
			fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
		}
	}
	
	private static String getFileName() {
		String fileName = "nucc_taxonomy_";
		 LocalDateTime currentTime = LocalDateTime.now().minusYears(2);
		int currentMonth = currentTime.getMonth().getValue();
		int version = 0;
		if(!(currentMonth>=1 && currentMonth<7))
		{	
			version = 1;
		}
		DateTimeFormatter df = DateTimeFormatter.ofPattern("yy");
		return fileName+df.format(currentTime)+version+".csv";
	}
	public static void main(String[] args) throws IOException {
	
		//System.out.println(getFileName());
		/*String url = "https://www.nucc.org/images/stories/CSV/nucc_taxonomy_201.csv";
		URL u = new URL(url);
		String outputFileName = "nucc_taxonomy_201.csv";
		downloadFile(u, outputFileName);*/

	}

}
