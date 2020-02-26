package com.example.demo.service;

import com.example.demo.entity.BaseEntity;
import com.example.demo.repository.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.NoSuchElementException;

/**
 * service-基类
 *
 * @author 雪庭(flysic) qq: 119238122 github: https://github.com/flysic
 * @since 1.0
 * @version at 20190420
 */
@Transactional
public abstract class BaseService<T extends BaseEntity, Id extends Long> {

    // 持久层对象
    private BaseRepository<T, Id> baseRepository;

    @Autowired
    protected void setBaseRepository(BaseRepository< T,Id> baseRepository) {
        this.baseRepository = baseRepository;
    }

    // 保存
    public void save(T entity){
        baseRepository.save(entity);
    }

    // 删除
    public void delete(T entity) {
        baseRepository.delete(entity);
    }

    public void deleteById(Id id) {
        baseRepository.deleteById(id);
    }

    public void saveAndFlush(T entity) {baseRepository.saveAndFlush(entity);}

    public List<T> saveAll(Iterable<T> entities){
       List<T> list =  baseRepository.saveAll(entities);
       return list;
    }
    // 取得
    public T findById(Id id)  {
        try {
            return baseRepository.findById(id).get();
        }catch (NoSuchElementException e){
            return null;
        }
    }

    // 取得所有
    public List<T> findAll(){
        return baseRepository.findAll();
    }

    // 分页取得所有
    public Page<T> findAll(Pageable pageable) {
        return baseRepository.findAll(pageable);
    }

    // 取得数量
    public long count() {
        return baseRepository.count();
    }



}
