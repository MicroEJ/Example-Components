# Overview
This project illustrates the _ej.components_ library.
It contains a service implementation and two bundles: the service publisher and the service user.

## Project structure
- `ej.examples.components.helloworld.service`
  - `[…]/Hello.java`: the interface defining the service.
- `ej.examples.components.helloworld.publisher`
  - `[…]/HelloPrint.java`: an implementation of the service.
  - `[…]/HelloPublisherBundle.java`: the bundle publishing the service implementation.
- `ej.examples.components.helloworld.user`
  - `[…]/SayHelloToEveryone.java`: an application that uses the service.
  - `[…]/HelloUserBundle.java`: the bundle retrieving the service.
- `ej.examples.components.helloworld`: the startup (main) of the example.
  - `src/main/java`: Java sources.
  - `src/main/resources`: the properties and bundles list.
  - `launches`: the MicroEJ launches.

# Requirements
* MicroEJ Studio or SDK 4.0 or later
* A platform with at least:
	* EDC-1.2 or higher

## Usage
To launch the application, right-click on the `helloWorld` project,
select `Run as`, `MicroEJ Application` and choose `Hello World Components (Sim)`.
Another launcher is available to execute on the target board.

## Changes
2015/06/15: Initial version.

## License
See the license file `LICENSE.md` located at the root of this repository.
