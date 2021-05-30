package benchmark;

import com.google.inject.AbstractModule;

/**
 * Module required for guice injections
 * Binds test objects
 *
 */
public class TestModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(ExpensiveSingleton.class);
		bind(RandomObject.class);
		bind(SimpleClass.class);
	}
}
