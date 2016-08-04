import spock.lang.IgnoreIf
import spock.lang.Requires
import spock.lang.Specification
import spock.util.environment.Jvm
import spock.util.environment.OperatingSystem


/**
 * Created by josebovet on 8/1/16.
 */
class S3_IgnoreIf_Requires extends Specification {


    @Requires({ OperatingSystem.current.windows })
    void "should only run on Windows"() {
        expect:
        false
    }

    @Requires({ OperatingSystem.current.linux })
    void "should only run on Linux"() {
        expect:
        true
    }


    @IgnoreIf({ Jvm.current.java8Compatible })
    void 'should be ignored in Java8+'() {
        expect:
        false
    }

    @IgnoreIf({ javaVersion < 1.9 })
    void 'should only run in Java 9 or upper'() {
        expect:
        true
    }


    @IgnoreIf({ Jvm.current.java9 })
    void 'should be ignored only in Java9'() {
        expect:
        true
    }

}