import com.khalilt.whispersync.Role
import com.khalilt.whispersync.User
import com.khalilt.whispersync.UserRole

class BootStrap {

    def init = { servletContext ->
        User user = new User(username: 'test', email: 'thomas@khalilt.com', password: 'foobar')
        user.save()
        
        Role roleUser = new Role(authority: "ROLE_USER")
        roleUser.save()
        
        new UserRole(user: user, roleUser: roleUser)

    }
    def destroy = {
    }
}
