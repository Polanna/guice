package strategies.output;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import benchmark.Config;

/**
 * Developed as class project for CSS553 at University of Washington (Bothell)
 * 
 * @author Gucci Team
 *
 */
public class OutputToFile implements OutputStrategy {
	private OutputStream outputStream;

	/**
	 * Return output stream to a file
	 * 
	 * @param Config
	 * @return OutputStream
	 */
	public OutputStream getOutputStream(Config config) {
		String fileFullPath = config.getFilename();
		// create output stream
		try {
			outputStream = new FileOutputStream(fileFullPath);
		} catch (FileNotFoundException e) {
			// Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException("Error creating FileOutputStream", e);
		}
		return outputStream;
	}

	/**
	 * Make sure the output stream is closed 
	 * 
	 * Implicitly called
	 * 
	 * @param
	 * @return
	 */
	public void close() {
		if (outputStream != null) {
			try {
				outputStream.close();
			} catch (IOException e) {
				throw new RuntimeException("Error closing stream", e);
			}
		}
	}
}
