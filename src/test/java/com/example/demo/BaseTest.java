package com.example.demo;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

/**
 * Create by leinuo on 19-9-2 上午11:22
 * <p>
 * qq:1321404703 https://github.com/leinuo2016
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@Transactional
@Rollback(false)
public class BaseTest {
}
