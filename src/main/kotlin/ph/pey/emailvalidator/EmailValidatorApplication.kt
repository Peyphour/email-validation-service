package ph.pey.emailvalidator

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cache.annotation.EnableCaching

@SpringBootApplication
@EnableCaching
class EmailValidatorApplication

fun main(args: Array<String>) {
    SpringApplication.run(EmailValidatorApplication::class.java, *args)
}
