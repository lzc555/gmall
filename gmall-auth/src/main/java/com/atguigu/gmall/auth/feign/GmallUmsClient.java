package com.atguigu.gmall.auth.feign;

import com.atguigu.gmall.ums.api.GmallUmsApi;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author lzc
 * @create 2019-12-17 0:47
 */
@FeignClient("ums-service")
public interface GmallUmsClient extends GmallUmsApi {
}