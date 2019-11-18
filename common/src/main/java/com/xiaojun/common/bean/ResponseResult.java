package com.xiaojun.common.bean;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

/**
 * @author xiaojun
 */
@Data
@Builder
@AllArgsConstructor
public class ResponseResult<T> {
    private Integer status;
    private String msg;
    private T data;

    public static <T> ResponseResult success(T data) {
        return ResponseResult.builder()
                .msg(ResponseStatus.SUCCESS.getMsg())
                .status(ResponseStatus.SUCCESS.getStatus())
                .data(data)
                .build();
    }

    public static <T> ResponseResult error() {
        return ResponseResult.builder()
                .msg(ResponseStatus.ERROR.getMsg())
                .status(ResponseStatus.ERROR.getStatus())
                .build();
    }

    public static <T> ResponseResult error(ResponseStatus responseStatus) {
        return ResponseResult.builder()
                .msg(responseStatus.getMsg())
                .status(responseStatus.getStatus())
                .build();
    }

}
