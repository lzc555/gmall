package com.atguigu.gmall.pms.vo;

import com.atguigu.gmall.pms.entity.CategoryEntity;
import lombok.Data;

import java.util.List;

/**
 * @author lzc
 * @create 2019-12-13 18:38
 */
@Data
public class CategoryVO extends CategoryEntity {

    private List<CategoryEntity> subs;
}
