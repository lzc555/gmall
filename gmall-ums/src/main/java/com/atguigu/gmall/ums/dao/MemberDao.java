package com.atguigu.gmall.ums.dao;

import com.atguigu.gmall.ums.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author lzc
 * @email lzc@atguigu.com
 * @date 2019-12-16 19:16:53
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
