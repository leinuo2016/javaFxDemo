package com.example.demo.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * entity-基类
 * - 提供id,createDate,modifyData，所有实体类都有的字段
 *
 * @author 雪庭(flysic) qq: 119238122 github: https://github.com/flysic
 * @since 1.0
 * @version 3.0 at 20190420
 */
@MappedSuperclass
@Getter
@Setter
public abstract class BaseEntity implements Serializable {

    /** 主键 */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    /** 创建日期 */
    private Date createDate;
    /** 修改日期 */
    private Date modifyDate;
    /**
     * 保存前处理
     */
    @PrePersist
    public void perPersist() {
        this.createDate = new Date();
        this.modifyDate = new Date();
    }

    /**
     * 更新前处理
     */
    @PreUpdate
    public void preUpdate() {
        this.modifyDate = new Date();
    }

}
