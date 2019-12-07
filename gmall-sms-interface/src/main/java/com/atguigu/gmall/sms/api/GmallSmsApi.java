package com.atguigu.gmall.sms.api;

import com.atguigu.core.bean.Resp;
import com.atguigu.gmall.sms.vo.SkuSaleVO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @author lzc
 * @create 2019-12-04 20:24
 */
public interface GmallSmsApi {
    @PostMapping("sms/skubounds/sku/sale/save")
    public Resp<Object> saveSale(@RequestBody SkuSaleVO skuSaleVO);
}