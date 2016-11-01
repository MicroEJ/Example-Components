/*
 * Java
 *
 * Copyright 2015-2016 IS2T. All rights reserved.
 * Use of this source code is governed by a BSD-style license that can be found at http://www.is2t.com/open-source-bsd-license/.
 */
package ej.examples.components.helloworld.user;

import ej.components.registry.util.BundleActivatorAdapter;
import ej.components.registry.util.BundleRegistryHelper;
import ej.examples.components.helloworld.service.Hello;

/**
 * Bundle that retrieves the {@link Hello} service and holds an application that uses it.
 */
public class HelloUserBundle extends BundleActivatorAdapter {

	private SayHelloToEveryone sayHelloToEveryone;

	@Override
	public void initialize() {
		// create the runner that say hello to a lot of people
		this.sayHelloToEveryone = new SayHelloToEveryone();
	}

	@Override
	public void link() {
		// link the runner to the hello service
		Hello hello = BundleRegistryHelper.getRegistry().getService(Hello.class);
		this.sayHelloToEveryone.setHello(hello);
	}

	@Override
	public void start() {
		// start the runner
		this.sayHelloToEveryone.start();
	}

	@Override
	public void stop() {
		// stop the runner
		this.sayHelloToEveryone.stop();
	}

}
