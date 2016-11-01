/*
 * Java
 *
 * Copyright 2015 IS2T. All rights reserved.
 * Use of this source code is governed by a BSD-style license that can be found at http://www.is2t.com/open-source-bsd-license/.
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
