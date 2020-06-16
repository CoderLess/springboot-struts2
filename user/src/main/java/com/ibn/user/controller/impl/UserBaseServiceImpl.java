package com.ibn.user.controller.impl;

import com.ibn.user.dao.UserBaseDao;
import com.ibn.user.domain.UserBaseDTO;
import com.ibn.user.entity.UserBaseDO;
import com.ibn.user.controller.UserBaseService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @version 1.0
 * @description:
 * @projectName：springboot-struts2
 * @see: com.ibn.user.service.impl
 * @author： RenBin
 * @createTime：2020/6/15 16:27
 */
@Service("userBaseService")
public class UserBaseServiceImpl implements UserBaseService {
    @Autowired
    private UserBaseDao userBaseDao;
    @Override
    public int createUserBase(UserBaseDTO userBaseDTO) {
        if (null == userBaseDTO) {
            return -1;
        }
        UserBaseDO userBaseDO = new UserBaseDO();
        BeanUtils.copyProperties(userBaseDTO,userBaseDO);
        return userBaseDao.createUserBase(userBaseDO);
    }

    @Override
    public int deleteUserBase(Long id) {
        if (null == id) {
            return -1;
        }
        return userBaseDao.deleteUserBase(id);
    }

    @Override
    public int modifyUserBase(UserBaseDTO userBaseDTO) {
        if (null == userBaseDTO) {
            return -1;
        }
        UserBaseDO userBaseDO = new UserBaseDO();
        BeanUtils.copyProperties(userBaseDTO,userBaseDO);
        return userBaseDao.modifyUserBase(userBaseDO);
    }

    @Override
    public UserBaseDTO queryUserBase(UserBaseDTO userBaseDTO) {
        if (null == userBaseDTO) {
            return null;
        }
        UserBaseDO userBaseDO = new UserBaseDO();
        BeanUtils.copyProperties(userBaseDTO,userBaseDO);
        UserBaseDO userBaseQueryDO = userBaseDao.queryUserBase(userBaseDO);
        UserBaseDTO userBaseQueryDTO = new UserBaseDTO();
        BeanUtils.copyProperties(userBaseQueryDO,userBaseQueryDTO);
        return userBaseQueryDTO;
    }
}
