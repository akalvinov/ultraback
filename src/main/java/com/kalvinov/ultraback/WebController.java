package com.kalvinov.ultraback;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;

@Controller
public class WebController {
    @RequestMapping("/test")
    @ResponseBody
    public String handleTest() throws IOException {
        return "ok";
    }
}
