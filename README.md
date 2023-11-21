# Project Overview

The Rebtel App is tested on Android Emulator devices.

## Tools used
- Appium is used as automation tool for testing the application based on Selenium.
- Maven is used as the build automation tool
- The framework implements the TestNG framework for generating reports 
- Development time IDE:  Eclipse is used for developing the framework.
- Java is used as a programming language for the automation suites.
- The App can be run on the Android Emulator inside Android Studio

Dependencies for Automating using Appium tool for Android

A computer with Windows 10 or macOS X 10.7 or later.
Java Development Kit (JDK) or Java SE version 8 or later.
Node and npm version 10+ or later.
An emulator or real Android device.
Appium Inspector to get the element locator.
Appium
Gesture Plugin installation for scrolling/swiping (The plugin will not be active unless turned on when invoking the Appium server:)
Integrated development environment (IDE).
APK File 

<br/>

## Framework Design - The Page Object Model

The automation framework is based on the Page Object Model(POM), which is a design pattern, that creates Android Object Repository for locator elements. 

The POM Framework helps reduce code duplication and provides better control for the test case framework maintenance.
The framework is developed in a way to make the code readable and reusable(For example: the object repository is independent of the test cases).

<br/>

## Project layout

- src\main\java\internal.pageobjects: Contains the Page Object Models. 
- src\main\java\resources: The properties file
- src\test\java: The actual test cases. The is further categorized into base(common utility) and the test cases for different features.
- reports: This folder is the placeholder for the test case reports after execution via the TestNG framework. Note that it contains
a pre saved report for reference. It will be overriden after run.
- target: To hold the compiles classes after build.
- testsuite: Contains the TestNG suite configuration.


<br/>


# Suite Execution steps

The section describes the different ways to execute the automation tests. There are 3 different ways in which it can be done:
- Using Command line: maven commands
- Using an IDE: Eclipse is taken as a reference point

These are detailed in the subsequent sections.

## Data Dependency Pre-requisite

Enter the Phone number with the desired Country code for international calling

<br/>



## Execution using command line: mvn commands

### Prerequisite

- Install the latest Maven and set the MAVEN_HOME and add it to paths in your system variables.
- Clone the repository: git clone https://github.com/Aakanksha1411/RebtelApp.git

### Steps

1. Open cmd or equivalent and go to the cloned repo location.
2. Execute appium --use-plugins=gestures
  The plugin will not be active unless turned on when invoking the Appium server:
3. Execute: mvn clean install -PRegression

You will get the test run result on the cmd console. Also, the latest test report is updated @ reports/index.html

<br/>

## Execution via IDE: Eclipse

### Prerequisites

- Download the Eclipse IDE

- Install the TestNg plugin via the Eclipse Marketplace

### Run via EclipseIDE

Execute appium --use-plugins=gestures in npm
The plugin will not be active unless turned on when invoking the Appium server:
- Goto : testsuite/testng.xml
- Right Click -> Run As -> TestNG Suite

- You will get the test run result on the cmd console. Also, the latest test report is updated @ reports/index.html

<br/>

## Known Issues

Emulator is slow and and not responding sometimes-Socket hangup or System UI Isnt responding message error.



<br/>

