package com.example.demo.controller;

import com.example.demo.entity.Test;
import com.example.demo.mapper.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.demo.service.TestService;
import java.util.HashMap;
import java.util.Map;

//@EnableAutoConfiguration
@RestController
//@RequestMapping("/test/first")
public class TestController {
    private String prefix = "test/first";
    @Autowired
    private TestService testService;
    @Autowired
    private TestMapper testMapper;

//    @PostMapping("/add")
//    public String insert(Model model){
//        return prefix+"/add";
//    }
    @PostMapping("/save")
    @ResponseBody
    public Map<String, Object> insertTest(Test test){
        Map<String, Object> map = null;
        int number = testService.insertTest(test);
        if(number > 0){
            map = new HashMap<String,Object>();
            map.put("msg","成功");
            return map;
        }else {
            map = new HashMap<String, Object>();
            map.put("msg","失败");
            return map;
        }
    }
/*
    *//**
     * 删除
     * @param id
     * @return
     *//*

    @RequestMapping("/delete")
    @ResponseBody
    public Map<String, Object> removeTest(int id){
        Map<String, Object> map = null;
        try{
            testService.delete(id);
            map = new HashMap<String,Object>();
            map.put("msg","成功");
            return map;
        }catch (Exception e){
            map = new HashMap<String, Object>();
            map.put("msg","失败");
            return map;
        }
    }

    *//**
     * 修改
     * @param id
     * @param model
     * @return
     *//*
    @RequestMapping("/update/{id}")
    public String update(@PathVariable("id") int id, Model model){
        Test test = testService.selectById(id);
        model.addAttribute("test",test);
        return prefix + "update";
    }
    @RequestMapping(value = "/saveUpdate",method = {RequestMethod.POST,RequestMethod.GET})
    @ResponseBody
    public Map<String, Object> updateTest(Test test){
        Map<String, Object> map = null;
        int number = testService.update(test);
        if(number > 0){
            map = new HashMap<String,Object>();
            map.put("msg","成功");
            return map;
        }else {
            map = new HashMap<String, Object>();
            map.put("msg","失败");
            return map;
        }
    }

    *//**
     * 查询
     * @param test
     * @return
     *//*
    @RequestMapping("/select")
    @ResponseBody
    public String selectTest(Test test){
        List<Test> testList = testService.select(test);
        return String.valueOf(testList);
    }*/
}