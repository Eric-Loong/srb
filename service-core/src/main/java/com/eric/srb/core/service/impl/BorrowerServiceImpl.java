package com.eric.srb.core.service.impl;

import com.eric.srb.core.pojo.entity.Borrower;
import com.eric.srb.core.mapper.BorrowerMapper;
import com.eric.srb.core.service.BorrowerService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 借款人 服务实现类
 * </p>
 *
 * @author Eric
 * @since 2022-06-22
 */
@Service
public class BorrowerServiceImpl extends ServiceImpl<BorrowerMapper, Borrower> implements BorrowerService {

}
