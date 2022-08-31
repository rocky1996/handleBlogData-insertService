package com.example.handleblogdatainsertservice.domain;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

/**
 * 字段            类型       是否允许为空       备注
 * uuid           String     不能为空       系统自动生成ID
 * integrity      String     不能为空       完整度
 * platform       String     可以为空       来源平台：FB、FQ、TW、IS、LI
 * data_source    String     可以为空       数据来源,数据来源文件名
 * create_time    String     可以为空       数据入库时间
 * importance     String     可以为空       重要等级,0：普通 （默认）1：关注 2：重要 3：特别重要
 * remark         String     可以为空       批注
 * language_type  String     可以为空       语种
 * source_id      String     不能为空       数据来源id
 * user_id        String     不能为空       用户唯一标识ID
 * screen_name    String     可以为空       昵称
 * use_name       String     可以为空       用户全名
 * user_url       String     可以为空       用户主页URL
 * user_avatar    String     可以为空       用户头像
 * local_photo_url   String  可以为空       用户头像本地路径
 * gender         String     可以为空       性别: -1：男,1：女, 0：未知
 * country        String     可以为空       国家
 * city           String     可以为空       城市
 * user_type      String     可以为空       用户类型,用户类型：1：个人账号people  0：公众 pages  -1：其他
 * verified       String     可以为空       用户认证,1：认证，0：非认证
 * followers_count   String  可以为空       粉丝数
 * friend_count   String     可以为空       关注数
 * post_count     String     可以为空       发文数
 * like_count     String     可以为空       喜欢数
 * source_create_time   String   可以为空   数据产生时间，数据产生的时间，如果没有产生时间，则填写入库时间
 * mobile         String     可以为空       手机号,预留字段，考虑如何模糊查询
 * email          String     可以为空       邮箱地址,预留字段
 * name_userd_before   String　　可以为空　　曾用名
 * language       String　　　可以为空　　　　语言编码
 * user_religion　 String    可以为空       宗教信仰　　
 * works          String     可以为空       工作信息
 * location       String     可以为空       位置信息
 * marriage       String　　　可以为空　　　　　婚姻状况
 * home_town      String　　　可以为空　　　　　家乡地址
 * user_summary   String　　　可以为空　　　　　用户简介
 * last_name       String     可以为空       姓氏
 * first_name      String     可以为空       名
 * maidern_name    String     可以为空       曾用名
 * birth_date_date    String     可以为空       出生日月
 * cover              String     可以为空       背景
 * local_cover        String     可以为空       本地化背景
 * description_job_title      String     可以为空       当前职业名称
 * description_school_id      String     可以为空       毕业院校
 * description_school_name    String   可以为空   毕业学校名
 * description_school_logo    String    可以为空        毕业学校logo
 * description_school_local_logo   String    可以为空        毕业学校本地logo
 * description_company_id    String    可以为空        当前就职企业id
 * description_company_name      String    可以为空        当前就职企业名
 * description_company_logo      String    可以为空        当前就职企业logo
 * description_company_local_logo   String    可以为空        当前就职企业本地logo
 * description_location      String     可以为空        居住地址
 * industry_name             String     可以为空        所属行业
 * summary                   String     可以为空        用户简介
 * experiences_job_title     String     可以为空        工作经历
 * experiences_company_id    String     可以为空        工作经历
 * experiences_company_name  String     可以为空        工作经历
 * experiences_company_logo  String     可以为空        工作经历
 * experiences_company_local_logo   String    可以为空  工作经历
 * experiences_company_location     String    可以为空  工作经历
 * experiences_time_period_time     String    可以为空  工作经历
 * experiences_description          String    可以为空  工作经历
 * certifications_name              String    可以为空  资格认证
 * certifications_authority         String    可以为空  资格认证
 * certifications_license           String    可以为空  资格认证
 * certifications_time_period_time  String    可以为空  资格认证
 * cerfitications_url               String    可以为空  资格认证
 * volunteer_experiences_role       String    可以为空  志愿者角色
 * volunteer_experiences_company_name     String  可以为空          志愿者单位名
 * volunteer_experiences_cause            String  可以为空          志愿原因
 * volunteer_experiences_time_period_time         String  可以为空  志愿时间段
 * volunteer_experiences_description              String  可以为空  志愿描述
 * educations_school_id            String  可以为空          教育经历
 * educations_school_name          String  可以为空          教育经历
 * educations_school_logo          String  可以为空          教育经历
 * educations_school_local_logo    String  可以为空          教育经历
 * educations_diplomaqq            String  可以为空          教育经历
 * educations_subjects             String  可以为空          教育经历
 * educations_grade                String  可以为空          教育经历
 * educations_activity             String  可以为空          教育经历
 * educations_time_period_time     String  可以为空          教育经历
 * educations_description          String  可以为空          教育经历
 * skills_name                     String  可以为空          技能认可
 * skills_endorsement_count        String  可以为空          技能认可
 * languages_name           String  可以为空          语言名
 * languages_proficiency    String  可以为空          精通
 * honors_title             String  可以为空          荣誉
 * honors_issuer            String  可以为空          荣誉
 * honors_time              String  可以为空          荣誉
 * honors_description       String  可以为空          荣誉
 * organizations_name       String  可以为空          组织名
 * organizations_time_period_time      String  可以为空          时间段
 * organizations_description           String  可以为空          组织描述
 * organizations_location              String  可以为空          组织所在地
 * patents_title            String  可以为空          专利名
 * patents_serial_no        String  可以为空          专利号
 * patents_issuer_country_name         String  可以为空          发行国家
 * patents_time             String  可以为空          时间
 * patents_issuer           String  可以为空          发行人
 * patents_url              String  可以为空          专利链接
 * patents_description      String  可以为空          专利描述
 * projects_name            String  可以为空          项目名
 * projects_url             String  可以为空          项目链接
 * projects_time_period_time             String  可以为空          项目时间
 * projects_description     String  可以为空          项目描述
 * publications_title       String  可以为空          出版物标题
 * publications_issuer      String  可以为空          发行人
 * publications_url         String  可以为空          发行链接
 * publications_time        String  可以为空          发行时间
 * contacts_title           String  可以为空          联系方式
 * contacts_name            String  可以为空          联系方式
 * contacts_url             String  可以为空          联系方式
 * tags                     String  可以为空          博主标签
 * profile_score            String  可以为空          信息完成度
 * coureses_name            String  可以为空          课程名称
 * coureses_number          String  可以为空          课程数量
 * tests_description        String  可以为空          描述
 * tests_name               String  可以为空          名称
 * tests_score              String  可以为空          得分
 * tests_time_period        String  可以为空          时间
 * person                   String  可以为空          人物
 * media_type_embeded       String  可以为空          媒介类型 ‘P’:  图片； ‘M’:  音频； ‘V’:  视频； ‘X’:  附件(文章) ²文章含有媒介时，多个之间用’|’隔开。比如：P|P|V|X media_type 与 media_url 一一对应
 * media_url                String  可以为空          ²文章含有媒介时，多个之间用’|’隔开
 * media_url_name           String  可以为空          本地媒体url， 多个用“|”分割
 * media_title              String  可以为空          ²  文章含有媒介时，多个之间用’|’隔开。比如：头像|banner|位置图集1|…|位置图集60|发帖图集1|…|发帖图集20|评论图1
 * original_mailbox         String  可以为空          原始邮箱
 * original_contact         String  可以为空          原始联系方式
 *
 *
 * 入参格式:
 * {
 *     "uuid":"",        #用户唯一ID
 *     "integrity":"",   #完整度
 *     "platform":"",    #来源平台：FB、FQ、TW、IS、LI
 *     "data_source":"", #数据来源,数据来源文件名
 *     "create_time":"", #数据入库时间
 *     "importance":"",  #重要等级,0：普通 （默认）1：关注 2：重要 3：特别重要
 *     "remark":"",      #扩展字段，对重要数据手动编辑的批注信息
 *     "language_type":"",  #语种
 *     "source_id":"",   #名称唯一ID   对应原字段->  data_id
 *     "user_id":"",     #用户id         ->       profile_id
 *     "screen_name":"", #用户名称        ->       public_id
 *     "use_name":"",    #用户名,         对应原字段->    name
 *     "user_url":"",    #博主url（若为空需要拼接，格式如下：https://www.facebook.com/profile.php?id=100068526609915)  ->    blogger_url
 *     "user_avatar":"", #用户头像链接     对应原字段->    photo
 *     "local_photo_url":"", #用户头像本地路径（若为空需要拼接，格式如下：fb_Info_1614294429_photo.jpg）   ->     local_photo
 *     "gender":"",      #用户性别，样例数据既有男，也有FEMALE，需统一编码（若为空，设置为0，-1是男，1是女）       ->     user_gender
 *     "country":"",     #国家（样例数据有国家中文名也有英文名；英文的统一治理中文，非标准的 原样存储 检索条件增加字典） ->   country_code
 *     "city":"",        #地址信息（通过currentLocation值抽取城市名称）   ->      current_location
 *     "user_type":"",   #用户类型（个人、公开page、其他）
 *     "verified":"",    #是否认证 1：认证，0：非认证   ->    is_attestation
 *     "followers_count":"",  #粉丝人数-个人/ 关注数- 公共page（粉丝总数）,      ->     description_followers
 *     "friend_count":"",     #关注数      ->      description_connections
 *     "post_count":"",  #发文数
 *     "like_count":"",  #喜欢数
 *     "source_create_time":"",      #数据产生的时间，如果没有产生时间，则填写入库时间   ->    timestamp
 *     "mobile":"",          #联系方式（电话号码“-”连接）,     ->     contacts_title_phoneNumbers
 *     "email":"",           #联系方式和基本信息（部分有值，例：Facebook:/tobu.hiroshi.takano|邮箱:celicas2245@gmail.com）  ->    contacts_title_email
 *     "name_userd_before":"",   #曾用名     ->     maidern_name
 *     "language":"",        #语言编码
 *     "user_religion":"",   #宗教信仰　
 *     "works":"",            #工作信息（数据部分为空）      ->      description_company_name
 *     "location":"",         #地址信息（现居地）         ->       description_location
 *     "marriage":"",         #婚姻状况
 *     "home_town":"",        #家乡地址
 *     "user_summary":"",     #用户简介   ->     summary
 *     "last_name":"",       #姓氏
 *     "first_name":"",      #名
 *     "birth_date_date":"", #出生日月
 *     "cover":"",           #背景
 *     "local_cover":"",     #本地化背景
 *     "description_job_title":"",      #当前职业名称
 *     "description_school_id":"",      #毕业院校
 *     "description_school_name":"",    #毕业学校名   ->    education.schoolName
 *     "description_school_logo":"",    #毕业学校logo   ->    education.logo
 *     "description_school_local_logo":"",   #毕业学校本地logo   ->   education.logo
 *     "description_company_id":"",     #当前就职企业id
 *     "description_company_name":"",   #当前就职企业名    ->    occupation
 *     "description_company_logo":"",   #当前就职企业logo
 *     "description_company_local_logo":"",   #当前就职企业本地logo
 *     "description_location":"",       #居住地址      ->      location
 *     "industry_name":"",              #所属行业      ->      industryname
 *     "summary":"",                    #用户简介
 *     "experiences_job_title":"",      #工作经历      ->      positionview.title
 *     "experiences_company_id":"",     #工作经历
 *     "experiences_company_name":"",   #工作经历      ->      positionview.companyName
 *     "experiences_company_logo":"",   #工作经历      ->      positionview.logo
 *     "experiences_company_local_logo":"",   #工作经历
 *     "experiences_company_location":"",     #工作经历   ->   positionview.locationName
 *     "experiences_time_period_time":"",     #工作经历
 *     "experiences_description":"",          #工作经历   ->   positionview.description
 *     "certifications_name":"",              #资格认证   ->   certification
 *     "certifications_authority":"",         #资格认证
 *     "certifications_license":"",           #资格认证
 *     "certifications_time_period_time":"",  #资格认证
 *     "cerfitications_url":"",               #资格认证
 *     "volunteer_experiences_role":"",       #志愿者角色  ->  volunteerexperience
 *     "volunteer_experiences_company_name":"",     #志愿者单位名
 *     "volunteer_experiences_cause":"",      #志愿原因
 *     "volunteer_experiences_time_period_time":"", #志愿时间段
 *     "volunteer_experiences_description":"",#志愿描述
 *     "educations_school_id":"",             #教育经历
 *     "educations_school_name":"",           #教育经历    ->    education.schoolName
 *     "educations_school_logo":"",           #教育经历    ->    education.logo
 *     "educations_school_local_logo":"",     #教育经历
 *     "educations_diplomaqq":"",             #教育经历    ->    education.degreeName
 *     "educations_subjects":"",              #教育经历    ->    education.fieldOfStudy
 *     "educations_grade":"",                 #教育经历    ->    education.grade
 *     "educations_activity":"",              #教育经历    ->    education.activities
 *     "educations_time_period_time":"",      #教育经历
 *     "educations_description":"",           #教育经历    ->    education.description
 *     "skills_name":"",                      #技能认可    ->    userskill.skill
 *     "skills_endorsement_count":"",         #技能认可
 *     "languages_name":"",                   #语言名      ->    language
 *     "languages_proficiency":"",            #精通
 *     "honors_title":"",                     #荣誉        ->    honor
 *     "honors_issuer":"",                    #荣誉
 *     "honors_time":"",                      #荣誉
 *     "honors_description":"",               #荣誉
 *     "organizations_name":"",               #组织名
 *     "organizations_time_period_time":"",   #时间段
 *     "organizations_description":"",        #组织描述
 *     "organizations_location":"",           #组织所在地
 *     "patents_title":"",                    #专利名
 *     "patents_serial_no":"",                #专利号
 *     "patents_issuer_country_name":"",      #发行国家
 *     "patents_time":"",                     #时间
 *     "patents_issuer":"",                   #发行人
 *     "patents_url":"",                      #专利链接
 *     "patents_description":"",              #专利描述
 *     "projects_name":"",                    #项目名
 *     "projects_url":"",                     #项目链接
 *     "projects_time_period_time":"",        #项目时间
 *     "projects_description":"",             #项目描述
 *     "publications_title":"",               #出版物标题
 *     "publications_issuer":"",              #发行人
 *     "publications_url":"",                 #发行链接
 *     "publications_time":"",                #发行时间
 *     "contacts_title":"",                   #联系方式    ->    contact
 *     "contacts_name":"",                    #联系方式
 *     "contacts_url":"",                     #联系方式
 *     "tags":"",                             #博主标签    ->    category
 *     "profile_score":"",                    #信息完成度
 *     "coureses_name":"",                    #课程名称
 *     "coureses_number":"",                  #课程数量
 *     "tests_description":"",                #描述
 *     "tests_name":"",                       #名称
 *     "tests_score":"",                      #得分
 *     "tests_time_period":"",                #时间
 *     "person":"",                           #人物
 *     "media_type_embeded":"",               #媒介类型 ‘P’:  图片； ‘M’:  音频； ‘V’:  视频； ‘X’:  附件(文章) ²文章含有媒介时，多个之间用’|’隔开。比如：P|P|V|X media_type 与 media_url 一一对应
 *     "media_url":"",                        #²文章含有媒介时，多个之间用’|’隔开
 *     "media_url_name":"",                   #本地媒体url， 多个用“|”分割
 *     "media_title":"",                      #²  文章含有媒介时，多个之间用’|’隔开。比如：头像|banner|位置图集1|…|位置图集60|发帖图集1|…|发帖图集20|评论图1
 *     "original_mailbox"      #原始邮箱
 *     "original_contact"      #原始联系方式
 * }
 */
@Data
@Builder
@Document(indexName = "link_v2")
public class LinkUserData_v2 {

    /**
     * 用户唯一ID
     */
//    @Id
    private String uuid;

    /**
     * 来源平台：FB、FQ、TW、IS、LI
     */
    private String platform;

    /**
     * 数据来源,数据来源文件名
     */
    private String data_source;

    /**
     * 数据入库时间
     */
    private String create_time;

    /**
     * 重要等级,0：普通 （默认）1：关注 2：重要 3：特别重要
     */
    private String importance;

    /**
     * 扩展字段，对重要数据手动编辑的批注信息
     */
    private String remark;

    /**
     * 语种
     */
    private String language_type;

    /**
     * 名称唯一ID   对应原字段->  data_id
     */
    private String source_id;

    /**
     * 用户id         ->       profile_id
     */
    //  @Field(type = FieldType.Text, analyzer = "ik_max_word", searchAnalyzer = "ik_max_word")
    @Id
    private String user_id;

    /**
     * 用户名称        ->       public_id
     */
//    @Field(type = FieldType.Text, analyzer = "ik_max_word", searchAnalyzer = "ik_max_word")
    private String screen_name;

    /**
     * 用户名,         对应原字段->    name
     */
    //   @Field(type = FieldType.Text, analyzer = "ik_max_word", searchAnalyzer = "ik_max_word")
    private String use_name;

    /**
     * 博主url（若为空需要拼接，格式如下：https://www.facebook.com/profile.php?id=100068526609915)  ->    blogger_url
     */
    private String user_url;

    /**
     * 用户头像链接     对应原字段->    photo
     */
    private String user_avatar;

    /**
     * 用户头像本地路径（若为空需要拼接，格式如下：fb_Info_1614294429_photo.jpg）   ->     local_photo
     */
    private String local_photo_url;

    /**
     * 用户性别，样例数据既有男，也有FEMALE，需统一编码（若为空，设置为0，-1是男，1是女）       ->     user_gender
     */
    private String gender;

    /**
     * 国家（样例数据有国家中文名也有英文名；英文的统一治理中文，非标准的 原样存储 检索条件增加字典） ->   country_code
     */
    //  @Field(type = FieldType.Text, analyzer = "ik_max_word", searchAnalyzer = "ik_max_word")
    private String country;

    /**
     * 地址信息（通过currentLocation值抽取城市名称）   ->      current_location
     */
    //   @Field(type = FieldType.Text, analyzer = "ik_max_word", searchAnalyzer = "ik_max_word")
    private String city;

    /**
     * 用户类型（个人、公开page、其他）
     */
    private String user_type;

    /**
     * 是否认证 1：认证，0：非认证   ->    is_attestation
     */
    private String verified;

    /**
     * 粉丝人数-个人/ 关注数- 公共page（粉丝总数）,      ->     description_followers
     */
    private String followers_count;

    /**
     * 关注数      ->      description_connections
     */
    private String friend_count;

    /**
     * 发文数
     */
    private String post_count;

    /**
     * 喜欢数
     */
    private String like_count;

    /**
     * 数据产生的时间，如果没有产生时间，则填写入库时间   ->    timestamp
     */
    private String source_create_time;

    /**
     * 联系方式（电话号码“-”连接）,     ->     contacts_title_phoneNumbers
     */
    //   @Field(type = FieldType.Text, analyzer = "ik_max_word", searchAnalyzer = "ik_max_word")
    private String mobile;

    /**
     * 联系方式和基本信息（部分有值，例：Facebook:/tobu.hiroshi.takano|邮箱:celicas2245@gmail.com）  ->    contacts_title_email
     */
    //   @Field(type = FieldType.Text, analyzer = "ik_max_word", searchAnalyzer = "ik_max_word")
    private String email;

    /**
     * 曾用名     ->     maidern_name
     */
     private String name_userd_before;

    /**
     * 语言编码
     */
    private String language;

    /**
     * 宗教信仰
     */
    private String user_religion;

    /**
     * 工作信息（数据部分为空）      ->      description_company_name
     */
    private String works;

    /**
     * 地址信息（现居地）         ->       description_location
     */
    private String location;

    /**
     * 婚姻状况
     */
    private String marriage;

    /**
     * 家乡地址
     */
    private String home_town;

    /**
     * 用户简介   ->     summary
     */
    private String user_summary;

    /**
     * impl or history
     */
    private String impl_or_history_type;

    /**
     * 姓氏
     */
    private String last_name;

    /**
     * 名
     */
    private String first_name;

    /**
     * 出生日月
     */
    private String birth_date_date;

    /**
     * 背景
     */
    private String cover;

    /**
     * 本地化背景
     */
    private String local_cover;

    /**
     * 当前职业名称
     */
    private String description_job_title;

    /**
     * 毕业院校
     */
    private String description_school_id;

    /**
     * 毕业学校名
     */
    private String description_school_name;

    /**
     * 毕业学校logo
     */
    private String description_school_logo;

    /**
     * 毕业学校本地logo
     */
    private String description_school_local_logo;

    /**
     * 当前就职企业id
     */
    private String description_company_id;

    /**
     * 当前就职企业名
     */
    private String description_company_name;

    /**
     * 当前就职企业logo
     */
    private String description_company_logo;

    /**
     * 当前就职企业本地logo
     */
    private String description_company_local_logo;

    /**
     * 居住地址
     */
    private String description_location;

    /**
     * 所属行业
     */
    private String industry_name;

    /**
     * 用户简介
     */
    private String summary;

    /**
     * 工作经历
     */
    private String experiences_job_title;

    /**
     * 工作经历
     */
    private String experiences_company_id;

    /**
     * 工作经历
     */
    private String experiences_company_name;

    /**
     * 工作经历
     */
    private String experiences_company_logo;

    /**
     * 工作经历
     */
    private String experiences_company_local_logo;

    /**
     * 工作经历
     */
    private String experiences_company_location;

    /**
     * 工作经历
     */
    private String experiences_time_period_time;

    /**
     * 工作经历
     */
    private String experiences_description;

    /**
     * 资格认证
     */
    private String certifications_name;

    /**
     * 资格认证
     */
    private String certifications_authority;

    /**
     * 资格认证
     */
    private String certifications_license;

    /**
     * 资格认证
     */
    private String certifications_time_period_time;

    /**
     * 资格认证
     */
    private String cerfitications_url;

    /**
     * 志愿者角色
     */
    private String volunteer_experiences_role;

    /**
     * 志愿者单位名
     */
    private String volunteer_experiences_company_name;

    /**
     * 志愿原因
     */
    private String volunteer_experiences_cause;

    /**
     * 志愿时间段
     */
    private String volunteer_experiences_time_period_time;

    /**
     * 志愿描述
     */
    private String volunteer_experiences_description;

    /**
     * 教育经历
     */
    private String educations_school_id;

    /**
     * 教育经历
     */
    private String educations_school_name;

    /**
     * 教育经历
     */
    private String educations_school_logo;

    /**
     * 教育经历
     */
    private String educations_school_local_logo;

    /**
     * 教育经历
     */
    private String educations_diplomaqq;

    /**
     * 教育经历
     */
    private String educations_subjects;

    /**
     * 教育经历
     */
    private String educations_grade;

    /**
     * 教育经历
     */
    private String educations_activity;

    /**
     * 教育经历
     */
    private String educations_time_period_time;

    /**
     * 教育经历
     */
    private String educations_description;

    /**
     * 技能认可
     */
    private String skills_name;

    /**
     * 技能认可
     */
    private String skills_endorsement_count;

    /**
     * 语言名
     */
    private String languages_name;

    /**
     * 精通
     */
    private String languages_proficiency;

    /**
     * 荣誉
     */
    private String honors_title;

    /**
     * 荣誉
     */
    private String honors_issuer;

    /**
     * 荣誉
     */
    private String honors_time;

    /**
     * 荣誉
     */
    private String honors_description;

    /**
     * 组织名
     */
    private String organizations_name;

    /**
     * 时间段
     */
    private String organizations_time_period_time;

    /**
     * 组织描述
     */
    private String organizations_description;

    /**
     * 组织所在地
     */
    private String organizations_location;

    /**
     * 专利名
     */
    private String patents_title;

    /**
     * 专利号
     */
    private String patents_serial_no;

    /**
     * 发行国家
     */
    private String patents_issuer_country_name;

    /**
     * 时间
     */
    private String patents_time;

    /**
     * 发行人
     */
    private String patents_issuer;

    /**
     * 专利链接
     */
    private String patents_url;

    /**
     * 专利描述
     */
    private String patents_description;

    /**
     * 项目名
     */
    private String projects_name;

    /**
     * 项目链接
     */
    private String projects_url;

    /**
     * 项目时间
     */
    private String projects_time_period_time;

    /**
     * 项目描述
     */
    private String projects_description;

    /**
     * 出版物标题
     */
    private String publications_title;

    /**
     * 发行人
     */
    private String publications_issuer;

    /**
     * 发行链接
     */
    private String publications_url;

    /**
     * 发行时间
     */
    @Field(type = FieldType.Text)
    private String publications_time;

    /**
     * 联系方式
     */
    private String contacts_title;

    /**
     * 联系方式
     */
    private String contacts_name;

    /**
     * 联系方式
     */
    private String contacts_url;

    /**
     * 博主标签
     */
    private String tags;

    /**
     * 博主标签
     */
    private String profile_score;

    /**
     * 课程名称
     */
    private String coureses_name;

    /**
     * 课程数量
     */
    private String coureses_number;

    /**
     * 描述
     */
    private String tests_description;

    /**
     * 描述
     */
    private String tests_name;

    /**
     * 描述
     */
    private String tests_score;

    /**
     * 时间
     */
    private String tests_time_period;

    /**
     * 人物
     */
    private String person;

    /**
     * 媒介类型 ‘P’:  图片； ‘M’:  音频； ‘V’:  视频； ‘X’:  附件(文章) ²文章含有媒介时，多个之间用’|’隔开。比如：P|P|V|X media_type 与 media_url 一一对应
     */
    private String media_type_embeded;

    /**
     * 文章含有媒介时，多个之间用’|’隔开
     */
    private String media_url;

    /**
     * 本地媒体url， 多个用“|”分割
     */
    private String media_url_name;

    /**
     * ²  文章含有媒介时，多个之间用’|’隔开。比如：头像|banner|位置图集1|…|位置图集60|发帖图集1|…|发帖图集20|评论图1
     */
    private String media_title;

    /**
     * 字段非空值累加
     */
//    @Field(type = FieldType.Text, analyzer = "ik_max_word", searchAnalyzer = "ik_max_word")
    private Integer integrity;

    /**
     * 原始邮箱
     */
    private String original_mailbox;

    /**
     * 原始联系方式
     */
    private String original_contact;

    public LinkUserData_v2() {}

    public LinkUserData_v2(String uuid, String platform, String data_source, String create_time, String importance, String remark, String language_type, String source_id, String user_id, String screen_name, String use_name, String user_url, String user_avatar, String local_photo_url, String gender, String country, String city, String user_type, String verified, String followers_count, String friend_count, String post_count, String like_count, String source_create_time, String mobile, String email, String name_userd_before, String language, String user_religion, String works, String location, String marriage, String home_town, String user_summary, String impl_or_history_type, String last_name, String first_name, String birth_date_date, String cover, String local_cover, String description_job_title, String description_school_id, String description_school_name, String description_school_logo, String description_school_local_logo, String description_company_id, String description_company_name, String description_company_logo, String description_company_local_logo, String description_location, String industry_name, String summary, String experiences_job_title, String experiences_company_id, String experiences_company_name, String experiences_company_logo, String experiences_company_local_logo, String experiences_company_location, String experiences_time_period_time, String experiences_description, String certifications_name, String certifications_authority, String certifications_license, String certifications_time_period_time, String cerfitications_url, String volunteer_experiences_role, String volunteer_experiences_company_name, String volunteer_experiences_cause, String volunteer_experiences_time_period_time, String volunteer_experiences_description, String educations_school_id, String educations_school_name, String educations_school_logo, String educations_school_local_logo, String educations_diplomaqq, String educations_subjects, String educations_grade, String educations_activity, String educations_time_period_time, String educations_description, String skills_name, String skills_endorsement_count, String languages_name, String languages_proficiency, String honors_title, String honors_issuer, String honors_time, String honors_description, String organizations_name, String organizations_time_period_time, String organizations_description, String organizations_location, String patents_title, String patents_serial_no, String patents_issuer_country_name, String patents_time, String patents_issuer, String patents_url, String patents_description, String projects_name, String projects_url, String projects_time_period_time, String projects_description, String publications_title, String publications_issuer, String publications_url, String publications_time, String contacts_title, String contacts_name, String contacts_url, String tags, String profile_score, String coureses_name, String coureses_number, String tests_description, String tests_name, String tests_score, String tests_time_period, String person, String media_type_embeded, String media_url, String media_url_name, String media_title, Integer integrity, String original_mailbox, String original_contact) {
        this.uuid = uuid;
        this.platform = platform;
        this.data_source = data_source;
        this.create_time = create_time;
        this.importance = importance;
        this.remark = remark;
        this.language_type = language_type;
        this.source_id = source_id;
        this.user_id = user_id;
        this.screen_name = screen_name;
        this.use_name = use_name;
        this.user_url = user_url;
        this.user_avatar = user_avatar;
        this.local_photo_url = local_photo_url;
        this.gender = gender;
        this.country = country;
        this.city = city;
        this.user_type = user_type;
        this.verified = verified;
        this.followers_count = followers_count;
        this.friend_count = friend_count;
        this.post_count = post_count;
        this.like_count = like_count;
        this.source_create_time = source_create_time;
        this.mobile = mobile;
        this.email = email;
        this.name_userd_before = name_userd_before;
        this.language = language;
        this.user_religion = user_religion;
        this.works = works;
        this.location = location;
        this.marriage = marriage;
        this.home_town = home_town;
        this.user_summary = user_summary;
        this.impl_or_history_type = impl_or_history_type;
        this.last_name = last_name;
        this.first_name = first_name;
        this.birth_date_date = birth_date_date;
        this.cover = cover;
        this.local_cover = local_cover;
        this.description_job_title = description_job_title;
        this.description_school_id = description_school_id;
        this.description_school_name = description_school_name;
        this.description_school_logo = description_school_logo;
        this.description_school_local_logo = description_school_local_logo;
        this.description_company_id = description_company_id;
        this.description_company_name = description_company_name;
        this.description_company_logo = description_company_logo;
        this.description_company_local_logo = description_company_local_logo;
        this.description_location = description_location;
        this.industry_name = industry_name;
        this.summary = summary;
        this.experiences_job_title = experiences_job_title;
        this.experiences_company_id = experiences_company_id;
        this.experiences_company_name = experiences_company_name;
        this.experiences_company_logo = experiences_company_logo;
        this.experiences_company_local_logo = experiences_company_local_logo;
        this.experiences_company_location = experiences_company_location;
        this.experiences_time_period_time = experiences_time_period_time;
        this.experiences_description = experiences_description;
        this.certifications_name = certifications_name;
        this.certifications_authority = certifications_authority;
        this.certifications_license = certifications_license;
        this.certifications_time_period_time = certifications_time_period_time;
        this.cerfitications_url = cerfitications_url;
        this.volunteer_experiences_role = volunteer_experiences_role;
        this.volunteer_experiences_company_name = volunteer_experiences_company_name;
        this.volunteer_experiences_cause = volunteer_experiences_cause;
        this.volunteer_experiences_time_period_time = volunteer_experiences_time_period_time;
        this.volunteer_experiences_description = volunteer_experiences_description;
        this.educations_school_id = educations_school_id;
        this.educations_school_name = educations_school_name;
        this.educations_school_logo = educations_school_logo;
        this.educations_school_local_logo = educations_school_local_logo;
        this.educations_diplomaqq = educations_diplomaqq;
        this.educations_subjects = educations_subjects;
        this.educations_grade = educations_grade;
        this.educations_activity = educations_activity;
        this.educations_time_period_time = educations_time_period_time;
        this.educations_description = educations_description;
        this.skills_name = skills_name;
        this.skills_endorsement_count = skills_endorsement_count;
        this.languages_name = languages_name;
        this.languages_proficiency = languages_proficiency;
        this.honors_title = honors_title;
        this.honors_issuer = honors_issuer;
        this.honors_time = honors_time;
        this.honors_description = honors_description;
        this.organizations_name = organizations_name;
        this.organizations_time_period_time = organizations_time_period_time;
        this.organizations_description = organizations_description;
        this.organizations_location = organizations_location;
        this.patents_title = patents_title;
        this.patents_serial_no = patents_serial_no;
        this.patents_issuer_country_name = patents_issuer_country_name;
        this.patents_time = patents_time;
        this.patents_issuer = patents_issuer;
        this.patents_url = patents_url;
        this.patents_description = patents_description;
        this.projects_name = projects_name;
        this.projects_url = projects_url;
        this.projects_time_period_time = projects_time_period_time;
        this.projects_description = projects_description;
        this.publications_title = publications_title;
        this.publications_issuer = publications_issuer;
        this.publications_url = publications_url;
        this.publications_time = publications_time;
        this.contacts_title = contacts_title;
        this.contacts_name = contacts_name;
        this.contacts_url = contacts_url;
        this.tags = tags;
        this.profile_score = profile_score;
        this.coureses_name = coureses_name;
        this.coureses_number = coureses_number;
        this.tests_description = tests_description;
        this.tests_name = tests_name;
        this.tests_score = tests_score;
        this.tests_time_period = tests_time_period;
        this.person = person;
        this.media_type_embeded = media_type_embeded;
        this.media_url = media_url;
        this.media_url_name = media_url_name;
        this.media_title = media_title;
        this.integrity = integrity;
        this.original_mailbox = original_mailbox;
        this.original_contact = original_contact;
    }
}
