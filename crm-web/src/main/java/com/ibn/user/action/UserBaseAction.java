package com.ibn.user.action;

import com.ibn.user.controller.UserBaseService;
import com.ibn.user.domain.UserBaseDTO;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @version 1.0
 * @description:
 * @projectName：springboot-struts2
 * @see: com.ibn.user.action
 * @author： RenBin
 * @createTime：2020/6/16 14:57
 */
@Component("userBaseAction")
@Data
@Scope("prototype")
public class UserBaseAction {
    @Autowired
    private UserBaseService userBaseService;
    private UserBaseDTO userBaseRequestDTO;
    private UserBaseDTO userBaseResponseDTO;

    public String index() {
        return "success";
    }

    public String showUser() {
        try {
            userBaseResponseDTO = userBaseService.queryUserBase(userBaseRequestDTO);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "success";
    }
}
