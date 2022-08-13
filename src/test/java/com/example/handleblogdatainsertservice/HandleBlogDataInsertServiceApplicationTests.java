package com.example.handleblogdatainsertservice;

import com.example.handleblogdatainsertservice.constants.RedisKeyConstants;
import com.example.handleblogdatainsertservice.service.RedisServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.elasticsearch.core.ElasticsearchRestTemplate;
import org.springframework.data.elasticsearch.core.mapping.IndexCoordinates;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@SpringBootTest
@Slf4j
@Component
class HandleBlogDataInsertServiceApplicationTests {

    @Resource
    private ElasticsearchRestTemplate elasticsearchRestTemplate;
    @Resource
    private RedisServiceImpl redisService;

    @Test
    void contextLoads() {
    }

    @Test
    public void deleteUserIndex() {
        IndexCoordinates indexCoordinates = IndexCoordinates.of("link_school_v2");
        indexCoordinates.getIndexNames();
        elasticsearchRestTemplate.indexOps(indexCoordinates).delete();
    }

    @Test
    public void queryNumFromRedis() {
//        System.out.println(redisService.getValue(RedisKeyConstants.TWITTER_PRO_GOV_NUM_KEY));
//        System.out.println(redisService.getValue(RedisKeyConstants.INSTAGRAM_PRO_GOV_NUM_KEY));
//        System.out.println(redisService.getValue(RedisKeyConstants.FB_PRO_GOV_NUM_KEY));
//        System.out.println(redisService.getValue(RedisKeyConstants.FQ_PRO_GOV_NUM_KEY));
//        System.out.println(redisService.getValue(RedisKeyConstants.LINK_PRO_GOV_NUM_KEY));
//        System.out.println(redisService.getValue(RedisKeyConstants.LINK_SCHOOL_PRO_GOV_NUM_KEY));
//        System.out.println(redisService.getValue(RedisKeyConstants.LINK_BUSINESS_PRO_GOV_NUM_KEY));
    }

}
