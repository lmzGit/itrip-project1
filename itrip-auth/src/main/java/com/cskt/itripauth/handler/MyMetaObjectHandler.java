package com.cskt.itripauth.handler;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import com.cskt.common.constants.SystemConstants;
import org.apache.ibatis.reflection.MetaObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.Date;

/**
 * @author mo
 * @Description: MyBatisPlus自动填充处理器
 * @date 2020-09-18 17:15
 */
@Component
public class MyMetaObjectHandler implements MetaObjectHandler {
    private static final Logger log = LoggerFactory.getLogger(MyMetaObjectHandler.class);

    @Override
    public void insertFill(MetaObject metaObject) {
        log.info("start insert fill ....");
        Date date = new Date();
        this.strictInsertFill(metaObject, "creationDate", Date.class, date);
        this.strictInsertFill(metaObject, "modifyDate",Date.class, date);
        this.strictInsertFill(metaObject, "activated", Integer.class, SystemConstants.UserActiveStatus.NOT_ACTIVE);
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        log.info("start update fill ....");
        Date date = new Date();
        this.strictUpdateFill(metaObject, "modifyDate",Date.class, date);
    }
}
