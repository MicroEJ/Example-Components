/*
 * Java
 *
 * Copyright 2015 IS2T. All rights reserved.
 * Use of this source code is governed by a BSD-style license that can be found at http://www.is2t.com/open-source-bsd-license/.
 */
package ej.examples.components.helloworld;

import ej.components.dependencyinjection.ServiceLoaderFactory;
import ej.components.registry.BundleRegistry;
import ej.components.registry.util.BundleRegistryHelper;

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
		System.out.println("Startup the registry");
		BundleRegistry registry = ServiceLoaderFactory.getServiceLoader().getService(BundleRegistry.class);
		BundleRegistryHelper.startup(registry);

		try {
			Thread.sleep(RUNNING_DURATION);
		} catch (InterruptedException e) {
		}
		System.out.println("Stop the registry");
		registry.stop();
	}

}
