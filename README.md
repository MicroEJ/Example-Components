# Overview
This project illustrates the _ej.components_ library.
It contains a service implementation and two bundles: the service publisher and the service user.

## Project Setup
First of all, you have to download the repository by using the Download button or by cloning the repository.
After having retrieved the repository content, open your MicroEJ and then import Existing project into workspace by selecting either the ZIP file or the root directory.

### Requirements
- JRE 7 (or later) x86
- MicroEJ 3.1 or later
- A Java platform to test with at least: EDC 1.2 & EJ.COMPONENTS 2.0 & LOGGING-LIGHTWEIGHT 2.0.

### Project structure
- `helloService`
  - `[…]/Hello.java`: the interface defining the service.
- `helloPublisher`
  - `[…]/HelloPrint.java`: an implementation of the service.
  - `[…]/HelloPublisherBundle.java`: the bundle publishing the service implementation.
- `helloUser`
  - `[…]/SayHelloToEveryone.java`: an application that uses the service.
  - `[…]/HelloUserBundle.java`: the bundle retrieving the service.
- `helloWorld`: the startup (main) of the example.
  - `src/main/java`: Java sources.
  - `src/main/resources`: the properties and bundles list.
  - `launches`: the MicroEJ launches.

## Usage
To launch the application, right-click on the `helloWorld` project,
select `Run as`, `MicroEJ Application` and choose `Hello World Components (Sim)`.
Another launcher is available to execute on the target board.

## Changes
2015/06/15: Initial version.

## License
See the license file `LICENSE.md` located at the root of this repository.
