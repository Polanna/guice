package benchmark;

/**
 * Test class to show functionality of the BenchmarkInjector
 *
 */
public class TestClass {

	/**
	 * Injects some test objects and outputs in various configurations
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		BenchmarkInjector injector = BenchmarkInjector.createInjector(new TestModule());

		injector.getInstance(RandomObject.class);
		
		for (int i = 0; i < 10; i++)
		{
			injector.getInstance(RandomObject.class);
			injector.getInstance(SimpleClass.class);
		}
		
		Config config = new Config();
		injector.generateReport(config);
		System.out.println("=====================================");
		config.setOutputFormat("json");
		injector.generateReport(config);
		
		System.out.println("=====================================");
		config.setFilename("test.json");
		config.setOutputType("file");
		injector.generateReport(config);
	}

}
