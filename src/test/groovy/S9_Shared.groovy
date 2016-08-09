import spock.lang.Shared
import spock.lang.Specification


/**
 * Created by josebovet on 8/9/16.
 */
class S9_Shared extends Specification {

    @Shared
    def user = new User('Jose Bovet', 30, 'jose.bovet@gmail.com')

    void 'should get name'() {
        expect:
        println user.name
    }

    void 'should get email'() {
        expect:
        println user.email
    }

    void 'should get age'() {
        expect:
        println user.age
    }
}