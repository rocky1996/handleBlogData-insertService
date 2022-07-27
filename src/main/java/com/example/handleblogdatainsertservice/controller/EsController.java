package com.example.handleblogdatainsertservice.controller;

import com.example.handleblogdatainsertservice.constants.RestResult;
import com.example.handleblogdatainsertservice.enums.MediaSourceEnum;
import com.example.handleblogdatainsertservice.enums.RestEnum;
import com.example.handleblogdatainsertservice.service.EsServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.math.NumberUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Slf4j
@RestController
@RequestMapping("/blogSystem/insertService")
public class EsController {

    @Resource
    private EsServiceImpl esService;

    @PostMapping("/upload")
    public RestResult upload(HttpServletRequest httpServletRequest,
                             @RequestParam("file") MultipartFile file,
                             Integer mediaSourceCode,
                             String preGovernanceNum) {
        try {
            if (file == null) {
                return new RestResult<>(RestEnum.FIELD_NOT_SUPPORT_DIM_SEARCH, "文件不能为空！！！");
            }

            MediaSourceEnum mediaSourceEnum = MediaSourceEnum.getMediaSourceEnum(mediaSourceCode);
            if (mediaSourceEnum == null) {
                return new RestResult<>(RestEnum.MEDIA_SOURCE_ERROR);
            }

            if (!NumberUtils.isNumber(preGovernanceNum)) {
                return new RestResult<>(RestEnum.FIELD_NOT_SUPPORT_DIM_SEARCH, "治理前数字格式不正确！！！");
            }

            boolean isOk = esService.insertEsData(file, mediaSourceEnum, preGovernanceNum);
            if (isOk) {
                return new RestResult<>(RestEnum.SUCCESS);
            }else {
                return new RestResult<>(RestEnum.FAILED);
            }
        } catch (Exception e) {
            log.error("EsController.upload has error:{}",e.getMessage());
            return new RestResult<>(RestEnum.FAILED.getCode(), e.getMessage(), null);
        }
    }
}
