package com.example.handleblogdatainsertservice.repository;

import com.example.handleblogdatainsertservice.domain.LinkUserData_v2;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LinkV2Repository extends ElasticsearchRepository<LinkUserData_v2, String> {
}
