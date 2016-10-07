package com.zheng.service.impl.dev;

import com.zheng.service.EmailService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by zhenglian on 2016/10/7.
 */
@Service
@Profile("test")
public class EmailServiceImpl implements EmailService {
    @Override
    public void send() {
        System.out.println("开发测试环境，发送邮件...");
    }
}
