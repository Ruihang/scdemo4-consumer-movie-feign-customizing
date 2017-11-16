package com.ruix.scdemo4;

import feign.Param;
import feign.RequestLine;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Ruixian
 * @date 2017/11/16
 */
@FeignClient(name = "scdemo2", configuration = FeignConfiguration.class)
public interface UserFeignClient {
//    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
//    User findById(@PathVariable("id") Long id);

    /**
     * 使用feign自带的注解@RequestLine
     * @see feign https://github.com/OpenFeign/feign
     *
     * @param id 用户ID
     * @return 用户信息
     */
    @RequestLine("GET /{id}")
    User findById(@Param("id") Long id);
}
