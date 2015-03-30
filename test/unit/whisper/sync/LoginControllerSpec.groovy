package whisper.sync

import grails.test.mixin.TestFor
import spock.lang.Specification
import whisper.sync.auth.LoginController

/**
 * See the API for {@link grails.test.mixin.web.ControllerUnitTestMixin} for usage instructions
 */
@TestFor(LoginController)
class LoginControllerSpec extends Specification {

    void "test index"() {
        when:
        controller.index()
        
        then:
        response.text == "Loggedin !!!"
    }
}
