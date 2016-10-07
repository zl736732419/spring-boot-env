package com.zheng.service.impl.prod;

import com.zheng.service.EmailService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by zhenglian on 2016/10/7.
 */
@Service
@Profile("prod")
public class EmailServiceImpl implements EmailService {
    @Override
    public void send() {
        System.out.println("生产环境，不发送垃圾邮件到客户...");
    }
}
