package com.atguigu.gmall.sms.dao;

import com.atguigu.gmall.sms.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author lzc
 * @email lzc@atguigu.com
 * @date 2019-12-02 23:53:34
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
