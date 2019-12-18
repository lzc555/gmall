package com.atguigu.gmall.cart.feign;

import com.atguigu.gmall.sms.api.GmallSmsApi;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author lzc
 * @create 2019-12-15 22:14
 */
@FeignClient("sms-service")
public interface GmallSmsClient extends GmallSmsApi {
}
