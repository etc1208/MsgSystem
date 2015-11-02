package com.msgSystem.service;

import com.msgSystem.dao.LoginDao;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * Created by yh on 2015/11/1.
 */
@Service("loginService")
public class LoginService {

    private ReadWriteLock lock = new ReentrantReadWriteLock();
    @Autowired
    private LoginDao loginDao;

    public JSONObject login(String username, String password){
        lock.writeLock().lock();
        try{
            return loginDao.login(username, password);
        }finally{
            lock.writeLock().unlock();
        }
    }
}
