package com.example.handleblogdatainsertservice.service;

import cn.hutool.db.DaoTemplate;
import com.example.handleblogdatainsertservice.constants.RedisKeyConstants;
import com.example.handleblogdatainsertservice.domain.*;
import com.example.handleblogdatainsertservice.enums.MediaSourceEnum;
import com.example.handleblogdatainsertservice.repository.*;
import com.example.handleblogdatainsertservice.util.ReaderFileUtil;
import com.example.handleblogdatainsertservice.vo.SendEmailReq;
import com.google.common.collect.Lists;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.util.List;

@Service
@Slf4j
public class EsServiceImpl {

    @Resource
    private TwitterV2Repository twitterV2Repository;
    @Resource
    private InstagramV2Repository instagramV2Repository;
    @Resource
    private FbV2Repository fbV2Repository;
    @Resource
    private FqV2Repository fqV2Repository;
    @Resource
    private LinkV2Repository linkV2Repository;
    @Resource
    private LinkSchoolV2Repository linkSchoolV2Repository;
    @Resource
    private LinkBusinessV2Repository linkBusinessV2Repository;
    @Resource
    private RedisServiceImpl redisService;
    @Resource
    private SendEmailServiceImpl sendEmailService;

    /**
     *
     * @param file
     * @param mediaSourceEnum
     * @param preGovernanceNum
     * @return
    //     */
    public synchronized boolean insertEsData(MultipartFile file, MediaSourceEnum mediaSourceEnum, String preGovernanceNum) {
        try {
            if (file == null) {
                return false;
            }

            switch (mediaSourceEnum) {
                case TWITTER:
                    List<TwitterUserData_v2> twitterUserData_v2List = (List<TwitterUserData_v2>) ReaderFileUtil.readMultipartFileFile(file, MediaSourceEnum.TWITTER);
                    if (!CollectionUtils.isEmpty(twitterUserData_v2List)) {

                        //统计治理前数量
                        addCacheFromRedis(RedisKeyConstants.TWITTER_PRO_GOV_NUM_KEY, preGovernanceNum);
                        List<TwitterUserData_v2> dataList = (List<TwitterUserData_v2>) twitterV2Repository.saveAll(twitterUserData_v2List);
                        if (CollectionUtils.isEmpty(dataList)) {
//                                sendEmailService.sendSimpleEmail(covBean(MediaSourceEnum.TWITTER));
                            return false;
                        }
                    }
                    break;
                case INSTAGRAM:
                    List<InstagramUserData_v2> instagramUserData_v2List = (List<InstagramUserData_v2>) ReaderFileUtil.readMultipartFileFile(file, MediaSourceEnum.INSTAGRAM);
                    if (!CollectionUtils.isEmpty(instagramUserData_v2List)) {

                        //统计治理前数量
                        addCacheFromRedis(RedisKeyConstants.INSTAGRAM_PRO_GOV_NUM_KEY, preGovernanceNum);
                        List<InstagramUserData_v2> dataList = (List<InstagramUserData_v2>) instagramV2Repository.saveAll(instagramUserData_v2List);
                        if (CollectionUtils.isEmpty(dataList)) {
//                            sendEmailService.sendSimpleEmail(covBean(MediaSourceEnum.INSTAGRAM));
                            return false;
                        }
                    }
                    break;
                case FB_IMPL:
                    List<FbUserData_v2> fbUserData_v2ImplList = (List<FbUserData_v2>) ReaderFileUtil.readMultipartFileFile(file, MediaSourceEnum.FB_IMPL);
                    if (!CollectionUtils.isEmpty(fbUserData_v2ImplList)) {
                        //统计治理前数量
                        addCacheFromRedis(RedisKeyConstants.FB_PRO_GOV_NUM_KEY, preGovernanceNum);

                        List<FbUserData_v2> dataList = (List<FbUserData_v2>) fbV2Repository.saveAll(fbUserData_v2ImplList);
                        if (CollectionUtils.isEmpty(dataList)) {
//                            sendEmailService.sendSimpleEmail(covBean(MediaSourceEnum.FB_IMPL));
                            return false;
                        }
                    }
                    break;
                case FB_HISTORY:
                    List<FbUserData_v2> fbUserData_v2HistoryList = (List<FbUserData_v2>) ReaderFileUtil.readMultipartFileFile(file, MediaSourceEnum.FB_HISTORY);
                    if (!CollectionUtils.isEmpty(fbUserData_v2HistoryList)) {

                        //统计治理前数量
                        addCacheFromRedis(RedisKeyConstants.FB_PRO_GOV_NUM_KEY, preGovernanceNum);
                        List<FbUserData_v2> dataList = (List<FbUserData_v2>) fbV2Repository.saveAll(fbUserData_v2HistoryList);
                        if (CollectionUtils.isEmpty(dataList)) {
//                            sendEmailService.sendSimpleEmail(covBean(MediaSourceEnum.FB_HISTORY));
                            return false;
                        }
                    }
                    break;
                case FQ_IMPL:
                    List<FqUserData_v2> fqUserData_v2ImplList = (List<FqUserData_v2>) ReaderFileUtil.readMultipartFileFile(file, MediaSourceEnum.FQ_IMPL);
                    if (!CollectionUtils.isEmpty(fqUserData_v2ImplList)) {
                        //统计治理前数量
                        addCacheFromRedis(RedisKeyConstants.FQ_PRO_GOV_NUM_KEY, preGovernanceNum);
                        List<FqUserData_v2> dataList = (List<FqUserData_v2>) fqV2Repository.saveAll(fqUserData_v2ImplList);
                        if (CollectionUtils.isEmpty(dataList)) {
//                            sendEmailService.sendSimpleEmail(covBean(MediaSourceEnum.FQ_IMPL));
                            return false;
                        }
                    }
                    break;
                case FQ_HISTORY:
                    List<FqUserData_v2> fqUserData_v2HistoryList = (List<FqUserData_v2>) ReaderFileUtil.readMultipartFileFile(file, MediaSourceEnum.FQ_HISTORY);
                    if (!CollectionUtils.isEmpty(fqUserData_v2HistoryList)) {
                        //统计治理前数量
                        addCacheFromRedis(RedisKeyConstants.FQ_PRO_GOV_NUM_KEY, preGovernanceNum);
                        List<FqUserData_v2> dataList = (List<FqUserData_v2>) fqV2Repository.saveAll(fqUserData_v2HistoryList);
                        if (CollectionUtils.isEmpty(dataList)) {
//                            sendEmailService.sendSimpleEmail(covBean(MediaSourceEnum.FQ_IMPL));
                            return false;
                        }
                    }
                    break;
                case LINKEDIN_IMPL:
                    List<LinkUserData_v2> linkUserData_v2ImplList = (List<LinkUserData_v2>) ReaderFileUtil.readMultipartFileFile(file, MediaSourceEnum.LINKEDIN_IMPL);
                    if (!CollectionUtils.isEmpty(linkUserData_v2ImplList)) {
                        //统计治理前数量
                        addCacheFromRedis(RedisKeyConstants.LINK_PRO_GOV_NUM_KEY, preGovernanceNum);
                        Lists.partition(linkUserData_v2ImplList, 1000).forEach(e -> linkV2Repository.saveAll(e));
                    }
                    break;
                case LINKEDIN_HISTORY:
                    List<LinkUserData_v2> linkUserData_v2HistoryList = (List<LinkUserData_v2>) ReaderFileUtil.readMultipartFileFile(file, MediaSourceEnum.LINKEDIN_HISTORY);
                    if (!CollectionUtils.isEmpty(linkUserData_v2HistoryList)) {

                        //统计治理前数量
                        addCacheFromRedis(RedisKeyConstants.LINK_PRO_GOV_NUM_KEY, preGovernanceNum);
                        List<LinkUserData_v2> dataList = (List<LinkUserData_v2>) linkV2Repository.saveAll(linkUserData_v2HistoryList);
                        if (CollectionUtils.isEmpty(dataList)) {
//                            sendEmailService.sendSimpleEmail(covBean(MediaSourceEnum.LINKEDIN_IMPL));
                            return false;
                        }
                    }
                    break;
                case LINKEDIN_BUSINESS:
                    List<LinkBusinessUserData_v2> linkBusinessUserData_v2List = (List<LinkBusinessUserData_v2>) ReaderFileUtil.readMultipartFileFile(file, MediaSourceEnum.LINKEDIN_BUSINESS);
                    if (!CollectionUtils.isEmpty(linkBusinessUserData_v2List)) {

                        //统计治理前数量
                        addCacheFromRedis(RedisKeyConstants.LINK_BUSINESS_PRO_GOV_NUM_KEY, preGovernanceNum);
                        List<LinkBusinessUserData_v2> dataList = (List<LinkBusinessUserData_v2>) linkBusinessV2Repository.saveAll(linkBusinessUserData_v2List);
                        if (CollectionUtils.isEmpty(dataList)) {
//                            sendEmailService.sendSimpleEmail(covBean(MediaSourceEnum.LINKEDIN_BUSINESS));
                            return false;
                        }
                    }
                    break;
                case LINKEDIN_SCHOOL:
                    List<LinkSchoolUserData_v2> linkSchoolUserData_v2List = (List<LinkSchoolUserData_v2>) ReaderFileUtil.readMultipartFileFile(file, MediaSourceEnum.LINKEDIN_SCHOOL);
                    if (!CollectionUtils.isEmpty(linkSchoolUserData_v2List)) {

                        //统计治理前数量
                        addCacheFromRedis(RedisKeyConstants.LINK_SCHOOL_PRO_GOV_NUM_KEY, preGovernanceNum);
                        List<LinkSchoolUserData_v2> dataList = (List<LinkSchoolUserData_v2>) linkSchoolV2Repository.saveAll(linkSchoolUserData_v2List);
                        if (CollectionUtils.isEmpty(dataList)) {
//                            sendEmailService.sendSimpleEmail(covBean(MediaSourceEnum.LINKEDIN_SCHOOL));
                            return false;
                        }
                    }
                    break;
                default:
                    break;
            }
            return true;
        }catch (Exception e) {
            log.error("EsServiceImpl.insertEsData has error:{}",e.getMessage());

            SendEmailReq sendEmailReq = SendEmailReq
                    .builder()
                    .subject(mediaSourceEnum.getEs_index_v2()+"类型入ES异常")
                    .content("报错信息:" + e.getMessage())
                    .build();
            sendEmailService.sendSimpleEmail(sendEmailReq);
        }
        return false;
    }

    /**
     * twitter
     * @param file
     * @param mediaSourceEnum
     * @param preGovernanceNum
     * @return
     */
    public synchronized boolean insertEsDataTwitter(MultipartFile file, MediaSourceEnum mediaSourceEnum, String preGovernanceNum) {
        try {
            if (file == null) {
                return false;
            }

            if (MediaSourceEnum.TWITTER != mediaSourceEnum) {
                return false;
            }

            List<TwitterUserData_v2> twitterUserData_v2List = (List<TwitterUserData_v2>) ReaderFileUtil.readMultipartFileFileTwitter(file, MediaSourceEnum.TWITTER);
            if (!CollectionUtils.isEmpty(twitterUserData_v2List)) {

                //统计治理前数量
                addCacheFromRedis(RedisKeyConstants.TWITTER_PRO_GOV_NUM_KEY, preGovernanceNum);
                List<TwitterUserData_v2> dataList = (List<TwitterUserData_v2>) twitterV2Repository.saveAll(twitterUserData_v2List);
                if (CollectionUtils.isEmpty(dataList)) {
                    return false;
                }
            }
            return true;
        }catch (Exception e) {
            log.error("EsServiceImpl.insertEsDataTwitter has error:{}",e.getMessage());
        }
        return false;
    }


    /**
     * instagram
     * @param file
     * @param mediaSourceEnum
     * @param preGovernanceNum
     * @return
     */
    public synchronized boolean insertEsDataInstagram(MultipartFile file, MediaSourceEnum mediaSourceEnum, String preGovernanceNum) {
        try {
            if (file == null) {
                return false;
            }

            if (MediaSourceEnum.INSTAGRAM != mediaSourceEnum) {
                return false;
            }

            List<InstagramUserData_v2> instagramUserData_v2List = (List<InstagramUserData_v2>) ReaderFileUtil.readMultipartFileFileInstagram(file, MediaSourceEnum.INSTAGRAM);
            if (!CollectionUtils.isEmpty(instagramUserData_v2List)) {
                //统计治理前数量
                addCacheFromRedis(RedisKeyConstants.INSTAGRAM_PRO_GOV_NUM_KEY, preGovernanceNum);
                List<InstagramUserData_v2> dataList = (List<InstagramUserData_v2>) instagramV2Repository.saveAll(instagramUserData_v2List);
                if (CollectionUtils.isEmpty(dataList)) {
                    return false;
                }
            }
            return true;
        }catch (Exception e) {
            log.error("EsServiceImpl.insertEsDataInstagram has error:{}",e.getMessage());
        }
        return false;
    }

    /**
     * link_school
     * @param file
     * @param mediaSourceEnum
     * @param preGovernanceNum
     * @return
     */
    public synchronized boolean insertEsDataLinkBusiness(MultipartFile file, MediaSourceEnum mediaSourceEnum, String preGovernanceNum) {
        try {
            if (file == null) {
                return false;
            }

            if (MediaSourceEnum.LINKEDIN_BUSINESS != mediaSourceEnum) {
                return false;
            }

            List<LinkBusinessUserData_v2> linkBusinessUserData_v2List = (List<LinkBusinessUserData_v2>) ReaderFileUtil.readMultipartFileFileLinkBusiness(file, MediaSourceEnum.LINKEDIN_BUSINESS);
            if (!CollectionUtils.isEmpty(linkBusinessUserData_v2List)) {

                //统计治理前数量
                addCacheFromRedis(RedisKeyConstants.LINK_BUSINESS_PRO_GOV_NUM_KEY, preGovernanceNum);
                List<LinkBusinessUserData_v2> dataList = (List<LinkBusinessUserData_v2>) linkBusinessV2Repository.saveAll(linkBusinessUserData_v2List);
                if (CollectionUtils.isEmpty(dataList)) {
                    return false;
                }
            }
            return true;
        }catch (Exception e) {
            log.error("EsServiceImpl.insertEsDataLinkBusiness has error:{}",e.getMessage());
        }
        return false;
    }



    /**
     * link_school
     * @param file
     * @param mediaSourceEnum
     * @param preGovernanceNum
     * @return
     */
    public synchronized boolean insertEsDataLinkSchool(MultipartFile file, MediaSourceEnum mediaSourceEnum, String preGovernanceNum) {
        try {
            if (file == null) {
                return false;
            }

            if (MediaSourceEnum.LINKEDIN_SCHOOL != mediaSourceEnum) {
                return false;
            }

            List<LinkSchoolUserData_v2> linkSchoolUserData_v2List = (List<LinkSchoolUserData_v2>) ReaderFileUtil.readMultipartFileFileLinkSchool(file, MediaSourceEnum.LINKEDIN_SCHOOL);
            if (!CollectionUtils.isEmpty(linkSchoolUserData_v2List)) {

                //统计治理前数量
                addCacheFromRedis(RedisKeyConstants.LINK_SCHOOL_PRO_GOV_NUM_KEY, preGovernanceNum);
                List<LinkSchoolUserData_v2> dataList = (List<LinkSchoolUserData_v2>) linkSchoolV2Repository.saveAll(linkSchoolUserData_v2List);
                if (CollectionUtils.isEmpty(dataList)) {
                    return false;
                }
            }
            return true;
        }catch (Exception e) {
            log.error("EsServiceImpl.insertEsDataLinkSchool has error:{}",e.getMessage());
        }
        return false;
    }
















    /**
         * 统计治理前数据
         * @param key
         * @param preGovernanceNum
         */
    public void addCacheFromRedis(String key, String preGovernanceNum) {
        if (StringUtils.isBlank(key)) {
            return;
        }

        boolean isKey = redisService.hasKey(key);
        if (isKey) {
            return;
        }
        redisService.set(key, preGovernanceNum, null, null, false);
    }
}
