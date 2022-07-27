package com.example.handleblogdatainsertservice.repository;

import com.example.handleblogdatainsertservice.domain.LinkSchoolUserData_v2;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LinkSchoolV2Repository extends ElasticsearchRepository<LinkSchoolUserData_v2, String> {
}