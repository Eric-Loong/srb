package com.eric.srb.core.service.impl;

import com.eric.srb.core.pojo.entity.LendItem;
import com.eric.srb.core.mapper.LendItemMapper;
import com.eric.srb.core.service.LendItemService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 标的出借记录表 服务实现类
 * </p>
 *
 * @author Eric
 * @since 2022-06-22
 */
@Service
public class LendItemServiceImpl extends ServiceImpl<LendItemMapper, LendItem> implements LendItemService {

}
