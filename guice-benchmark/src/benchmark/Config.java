package benchmark;

/**
 * Configuration Developed as class project for CSS553 at University of
 * Washington (Bothell)
 * 
 * @author Gucci Team
 */
public class Config {
	private String outputFormat;
	private String outputType;
	private String filename;

	/**
	 * Assigns default configurations
	 */
	public Config() {
		this.outputFormat = "csv";
		this.outputType = "screen";
	}

	/**
	 * Assigns default configuration for output type 
	 * 
	 * Assigns user configuration for output format
	 * 
	 * @param outputFormat
	 */
	public Config(String outputFormat) {
		this.outputFormat = outputFormat;
		this.outputType = "screen";
	}

	/**
	 * Assigns user configuration for output location 
	 * 
	 * Assigns user configuration for output format
	 * 
	 * @param outputFormat
	 * @param location
	 */
	public Config(String outputFormat, String location) {
		this.outputFormat = outputFormat;
		this.outputType = location;
	}

	/**
	 * Assigns user configuration for output location 
	 * 
	 * Assigns user configuration for output format
	 * 
	 * Assigns user configuration for filename
	 * 
	 * @param outputFormat
	 * @param outputType
	 * @param filename
	 */
	public Config(String outputFormat, String outputType, String filename) {
		this.outputFormat = outputFormat;
		this.outputType = outputType;
		this.filename = filename;
	}

	/**
	 * @return the outputFormat
	 */
	public String getOutputFormat() {
		return outputFormat;
	}

	/**
	 * @param outputFormat the outputFormat to set
	 */
	public void setOutputFormat(String outputFormat) {
		this.outputFormat = outputFormat;
	}

	/**
	 * Name change to outputType
	 * 
	 * @return the location
	 */
	@Deprecated
	public String getLocation() {
		return outputType;
	}

	/**
	 * Name change to outputType
	 * 
	 * @param location the location to set
	 */
	@Deprecated
	public void setLocation(String location) {
		this.outputType = location;
	}

	/**
	 * @return the filename
	 */
	public String getFilename() {
		return filename;
	}

	/**
	 * @param filename the filename to set
	 */
	public void setFilename(String filename) {
		this.filename = filename;
	}

	/**
	 * @return the outputType
	 */
	public String getOutputType() {
		return outputType;
	}

	/**
	 * @param outputType the outputType to set
	 */
	public void setOutputType(String outputType) {
		this.outputType = outputType;
	}

}
