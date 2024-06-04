package com.itheima.redisson.pojo;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @ClassName AnyObject.java
 * @Description 如何对象
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class AnyObject implements Serializable {
 
    private String id;
 
    private String name;
 
    private Integer age;
 
    private String address;
 
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")//get
    protected Date createdTime;
 
    public AnyObject(String id) {
        this.id = id;
    }
}