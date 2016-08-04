import exceptions.DuplicateUserException
import spock.lang.Specification


/**
 * Created by josebovet on 8/4/16.
 */
class S5_Exceptions extends Specification {

    UserRepository userRepository = Mock()

    void 'should throw an ArithmeticException'() {
        when:
        (1 / 0)

        then:
        thrown ArithmeticException
    }

    def "should HashMap accepts null key"() {
        setup:
        def map = new HashMap()

        when:
        map.put(null, "elem")

        then:
        notThrown(NullPointerException)
    }

    def "should HashTable not accepts null key"() {
        setup:
        def map = new Hashtable()

        when:
        map.put(null, "elem")

        then:
        thrown(NullPointerException)
    }

    void "shoud throw an IllegalArgumentException "() {
        given:
        def validador = new ValidaData();

        when:
        validador.valida(null, 0);

        then:
        thrown(IllegalArgumentException)
    }

    void 'should throw a DuplicateUserException'() {
        given: "new user"
        def user = new User(name: "jose", age: 25, email: "jbovet@zbsys.net")

        when:
        userRepository.insertUser(user)

        then:
        thrown(DuplicateUserException)
        1 * userRepository.insertUser(user) >> { throw new DuplicateUserException() }
    }
}