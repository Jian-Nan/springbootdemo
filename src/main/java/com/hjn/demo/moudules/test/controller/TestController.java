package com.hjn.demo.moudules.test.controller;

import org.apache.juli.logging.LogFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/test")
public class TestController {

    private final static Logger LOGGER= LoggerFactory.getLogger(TestController.class);

    @RequestMapping("/logerTest")
    @ResponseBody
    public String loggerTest()
    {
        LOGGER.trace("trace");
        LOGGER.debug("debug");
        LOGGER.warn("warn");
        return "logger test";
    }

    @RequestMapping("/testDesc")
    @ResponseBody
    public String testDesc()
    {
        return "ttt";
    }

}
