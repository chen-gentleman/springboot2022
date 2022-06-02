package com.chen.boot.model;

import lombok.Data;
import lombok.ToString;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

/**
 * @Author @Chenxc
 * @Date 2022/6/1 17:08
 */
@Data
@ToString
public class User {
    @NotEmpty(message = "姓名不能为空")
    private String name;
    @Max(value = 100,message = "年龄不能⼤于100岁")
    @Min(value = 18,message = "必须年满18岁！")
    private int age;
    @NotEmpty(message = "密码不能为空")
    @Length(min = 6,message = "密码⻓度不能⼩于6位")
    private String pass;
}
