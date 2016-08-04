import spock.lang.Specification

/**
 * Created by josebovet on 8/1/16.
 */
class S0_HelloSpock extends Specification {

    def "should say hello wold"() {
        given: "a String"
        def word = "Hello World!"

        when: 'reversing it'
        def reversed = word.reverse()

        then:
        reversed == "!dlroW olleH"
    }
}