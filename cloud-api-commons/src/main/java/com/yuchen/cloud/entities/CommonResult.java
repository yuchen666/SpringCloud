package com.yuchen.cloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author yuchen
 * 2020/3/21/021 12:46
 *
 * 前端通用返回信息
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommonResult<T> {
    /**
    * 返回状态编码
    */
    private Integer code;
    /**
     * 返回消息
     */
    private String message;

    /**
     * 全部实体类的信息
     */
    private T data;
    public CommonResult(Integer code,String message){
        this(code,message,null);
    }
}
