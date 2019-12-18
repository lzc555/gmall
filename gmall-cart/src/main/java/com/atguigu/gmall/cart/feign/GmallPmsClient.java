package com.atguigu.gmall.cart.feign;

import com.atguigu.gmall.pms.api.GmallPmsApi;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author lzc
 * @create 2019-12-15 22:14
 */
@FeignClient("pms-service")
public interface GmallPmsClient extends GmallPmsApi {
}
