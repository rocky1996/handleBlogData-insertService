package com.example.handleblogdatainsertservice.repository;

import com.example.handleblogdatainsertservice.domain.FbUserData_v2;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FbV2Repository extends ElasticsearchRepository<FbUserData_v2, String> {
}
