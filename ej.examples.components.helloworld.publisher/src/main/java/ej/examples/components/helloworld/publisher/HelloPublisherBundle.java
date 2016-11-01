package ej.examples.components.helloworld.publisher;

import ej.components.registry.BundleRegistry;
import ej.components.registry.util.BundleActivatorAdapter;
import ej.components.registry.util.BundleRegistryHelper;
import ej.examples.components.helloworld.service.Hello;

/**
 * Bundle that publish an implementation of the {@link Hello} service.
 */
public class HelloPublisherBundle extends BundleActivatorAdapter {

	@Override
	public void initialize() {
		// Instantiate the bundle
		HelloPrint helloPrint = new HelloPrint();
		// … register it in the registry to be available to requester of this service
		BundleRegistry registry = BundleRegistryHelper.getRegistry();
		registry.register(Hello.class, helloPrint);
	}


}
