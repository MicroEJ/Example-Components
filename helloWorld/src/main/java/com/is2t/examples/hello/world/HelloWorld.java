/*
 * Java
 *
 * Copyright 2015 IS2T. All rights reserved.
 * Use of this source code is governed by a BSD-style license that can be found at http://www.is2t.com/open-source-bsd-license/.
 */
package com.is2t.examples.hello.world;

import java.util.logging.Logger;

import ej.components.Registry;
import ej.components.RegistryFactory;

/**
 * Main class.
 */
public class HelloWorld {

	private static final int RUNNING_DURATION = 20000;

	/**
	 * Main method.
	 *
	 * @param args
	 *            java arguments.
	 */
	public static void main(String[] args) {
		Logger.getGlobal().info("Startup the registry");
		Registry registry = RegistryFactory.getRegistry();
		RegistryFactory.startupRegistry(registry, "/properties/services.bundles");

		try {
			Thread.sleep(RUNNING_DURATION);
		} catch (InterruptedException e) {
		}
		Logger.getGlobal().info("Stop the registry");
		registry.stop("");
	}

}
