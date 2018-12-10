package com.lucas.seckill.web;

import com.lucas.seckill.service.PushSeckillIntoRedis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chenxiaobin
 * @description
 * @create 2018/12/10
 */
@RestController
public class RedisCtrl {
    @Autowired
    private PushSeckillIntoRedis pushSeckillIntoRedis;

    @RequestMapping("/push")
    public void push() {
        pushSeckillIntoRedis.publish();
    }
}
