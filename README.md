# Service DB

Service components are used to store the main *business logic* of a Spring app. 

Services are annotated with `@Service`

The functionality is identical to that of `@Component`, only difference is that
`@Service` shows that you *intend* to use the class as a Service. 

The Service lives between the `Controller` and `Repo` in the Backend. 

