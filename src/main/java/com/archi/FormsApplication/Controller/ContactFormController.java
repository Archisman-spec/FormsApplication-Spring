package com.archi.FormsApplication.Controller;

import com.archi.FormsApplication.Domain.ContactForm;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@Slf4j
public class ContactFormController {

    @RequestMapping(path = "/contact", method = RequestMethod.POST)
    public String contactFormSubmission(@Valid  @ModelAttribute final ContactForm contactForm) {

        log.info(contactForm.toString());
        return "redirect:success.html";
    }
}
