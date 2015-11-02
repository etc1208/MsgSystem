package com.msgSystem.service;

import com.msgSystem.dao.RegisterDao;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * Created by yh on 2015/11/1.
 */
@Service("registerService")
public class RegisterService {
    private ReadWriteLock lock = new ReentrantReadWriteLock();
    @Autowired
    private RegisterDao registerDao;

    public JSONObject register(String username, String password, String phone, String email) {
        lock.writeLock().lock();
        try{
            return registerDao.register(username, password, phone, email);
        }finally{
            lock.writeLock().unlock();
        }
    }
}
