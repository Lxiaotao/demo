package com.example.demo.service.impl;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.entity.Test;
import com.example.demo.mapper.TestMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.example.demo.service.TestService;
import javax.annotation.Resource;



@Slf4j
@Service
public class TestServiceImpl extends ServiceImpl<TestMapper,Test> implements TestService {

    @Resource
    private TestService testService;
    @Resource
    private TestMapper testMapper;

    @Override
    @Transactional
    public int insertTest(Test test) {
        return testMapper.insert(test);
    }
}
//
//    @Transactional
//    public int delete(int id){
//        return testMapper.deleteById(id);
//    }
//
//    @Transactional
//    public int update(Test test){
//        return testMapper.updateById(test);
//    }
//
//    public List<Test> selectList(Test test) {
//        List<Test> testLists = testMapper.selectList(test);
//        return testLists;
//    }
//    public int selectById(int id){
//        testService.selectById(id);
//        return 0;
//    }
//}
