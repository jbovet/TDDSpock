import spock.lang.Specification


/**
 * Created by josebovet on 8/4/16.
 */
class S6_DataDriven extends Specification {

    def "length of Spock's and his friends' names"() {
        expect:
        name.size() == length

        where:
        name     | length
        "Spock"  | 5
        "Kirk"   | 4
        "Scotty" | 6

    }

    def "reverse greetings"() {

        expect:
        name.reverse() == word

        where:
        name     | word
        "Spock"  | "kcopS"
        "Kirk"   | "kriK"
        "Scotty" | "yttocS"

    }

    void 'all numbers should be even'() {
        expect:
        number % 2 == 0

        where:
        number << [-10, 0, 2, 42, 1000]
    }

    def "computing the minimum of two numbers"() {
        expect:
        Math.min(x, y) == minValue

        where:
        x  | y  | minValue
        1  | 2  | 1
        -2 | -1 | -2
        -2 | 0  | -2
    }

    def "computing the maximum of two numbers"() {
        expect:
        Math.max(a, b) == c

        where:
        a << [5, 3]
        b << [1, 9]
        c << [5, 9]
    }


    def "should add user"() {
        given: "usuario service"
        def usuarioService = Mock(UsuarioService)

        when:
        usuarioService.addUser("pepe")

        then:
        1 * usuarioService.addUser("pepe")
    }

}