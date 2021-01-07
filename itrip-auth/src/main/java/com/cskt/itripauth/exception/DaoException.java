package com.cskt.itripauth.exception;

import com.cskt.common.constants.ErrorCodeEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 类名称: DaoException
 * 类描述: TODO
 * 创建人: 李谟卓
 * 创建时间 2021/1/4
 *
 * @Version 1.0
 */
@Data
@ApiModel(value = "自定义Dao层异常")
public class DaoException extends RuntimeException {
    @ApiModelProperty(value = "异常状态码")
    private String errorCode;
    public DaoException(String message,String errorCode) {
        //把返回给前端的信息放在异常信息里面
        super(message);
        this.errorCode = errorCode;
    }
    public DaoException(ErrorCodeEnum errorCodeEnum) {
        super(errorCodeEnum.getMsg());
        this.errorCode = errorCodeEnum.getErrorCode();
    }

}
