/*
 * Java
 *
 * Copyright 2015 IS2T. All rights reserved.
 * Use of this source code is governed by a BSD-style license that can be found at http://www.is2t.com/open-source-bsd-license/.
 */
package com.is2t.examples.hello.user;

import com.is2t.examples.hello.Hello;

/**
 *
 */
public class SayHelloToEveryone {

	private static final String[] ALL_PEOPLE = { "John", "Brice", "Frederick", "Alan", "Peter", "Jeremiah", "Stanley",
		"Jensen", "William", "Steven", "Sebastian", "Jeremy", "Adrian", "Julian", "Gareth" };

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
					String name = ALL_PEOPLE[SayHelloToEveryone.this.currentIndex];
					SayHelloToEveryone.this.hello.sayHello(name);
					SayHelloToEveryone.this.currentIndex = (SayHelloToEveryone.this.currentIndex + 1)
							% ALL_PEOPLE.length;
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
					}
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
