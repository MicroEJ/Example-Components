/*
 * Java
 *
 * Copyright 2015-2016 IS2T. All rights reserved.
 * Use of this source code is subject to license terms.
 */
package ej.examples.components.helloworld.publisher;

import ej.examples.components.helloworld.service.Hello;

/**
 * Say hello to people by printing on the {@link System#out}.
 */
public class HelloPrint implements Hello {

	@Override
	public void sayHello(String name) {
		System.out.println("Hello " + name);
	}

}
