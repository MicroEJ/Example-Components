# Overview
This project illustrates the _ej.library.runtime.components_ library.
It contains a service implementation and two bundles: the service publisher and the service user.

## Project structure
- [com.microej.example.components.helloworld.service](com.microej.example.components.helloworld.service) 
	- [[…]/Hello.java](com.microej.example.components.helloworld.service/src/main/java/com/microej/example/components/helloworld/service/Hello.java): the interface defining the service.

- [com.microej.example.components.helloworld.publisher](com.microej.example.components.helloworld.publisher)
	- [[…]/HelloPrint.java](com.microej.example.components.helloworld.publisher/src/main/java/com/microej/example/components/helloworld/publisher/HelloPrint.java) : an implementation of the service.
	- [[…]/HelloPublisherBundle.java](com.microej.example.components.helloworld.publisher/src/main/java/com/microej/example/components/helloworld/publisher/HelloPublisherBundle.java) : the bundle publishing the service implementation.
	
- [com.microej.example.components.helloworld.user](com.microej.example.components.helloworld.user)
	- [[…]/SayHelloToEveryone.java](com.microej.example.components.helloworld.user/src/main/java/com/microej/example/components/helloworld/user/SayHelloToEveryone.java) : an application that uses the service.
	- [[…]/HelloUserBundle.java](com.microej.example.components.helloworld.user/src/main/java/com/microej/example/components/helloworld/user/HelloUserBundle.java) : the bundle retrieving the service.
	
- [com.microej.example.components.helloworld](com.microej.example.components.helloworld) : the startup (main) of the example.
	- [src/main/java](com.microej.example.components.helloworld/src/main/java) : Java sources.
	- [src/main/resources](com.microej.example.components.helloworld/src/main/resources) : the properties and bundles list.

  
## Usage
See [README.md](com.microej.example.components.helloWorld/README.md).

# Requirements
See [README.md](com.microej.example.components.helloWorld/README.md).

# Source
See [README.md](com.microej.example.components.helloWorld/README.md).

# Restrictions
See [README.md](com.microej.example.components.helloWorld/README.md).

# Changes
See [CHANGELOG.md](CHANGELOG.md).

## License
See [LICENSE.md](LICENSE.md).
