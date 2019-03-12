package com.zhoubi.graindepot.controller;

import com.bstek.ureport.export.ExportManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
    @Autowired
    private ExportManager exportManager;

    @GetMapping("/test")
    @ResponseBody
    public String test(){
        //exportManager.exportHtml()
        return "hello world";
    }

}
