package com.example.demo.repository;

import com.example.demo.entity.BaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * repository-基类
 *
 * @author 雪庭(flysic) qq: 119238122 github: https://github.com/flysic
 * @since 1.0
 * @version 3.0 at 20190420
 */
public interface BaseRepository<T extends BaseEntity,I extends Long> extends JpaRepository<T,I> {

    @Override
    List<T> findAll();
    <S extends T> List<S> saveAll(Iterable<S> entities);
}
