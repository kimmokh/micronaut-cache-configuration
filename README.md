## Micronaut cache configuration

Example 

If an application uses both service discovery w/ cache and Caffeine caching, a `NonUniqueBeanException` is thrown during startup since `DefaultCacheConfiguration` and `DiscoveryClientCacheConfiguration` implement `CacheConfiguration`:
  
```
Caused by: io.micronaut.context.exceptions.NonUniqueBeanException: Multiple possible bean candidates found: [io.micronaut.cache.caffeine.DefaultCacheConfiguration, io.micronaut.cache.discovery.DiscoveryClientCacheConfiguration]
```

To run the app:
```
./gradlew run
```

Or the test case:
```
./gradlew test
```


 
