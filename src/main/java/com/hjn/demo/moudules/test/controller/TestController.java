package com.hjn.demo.moudules.test.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Description TestController
 * @Author HymanHu
 * @Date 2020/8/10 10:39
 */
@Controller
@RequestMapping("/test")
public class TestController {

    /**
     * 127.0.0.1:8080/test/testDesc ---- get
     */
    @GetMapping("/testDesc")
    @ResponseBody
    public String testDesc() {
        return "This is test module desc.";
    }
}
