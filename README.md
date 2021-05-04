# Response Entities

`ResponseEntity` represents the whole HTTP response: 

* Status Code
* Headers
* Body 

We can use it to configure the Response that is sent from Spring to the Presentation Layer. 

```java

public ResponseEntity<Marvel> getAll(){
	return new ResponseEntity<Marvel>(this.service.getAll(), HttpStatus.OK); 
}
```

These are used in the `Controller` component of the application. 

