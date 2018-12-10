package com.lucas.seckill.service;

import com.lucas.seckill.dao.SecKillRepository;
import com.lucas.seckill.entity.SecKill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import redis.clients.jedis.Jedis;

import java.util.List;

/**
 * @author chenxiaobin
 * @description
 * @create 2018/12/10
 */
@Service
public class PushSeckillIntoRedis {

    @Autowired
    private RedisTemplate<String, Object> redisTemplate;
    @Autowired
    private SecKillRepository secKillRepository;

    public void publish() {
        List<SecKill> all = secKillRepository.findAll();
        for (SecKill sec:
                all) {
            String name = sec.getName();
            int stocks = sec.getStocks();
            Jedis jedis = new Jedis("localhost");
            jedis.set(name,String.valueOf(stocks));
        }


    }
}
