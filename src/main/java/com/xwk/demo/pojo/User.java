package com.xwk.demo.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * 属性
 * set get
 * 空参构造
 * 无参构造
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    //sssssssssssss
    private Integer id;
    private String name;
    //返回数据显示的格式
   /* @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date birthday;*/
}
