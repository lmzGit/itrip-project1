package com.cskt.common.constants;

/**
 * 类名称: SystemConstants
 * 类描述: TODO
 * 创建人: 帅哥禹品
 * 创建时间 2021/1/6 11:22
 *
 * @Version 1.0
 */
public class SystemConstants {
    public interface UserType{
        /**用户类型常量*/
        public static final Integer REGISTRATION = 0;
        public static final Integer WE_CHAT_LOGIN = 1;
        public static final Integer QQ_LOGIN = 2;
        public static final Integer WEI_BO_LOGIN = 3;
    }

    /**用户激活状态 0：未激活  1、已激活*/
    public interface  UserActiveStatus{
        public static final Integer NOT_ACTIVE = 0;
        public static final Integer IS_ACTIVE = 1;
    }

    /**订单来源*/
    public interface OrderBookType{
        Integer WEB = 0;
        Integer PHONE = 1;
        Integer OTHER = 2;
    }

    public interface OrderStatus{
        //        （0：待支付 1:已取消 2:支付成功 3:已消费 4：已点评）
        public static final Integer TO_BE_PAID = 0;
        public static final Integer IS_CANCELLED = 1;
        public static final Integer PAYMENT_SUCCESSFUL = 2;
        public static final Integer IS_CONSUMED = 3;
        public static final Integer IS_REVIEWED = 4;
    }
}
