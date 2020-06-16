package com.ibn.user.controller;

import com.ibn.user.domain.UserBaseDTO;

/**
 * @version 1.0
 * @description:
 * @projectName：springboot-struts2
 * @see: com.ibn.service
 * @author： RenBin
 * @createTime：2020/6/15 14:33
 */
public interface UserBaseService {

    /**
     * @description: 新增用户信息
     * @author：RenBin
     * @createTime：2020/6/15 15:48
     */
    int createUserBase(UserBaseDTO userBaseDTO);

    /**
     * @description: 删除用户信息
     * @author：RenBin
     * @createTime：2020/6/15 15:49
     */
    int deleteUserBase(Long id);

    /**
     * @description: 修改用户信息
     * @author：RenBin
     * @createTime：2020/6/15 15:50
     */
    int modifyUserBase(UserBaseDTO userBaseDTO);

    /**
     * @description: 查询用户信息
     * @author：RenBin
     * @createTime：2020/6/15 15:50
     */
    UserBaseDTO queryUserBase(UserBaseDTO userBaseDTO);
}
