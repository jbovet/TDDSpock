import spock.lang.Ignore
import spock.lang.Specification
import spock.lang.Timeout

import java.util.concurrent.TimeUnit


/**
 * Created by josebovet on 8/4/16.
 */
class S4_TimeOut extends Specification {

    @Timeout(2)
    def "I fail if I run for more than two seconds"() {
        given:
        Thread.sleep 1000 //change to 2000

        expect:
        true
    }


    @Ignore("Remove to check that the test fails")
    @Timeout(value = 500, unit = TimeUnit.MILLISECONDS)
    void 'should fail after 500 milliseconds'() {
        given:
        Thread.sleep 500

        expect:
        true
    }


}