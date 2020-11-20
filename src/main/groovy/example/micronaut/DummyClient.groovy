package example.micronaut

import io.micronaut.cache.annotation.CacheConfig
import io.micronaut.cache.annotation.Cacheable
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.QueryValue
import io.micronaut.http.client.annotation.Client


@Client(id = 'someservice')
@CacheConfig(cacheNames = ["someservice"])
interface DummyClient {

    @Get("/foo")
    @Cacheable(parameters = ["dummy"])
    String getFooByReference(@QueryValue String reference)

}
