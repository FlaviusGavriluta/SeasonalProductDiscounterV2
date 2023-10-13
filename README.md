# Seasonal Product Discounter v2

## What are you going to learn?
* Create randomized objects using java.util.Random
* Create queries using the Stream API
* Practice architectural & SOLID principles
* Write parameterized unit tests

he Seasonal Product Discounter is an ongoing project. On every solo week you need to add new features to it, and improve existing ones. This approach models the iterative software development process with its ever-changing requirements.

Each solo week provides a small description on what needs to be added and why. If you cannot complete the previous week, do not worry. The starter repo contains the latest version of the program that you can use to build on.

We recommend you to try and always complete the tasks in your existing codebase, because this improves your code maintenance and refactoring skills.

This week introduces two new features.

The first version of the program includes hard-coded Product objects so that there is something to work with. Now you need to add a new class that can generate thousands of randomized Product objects, providing much more data. This simulates real-world applications which may work with millions of products.

Although in the real world the products usually come from an external database, this does not matter for the internal structure of the application.

Once the in-memory dataset is ready, you need to unleash a tsunami of queries against it, using a feature of the Java language called streams.

Before jumping in, you need to learn about lambda expressions and the Stream API. For information on these topics, see the Background materials section.

Good luck!

## Tasks

### Logger
We already have a ConsoleLogger implementation of the Logger interface. We will now implement a FileLogger class and a LoggerBase abstract class that have the common methods of both loggers. First, create the FileLogger, then extract the common functionality into the LoggerBase class, then make both classes inherit from LoggerBase.

The implementation of the FileLogger class is completed.

The implementation of the LoggerBase class is completed.

### Random product generator
Create a component that can generate randomized Product objects. To achieve this, implement a RandomProductGenerator class. Implement the existing ProductProvider interface in the RandomProductGenerator class. Now you can swap between the hard-coded ProductProviderImpl and the RandomProductGenerator, as they share the same interface.

Note the following regarding the RandomProductGenerator.
- The java.util.Random class contains a method that returns a random integer within a specified range. Use this to choose a random element from an array.
- A Product name contains the color followed by the type (such as 'Yellow skirt')
- Product objects are distinguished using an id field in the Product record. This is a counter, starting from zero.

The RandomProductGenerator is implemented. It returns an arbitrary positive number of Product objects.

The RandomProductGenerator class is covered with unit tests. At least four cases are implemented.

### Product browser
Create a ProductBrowserImpl that creates queries against the Product database. Implement every method on the ProductBrowser interface, and cover them with unit tests.
You can use the ProductsUi class to test your implementations while developing.

We recommend you to develop in the following phases.
- Implement a method from the ProductBrowser interface.
- Test the implementation by calling the method from the ProductsUi class and printing the results from the console.
- Add unit tests for the method. Most of the time one test is enough, but if there are any edge cases, consider covering them.

All methods on the ProductBrowser are implemented.

There is at least one unit test method for every method on the ProductBrowser interface.

The results of some methods are printed on the console in the ProductUi class.

### Product statistics
A database requires proper statistics. Add the ability to query different statistical aspects of the data. For this, implement the ProductStatistics the same way as the ProductBrowser. You can use the StatisticsUi class for printing. To change the type of UI to show, change the Application.java file.

All methods on the ProductStatistics are implemented.

At least one unit test method is created for every method on the ProductStatistics interface.

The results of some methods are printed on the console in the StatisticsUi class.

### OPTIONAL TASK:
Output to files
Create a component that, instead of printing to the console, writes the query results into text files. The file name must contain the name of the query and its parameter(s). The file must list each object on separate lines.

A component (interface and implementation) is created that writes query results into files. The component is called from Application.java.

## Hints
* Keep the size of the dataset around 50 to 100 objects.
* Use java.util.Random objects by placing them inside static variables and using them throughout the class. Do not create them in a loop, because this may result in the results not being random. These objects use the sytem clock for a seed value, and if the execution is fast enough, the clock may not tick over between two seeds, resulting in the same seed being used twice.
* Break down difficult queries into smaller parts.
* Use the groupingBy method for queries where you have to return a Map.
* Use parameterized tests when writing unit tests. It allows you to cover more cases with one method.

## Background materials
[Lambda expressions explained](https://www.youtube.com/watch?v=VLTEPWkEhsg&ab_channel=edureka%21)

[Another explanation about lambda expressions](https://www.youtube.com/watch?v=tj5sLSFjVj4&ab_channel=CodingwithJohn)

[All about the Java Stream API](https://www.baeldung.com/java-streams)

[Quick introduction to Java Streams](https://www.baeldung.com/java-8-streams-introduction)

[Stream API tutorial](https://www.baeldung.com/java-8-streams)

[Working with Maps using Streams](https://www.baeldung.com/java-maps-streams)

[Guide to the groupingBy Collector](https://www.baeldung.com/java-groupingby-collector)

[Guide to JUnit 5](https://www.baeldung.com/junit-5)

[JUnit 5 Parameterizet Tests](https://www.baeldung.com/parameterized-tests-junit-5)

[The Optional class in Java](https://www.baeldung.com/java-optional)
