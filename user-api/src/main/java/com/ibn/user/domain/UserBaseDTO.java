package com.ibn.user.domain;

import lombok.Data;

/**
 * @version 1.0
 * @description:
 * @projectName：springboot-struts2
 * @see: com.ibn.domain
 * @author： RenBin
 * @createTime：2020/6/15 15:46
 */
@Data
public class UserBaseDTO extends BaseDTO {
    /**
     * @description: 主键
     * @author：RenBin
     * @createTime：2020/6/15 15:46
     */
    private Long id;
    /**
     * @description: 用户名
     * @author：RenBin
     * @createTime：2020/6/15 15:46
     */
    private String username;
    /**
     * @description: 密码
     * @author：RenBin
     * @createTime：2020/6/15 15:46
     */
    private String password;
    /**
     * @description: 手机号
     * @author：RenBin
     * @createTime：2020/6/15 16:10
     */
    private String phone;
    /**
     * @description: 创建时间
     * @author：RenBin
     * @createTime：2020/6/15 16:10
     */
    private Long createTime;
    /**
     * @description: 上次修改时间
     * @author：RenBin
     * @createTime：2020/6/15 16:10
     */
    private Long lastAccess;
    /**
     * @description: 版本
     * @author：RenBin
     * @createTime：2020/6/15 16:10
     */
    private Long version;
}
