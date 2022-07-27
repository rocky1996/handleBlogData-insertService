package com.example.handleblogdatainsertservice.repository;

import com.example.handleblogdatainsertservice.domain.LinkBusinessUserData_v2;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LinkBusinessV2Repository extends ElasticsearchRepository<LinkBusinessUserData_v2, String> {
}
