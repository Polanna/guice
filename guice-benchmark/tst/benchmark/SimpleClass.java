package benchmark;

/**
 * Straightforward simple test object
 * 
 * Ouputs class to avoid being ignored in Java optimisation
 *
 */
public class SimpleClass {
	public SimpleClass()
	{
		System.out.println("Creating " + this.getClass());
	}
}
