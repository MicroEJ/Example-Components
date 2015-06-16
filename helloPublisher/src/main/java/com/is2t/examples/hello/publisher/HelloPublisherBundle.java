package com.is2t.examples.hello.publisher;

import com.is2t.examples.hello.Hello;

import ej.components.RegistryFactory;
import ej.components.util.ActivatorAdapter;

public class HelloPublisherBundle extends ActivatorAdapter {

	private HelloPrint helloPrint;

	@Override
	public void initialize(String parameters) {
		// create the hello service implementation…
		this.helloPrint = new HelloPrint();
		// … register it in the registry to be available to requester of this service
		RegistryFactory.getRegistry().register(Hello.class, this.helloPrint);
	}

}
