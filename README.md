# Swagger and Static

## Swagger

Swagger is a way for us to see the available end points in our API

Add the following dependency to you `pom.xml`

```xml
<dependency>
	<groupId>io.springfox</groupId>
	<artifactId>springfox-boot-starter</artifactId>
	<version>3.0.0</version>
</dependency> 
```

To see the EndPoints, run your application then navigate to `https://localhost:9095/swagger-ui/index.html`.

## Static

Our front end folder source code, must be contained in the `src/main/resources/static` folder. 

Ensure the main page is located under `index.html`!

