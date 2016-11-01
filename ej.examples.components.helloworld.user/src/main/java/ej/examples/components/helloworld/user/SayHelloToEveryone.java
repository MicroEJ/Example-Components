/*
 * Java
 *
 * Copyright 2015-2016 IS2T. All rights reserved.
 * Use of this source code is governed by a BSD-style license that can be found at http://www.is2t.com/open-source-bsd-license/.
 */
package ej.examples.components.helloworld.user;

import ej.examples.components.helloworld.service.Hello;

/**
 * Application that uses the {@link Hello} service to say hello to everyone!
 */
public class SayHelloToEveryone {

	private static final int SECOND = 1000;

	private static final String[] ALL_PEOPLE = { "John", "Brice", "Frederick", "Alan", "Peter", "Jeremiah", "Stanley",
			"Jensen", "William", "Steven", "Sebastian", "Jeremy", "Adrian", "Julian", "Gareth" };

	/**
	 * This variable is a pointer to the service hello, it is used to demonstrate the link phase of the Bundle. However,
	 * a better implementation would be to call the service: 
	 * Hello hello = ServiceLoaderFactory.getServiceLoader().getService(Hello.class); 
	 * if (hello != null) {
	 *	 hello.sayHello(name);
	 * } else {
	 *	 System.out.println("Service Hello not found.");
	 *	}
	 */
	private Hello hello;
	private boolean running;
	private int currentIndex;

	/**
	 * Sets the hello service to use to say hello.
	 *
	 * @param hello
	 *            the hello service.
	 */
	public void setHello(Hello hello) {
		this.hello = hello;
	}

	/**
	 * Starts to say hello every second!
	 */
	public void start() {
		this.running = true;
		// starts the thread that say hello to everyone
		Thread thread = new Thread() {
			@Override
			public void run() {
				while (SayHelloToEveryone.this.running) {
					// get the current person…
					String name = ALL_PEOPLE[SayHelloToEveryone.this.currentIndex];
					// … say hello!
					SayHelloToEveryone.this.hello.sayHello(name);
					try {
						Thread.sleep(SECOND);
					} catch (InterruptedException e) {
					}
					// prepare the next person
					SayHelloToEveryone.this.currentIndex = (SayHelloToEveryone.this.currentIndex + 1)
							% ALL_PEOPLE.length;
				}
			}
		};
		thread.start();
	}

	/**
	 * Stops saying hello.
	 */
	public void stop() {
		this.running = false;
	}

}
