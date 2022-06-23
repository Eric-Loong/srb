package com.eric.srb.core.service.impl;

import com.eric.srb.core.pojo.entity.UserAccount;
import com.eric.srb.core.mapper.UserAccountMapper;
import com.eric.srb.core.service.UserAccountService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户账户 服务实现类
 * </p>
 *
 * @author Eric
 * @since 2022-06-22
 */
@Service
public class UserAccountServiceImpl extends ServiceImpl<UserAccountMapper, UserAccount> implements UserAccountService {

}
