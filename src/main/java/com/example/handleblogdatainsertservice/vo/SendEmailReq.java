package com.example.handleblogdatainsertservice.vo;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class SendEmailReq {

    private String subject;

    private String content;
}
