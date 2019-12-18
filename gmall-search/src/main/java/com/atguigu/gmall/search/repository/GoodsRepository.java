package com.atguigu.gmall.search.repository;

import com.atguigu.gmall.search.pojo.Goods;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * @author lzc
 * @create 2019-12-10 20:32
 */
public interface GoodsRepository extends ElasticsearchRepository<Goods,Long> {
}
