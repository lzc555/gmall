package com.atguigu.gmall.index.service.impl;

import com.alibaba.fastjson.JSON;
import com.atguigu.core.bean.Resp;
import com.atguigu.gmall.index.annotation.GmallCache;
import com.atguigu.gmall.index.feign.GmallPmsClient;
import com.atguigu.gmall.index.service.IndexService;
import com.atguigu.gmall.pms.entity.CategoryEntity;
import com.atguigu.gmall.pms.vo.CategoryVO;
import org.redisson.api.RLock;
import org.redisson.api.RedissonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * @author lzc
 * @create 2019-12-13 11:51
 */
@Service
public class IndexServiceImpl implements IndexService {

    @Autowired
    private GmallPmsClient gmallPmsClient;

    @Autowired
    private StringRedisTemplate redisTemplate;

    @Autowired
    private RedissonClient redissonClient;

    private static final String KEY_PREFIX = "index:cates:";

    @Override
    public List<CategoryEntity> queryLvl1Categories() {
        Resp<List<CategoryEntity>> listResp = this.gmallPmsClient.queryCategoriesByPidOrLevel(1, null);
        return listResp.getData();
    }

//    @Override
//    public List<CategoryVO> querySubCategories(Long pid) {
//        //1.判断缓存中有没有
//        String cateJson = this.redisTemplate.opsForValue().get(KEY_PREFIX + pid);
//        //2.有，直接返回
//        if (!StringUtils.isEmpty(cateJson)) {
//            return JSON.parseArray(cateJson, CategoryVO.class);
//        }
//        RLock lock = this.redissonClient.getLock("lock" + pid);
//        lock.lock();
//        //1.判断缓存中有没有
//        String cateJson2 = this.redisTemplate.opsForValue().get(KEY_PREFIX + pid);
//        //2.有，直接返回
//        if (!StringUtils.isEmpty(cateJson2)) {
//            lock.unlock();
//            return JSON.parseArray(cateJson, CategoryVO.class);
//        }
//
//
//        //查询数据库
//        Resp<List<CategoryVO>> listResp = gmallPmsClient.querySubCategories(pid);
//        List<CategoryVO> categoryVOS = listResp.getData();
//        //3.查询完成后放入缓存
//        this.redisTemplate.opsForValue().set(KEY_PREFIX + pid, JSON.toJSONString(categoryVOS));
//        lock.unlock();
//        return listResp.getData();
//    }

    @GmallCache(prefix = "index:cates:", timeout = 7200, random = 100)
    @Override
    public List<CategoryVO> querySubCategories(Long pid) {

        //查询数据库
        Resp<List<CategoryVO>> listResp = gmallPmsClient.querySubCategories(pid);
        List<CategoryVO> categoryVOS = listResp.getData();
        return listResp.getData();
    }
}
