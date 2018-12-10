package com.lucas.seckill.dao;

import com.lucas.seckill.entity.SecKillOrder;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author chenxiaobin
 * @description
 * @create 2018/12/10
 */
public interface SecKillOrderRepository extends JpaRepository<SecKillOrder,Long> {
}
