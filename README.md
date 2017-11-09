# Spec by Example with FitNesse in a Nutshell

This repository demonstrates a minimal FitNesse project.

# Setup

1. Compile the Java classes and place the compiled classes in the directory `output` (including package directories).

# Running the System

1. Launch FitNesse by following these steps:
  - `cd fitnesse`
  - `java -jar fitnesse-standalone.jar -p 8080`
  - Please change the port (8080) if it is already in use on your machine.
  
# Accessing the Specifications and Examples
  
  - Point your browser to [localhost:8080](http://localhost:8080/)
  - At the bottom of the page, you find the link to the Spec by Example demo:
    [SpecByExampleRoot](http://localhost:8080/SpecByExampleRoot)
  - The specs and examples are contained in the [Example Page](http://localhost:8080/SpecByExampleRoot.ExamplePage)
  - To run the tests, click the [Test](http://localhost:8080/SpecByExampleRoot.ExamplePage?test) button in the upper left corner

# Documentation

  - FitNesse comes with [Documentation for the Slim Test System](http://localhost:8080/FitNesse.UserGuide.WritingAcceptanceTests.SliM) and the types of tables that it supports
