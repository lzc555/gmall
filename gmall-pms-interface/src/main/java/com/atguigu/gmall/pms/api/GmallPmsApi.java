package com.atguigu.gmall.pms.api;

import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;
import com.atguigu.core.bean.Resp;
import com.atguigu.gmall.pms.entity.*;
import com.atguigu.gmall.pms.vo.CategoryVO;
import com.atguigu.gmall.pms.vo.ItemGroupVO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author lzc
 * @create 2019-12-09 19:36
 */
public interface GmallPmsApi {



    //根据id查询spu
    @GetMapping("pms/spuinfo/info/{id}")
    public Resp<SpuInfoEntity> querySpuById(@PathVariable("id") Long id);

    // 分页查询 spu  ( createTime )
    @PostMapping("pms/spuinfo/page")
    public Resp<List<SpuInfoEntity>> querySpusByPage(@RequestBody QueryCondition queryCondition);

    // 根据 spuId 查询 spu 下的 sku ( skuId pic price title brandId )
    @GetMapping("pms/skuinfo/{spuId}")
    public Resp<List<SkuInfoEntity>> querySkusBySpuId(@PathVariable("spuId")Long spuId);

    @GetMapping("pms/skuinfo/info/{skuId}")
    public Resp<SkuInfoEntity> querySkuById(@PathVariable("skuId") Long skuId);

    @GetMapping("pms/skuimages/{skuId}")
    public Resp<List<SkuImagesEntity>> querySkuImagesBySkuId(@PathVariable("skuId")Long skuId);

    // 根据品牌 id 查询品牌名称 brandName
    @GetMapping("pms/brand/info/{brandId}")
    public Resp<BrandEntity> queryBrandById(@PathVariable("brandId") Long brandId);

    // 根据分类 id 查询分类 categoryName
    @GetMapping("pms/category/info/{catId}")
    public Resp<CategoryEntity> queryCategoryById(@PathVariable("catId") Long catId);

    // 根据 spuid 查询该商品对应的搜索属性及值 ( pms_attr  pms_product_attr_value )
    @GetMapping("pms/productattrvalue/{spuId}")
    public Resp<List<ProductAttrValueEntity>> querySearchAttrValueBySpuId(@PathVariable("spuId") Long spuId);

    //根据分类等级或者父id查询分类
    @GetMapping("pms/category")
    public Resp<List<CategoryEntity>> queryCategoriesByPidOrLevel(@RequestParam(value = "level", defaultValue = "0") Integer level, @RequestParam(value = "parentCid", required = false) Long pid);

    //根据一级分类id查询二级分类及三级分类
    @GetMapping("pms/category/{pid}")
    public Resp<List<CategoryVO>> querySubCategories(@PathVariable("pid")Long pid);

    @GetMapping("pms/skusaleattrvalue/{spuId}")
    public Resp<List<SkuSaleAttrValueEntity>> querySkuSaleAttrValuesBySpuId(@PathVariable("spuId")Long spuId);

    @GetMapping("pms/skusaleattrvalue/sku/{skuId}")
    public Resp<List<SkuSaleAttrValueEntity>> querySkuSaleAttrValuesBySkuId(@PathVariable("skuId")Long skuId);

    @GetMapping("pms/attrgroup/item/group/{cid}/{spuId}")
    public Resp<List<ItemGroupVO>> queryItemGroupVOByCidAndSpuId(@PathVariable("cid")Long cid, @PathVariable("spuId")Long spuId);

    @GetMapping("pms/spuinfodesc/info/{spuId}")
    public Resp<SpuInfoDescEntity> querySpuDescBySpuId(@PathVariable("spuId") Long spuId);

}
