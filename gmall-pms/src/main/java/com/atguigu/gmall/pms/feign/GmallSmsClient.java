package com.atguigu.gmall.pms.feign;

import com.atguigu.gmall.sms.api.GmallSmsApi;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author lzc
 * @create 2019-12-04 16:31
 */
@FeignClient("sms-service")
public interface GmallSmsClient extends GmallSmsApi {


}
