package com.example.handleblogdatainsertservice.repository;

import com.example.handleblogdatainsertservice.domain.InstagramUserData_v2;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InstagramV2Repository extends ElasticsearchRepository<InstagramUserData_v2, String> {
}
