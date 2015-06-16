/*
 * Java
 *
 * Copyright 2015 IS2T. All rights reserved.
 * Use of this source code is governed by a BSD-style license that can be found at http://www.is2t.com/open-source-bsd-license/.
 */
package com.is2t.examples.hello.user;

import com.is2t.examples.hello.Hello;

import ej.components.BundleActivator;
import ej.components.RegistryFactory;

public class HelloUserBundle implements BundleActivator {

	private SayHelloToEveryone sayHelloToEveryone;

	@Override
	public void initialize(String parameters) {
		// create the runner that say hello to a lot of people
		this.sayHelloToEveryone = new SayHelloToEveryone();
	}

	@Override
	public void link(String parameters) {
		// link the runner to the hello service
		Hello hello = RegistryFactory.getRegistry().getService(Hello.class);
		this.sayHelloToEveryone.setHello(hello);
	}

	@Override
	public void start(String parameters) {
		// start the runner
		this.sayHelloToEveryone.start();
	}

	@Override
	public void stop(String parameters) {
		// stop the runner
		this.sayHelloToEveryone.stop();
	}

}
