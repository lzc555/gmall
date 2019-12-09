package com.atguigu.gmall.search.pojo;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * 分页查询 spu  ( createTime )
 * 根据 spuId 查询 spu 下的 sku ( skuId pic price title brandId )
 * 根据品牌 id 查询品牌名称 brandName
 * 根据分类 id 查询分类 categoryName
 * 根据 spuid 查询该商品对应的搜索属性及值 ( pms_attr  pms_product_attr_value )
 *
 * @author lzc
 * @create 2019-12-09 18:24
 */
@Data
@Document(indexName = "goods",type = "info",shards = 5,replicas = 2)
public class Goods {

    @Id
    private Long skuId;

    @Field(type = FieldType.Keyword,index = false)
    private String pic;

    @Field(type = FieldType.Text,analyzer ="ik_max_word" )
    private String title;

    @Field(type = FieldType.Double)
    private Double price;

    @Field(type = FieldType.Long)
    private Long sale;              //销量

    @Field(type = FieldType.Long)
    private Long store;             //是否有货

    @Field(type = FieldType.Date)
    private Date createTime;        //创建时间

    @Field(type = FieldType.Long)
    private Long brandId;

    @Field(type = FieldType.Keyword)
    private String brandName;

    @Field(type = FieldType.Long)
    private Long categoryId;

    @Field(type = FieldType.Keyword)
    private String categoryName;

    @Field(type = FieldType.Nested)
    private List<SearchAttr> attrs;
}
