package com.zheng.service;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by zhenglian on 2016/10/7.
 */
public class EmailServiceTest extends BaseServiceTest {
    @Autowired
    private EmailService emailService;

    @Test
    public void testSend() {
        emailService.send();
    }



}
