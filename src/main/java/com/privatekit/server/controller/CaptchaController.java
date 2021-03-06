package com.privatekit.server.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CaptchaController {

    @Value("${captcha.site-key}")
    private String siteKey;

    @GetMapping(value = "/v1.0/captcha")
    public String renderCaptcha(Model model) {
        model.addAttribute("siteKey", siteKey);
        return "captcha";
    }
}
