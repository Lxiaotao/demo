package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@TableName(value = "test_lable")
public class Test {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "lable")
    private String lable;

    @Column(name = "intput_type")
    private Integer intputType;

    @Column(name = "data")
    private String data;

    @Column(name = "required")
    private Boolean required;

}
