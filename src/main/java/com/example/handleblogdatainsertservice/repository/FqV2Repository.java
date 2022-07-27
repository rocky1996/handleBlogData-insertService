package com.example.handleblogdatainsertservice.repository;

import com.example.handleblogdatainsertservice.domain.FqUserData_v2;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FqV2Repository extends ElasticsearchRepository<FqUserData_v2, String> {
}
