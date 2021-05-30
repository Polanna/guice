/**
 * 
 */
package benchmark;

/**
 * Developed as class project for CSS553 at University of Washington (Bothell)
 * 
 * @author Gucci Team *
 */
public class TimingObj {
	private long startTime;
	private long endTime;
	private String className;

	/**
	 * Creates a new TimingObj with the start time and className of the object being
	 * benchmarked
	 * 
	 * @param startTime
	 * @param className
	 */
	public TimingObj(long startTime, String className) {
		this.startTime = startTime;
		this.className = className;
	}

	/**
	 * 
	 * @return the className
	 */
	public String getClassName() {
		return className;
	}

	/**
	 * Stops the timing with the current system time in milliseconds
	 */
	public void stopTiming() {
		this.endTime = System.currentTimeMillis();
	}

	/**
	 * Return the loading duration of each class
	 * 
	 * @return endTime - startTime
	 */
	public long duration() {
		return endTime - startTime;
	}

}
