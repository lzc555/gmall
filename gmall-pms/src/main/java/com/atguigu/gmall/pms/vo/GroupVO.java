package com.atguigu.gmall.pms.vo;

import com.atguigu.gmall.pms.entity.AttrAttrgroupRelationEntity;
import com.atguigu.gmall.pms.entity.AttrEntity;
import com.atguigu.gmall.pms.entity.AttrGroupEntity;
import lombok.Data;

import java.util.List;

/**
 * 属性组，属性信息，中间表信息
 * @author lzc
 * @create 2019-12-03 18:01
 */
@Data
public class GroupVO extends AttrGroupEntity {
    private List<AttrEntity> attrEntities;
    private List<AttrAttrgroupRelationEntity> relations;

}
