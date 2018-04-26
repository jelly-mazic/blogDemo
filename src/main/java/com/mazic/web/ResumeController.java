package com.mazic.web;

import com.mazic.entity.Resume;
import com.mazic.service.ResumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("resume")//url:模块/资源/{}/细分
public class ResumeController {
    @Autowired
    private ResumeService resumeService;
    @RequestMapping(value = "/getResume",method = RequestMethod.GET)
    public String getResume(Model model){
        System.out.println("!!!!!!!!!!");
        Resume result = resumeService.seeResume(1);
        model.addAttribute("resume",result);
        return "createArticle";
    }
}
