# Overview
This project illustrates the _ej.library.runtime.components_ library.
It contains a service implementation and two bundles: the service publisher and the service user.

## Project structure
- [ej.examples.components.helloworld.service](ej.examples.components.helloworld.service) 
	- [[…]/Hello.java](ej.examples.components.helloworld.service/src/main/java/ej/examples/components/helloworld/service/Hello.java): the interface defining the service.

- [ej.examples.components.helloworld.publisher](ej.examples.components.helloworld.publisher)
	- [[…]/HelloPrint.java](ej.examples.components.helloworld.publisher/src/main/java/ej/examples/components/helloworld/publisher/HelloPrint.java) : an implementation of the service.
	- [[…]/HelloPublisherBundle.java](ej.examples.components.helloworld.publisher/src/main/java/ej/examples/components/helloworld/publisher/HelloPublisherBundle.java) : the bundle publishing the service implementation.
	
- [ej.examples.components.helloworld.user](ej.examples.components.helloworld.user)
	- [[…]/SayHelloToEveryone.java](ej.examples.components.helloworld.user/src/main/java/ej/examples/components/helloworld/user/SayHelloToEveryone.java) : an application that uses the service.
	- [[…]/HelloUserBundle.java](ej.examples.components.helloworld.user/src/main/java/ej/examples/components/helloworld/user/HelloUserBundle.java) : the bundle retrieving the service.
	
- [ej.examples.components.helloworld](ej.examples.components.helloworld) : the startup (main) of the example.
	- [src/main/java](ej.examples.components.helloworld/src/main/java) : Java sources.
	- [src/main/resources](ej.examples.components.helloworld/src/main/resources) : the properties and bundles list.

  
## Usage
See [README.md](ej.examples.components.helloWorld/README.md).

# Requirements
See [README.md](ej.examples.components.helloWorld/README.md).

# Source
See [README.md](ej.examples.components.helloWorld/README.md).

# Restrictions
See [README.md](ej.examples.components.helloWorld/README.md).

# Changes
See [CHANGELOG.md](CHANGELOG.md).

## License
See [LICENSE.md](LICENSE.md).
