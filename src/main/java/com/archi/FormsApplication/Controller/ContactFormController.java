package com.archi.FormsApplication.Controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@Slf4j
public class ContactFormController {

    @RequestMapping(path = "/contact", method = RequestMethod.POST)
    public String contactFormSubmission(@RequestBody MultiValueMap values) {
        log.info(values.toString());

        return "redirect:success.html";
    }
}
