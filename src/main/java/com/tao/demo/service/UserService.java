package com.tao.demo.service;

import com.tao.demo.mapper.UserTMapper;
import com.tao.demo.po.UserT;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * @Author TAO
 * @Date 2017/10/16 22:53
 */
@Service
public class UserService {
    @Resource
    private UserTMapper userTMapper;

    public UserT getUserById(int userId) {
        return userTMapper.selectByPrimaryKey(userId);
    }

    @Transactional(rollbackFor = Exception.class)
    public void bath2(){
        a();
        b();
        int i = 1/0;//事物回滚
    }

    private void a(){
        UserT userT1 = new UserT();
        userT1.setId(1);
        userT1.setUserName("yct");
        userTMapper.updateByPrimaryKey(userT1);

    }

    private void b(){
        UserT userT = new UserT();
        userT.setAge(10);
        userT.setPassword("1233");
        userT.setUserName("gutao4");
        userTMapper.insert(userT);
    }

}