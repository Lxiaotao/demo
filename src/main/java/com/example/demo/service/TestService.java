package com.example.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.demo.entity.Test;
public interface TestService extends IService<Test> {
    int insertTest(Test test);

}
