/*
 * Java
 *
 * Copyright 2015-2016 IS2T. All rights reserved.
 * Use of this source code is subject to license terms.
 */
package com.microej.example.components.helloworld.publisher;

import ej.components.registry.BundleRegistry;
import ej.components.registry.util.BundleActivatorAdapter;
import ej.components.registry.util.BundleRegistryHelper;
import com.microej.example.components.helloworld.service.Hello;

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
