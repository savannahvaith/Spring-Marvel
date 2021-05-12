# Selenium 

Selenium is a tool that we can use to automate the process of testing our frontend. 

Selenium uses a webdriver to communicate with the browser, and java. 

Our code, is written in conjunction with JUnit.

In our `pom.xml` we would need to include the following dependencies: 

```xml
<!-- https://mvnrepository.com/artifact/junit/junit -->
<dependency>
        <groupId>junit</groupId>
        <artifactId>junit</artifactId>
        <version>4.12</version>
        <scope>test</scope>
</dependency>

<!-- https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java -->
<dependency>
        <groupId>org.seleniumhq.selenium</groupId>
        <artifactId>selenium-java</artifactId>
        <version>3.141.59</version>
         <scope>test</scope>
</dependency>
```

Our test cases should be split using the POM structure, that is, all of the elements on a webpage in a separate package `pages`
and our tests in a package `tests`

This way our code following Single Responsibility, and also we are able to maintain and keep track of the elements easily. 

