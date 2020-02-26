package com.example.demo.repository;

import com.example.demo.entity.User;

import java.util.List;

/**
 * Create by leinuo on 19-9-2 上午10:31
 * <p>
 * qq:1321404703 https://github.com/leinuo2016
 */
public interface UserRepository extends BaseRepository<User,Long>  {
    List<User> findByNameEquals(String name);
}
