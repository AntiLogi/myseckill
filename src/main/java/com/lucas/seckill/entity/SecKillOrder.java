package com.lucas.seckill.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

/**
 * @author chenxiaobin
 * @description
 * @create 2018/12/10
 */
@Data
@Entity
public class SecKillOrder {
    @Id
    private long secKillId;

    private long userId;

    private int state;

    private Date createTime;


}
