package com.lucas.seckill.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * @author chenxiaobin
 * @description
 * @create 2018/12/10
 */
@Getter
@Setter
@Entity
@Table(name = "seckill")
public class SecKill {
    @Id
    @Column(name = "seckill_id")
    private long secKillId;
    @Column(name = "stocks")
    private int stocks;
    @Column(name = "name")
    private String name;
    @Column(name = "start_time")
    private Date startTime;
    @Column(name = "end_time")
    private Date endTime;
    @Column(name = "create_time")
    private Date createTime;


    public SecKill() {
    }

    public SecKill(long secKillId, int stocks, String name, Date startTime, Date endTime, Date createTime) {
        this.secKillId = secKillId;
        this.stocks = stocks;
        this.name = name;
        this.startTime = startTime;
        this.endTime = endTime;
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "SecKill{" +
                "secKillId=" + secKillId +
                ", stocks=" + stocks +
                ", name='" + name + '\'' +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", createTime=" + createTime +
                '}';
    }
}
