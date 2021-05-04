# CRUD Controller

## Rest Controller

Allows for the use of `Request Mapping` to expose methods and provide config for handling requests in a RESTFUL manner
(namely returning data in a JSON format). 

### GET Mapping

Used to fetch data - `GET Requests`

```java
@GetMapping("/getAll")
public List<Marvel> getAll(){
	...
}
```

### POST Mapping

Used to send data - `POST Requests`

`@RequestBody` -  Data sent in the body of a request can be converted from JSON to a java object by marking a method parameter with @RequestBody.
Only one parameter can be marked this way.

```java
@PostMapping("/create")
public void create(@RequestBody Marvel marvel){
	...
}
```

### DELETE Mapping

Used to delete data - `DELETE Request`

`@PathVariable` - Extracts values from the URL to the request that was sent. 
The value needs to match exactly. 

```java
@DeleteMapping("/remove/{id}")
public Marvel remove(@PathVariable int id){
	...
}
```
