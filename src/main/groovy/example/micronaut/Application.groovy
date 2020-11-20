package example.micronaut

import io.micronaut.runtime.Micronaut
import groovy.transform.CompileStatic

import javax.annotation.PostConstruct

@CompileStatic
class Application {
    static void main(String[] args) {
        Micronaut.run(Application, args)
    }


}
