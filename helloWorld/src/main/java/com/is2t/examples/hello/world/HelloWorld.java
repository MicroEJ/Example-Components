/*
 * Java
 *
 * Copyright 2015 IS2T. All rights reserved.
 * Use of this source code is governed by a BSD-style license that can be found at http://www.is2t.com/open-source-bsd-license/.
 */
package com.is2t.examples.hello.world;

import ej.components.Registry;
import ej.components.RegistryFactory;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Startup the registry");
		Registry registry = RegistryFactory.getRegistry();
		RegistryFactory.startupRegistry(registry, "/properties/services.bundles");

		try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
		}
		System.out.println("Stop the registry");
		registry.stop("");
	}

}
