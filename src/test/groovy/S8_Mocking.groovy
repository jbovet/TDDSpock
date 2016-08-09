import spock.lang.Specification


/**
 * Created by josebovet on 8/9/16.
 */
class S8_Mocking extends Specification {

    def "should add user"() {
        given: "usuario service"
        def usuarioService = Mock(UsuarioService)

        when:
        usuarioService.addUser("pepe")

        then:
        1 * usuarioService.addUser("pepe")
    }


}