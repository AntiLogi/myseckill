package com.lucas.seckill.web;

import com.lucas.seckill.dao.SecKillRepository;
import com.lucas.seckill.entity.SecKill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * @author chenxiaobin
 * @description
 * @create 2018/12/10
 */
@RestController
public class SecKillCtrl  {
    @Autowired
    private SecKillRepository secKillRepository;

    @PostMapping(path = "addSecKill")
    public void addSecKill(SecKill secKill) {

        secKillRepository.save(secKill);
    }

    @RequestMapping("/getSeckills")
    public  List<SecKill> getAllSecKill(){

        return secKillRepository.findAll();
    }

}
