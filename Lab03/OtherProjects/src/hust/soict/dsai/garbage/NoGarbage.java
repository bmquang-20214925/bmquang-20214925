package hust.soict.dsai.garbage;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Random;

public class NoGarbage {
	public static void main(String[] args) throws IOException {
		String filename = "text.txt";
		byte[] inputBytes = {0};
		long startTime, endTime;


		try {
	        inputBytes = Files.readAllBytes(Paths.get(filename));
	    } catch (IOException e) {
	        e.printStackTrace();
	    }

		startTime = System.currentTimeMillis();
		StringBuilder outputString= new StringBuilder();
		for (byte b: inputBytes) {
			outputString.append((char)b);
		}
		endTime = System.currentTimeMillis();
		System.out.println(endTime - startTime);

		System.out.println(outputString);

		
				
	}
}
