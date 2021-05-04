# Beans

Beans are managed objects, the creation, maintenance and destruction of that object is solely 
under the control of Spring framework. 

Spring is refered to as an *Inversion of Control Container* due to the nature of giving up control 
of objects and letting Spring handle it. 

Spring helpfully puts all of its **beans** into one centralised location called `Application Context`

You can access the beans from the `main()` method. 

## Component Scan 

`@SpringBootApplication` does a `@ComponentScan` to figure out what classes are `@Components`
any that are, are stored in the beanbag!
