package com.sihai.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author zw
 * @date 2020/4/23 10:45
 */
@Controller
public class IndexController {
    @RequestMapping(value="/index")
    public String testF2F() {
        return "index";

    }
    @RequestMapping(value="/jsp")
    public String jsp() {
        return "jsp";

    }
    @RequestMapping(value="/goPay")
    public String goPay() {
        return "goPay";

    }
}
