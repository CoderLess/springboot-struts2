package com.ibn.user.dao;

import com.ibn.user.entity.UserBaseDO;

/**
 * @version 1.0
 * @description:
 * @projectName：springboot-struts2
 * @see: com.ibn.user.dao
 * @author： RenBin
 * @createTime：2020/6/15 16:02
 */
public interface UserBaseDao {
    /**
     * @description: 创建用户信息
     * @author：RenBin
     * @createTime：2020/6/15 16:02
     */
    int createUserBase(UserBaseDO userBaseDO);
    /**
     * @description: 删除用户信息
     * @author：RenBin
     * @createTime：2020/6/15 16:03
     */
    int deleteUserBase(Long id);
    /**
     * @description: 修改用户信息
     * @author：RenBin
     * @createTime：2020/6/15 16:04
     */
    int modifyUserBase(UserBaseDO userBaseDO);
    /**
     * @description: 查询用户信息
     * @author：RenBin
     * @createTime：2020/6/15 16:04
     */
    UserBaseDO queryUserBase(UserBaseDO userBaseDO);
}
