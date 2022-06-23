package com.eric.srb.core.service.impl;

import com.eric.srb.core.pojo.entity.UserLoginRecord;
import com.eric.srb.core.mapper.UserLoginRecordMapper;
import com.eric.srb.core.service.UserLoginRecordService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户登录记录表 服务实现类
 * </p>
 *
 * @author Eric
 * @since 2022-06-22
 */
@Service
public class UserLoginRecordServiceImpl extends ServiceImpl<UserLoginRecordMapper, UserLoginRecord> implements UserLoginRecordService {

}
