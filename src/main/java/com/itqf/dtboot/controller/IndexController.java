package com.itqf.dtboot.controller;

import com.itqf.dtboot.service.IndexService;
import com.itqf.dtboot.utils.R;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * DJ 2019/2/169:29
 */
@Controller
public class IndexController {

    @Resource
    private IndexService indexService;

    @RequestMapping("/home")
    @ResponseBody
    public R findHot(Long id){
        return R.ok().put("hot", indexService.findAll())
                .put("city", indexService.findCity())
                .put("selectCity", indexService.findCity());
    }








































































































































}
