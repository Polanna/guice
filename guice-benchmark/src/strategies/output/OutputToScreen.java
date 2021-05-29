package strategies.output;

import java.io.OutputStream;

import benchmark.Config;

/**
 * 
 * @author Gucci Team*
 *
 */
public class OutputToScreen implements OutputStrategy{
	
	/**
	 * Return an output stream to screen
	 * @param Config
	 * @return OutputStream
	 */
	public OutputStream getOutputStream(Config config) {
		OutputStream outputStream = System.out;
		return outputStream;
	}

	@Override
	public void close() {
		// We do NOT want to close System.out
	}

}
