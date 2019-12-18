package com.atguigu.gmall.wms.api;

import com.atguigu.core.bean.Resp;
import com.atguigu.gmall.wms.entity.WareSkuEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * @author lzc
 * @create 2019-12-09 20:10
 */
public interface GmallWmsApi {
    @GetMapping("wms/waresku/{skuId}")
    public Resp<List<WareSkuEntity>> queryWareSkusBySkuId(@PathVariable("skuId")Long skuId);
}
