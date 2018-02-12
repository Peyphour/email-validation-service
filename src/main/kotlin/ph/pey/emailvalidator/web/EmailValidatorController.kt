package ph.pey.emailvalidator.web

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import ph.pey.emailvalidator.service.EmailValidatorService
import ph.pey.emailvalidator.web.data.ValidateRequest
import ph.pey.emailvalidator.web.data.ValidateResponse

@RestController("/")
class EmailValidatorController {

    @Autowired
    private lateinit var emailValidatorService: EmailValidatorService

    @PostMapping("/validate")
    fun validate(@RequestBody validateRequest: ValidateRequest): ValidateResponse {
        return ValidateResponse(emailValidatorService.isValidEmail(validateRequest.email))
    }
}