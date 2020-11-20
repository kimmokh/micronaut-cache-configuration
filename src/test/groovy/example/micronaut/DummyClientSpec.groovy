package example.micronaut

import io.micronaut.context.ApplicationContext
import io.micronaut.test.annotation.MicronautTest
import spock.lang.Specification

import javax.inject.Inject

@MicronautTest
class DummyClientSpec extends Specification {

    @Inject
    ApplicationContext applicationContext


    def "construct service"() {
        when:
        applicationContext.getBean(DummyClient)
        then:
        noExceptionThrown()
    }

}
