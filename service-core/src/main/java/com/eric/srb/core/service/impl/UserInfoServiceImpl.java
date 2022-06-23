package com.eric.srb.core.service.impl;

import com.eric.srb.core.pojo.entity.UserInfo;
import com.eric.srb.core.mapper.UserInfoMapper;
import com.eric.srb.core.service.UserInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户基本信息 服务实现类
 * </p>
 *
 * @author Eric
 * @since 2022-06-22
 */
@Service
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo> implements UserInfoService {

}
