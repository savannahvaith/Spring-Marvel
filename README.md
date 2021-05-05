# Custom Queries

Custom Queries are a way for us to write our own code as part of JPQL - Java Persistent Query Language.

Spring is smart enough to figure out what the query would be via the method name that is placed in the repository.

For more control, we could use the @Query('sql statementhere') annotation.