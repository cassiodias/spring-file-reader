package io.cassio

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.ContextConfiguration
import spock.lang.Specification

@SpringBootTest
@ContextConfiguration
class FileReaderServiceSpec extends Specification {

    @Autowired
    FileReaderService fileReaderService

    def "should autowire"() {
        expect:
        fileReaderService != null
    }

}
