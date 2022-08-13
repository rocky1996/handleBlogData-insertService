package com.example.handleblogdatainsertservice.util;

import com.example.handleblogdatainsertservice.domain.*;
import com.example.handleblogdatainsertservice.enums.MediaSourceEnum;
import com.google.common.collect.Lists;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.regex.Pattern;

@Slf4j
public class ReaderFileUtil {

    /**
     * 读取本地文件
     * @param multipartFile
     * @param mediaSourceEnum
     * @return
     */
    public static Object readMultipartFileFile(MultipartFile multipartFile, MediaSourceEnum mediaSourceEnum) {

        List<Object> objList = Lists.newLinkedList();
        try {
            InputStreamReader isr = new InputStreamReader(multipartFile.getInputStream());
            BufferedReader bf = new BufferedReader(isr);
            String textLine;
            while ((textLine = bf.readLine()) != null) {
                if (StringUtils.isNotBlank(textLine)) {
                    switch (mediaSourceEnum) {
                        case TWITTER:
                            TwitterUserData_v2 twitterUserData_v2 = JacksonUtil.strToBean(textLine, TwitterUserData_v2.class);
                            if (twitterUserData_v2 != null) {
                                String country = twitterUserData_v2.getCountry();
                                if (StringUtils.isNotBlank(country) && isAllLetters(country)) {
                                   if (isAcronym(country, true)) {
                                       twitterUserData_v2.setCountry(CountryUtil.getCountryName(country) == null ? "" : CountryUtil.getCountryName(country));
                                   }else {
                                       twitterUserData_v2.setCountry(CountryUtil.getCountryName(country.toUpperCase()) == null ? "" : CountryUtil.getCountryName(country.toUpperCase()));
                                   }
                                }
                                objList.add(twitterUserData_v2);
                            }
                            break;
                        case FB_IMPL:
                            FbUserData_v2 fbUserDataImpl_v2 = JacksonUtil.strToBean(textLine, FbUserData_v2.class);
                            if (fbUserDataImpl_v2 != null) {
                                String country = fbUserDataImpl_v2.getCountry();
                                if (StringUtils.isNotBlank(country) && isAllLetters(country)) {
                                    if (isAcronym(country, true)) {
                                        fbUserDataImpl_v2.setCountry(CountryUtil.getCountryName(country) == null ? "" : CountryUtil.getCountryName(country));
                                    }else {
                                        fbUserDataImpl_v2.setCountry(CountryUtil.getCountryName(country.toUpperCase()) == null ? "" : CountryUtil.getCountryName(country.toUpperCase()));
                                    }
                                }
                                objList.add(fbUserDataImpl_v2);
                            }
                            break;
                        case FB_HISTORY:
                            FbUserData_v2 fbUserDataHistory_v2 = JacksonUtil.strToBean(textLine, FbUserData_v2.class);
                            if (fbUserDataHistory_v2 != null) {
                                String country = fbUserDataHistory_v2.getCountry();
                                if (StringUtils.isNotBlank(country) && isAllLetters(country)) {
                                    if (isAcronym(country, true)) {
                                        fbUserDataHistory_v2.setCountry(CountryUtil.getCountryName(country) == null ? "" : CountryUtil.getCountryName(country));
                                    }else {
                                        fbUserDataHistory_v2.setCountry(CountryUtil.getCountryName(country.toUpperCase()) == null ? "" : CountryUtil.getCountryName(country.toUpperCase()));
                                    }
                                }
                                objList.add(fbUserDataHistory_v2);
                            }
                            break;
                        case FQ_IMPL:
                            FqUserData_v2 fqUserDataImpl_v2 = JacksonUtil.strToBean(textLine, FqUserData_v2.class);
                            if (fqUserDataImpl_v2 != null) {
                                String country = fqUserDataImpl_v2.getCountry();
                                if (StringUtils.isNotBlank(country) && isAllLetters(country)) {
                                    if (isAcronym(country, true)) {
                                        fqUserDataImpl_v2.setCountry(CountryUtil.getCountryName(country) == null ? "" : CountryUtil.getCountryName(country));
                                    }else {
                                        fqUserDataImpl_v2.setCountry(CountryUtil.getCountryName(country.toUpperCase()) == null ? "" : CountryUtil.getCountryName(country.toUpperCase()));
                                    }
                                }
                                objList.add(fqUserDataImpl_v2);
                            }
                            break;
                        case FQ_HISTORY:
                            FqUserData_v2 fqUserDataHistory_v2 = JacksonUtil.strToBean(textLine, FqUserData_v2.class);
                            if (fqUserDataHistory_v2 != null) {
                                String country = fqUserDataHistory_v2.getCountry();
                                if (StringUtils.isNotBlank(country) && isAllLetters(country)) {
                                    if (isAcronym(country, true)) {
                                        fqUserDataHistory_v2.setCountry(CountryUtil.getCountryName(country) == null ? "" : CountryUtil.getCountryName(country));
                                    }else {
                                        fqUserDataHistory_v2.setCountry(CountryUtil.getCountryName(country.toUpperCase()) == null ? "" : CountryUtil.getCountryName(country.toUpperCase()));
                                    }
                                }
                                objList.add(fqUserDataHistory_v2);
                            }
                            break;
                        case INSTAGRAM:
                            InstagramUserData_v2 instagramUserData_v2 = JacksonUtil.strToBean(textLine, InstagramUserData_v2.class);
                            if (instagramUserData_v2 != null) {
                                String country = instagramUserData_v2.getCountry();
                                if (StringUtils.isNotBlank(country) && isAllLetters(country)) {
                                    if (isAcronym(country, true)) {
                                        instagramUserData_v2.setCountry(CountryUtil.getCountryName(country) == null ? "" : CountryUtil.getCountryName(country));
                                    }else {
                                        instagramUserData_v2.setCountry(CountryUtil.getCountryName(country.toUpperCase()) == null ? "" : CountryUtil.getCountryName(country.toUpperCase()));
                                    }
                                }
                                objList.add(instagramUserData_v2);
                            }
                            break;
                        case LINKEDIN_IMPL:
                            LinkUserData_v2 linkUserDataImpl_v2 = JacksonUtil.strToBean(textLine, LinkUserData_v2.class);
                            if (linkUserDataImpl_v2 != null) {
                                String country = linkUserDataImpl_v2.getCountry();
                                if (StringUtils.isNotBlank(country) && isAllLetters(country)) {
                                    if (isAcronym(country, true)) {
                                        linkUserDataImpl_v2.setCountry(CountryUtil.getCountryName(country) == null ? "" : CountryUtil.getCountryName(country));
                                    }else {
                                        linkUserDataImpl_v2.setCountry(CountryUtil.getCountryName(country.toUpperCase()) == null ? "" : CountryUtil.getCountryName(country.toUpperCase()));
                                    }
                                }
                                objList.add(linkUserDataImpl_v2);
                            }
                            break;
                        case LINKEDIN_HISTORY:
                            LinkUserData_v2 linkUserDataHistory_v2 = JacksonUtil.strToBean(textLine, LinkUserData_v2.class);
                            if (linkUserDataHistory_v2 != null) {
                                String country = linkUserDataHistory_v2.getCountry();
                                if (StringUtils.isNotBlank(country) && isAllLetters(country)) {
                                    if (isAcronym(country, true)) {
                                        linkUserDataHistory_v2.setCountry(CountryUtil.getCountryName(country) == null ? "" : CountryUtil.getCountryName(country));
                                    }else {
                                        linkUserDataHistory_v2.setCountry(CountryUtil.getCountryName(country.toUpperCase()) == null ? "" : CountryUtil.getCountryName(country.toUpperCase()));
                                    }
                                }
                                objList.add(linkUserDataHistory_v2);
                            }
                            break;
                        case LINKEDIN_BUSINESS:
                            LinkBusinessUserData_v2 linkBusinessUserData_v2 = JacksonUtil.strToBean(textLine, LinkBusinessUserData_v2.class);
                            if (linkBusinessUserData_v2 != null) {
                                String country = linkBusinessUserData_v2.getCountry();
                                if (StringUtils.isNotBlank(country) && isAllLetters(country)) {
                                    if (isAcronym(country, true)) {
                                        linkBusinessUserData_v2.setCountry(CountryUtil.getCountryName(country) == null ? "" : CountryUtil.getCountryName(country));
                                    }else {
                                        linkBusinessUserData_v2.setCountry(CountryUtil.getCountryName(country.toUpperCase()) == null ? "" : CountryUtil.getCountryName(country.toUpperCase()));
                                    }
                                }
                                objList.add(linkBusinessUserData_v2);
                            }
                            break;
                        case LINKEDIN_SCHOOL:
                            LinkSchoolUserData_v2 linkSchoolUserData_v2 = JacksonUtil.strToBean(textLine, LinkSchoolUserData_v2.class);
                            if (linkSchoolUserData_v2 != null) {
                                String country = linkSchoolUserData_v2.getCountry();
                                if (StringUtils.isNotBlank(country) && isAllLetters(country)) {
                                    if (isAcronym(country, true)) {
                                        linkSchoolUserData_v2.setCountry(CountryUtil.getCountryName(country) == null ? "" : CountryUtil.getCountryName(country));
                                    }else {
                                        linkSchoolUserData_v2.setCountry(CountryUtil.getCountryName(country.toUpperCase()) == null ? "" : CountryUtil.getCountryName(country.toUpperCase()));
                                    }
                                }
                                objList.add(linkSchoolUserData_v2);
                            }
                            break;
                        default:
                            break;
                    }
                }
            }
        } catch (IOException e) {
            log.info("ReaderFileUtil.readMultipartFileFile has error:{}",e.getMessage());
        }
        return objList;
    }


    public static Object readMultipartFileFileTwitter(MultipartFile multipartFile, MediaSourceEnum mediaSourceEnum) {

        List<Object> objList = Lists.newLinkedList();
        try {
            InputStreamReader isr = new InputStreamReader(multipartFile.getInputStream());
            BufferedReader bf = new BufferedReader(isr);
            String textLine;
            while ((textLine = bf.readLine()) != null) {
                if (StringUtils.isNotBlank(textLine)) {
                    switch (mediaSourceEnum) {
                        case TWITTER:
                            TwitterUserData_v2 twitterUserData_v2 = JacksonUtil.strToBean(textLine, TwitterUserData_v2.class);
                            if (twitterUserData_v2 != null) {
                                String country = twitterUserData_v2.getCountry();
                                if (StringUtils.isNotBlank(country) && isAllLetters(country)) {
                                    if (isAcronym(country, true)) {
                                        twitterUserData_v2.setCountry(CountryUtil.getCountryName(country) == null ? "" : CountryUtil.getCountryName(country));
                                    }else {
                                        twitterUserData_v2.setCountry(CountryUtil.getCountryName(country.toUpperCase()) == null ? "" : CountryUtil.getCountryName(country.toUpperCase()));
                                    }
                                }
                                objList.add(twitterUserData_v2);
                            }
                            break;
                        case FB_IMPL:
                            FbUserData_v2 fbUserDataImpl_v2 = JacksonUtil.strToBean(textLine, FbUserData_v2.class);
                            if (fbUserDataImpl_v2 != null) {
                                String country = fbUserDataImpl_v2.getCountry();
                                if (StringUtils.isNotBlank(country) && isAllLetters(country)) {
                                    if (isAcronym(country, true)) {
                                        fbUserDataImpl_v2.setCountry(CountryUtil.getCountryName(country) == null ? "" : CountryUtil.getCountryName(country));
                                    }else {
                                        fbUserDataImpl_v2.setCountry(CountryUtil.getCountryName(country.toUpperCase()) == null ? "" : CountryUtil.getCountryName(country.toUpperCase()));
                                    }
                                }
                                objList.add(fbUserDataImpl_v2);
                            }
                            break;
                        case FB_HISTORY:
                            FbUserData_v2 fbUserDataHistory_v2 = JacksonUtil.strToBean(textLine, FbUserData_v2.class);
                            if (fbUserDataHistory_v2 != null) {
                                String country = fbUserDataHistory_v2.getCountry();
                                if (StringUtils.isNotBlank(country) && isAllLetters(country)) {
                                    if (isAcronym(country, true)) {
                                        fbUserDataHistory_v2.setCountry(CountryUtil.getCountryName(country) == null ? "" : CountryUtil.getCountryName(country));
                                    }else {
                                        fbUserDataHistory_v2.setCountry(CountryUtil.getCountryName(country.toUpperCase()) == null ? "" : CountryUtil.getCountryName(country.toUpperCase()));
                                    }
                                }
                                objList.add(fbUserDataHistory_v2);
                            }
                            break;
                        case FQ_IMPL:
                            FqUserData_v2 fqUserDataImpl_v2 = JacksonUtil.strToBean(textLine, FqUserData_v2.class);
                            if (fqUserDataImpl_v2 != null) {
                                String country = fqUserDataImpl_v2.getCountry();
                                if (StringUtils.isNotBlank(country) && isAllLetters(country)) {
                                    if (isAcronym(country, true)) {
                                        fqUserDataImpl_v2.setCountry(CountryUtil.getCountryName(country) == null ? "" : CountryUtil.getCountryName(country));
                                    }else {
                                        fqUserDataImpl_v2.setCountry(CountryUtil.getCountryName(country.toUpperCase()) == null ? "" : CountryUtil.getCountryName(country.toUpperCase()));
                                    }
                                }
                                objList.add(fqUserDataImpl_v2);
                            }
                            break;
                        case FQ_HISTORY:
                            FqUserData_v2 fqUserDataHistory_v2 = JacksonUtil.strToBean(textLine, FqUserData_v2.class);
                            if (fqUserDataHistory_v2 != null) {
                                String country = fqUserDataHistory_v2.getCountry();
                                if (StringUtils.isNotBlank(country) && isAllLetters(country)) {
                                    if (isAcronym(country, true)) {
                                        fqUserDataHistory_v2.setCountry(CountryUtil.getCountryName(country) == null ? "" : CountryUtil.getCountryName(country));
                                    }else {
                                        fqUserDataHistory_v2.setCountry(CountryUtil.getCountryName(country.toUpperCase()) == null ? "" : CountryUtil.getCountryName(country.toUpperCase()));
                                    }
                                }
                                objList.add(fqUserDataHistory_v2);
                            }
                            break;
                        case INSTAGRAM:
                            InstagramUserData_v2 instagramUserData_v2 = JacksonUtil.strToBean(textLine, InstagramUserData_v2.class);
                            if (instagramUserData_v2 != null) {
                                String country = instagramUserData_v2.getCountry();
                                if (StringUtils.isNotBlank(country) && isAllLetters(country)) {
                                    if (isAcronym(country, true)) {
                                        instagramUserData_v2.setCountry(CountryUtil.getCountryName(country) == null ? "" : CountryUtil.getCountryName(country));
                                    }else {
                                        instagramUserData_v2.setCountry(CountryUtil.getCountryName(country.toUpperCase()) == null ? "" : CountryUtil.getCountryName(country.toUpperCase()));
                                    }
                                }
                                objList.add(instagramUserData_v2);
                            }
                            break;
                        case LINKEDIN_IMPL:
                            LinkUserData_v2 linkUserDataImpl_v2 = JacksonUtil.strToBean(textLine, LinkUserData_v2.class);
                            if (linkUserDataImpl_v2 != null) {
                                String country = linkUserDataImpl_v2.getCountry();
                                if (StringUtils.isNotBlank(country) && isAllLetters(country)) {
                                    if (isAcronym(country, true)) {
                                        linkUserDataImpl_v2.setCountry(CountryUtil.getCountryName(country) == null ? "" : CountryUtil.getCountryName(country));
                                    }else {
                                        linkUserDataImpl_v2.setCountry(CountryUtil.getCountryName(country.toUpperCase()) == null ? "" : CountryUtil.getCountryName(country.toUpperCase()));
                                    }
                                }
                                objList.add(linkUserDataImpl_v2);
                            }
                            break;
                        case LINKEDIN_HISTORY:
                            LinkUserData_v2 linkUserDataHistory_v2 = JacksonUtil.strToBean(textLine, LinkUserData_v2.class);
                            if (linkUserDataHistory_v2 != null) {
                                String country = linkUserDataHistory_v2.getCountry();
                                if (StringUtils.isNotBlank(country) && isAllLetters(country)) {
                                    if (isAcronym(country, true)) {
                                        linkUserDataHistory_v2.setCountry(CountryUtil.getCountryName(country) == null ? "" : CountryUtil.getCountryName(country));
                                    }else {
                                        linkUserDataHistory_v2.setCountry(CountryUtil.getCountryName(country.toUpperCase()) == null ? "" : CountryUtil.getCountryName(country.toUpperCase()));
                                    }
                                }
                                objList.add(linkUserDataHistory_v2);
                            }
                            break;
                        case LINKEDIN_BUSINESS:
                            LinkBusinessUserData_v2 linkBusinessUserData_v2 = JacksonUtil.strToBean(textLine, LinkBusinessUserData_v2.class);
                            if (linkBusinessUserData_v2 != null) {
                                String country = linkBusinessUserData_v2.getCountry();
                                if (StringUtils.isNotBlank(country) && isAllLetters(country)) {
                                    if (isAcronym(country, true)) {
                                        linkBusinessUserData_v2.setCountry(CountryUtil.getCountryName(country) == null ? "" : CountryUtil.getCountryName(country));
                                    }else {
                                        linkBusinessUserData_v2.setCountry(CountryUtil.getCountryName(country.toUpperCase()) == null ? "" : CountryUtil.getCountryName(country.toUpperCase()));
                                    }
                                }
                                objList.add(linkBusinessUserData_v2);
                            }
                            break;
                        case LINKEDIN_SCHOOL:
                            LinkSchoolUserData_v2 linkSchoolUserData_v2 = JacksonUtil.strToBean(textLine, LinkSchoolUserData_v2.class);
                            if (linkSchoolUserData_v2 != null) {
                                String country = linkSchoolUserData_v2.getCountry();
                                if (StringUtils.isNotBlank(country) && isAllLetters(country)) {
                                    if (isAcronym(country, true)) {
                                        linkSchoolUserData_v2.setCountry(CountryUtil.getCountryName(country) == null ? "" : CountryUtil.getCountryName(country));
                                    }else {
                                        linkSchoolUserData_v2.setCountry(CountryUtil.getCountryName(country.toUpperCase()) == null ? "" : CountryUtil.getCountryName(country.toUpperCase()));
                                    }
                                }
                                objList.add(linkSchoolUserData_v2);
                            }
                            break;
                        default:
                            break;
                    }
                }
            }
        } catch (IOException e) {
            log.info("ReaderFileUtil.readMultipartFileFile has error:{}",e.getMessage());
        }
        return objList;
    }



    public static Object readMultipartFileFileInstagram(MultipartFile multipartFile, MediaSourceEnum mediaSourceEnum) {

        List<Object> objList = Lists.newLinkedList();
        try {
            InputStreamReader isr = new InputStreamReader(multipartFile.getInputStream());
            BufferedReader bf = new BufferedReader(isr);
            String textLine;
            while ((textLine = bf.readLine()) != null) {
                if (StringUtils.isNotBlank(textLine)) {
                    switch (mediaSourceEnum) {
                        case TWITTER:
                            TwitterUserData_v2 twitterUserData_v2 = JacksonUtil.strToBean(textLine, TwitterUserData_v2.class);
                            if (twitterUserData_v2 != null) {
                                String country = twitterUserData_v2.getCountry();
                                if (StringUtils.isNotBlank(country) && isAllLetters(country)) {
                                    if (isAcronym(country, true)) {
                                        twitterUserData_v2.setCountry(CountryUtil.getCountryName(country) == null ? "" : CountryUtil.getCountryName(country));
                                    }else {
                                        twitterUserData_v2.setCountry(CountryUtil.getCountryName(country.toUpperCase()) == null ? "" : CountryUtil.getCountryName(country.toUpperCase()));
                                    }
                                }
                                objList.add(twitterUserData_v2);
                            }
                            break;
                        case FB_IMPL:
                            FbUserData_v2 fbUserDataImpl_v2 = JacksonUtil.strToBean(textLine, FbUserData_v2.class);
                            if (fbUserDataImpl_v2 != null) {
                                String country = fbUserDataImpl_v2.getCountry();
                                if (StringUtils.isNotBlank(country) && isAllLetters(country)) {
                                    if (isAcronym(country, true)) {
                                        fbUserDataImpl_v2.setCountry(CountryUtil.getCountryName(country) == null ? "" : CountryUtil.getCountryName(country));
                                    }else {
                                        fbUserDataImpl_v2.setCountry(CountryUtil.getCountryName(country.toUpperCase()) == null ? "" : CountryUtil.getCountryName(country.toUpperCase()));
                                    }
                                }
                                objList.add(fbUserDataImpl_v2);
                            }
                            break;
                        case FB_HISTORY:
                            FbUserData_v2 fbUserDataHistory_v2 = JacksonUtil.strToBean(textLine, FbUserData_v2.class);
                            if (fbUserDataHistory_v2 != null) {
                                String country = fbUserDataHistory_v2.getCountry();
                                if (StringUtils.isNotBlank(country) && isAllLetters(country)) {
                                    if (isAcronym(country, true)) {
                                        fbUserDataHistory_v2.setCountry(CountryUtil.getCountryName(country) == null ? "" : CountryUtil.getCountryName(country));
                                    }else {
                                        fbUserDataHistory_v2.setCountry(CountryUtil.getCountryName(country.toUpperCase()) == null ? "" : CountryUtil.getCountryName(country.toUpperCase()));
                                    }
                                }
                                objList.add(fbUserDataHistory_v2);
                            }
                            break;
                        case FQ_IMPL:
                            FqUserData_v2 fqUserDataImpl_v2 = JacksonUtil.strToBean(textLine, FqUserData_v2.class);
                            if (fqUserDataImpl_v2 != null) {
                                String country = fqUserDataImpl_v2.getCountry();
                                if (StringUtils.isNotBlank(country) && isAllLetters(country)) {
                                    if (isAcronym(country, true)) {
                                        fqUserDataImpl_v2.setCountry(CountryUtil.getCountryName(country) == null ? "" : CountryUtil.getCountryName(country));
                                    }else {
                                        fqUserDataImpl_v2.setCountry(CountryUtil.getCountryName(country.toUpperCase()) == null ? "" : CountryUtil.getCountryName(country.toUpperCase()));
                                    }
                                }
                                objList.add(fqUserDataImpl_v2);
                            }
                            break;
                        case FQ_HISTORY:
                            FqUserData_v2 fqUserDataHistory_v2 = JacksonUtil.strToBean(textLine, FqUserData_v2.class);
                            if (fqUserDataHistory_v2 != null) {
                                String country = fqUserDataHistory_v2.getCountry();
                                if (StringUtils.isNotBlank(country) && isAllLetters(country)) {
                                    if (isAcronym(country, true)) {
                                        fqUserDataHistory_v2.setCountry(CountryUtil.getCountryName(country) == null ? "" : CountryUtil.getCountryName(country));
                                    }else {
                                        fqUserDataHistory_v2.setCountry(CountryUtil.getCountryName(country.toUpperCase()) == null ? "" : CountryUtil.getCountryName(country.toUpperCase()));
                                    }
                                }
                                objList.add(fqUserDataHistory_v2);
                            }
                            break;
                        case INSTAGRAM:
                            InstagramUserData_v2 instagramUserData_v2 = JacksonUtil.strToBean(textLine, InstagramUserData_v2.class);
                            if (instagramUserData_v2 != null) {
                                String country = instagramUserData_v2.getCountry();
                                if (StringUtils.isNotBlank(country) && isAllLetters(country)) {
                                    if (isAcronym(country, true)) {
                                        instagramUserData_v2.setCountry(CountryUtil.getCountryName(country) == null ? "" : CountryUtil.getCountryName(country));
                                    }else {
                                        instagramUserData_v2.setCountry(CountryUtil.getCountryName(country.toUpperCase()) == null ? "" : CountryUtil.getCountryName(country.toUpperCase()));
                                    }
                                }
                                objList.add(instagramUserData_v2);
                            }
                            break;
                        case LINKEDIN_IMPL:
                            LinkUserData_v2 linkUserDataImpl_v2 = JacksonUtil.strToBean(textLine, LinkUserData_v2.class);
                            if (linkUserDataImpl_v2 != null) {
                                String country = linkUserDataImpl_v2.getCountry();
                                if (StringUtils.isNotBlank(country) && isAllLetters(country)) {
                                    if (isAcronym(country, true)) {
                                        linkUserDataImpl_v2.setCountry(CountryUtil.getCountryName(country) == null ? "" : CountryUtil.getCountryName(country));
                                    }else {
                                        linkUserDataImpl_v2.setCountry(CountryUtil.getCountryName(country.toUpperCase()) == null ? "" : CountryUtil.getCountryName(country.toUpperCase()));
                                    }
                                }
                                objList.add(linkUserDataImpl_v2);
                            }
                            break;
                        case LINKEDIN_HISTORY:
                            LinkUserData_v2 linkUserDataHistory_v2 = JacksonUtil.strToBean(textLine, LinkUserData_v2.class);
                            if (linkUserDataHistory_v2 != null) {
                                String country = linkUserDataHistory_v2.getCountry();
                                if (StringUtils.isNotBlank(country) && isAllLetters(country)) {
                                    if (isAcronym(country, true)) {
                                        linkUserDataHistory_v2.setCountry(CountryUtil.getCountryName(country) == null ? "" : CountryUtil.getCountryName(country));
                                    }else {
                                        linkUserDataHistory_v2.setCountry(CountryUtil.getCountryName(country.toUpperCase()) == null ? "" : CountryUtil.getCountryName(country.toUpperCase()));
                                    }
                                }
                                objList.add(linkUserDataHistory_v2);
                            }
                            break;
                        case LINKEDIN_BUSINESS:
                            LinkBusinessUserData_v2 linkBusinessUserData_v2 = JacksonUtil.strToBean(textLine, LinkBusinessUserData_v2.class);
                            if (linkBusinessUserData_v2 != null) {
                                String country = linkBusinessUserData_v2.getCountry();
                                if (StringUtils.isNotBlank(country) && isAllLetters(country)) {
                                    if (isAcronym(country, true)) {
                                        linkBusinessUserData_v2.setCountry(CountryUtil.getCountryName(country) == null ? "" : CountryUtil.getCountryName(country));
                                    }else {
                                        linkBusinessUserData_v2.setCountry(CountryUtil.getCountryName(country.toUpperCase()) == null ? "" : CountryUtil.getCountryName(country.toUpperCase()));
                                    }
                                }
                                objList.add(linkBusinessUserData_v2);
                            }
                            break;
                        case LINKEDIN_SCHOOL:
                            LinkSchoolUserData_v2 linkSchoolUserData_v2 = JacksonUtil.strToBean(textLine, LinkSchoolUserData_v2.class);
                            if (linkSchoolUserData_v2 != null) {
                                String country = linkSchoolUserData_v2.getCountry();
                                if (StringUtils.isNotBlank(country) && isAllLetters(country)) {
                                    if (isAcronym(country, true)) {
                                        linkSchoolUserData_v2.setCountry(CountryUtil.getCountryName(country) == null ? "" : CountryUtil.getCountryName(country));
                                    }else {
                                        linkSchoolUserData_v2.setCountry(CountryUtil.getCountryName(country.toUpperCase()) == null ? "" : CountryUtil.getCountryName(country.toUpperCase()));
                                    }
                                }
                                objList.add(linkSchoolUserData_v2);
                            }
                            break;
                        default:
                            break;
                    }
                }
            }
        } catch (IOException e) {
            log.info("ReaderFileUtil.readMultipartFileFile has error:{}",e.getMessage());
        }
        return objList;
    }



    public static Object readMultipartFileFileLinkBusiness(MultipartFile multipartFile, MediaSourceEnum mediaSourceEnum) {

        List<Object> objList = Lists.newLinkedList();
        try {
            InputStreamReader isr = new InputStreamReader(multipartFile.getInputStream());
            BufferedReader bf = new BufferedReader(isr);
            String textLine;
            while ((textLine = bf.readLine()) != null) {
                if (StringUtils.isNotBlank(textLine)) {
                    switch (mediaSourceEnum) {
                        case TWITTER:
                            TwitterUserData_v2 twitterUserData_v2 = JacksonUtil.strToBean(textLine, TwitterUserData_v2.class);
                            if (twitterUserData_v2 != null) {
                                String country = twitterUserData_v2.getCountry();
                                if (StringUtils.isNotBlank(country) && isAllLetters(country)) {
                                    if (isAcronym(country, true)) {
                                        twitterUserData_v2.setCountry(CountryUtil.getCountryName(country) == null ? "" : CountryUtil.getCountryName(country));
                                    }else {
                                        twitterUserData_v2.setCountry(CountryUtil.getCountryName(country.toUpperCase()) == null ? "" : CountryUtil.getCountryName(country.toUpperCase()));
                                    }
                                }
                                objList.add(twitterUserData_v2);
                            }
                            break;
                        case FB_IMPL:
                            FbUserData_v2 fbUserDataImpl_v2 = JacksonUtil.strToBean(textLine, FbUserData_v2.class);
                            if (fbUserDataImpl_v2 != null) {
                                String country = fbUserDataImpl_v2.getCountry();
                                if (StringUtils.isNotBlank(country) && isAllLetters(country)) {
                                    if (isAcronym(country, true)) {
                                        fbUserDataImpl_v2.setCountry(CountryUtil.getCountryName(country) == null ? "" : CountryUtil.getCountryName(country));
                                    }else {
                                        fbUserDataImpl_v2.setCountry(CountryUtil.getCountryName(country.toUpperCase()) == null ? "" : CountryUtil.getCountryName(country.toUpperCase()));
                                    }
                                }
                                objList.add(fbUserDataImpl_v2);
                            }
                            break;
                        case FB_HISTORY:
                            FbUserData_v2 fbUserDataHistory_v2 = JacksonUtil.strToBean(textLine, FbUserData_v2.class);
                            if (fbUserDataHistory_v2 != null) {
                                String country = fbUserDataHistory_v2.getCountry();
                                if (StringUtils.isNotBlank(country) && isAllLetters(country)) {
                                    if (isAcronym(country, true)) {
                                        fbUserDataHistory_v2.setCountry(CountryUtil.getCountryName(country) == null ? "" : CountryUtil.getCountryName(country));
                                    }else {
                                        fbUserDataHistory_v2.setCountry(CountryUtil.getCountryName(country.toUpperCase()) == null ? "" : CountryUtil.getCountryName(country.toUpperCase()));
                                    }
                                }
                                objList.add(fbUserDataHistory_v2);
                            }
                            break;
                        case FQ_IMPL:
                            FqUserData_v2 fqUserDataImpl_v2 = JacksonUtil.strToBean(textLine, FqUserData_v2.class);
                            if (fqUserDataImpl_v2 != null) {
                                String country = fqUserDataImpl_v2.getCountry();
                                if (StringUtils.isNotBlank(country) && isAllLetters(country)) {
                                    if (isAcronym(country, true)) {
                                        fqUserDataImpl_v2.setCountry(CountryUtil.getCountryName(country) == null ? "" : CountryUtil.getCountryName(country));
                                    }else {
                                        fqUserDataImpl_v2.setCountry(CountryUtil.getCountryName(country.toUpperCase()) == null ? "" : CountryUtil.getCountryName(country.toUpperCase()));
                                    }
                                }
                                objList.add(fqUserDataImpl_v2);
                            }
                            break;
                        case FQ_HISTORY:
                            FqUserData_v2 fqUserDataHistory_v2 = JacksonUtil.strToBean(textLine, FqUserData_v2.class);
                            if (fqUserDataHistory_v2 != null) {
                                String country = fqUserDataHistory_v2.getCountry();
                                if (StringUtils.isNotBlank(country) && isAllLetters(country)) {
                                    if (isAcronym(country, true)) {
                                        fqUserDataHistory_v2.setCountry(CountryUtil.getCountryName(country) == null ? "" : CountryUtil.getCountryName(country));
                                    }else {
                                        fqUserDataHistory_v2.setCountry(CountryUtil.getCountryName(country.toUpperCase()) == null ? "" : CountryUtil.getCountryName(country.toUpperCase()));
                                    }
                                }
                                objList.add(fqUserDataHistory_v2);
                            }
                            break;
                        case INSTAGRAM:
                            InstagramUserData_v2 instagramUserData_v2 = JacksonUtil.strToBean(textLine, InstagramUserData_v2.class);
                            if (instagramUserData_v2 != null) {
                                String country = instagramUserData_v2.getCountry();
                                if (StringUtils.isNotBlank(country) && isAllLetters(country)) {
                                    if (isAcronym(country, true)) {
                                        instagramUserData_v2.setCountry(CountryUtil.getCountryName(country) == null ? "" : CountryUtil.getCountryName(country));
                                    }else {
                                        instagramUserData_v2.setCountry(CountryUtil.getCountryName(country.toUpperCase()) == null ? "" : CountryUtil.getCountryName(country.toUpperCase()));
                                    }
                                }
                                objList.add(instagramUserData_v2);
                            }
                            break;
                        case LINKEDIN_IMPL:
                            LinkUserData_v2 linkUserDataImpl_v2 = JacksonUtil.strToBean(textLine, LinkUserData_v2.class);
                            if (linkUserDataImpl_v2 != null) {
                                String country = linkUserDataImpl_v2.getCountry();
                                if (StringUtils.isNotBlank(country) && isAllLetters(country)) {
                                    if (isAcronym(country, true)) {
                                        linkUserDataImpl_v2.setCountry(CountryUtil.getCountryName(country) == null ? "" : CountryUtil.getCountryName(country));
                                    }else {
                                        linkUserDataImpl_v2.setCountry(CountryUtil.getCountryName(country.toUpperCase()) == null ? "" : CountryUtil.getCountryName(country.toUpperCase()));
                                    }
                                }
                                objList.add(linkUserDataImpl_v2);
                            }
                            break;
                        case LINKEDIN_HISTORY:
                            LinkUserData_v2 linkUserDataHistory_v2 = JacksonUtil.strToBean(textLine, LinkUserData_v2.class);
                            if (linkUserDataHistory_v2 != null) {
                                String country = linkUserDataHistory_v2.getCountry();
                                if (StringUtils.isNotBlank(country) && isAllLetters(country)) {
                                    if (isAcronym(country, true)) {
                                        linkUserDataHistory_v2.setCountry(CountryUtil.getCountryName(country) == null ? "" : CountryUtil.getCountryName(country));
                                    }else {
                                        linkUserDataHistory_v2.setCountry(CountryUtil.getCountryName(country.toUpperCase()) == null ? "" : CountryUtil.getCountryName(country.toUpperCase()));
                                    }
                                }
                                objList.add(linkUserDataHistory_v2);
                            }
                            break;
                        case LINKEDIN_BUSINESS:
                            LinkBusinessUserData_v2 linkBusinessUserData_v2 = JacksonUtil.strToBean(textLine, LinkBusinessUserData_v2.class);
                            if (linkBusinessUserData_v2 != null) {
                                String country = linkBusinessUserData_v2.getCountry();
                                if (StringUtils.isNotBlank(country) && isAllLetters(country)) {
                                    if (isAcronym(country, true)) {
                                        linkBusinessUserData_v2.setCountry(CountryUtil.getCountryName(country) == null ? "" : CountryUtil.getCountryName(country));
                                    }else {
                                        linkBusinessUserData_v2.setCountry(CountryUtil.getCountryName(country.toUpperCase()) == null ? "" : CountryUtil.getCountryName(country.toUpperCase()));
                                    }
                                }
                                objList.add(linkBusinessUserData_v2);
                            }
                            break;
                        case LINKEDIN_SCHOOL:
                            LinkSchoolUserData_v2 linkSchoolUserData_v2 = JacksonUtil.strToBean(textLine, LinkSchoolUserData_v2.class);
                            if (linkSchoolUserData_v2 != null) {
                                String country = linkSchoolUserData_v2.getCountry();
                                if (StringUtils.isNotBlank(country) && isAllLetters(country)) {
                                    if (isAcronym(country, true)) {
                                        linkSchoolUserData_v2.setCountry(CountryUtil.getCountryName(country) == null ? "" : CountryUtil.getCountryName(country));
                                    }else {
                                        linkSchoolUserData_v2.setCountry(CountryUtil.getCountryName(country.toUpperCase()) == null ? "" : CountryUtil.getCountryName(country.toUpperCase()));
                                    }
                                }
                                objList.add(linkSchoolUserData_v2);
                            }
                            break;
                        default:
                            break;
                    }
                }
            }
        } catch (IOException e) {
            log.info("ReaderFileUtil.readMultipartFileFile has error:{}",e.getMessage());
        }
        return objList;
    }






    public static Object readMultipartFileFileLinkSchool(MultipartFile multipartFile, MediaSourceEnum mediaSourceEnum) {

        List<Object> objList = Lists.newLinkedList();
        try {
            InputStreamReader isr = new InputStreamReader(multipartFile.getInputStream());
            BufferedReader bf = new BufferedReader(isr);
            String textLine;
            while ((textLine = bf.readLine()) != null) {
                if (StringUtils.isNotBlank(textLine)) {
                    switch (mediaSourceEnum) {
                        case TWITTER:
                            TwitterUserData_v2 twitterUserData_v2 = JacksonUtil.strToBean(textLine, TwitterUserData_v2.class);
                            if (twitterUserData_v2 != null) {
                                String country = twitterUserData_v2.getCountry();
                                if (StringUtils.isNotBlank(country) && isAllLetters(country)) {
                                    if (isAcronym(country, true)) {
                                        twitterUserData_v2.setCountry(CountryUtil.getCountryName(country) == null ? "" : CountryUtil.getCountryName(country));
                                    }else {
                                        twitterUserData_v2.setCountry(CountryUtil.getCountryName(country.toUpperCase()) == null ? "" : CountryUtil.getCountryName(country.toUpperCase()));
                                    }
                                }
                                objList.add(twitterUserData_v2);
                            }
                            break;
                        case FB_IMPL:
                            FbUserData_v2 fbUserDataImpl_v2 = JacksonUtil.strToBean(textLine, FbUserData_v2.class);
                            if (fbUserDataImpl_v2 != null) {
                                String country = fbUserDataImpl_v2.getCountry();
                                if (StringUtils.isNotBlank(country) && isAllLetters(country)) {
                                    if (isAcronym(country, true)) {
                                        fbUserDataImpl_v2.setCountry(CountryUtil.getCountryName(country) == null ? "" : CountryUtil.getCountryName(country));
                                    }else {
                                        fbUserDataImpl_v2.setCountry(CountryUtil.getCountryName(country.toUpperCase()) == null ? "" : CountryUtil.getCountryName(country.toUpperCase()));
                                    }
                                }
                                objList.add(fbUserDataImpl_v2);
                            }
                            break;
                        case FB_HISTORY:
                            FbUserData_v2 fbUserDataHistory_v2 = JacksonUtil.strToBean(textLine, FbUserData_v2.class);
                            if (fbUserDataHistory_v2 != null) {
                                String country = fbUserDataHistory_v2.getCountry();
                                if (StringUtils.isNotBlank(country) && isAllLetters(country)) {
                                    if (isAcronym(country, true)) {
                                        fbUserDataHistory_v2.setCountry(CountryUtil.getCountryName(country) == null ? "" : CountryUtil.getCountryName(country));
                                    }else {
                                        fbUserDataHistory_v2.setCountry(CountryUtil.getCountryName(country.toUpperCase()) == null ? "" : CountryUtil.getCountryName(country.toUpperCase()));
                                    }
                                }
                                objList.add(fbUserDataHistory_v2);
                            }
                            break;
                        case FQ_IMPL:
                            FqUserData_v2 fqUserDataImpl_v2 = JacksonUtil.strToBean(textLine, FqUserData_v2.class);
                            if (fqUserDataImpl_v2 != null) {
                                String country = fqUserDataImpl_v2.getCountry();
                                if (StringUtils.isNotBlank(country) && isAllLetters(country)) {
                                    if (isAcronym(country, true)) {
                                        fqUserDataImpl_v2.setCountry(CountryUtil.getCountryName(country) == null ? "" : CountryUtil.getCountryName(country));
                                    }else {
                                        fqUserDataImpl_v2.setCountry(CountryUtil.getCountryName(country.toUpperCase()) == null ? "" : CountryUtil.getCountryName(country.toUpperCase()));
                                    }
                                }
                                objList.add(fqUserDataImpl_v2);
                            }
                            break;
                        case FQ_HISTORY:
                            FqUserData_v2 fqUserDataHistory_v2 = JacksonUtil.strToBean(textLine, FqUserData_v2.class);
                            if (fqUserDataHistory_v2 != null) {
                                String country = fqUserDataHistory_v2.getCountry();
                                if (StringUtils.isNotBlank(country) && isAllLetters(country)) {
                                    if (isAcronym(country, true)) {
                                        fqUserDataHistory_v2.setCountry(CountryUtil.getCountryName(country) == null ? "" : CountryUtil.getCountryName(country));
                                    }else {
                                        fqUserDataHistory_v2.setCountry(CountryUtil.getCountryName(country.toUpperCase()) == null ? "" : CountryUtil.getCountryName(country.toUpperCase()));
                                    }
                                }
                                objList.add(fqUserDataHistory_v2);
                            }
                            break;
                        case INSTAGRAM:
                            InstagramUserData_v2 instagramUserData_v2 = JacksonUtil.strToBean(textLine, InstagramUserData_v2.class);
                            if (instagramUserData_v2 != null) {
                                String country = instagramUserData_v2.getCountry();
                                if (StringUtils.isNotBlank(country) && isAllLetters(country)) {
                                    if (isAcronym(country, true)) {
                                        instagramUserData_v2.setCountry(CountryUtil.getCountryName(country) == null ? "" : CountryUtil.getCountryName(country));
                                    }else {
                                        instagramUserData_v2.setCountry(CountryUtil.getCountryName(country.toUpperCase()) == null ? "" : CountryUtil.getCountryName(country.toUpperCase()));
                                    }
                                }
                                objList.add(instagramUserData_v2);
                            }
                            break;
                        case LINKEDIN_IMPL:
                            LinkUserData_v2 linkUserDataImpl_v2 = JacksonUtil.strToBean(textLine, LinkUserData_v2.class);
                            if (linkUserDataImpl_v2 != null) {
                                String country = linkUserDataImpl_v2.getCountry();
                                if (StringUtils.isNotBlank(country) && isAllLetters(country)) {
                                    if (isAcronym(country, true)) {
                                        linkUserDataImpl_v2.setCountry(CountryUtil.getCountryName(country) == null ? "" : CountryUtil.getCountryName(country));
                                    }else {
                                        linkUserDataImpl_v2.setCountry(CountryUtil.getCountryName(country.toUpperCase()) == null ? "" : CountryUtil.getCountryName(country.toUpperCase()));
                                    }
                                }
                                objList.add(linkUserDataImpl_v2);
                            }
                            break;
                        case LINKEDIN_HISTORY:
                            LinkUserData_v2 linkUserDataHistory_v2 = JacksonUtil.strToBean(textLine, LinkUserData_v2.class);
                            if (linkUserDataHistory_v2 != null) {
                                String country = linkUserDataHistory_v2.getCountry();
                                if (StringUtils.isNotBlank(country) && isAllLetters(country)) {
                                    if (isAcronym(country, true)) {
                                        linkUserDataHistory_v2.setCountry(CountryUtil.getCountryName(country) == null ? "" : CountryUtil.getCountryName(country));
                                    }else {
                                        linkUserDataHistory_v2.setCountry(CountryUtil.getCountryName(country.toUpperCase()) == null ? "" : CountryUtil.getCountryName(country.toUpperCase()));
                                    }
                                }
                                objList.add(linkUserDataHistory_v2);
                            }
                            break;
                        case LINKEDIN_BUSINESS:
                            LinkBusinessUserData_v2 linkBusinessUserData_v2 = JacksonUtil.strToBean(textLine, LinkBusinessUserData_v2.class);
                            if (linkBusinessUserData_v2 != null) {
                                String country = linkBusinessUserData_v2.getCountry();
                                if (StringUtils.isNotBlank(country) && isAllLetters(country)) {
                                    if (isAcronym(country, true)) {
                                        linkBusinessUserData_v2.setCountry(CountryUtil.getCountryName(country) == null ? "" : CountryUtil.getCountryName(country));
                                    }else {
                                        linkBusinessUserData_v2.setCountry(CountryUtil.getCountryName(country.toUpperCase()) == null ? "" : CountryUtil.getCountryName(country.toUpperCase()));
                                    }
                                }
                                objList.add(linkBusinessUserData_v2);
                            }
                            break;
                        case LINKEDIN_SCHOOL:
                            LinkSchoolUserData_v2 linkSchoolUserData_v2 = JacksonUtil.strToBean(textLine, LinkSchoolUserData_v2.class);
                            if (linkSchoolUserData_v2 != null) {
                                String country = linkSchoolUserData_v2.getCountry();
                                if (StringUtils.isNotBlank(country) && isAllLetters(country)) {
                                    if (isAcronym(country, true)) {
                                        linkSchoolUserData_v2.setCountry(CountryUtil.getCountryName(country) == null ? "" : CountryUtil.getCountryName(country));
                                    }else {
                                        linkSchoolUserData_v2.setCountry(CountryUtil.getCountryName(country.toUpperCase()) == null ? "" : CountryUtil.getCountryName(country.toUpperCase()));
                                    }
                                }
                                objList.add(linkSchoolUserData_v2);
                            }
                            break;
                        default:
                            break;
                    }
                }
            }
        } catch (IOException e) {
            log.info("ReaderFileUtil.readMultipartFileFile has error:{}",e.getMessage());
        }
        return objList;
    }











    public static boolean isChinese(String value) {
        Pattern pattern = Pattern.compile("[\u0391-\uFFE5]+$");
        return pattern.matcher(value).matches();
    }

    public static boolean isAllLetters(String str) {
        char[] chars=str.toCharArray();
        boolean isTic;
        for(int i = 0; i < chars.length; i++) {
            isTic = (chars[i] >= 'a' && chars[i] <= 'z') || (chars[i] >= 'A' && chars[i] <= 'Z');
            if (!isTic) {
                try{
                    int num = Integer.valueOf(chars[i]);
                }catch (Exception e){
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * 判断均大写
     * @param word
     * @return
     */
    public static boolean isAcronym(String word, boolean isLarge) {
        for(int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (isLarge) {
                if (Character.isLowerCase(c)) {
                    return false;
                }
            }else {
                if (Character.isUpperCase(c)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isAcronym("AE", true));
        System.out.println("ae".toUpperCase());
    }
}
