package com.example.handleblogdatainsertservice.repository;

import com.example.handleblogdatainsertservice.domain.TwitterUserData_v2;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TwitterV2Repository extends ElasticsearchRepository<TwitterUserData_v2, String> {
}
