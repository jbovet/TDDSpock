import groovy.json.JsonSlurper
import spock.lang.Ignore
import spock.lang.Specification

/**
 * Created by josebovet on 8/4/16.
 */
@Ignore("Comment to check the errors")
class S2_Asserts extends Specification {

    void 'should verify similarity word'() {
        expect:
        'Hello World' == 'hello world'
        //'Hello World' == 'jellou guorld'
    }

    void 'should fail with numbers'() {
        expect:
        2 * 3 == 5 * 4
    }

    void 'should get map values'() {
        given:
        def map = [color: 'Blue', price: 150]

        expect:
        map.price == 30 * 4.99
        //map.color == 'e'
    }

    def "all numbers should be even"() {
        expect:
        number % 2 == 0

        where:
        number << [876, 888, 781, 946]
    }

    def "maximum of two numbers"() {
        expect:
        Math.max(1, 3) == 3
        Math.max(0, 0) == 0
        Math.max(-7, -1) == -1
        Math.max(0.01, 0.009) == 0.009
    }

    void 'should get first 5 letters from alphabet'() {
        given:
        def alphabet = 'a'..'z'

        expect:
        alphabet.size() == 25
    }

    void 'should get words size in map'() {
        given:
        def os = ['GNU/Linux', 'OSX', 'Windows', 'Unix']

        expect:
        os.collect { it.size() } == [2, 2, 9, 1]
    }

    void 'should fail with maps and lists'() {
        given:
        def data = [
                name  : 'Francisco', age: 54,
                childs: [
                        [name: 'Jose', age: 31],
                        [name: 'Francesca', age: 24]
                ]
        ]

        expect:
        data.childs.name.first() == 'Francesca'
    }

    void 'should chuck be named on the joke'() {
        given:
        def json = new JsonSlurper().parseText(new URL("http://api.icndb.com/jokes/random").text)

        expect:
        json.value.joke.contains('Norriz') == true

    }
}