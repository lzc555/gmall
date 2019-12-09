package com.atguigu.gmall.search;

import com.atguigu.gmall.search.pojo.Goods;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.elasticsearch.core.ElasticsearchRestTemplate;

@SpringBootTest
class GmallSearchApplicationTests {

    @Autowired
    private ElasticsearchRestTemplate elasticsearchRestTemplate;


    @Test
    void contextLoads() {
        this.elasticsearchRestTemplate.createIndex(Goods.class);
        this.elasticsearchRestTemplate.putMapping(Goods.class);
    }



}
