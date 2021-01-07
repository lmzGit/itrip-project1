package com.cskt.itripauth.handler;

import com.cskt.common.constants.ErrorCodeEnum;
import com.cskt.common.vo.ReturnResult;
import com.cskt.itripauth.exception.DaoException;
import com.cskt.itripauth.exception.ServiceException;
import com.cskt.itripauth.exception.SysException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author mo
 * @Description: 统一异常处理器
 * @date 2020-09-02 8:32
 */
@RestControllerAdvice
public class CustomizeExceptionHandler {
    private static final Logger LOGGER = LoggerFactory.getLogger(CustomizeExceptionHandler.class);

    /**
     * 捕获异常
     * @param e 异常类型为 Exception
     * @return
     */
    @ExceptionHandler(value = Exception.class)
    public ReturnResult error(Exception e) {
        LOGGER.error(e.getMessage(), e);
        return ReturnResult.error(ErrorCodeEnum.SYSTEM_EXECUTION_ERROR);
    }

    /**
     * 捕获异常
     * @param e 异常类型为 ServiceException
     * @return
     */
    @ExceptionHandler(value = ServiceException.class)
    public ReturnResult error(ServiceException e) {
        LOGGER.error(e.getMessage(), e);
        return ReturnResult.error(e.getErrorCode(),e.getMessage());
    }

    /**
     * 捕获异常
     * @param e 异常类型为 DaoException
     * @return
     */
    @ExceptionHandler(value = DaoException.class)
    public ReturnResult error(DaoException e) {
        LOGGER.error(e.getMessage(), e);
        return ReturnResult.error(e.getErrorCode(),e.getMessage());
    }

    @ExceptionHandler(value = SysException.class)
    public ReturnResult error(SysException e) {
        LOGGER.error(e.getMessage(), e);
        return ReturnResult.error(e.getErrorCode(), e.getMessage());
    }
}
