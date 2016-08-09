import spock.lang.Shared
import spock.lang.Specification


/**
 * Created by josebovet on 8/9/16.
 */
class S9_Shared extends Specification {

    @Shared
    def user = new User('Jose Bovet', 30, 'jose.bovet@gmail.com')

    void 'should get name'() {
        expect: 'name Jose Bovet'
        user.name == 'Jose Bovet'
    }

    void 'should get email'() {
        expect: 'email jose.bovet@gmail.com'
        user.email == 'jose.bovet@gmail.com'
    }

    void 'should get age'() {
        expect: 'age 30'
        user.age == 30
    }
}