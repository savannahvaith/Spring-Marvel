# CDI and Service

## CDI - `Context Dependency Injection`

The idea of CDI is injecting a dependency into a class at run time. 

We want to make it so that the class is fully closed for modification. 
Therefore, instead of having concrete implementations, it should depend on abstractions - we use it to reduce coupling between components. 

If we had concrete implementations in a class that we later wanted to change, we would be breaking the `O&D` of `SOLID`.


## Service

This is where the logic of our application lives. 

We mark our class with a `@Service` Annotation, which tells the `Application Context` that the class is a `Component`.

We need to adhere to the `Single Responsibility` principle of SOLID and therefore our `Controller` class mustn't be responsible for handling logic. 
