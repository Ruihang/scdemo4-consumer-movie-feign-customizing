package com.ruix.scdemo4;

import feign.Contract;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 该类为Feign的配置类
 * @author Ruixian
 * @date 2017/11/16
 */
@Configuration
public class FeignConfiguration {
    /**
     * 将契约改成feign原生的契约。这样就可以使用feign自带的注解
     * @return
     */
    @Bean
    public Contract feignContract(){
        return new Contract.Default();
    }
}
