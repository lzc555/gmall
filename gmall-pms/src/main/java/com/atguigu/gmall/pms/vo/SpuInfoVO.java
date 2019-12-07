package com.atguigu.gmall.pms.vo;

import com.atguigu.gmall.pms.entity.SpuInfoEntity;
import lombok.Data;

import java.util.List;

/**
 * spuInfo扩展对象
 * 包括：spuInfo基本信息，spuImages图片信息，baseAttrs基本属性信息，skus信息
 * @author lzc
 * @create 2019-12-04 11:14
 */
@Data
public class SpuInfoVO extends SpuInfoEntity {
    private List<String> spuImages;
    private List<BaseAttrVO> baseAttrs;
    private List<SkuInfoVO> skus;
}
