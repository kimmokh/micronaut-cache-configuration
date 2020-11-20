package example.micronaut

import groovy.util.logging.Slf4j
import io.micronaut.context.ApplicationContext
import io.micronaut.context.event.ApplicationEventListener
import io.micronaut.runtime.server.event.ServerStartupEvent

import javax.inject.Singleton

@Slf4j
@Singleton
class Service implements ApplicationEventListener<ServerStartupEvent> {

    ApplicationContext applicationContext
    DummyClient dummyClient

    // Cannot construct this service as cache configuration cannot be instantiated
    Service(ApplicationContext applicationContext, DummyClient dummyClient) {
        this.applicationContext = applicationContext
        this.dummyClient = dummyClient
    }

    @Override
    void onApplicationEvent(ServerStartupEvent event) {
        log.info('Server started.')
    }

}
