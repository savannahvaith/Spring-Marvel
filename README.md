# Repo and Entity

## Repository 

Repositories provide methods for interacting with a database. 
In spring, they take the form of interfaces that extend `JpaRespotiory`. 

```java
@Repository 

public interface MarvelRepo extends JpaRepository<Marvel,Long>{
	...
}
```

`JpaRepository` extends a type of `Marvel,Long` with `Marvel` being the type of the Entity, and `Long` being the type of `id`.

By extending the JpaRepository, the instance that is created at runtime will inherit all the basic CRUD functionality. 


## Entity

Entity Marks a class as a `table`. 
The domain class must contain the annotation `@Entity` to let Spring know that this is the domain object that will be made a table of. 
