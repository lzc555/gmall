package com.atguigu.gmall.cart.feign;

import com.atguigu.gmall.wms.api.GmallWmsApi;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author lzc
 * @create 2019-12-15 22:14
 */
@FeignClient("wms-service")
public interface GmallWmsClient extends GmallWmsApi {
}
