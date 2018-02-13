package ph.pey.emailvalidator.service

import org.springframework.cache.annotation.Cacheable
import org.springframework.stereotype.Service
import org.xbill.DNS.Lookup
import org.xbill.DNS.Type

@Service
class EmailValidatorService {

    /**
     * Email is valid if :
     *  - Has at least one '@'
     *  - The domain has at least one MX record
     */
    @Cacheable("emails")
    fun isValidEmail(email: String): Boolean {

        if(email.count { it == '@' } == 0)
            return false

        val domain = email.substring(email.lastIndexOf('@') + 1, email.length)

        val lookups = Lookup(domain, Type.MX).run()

        return lookups != null && lookups.isNotEmpty()
    }
}