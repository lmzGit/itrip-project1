package com.cskt.itripauth.exception;

import com.cskt.common.constants.ErrorCodeEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 类名称: ServiceException
 * 类描述: TODO
 * 创建人: 李谟卓
 * 创建时间 2021/1/4
 *
 * @Version 1.0
 */
@Data
@ApiModel(value = "自定义service层异常")
public class ServiceException extends RuntimeException {
    @ApiModelProperty(value = "异常状态码")
    private String errorCode;
    public ServiceException(String message, String errorCode) {
        super(message);
        this.errorCode = errorCode;
    }
    public ServiceException(ErrorCodeEnum errorCodeEnum) {
        super(errorCodeEnum.getMsg());
        this.errorCode = errorCodeEnum.getErrorCode();
    }
}
