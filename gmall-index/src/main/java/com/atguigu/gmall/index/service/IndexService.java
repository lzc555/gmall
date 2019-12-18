package com.atguigu.gmall.index.service;

import com.atguigu.gmall.pms.entity.CategoryEntity;
import com.atguigu.gmall.pms.vo.CategoryVO;

import java.util.List;

/**
 * @author lzc
 * @create 2019-12-13 11:49
 */
public interface IndexService {
    List<CategoryEntity> queryLvl1Categories();

    List<CategoryVO> querySubCategories(Long pid);
}
