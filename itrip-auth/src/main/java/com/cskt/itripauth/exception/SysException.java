package com.cskt.itripauth.exception;

import com.cskt.common.constants.ErrorCodeEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 类名称: SysException
 * 类描述: 除了持久层和业务逻辑层通用的异常类
 * 创建人: 李谟卓
 * 创建时间 2021/1/4
 *
 * @Version 1.0
 */
@Data
@ApiModel(value = "自定义系统层异常")
public class SysException extends RuntimeException {
    @ApiModelProperty(value = "异常编码")
    private String errorCode;
    public SysException(String message,String errorCode) {
        super(message);
        this.errorCode = errorCode;
    }
    public SysException(ErrorCodeEnum errorCodeEnum) {
        super(errorCodeEnum.getMsg());
        this.errorCode = errorCodeEnum.getErrorCode();
    }

}
