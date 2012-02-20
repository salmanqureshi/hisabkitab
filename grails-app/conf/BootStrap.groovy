import com.conradlabs.SecRole
import com.conradlabs.SecUser
import com.conradlabs.SecUserSecRole

class BootStrap {

    def init = { servletContext ->
		def userRole = SecRole.findByAuthority('ROLE_USER') ?: new SecRole(authority: 'ROLE_USER').save(failOnError: true)
		def adminRole = SecRole.findByAuthority('ROLE_ADMIN') ?: new SecRole(authority: 'ROLE_ADMIN').save(failOnError: true)

		def adminUser = SecUser.findByUsername('admin') ?: new SecUser(
			username: 'admin',
			password: 'admin',
			userTenantId: 0,
			enabled: true).save(failOnError: true)

		if (!adminUser.authorities.contains(adminRole)) {
			SecUserSecRole.create adminUser, adminRole
		}

		def user = SecUser.findByUsername('salman') ?: new SecUser(
			username: 'salman',
			password: 'salman',
			userTenantId: 1,
			enabled: true).save(failOnError: true)

		if (!user.authorities.contains(userRole)) {
			SecUserSecRole.create user, userRole
		}
    }
    def destroy = {
    }
}
