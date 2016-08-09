import spock.lang.Specification


/**
 * Created by josebovet on 8/9/16.
 */
class S7_LifeCycle extends Specification {

    def setupSpec() {
        println '> setupSpec'
    }

    def setup() {
        println '>> setup'
    }

    def cleanup() {
        println '>> cleanup'
    }

    def cleanupSpec() {
        println '> cleanSpec'
    }

    void 'test'() {
        expect:
        println '>>> test'
    }

    void 'test 2'() {
        expect:
        println '>>> test 2'
    }


}