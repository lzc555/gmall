package com.atguigu.gmall.pms.vo;

import com.atguigu.gmall.pms.entity.ProductAttrValueEntity;
import lombok.Data;

import java.util.List;

/**
 * @author lzc
 * @create 2019-12-15 21:59
 */
@Data
public class ItemGroupVO {

    private String name;

    private List<ProductAttrValueEntity> baseAttrs;
}
