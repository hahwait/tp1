package com.itqf.dtboot.controller;

import com.itqf.dtboot.service.PersonalTailorService;
import com.itqf.dtboot.utils.R;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * DJ 2019/2/1612:08
 */
@Controller
public class PersonalTailorController {
    @Resource
    private PersonalTailorService personalTailorService;


    @RequestMapping("/PersonalTailor/photographer")
    @ResponseBody
    public R findP(){
        return R.ok().put("photographer", personalTailorService.findP())
                .put("ScenicSpot", personalTailorService.findS())
                .put("hotel", personalTailorService.findH())
                .put("traffic", personalTailorService.findT())
                .put("diet", personalTailorService.findD());
    }


}
