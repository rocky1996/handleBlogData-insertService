package com.example.handleblogdatainsertservice.util;

import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.Map;

public class CountryUtil {

    public static Map<String, String> countryMap = new HashMap<>();
    static {
        countryMap.put("TW", "中国台湾");
        countryMap.put("MX", "墨西哥");
        countryMap.put("US", "美国");
        countryMap.put("TH", "泰国");
        countryMap.put("USA|美国", "美国");
        countryMap.put("IN", "印度");
        countryMap.put("Spain", "西班牙");
        countryMap.put("Panama", "巴拿马");
        countryMap.put("India", "印度");
        countryMap.put("Philippines", "菲律宾");
        countryMap.put("Bosnia and Herzegovina", "波斯尼亚和黑塞哥维那");
        countryMap.put("Malaysla", "马来西亚");
        countryMap.put("NorWay", "挪威");
        countryMap.put("AU", "澳大利亚");
        countryMap.put("DE", "德国");
        countryMap.put("CN", "中国");
        countryMap.put("JP", "日本");
        countryMap.put("Botswana", "博茨瓦纳");
        countryMap.put("Vietnam", "越南");
        countryMap.put("Bulgaria", "保加利亚");
        countryMap.put("Germany", "德国");
        countryMap.put("Greece", "希腊");
        countryMap.put("ES", "西班牙");
        countryMap.put("HK", "中国香港");
        countryMap.put("CA", "加拿大");
        countryMap.put("IT", "意大利");
        countryMap.put("MY", "马来西亚");
        countryMap.put("IE", "爱尔兰");
        countryMap.put("SG", "新加坡");
        countryMap.put("TR", "土耳其");
        countryMap.put("PH", "菲律宾");
        countryMap.put("GB", "英国");
        countryMap.put("KH", "柬埔寨");
        countryMap.put("FR", "法国");
        countryMap.put("SE", "瑞典");
        countryMap.put("LU", "卢森堡");
        countryMap.put("CH", "瑞士");
        countryMap.put("BE", "比利时");
        countryMap.put("NL", "荷兰");
        countryMap.put("GE", "格鲁吉亚");
        countryMap.put("AE", "阿拉伯联合酋长国");
        countryMap.put("SA", "沙特阿拉伯王国");
        countryMap.put("BH", "巴林");
        countryMap.put("IL", "以色列");
        countryMap.put("PL", "波兰");
        countryMap.put("PK", "巴基斯坦");
        countryMap.put("EG", "埃及");
        countryMap.put("LB", "黎巴嫩");
        countryMap.put("ZA", "南非");
        countryMap.put("DK", "丹麦");
        countryMap.put("JO", "约旦");
        countryMap.put("QA", "卡塔尔");
        countryMap.put("KR", "韩国");
        countryMap.put("GH", "加纳");
        countryMap.put("BR", "巴西");
        countryMap.put("NP", "尼泊尔");
        countryMap.put("RU", "俄罗斯");
        countryMap.put("BD", "孟加拉国");
        countryMap.put("PE", "秘鲁");
        countryMap.put("GR", "希腊");
        countryMap.put("VN", "越南");
        countryMap.put("KW", "科威特");
        countryMap.put("LV", "拉脱维亚");
        countryMap.put("KE", "肯尼亚");
        countryMap.put("AZ", "阿塞拜疆");
        countryMap.put("ID", "印度尼西亚");
        countryMap.put("MA", "摩洛哥");
        countryMap.put("EC", "厄瓜多尔");
        countryMap.put("MX", "墨西哥");
        countryMap.put("CZ", "捷克");
        countryMap.put("AL", "阿尔巴尼亚");
        countryMap.put("DZ", "阿尔及利亚");
        countryMap.put("FI", "芬兰");
        countryMap.put("JE", "泽西岛");
        countryMap.put("NZ", "新西兰");
        countryMap.put("OO", "阿尔巴尼亚");
        countryMap.put("LK", "斯里兰卡");
        countryMap.put("RW", "卢旺达");
        countryMap.put("NG", "尼日利亚");
        countryMap.put("BY", "白俄罗斯");
        countryMap.put("AF", "阿富汗");
        countryMap.put("TN", "突尼斯");
        countryMap.put("RO", "罗马尼亚");
        countryMap.put("NO", "挪威");
        countryMap.put("UA", "乌克兰");
        countryMap.put("AT", "奥地利");
        countryMap.put("BO", "玻利维亚");
        countryMap.put("CO", "哥伦比亚");
        countryMap.put("CL", "智利");
        countryMap.put("VE", "委内瑞拉");
        countryMap.put("MG", "马达加斯加");
        countryMap.put("SN", "塞内加尔");
        countryMap.put("PT", "葡萄牙");
        countryMap.put("HR", "克罗地亚");
        countryMap.put("AS", "东萨摩亚");
        countryMap.put("AD", "安道尔");
        countryMap.put("AO", "安哥拉");
        countryMap.put("AV", "安圭拉岛");
        countryMap.put("AG", "安提瓜和巴布达");
        countryMap.put("AR", "阿根廷");
        countryMap.put("AM", "亚美尼亚");
        countryMap.put("AA", "阿鲁巴");
        countryMap.put("BF", "巴哈马");
        countryMap.put("BB", "巴巴多斯");
        countryMap.put("BZ", "伯里兹");
        countryMap.put("BJ", "贝宁");
        countryMap.put("BM", "百慕大");
        countryMap.put("BS", "巴哈马");
        countryMap.put("BT", "不丹");
        countryMap.put("BW", "博茨瓦纳");
        countryMap.put("BA", "波黑");
        countryMap.put("BV", "布韦岛");
        countryMap.put("BN", "文莱布鲁萨兰");
        countryMap.put("BG", "保加利亚");
        countryMap.put("BF", "布基纳法索");
        countryMap.put("BI", "布隆迪");
        countryMap.put("CM", "喀麦隆");
        countryMap.put("CV", "佛得角");
        countryMap.put("KY", "开曼群岛");
        countryMap.put("CF", "中非");
        countryMap.put("TD", "乍得");
        countryMap.put("CX", "圣诞岛");
        countryMap.put("CC", "可可斯群岛");
        countryMap.put("KM", "科摩罗");
        countryMap.put("CG", "刚果(金)");
        countryMap.put("CD", "刚果(布)");
        countryMap.put("CK", "库克群岛");
        countryMap.put("CR", "哥斯达黎加");
        countryMap.put("CU", "古巴");
        countryMap.put("CY", "塞普路斯");
        countryMap.put("CZ", "捷克");
        countryMap.put("CS", "捷克斯洛伐克");
        countryMap.put("DJ", "吉布提");
        countryMap.put("DM", "多米尼加共和国");
        countryMap.put("DO", "多米尼加联邦");
        countryMap.put("TP", "东帝汶");
        countryMap.put("SV", "萨尔瓦多");
        countryMap.put("GQ", "赤道几内亚");
        countryMap.put("EE", "爱沙尼亚");
        countryMap.put("ET", "埃塞俄比亚");
        countryMap.put("FK", "福兰克群岛");
        countryMap.put("FO", "法罗群岛");
        countryMap.put("FJ", "斐济");
        countryMap.put("GF", "法属圭亚那");
        countryMap.put("PF", "法属玻里尼西亚");
        countryMap.put("GA", "加蓬");
        countryMap.put("GM", "冈比亚");
        countryMap.put("GI", "直布罗陀");
        countryMap.put("GL", "格陵兰岛");
        countryMap.put("GD", "格林纳达");
        countryMap.put("GP", "法属德洛普群岛");
        countryMap.put("GU", "关岛");
        countryMap.put("GT", "危地马拉");
        countryMap.put("GN", "几内亚");
        countryMap.put("GW", "几内亚比绍");
        countryMap.put("GY", "圭亚那");
        countryMap.put("HT", "海地");
        countryMap.put("HM", "赫德和麦克唐纳群岛");
        countryMap.put("HN", "洪都拉斯");
        countryMap.put("HU", "匈牙利");
        countryMap.put("IS", "冰岛");
        countryMap.put("IR", "伊朗");
        countryMap.put("IQ", "伊拉克");
        countryMap.put("JM", "牙买加");
        countryMap.put("KZ", "哈萨克斯坦");
        countryMap.put("KI", "基里巴斯");
        countryMap.put("KP", "朝鲜");
        countryMap.put("KG", "吉尔吉斯斯坦");
        countryMap.put("LA", "老挝");
        countryMap.put("LI", "列支顿士登");
        countryMap.put("LR", "利比里亚");
        countryMap.put("LY", "利比亚");
        countryMap.put("LS", "莱索托");
        countryMap.put("LT", "立陶宛");
        countryMap.put("MO", "中国澳门");
        countryMap.put("MW", "马拉维");
        countryMap.put("MV", "马尔代夫");
        countryMap.put("ML", "马里");
        countryMap.put("MT", "马耳他");
        countryMap.put("MH", "马绍尔群岛");
        countryMap.put("MQ", "法属马提尼克群岛");
        countryMap.put("MR", "毛里塔尼亚");
        countryMap.put("MU", "毛里求斯");
        countryMap.put("FM", "米克罗尼西亚");
        countryMap.put("MC", "摩纳哥");
        countryMap.put("MD", "摩尔多瓦");
        countryMap.put("MN", "蒙古");
        countryMap.put("MZ", "莫桑比克");
        countryMap.put("MM", "缅甸");
        countryMap.put("NA", "纳米比亚");
        countryMap.put("NR", "瑙鲁");
        countryMap.put("AN", "荷属安德列斯");
        countryMap.put("NC", "新卡里多尼亚");
        countryMap.put("NI", "尼加拉瓜");
        countryMap.put("NE", "尼日尔");
        countryMap.put("NU", "纽爱");
        countryMap.put("NF", "诺福克岛");
        countryMap.put("MP", "北马里亚纳群岛");
        countryMap.put("OM", "阿曼");
        countryMap.put("PW", "帕劳");
        countryMap.put("PG", "巴布亚新几内亚");
        countryMap.put("PY", "巴拉圭");
        countryMap.put("PN", "皮特克恩岛");
        countryMap.put("PR", "波多黎各");
        countryMap.put("RE", "法属尼留旺岛");
        countryMap.put("KN", "圣基茨和尼维斯");
        countryMap.put("LC", "圣卢西亚");
        countryMap.put("VC", "圣文森特和格陵纳丁斯");
        countryMap.put("WS", "西萨摩亚");
        countryMap.put("SM", "圣马力诺");
        countryMap.put("ST", "圣多美和普林西比");
        countryMap.put("SC", "塞舌尔");
        countryMap.put("SL", "塞拉利昂");
        countryMap.put("SI", "斯罗文尼亚");
        countryMap.put("SK", "斯洛伐克");
        countryMap.put("SB", "所罗门群岛");
        countryMap.put("SO", "索马里");
        countryMap.put("PM", "圣皮艾尔和密克隆群岛");
        countryMap.put("SD", "苏丹");
        countryMap.put("SR", "苏里南");
        countryMap.put("SJ", "斯瓦尔巴特和扬马延岛");
        countryMap.put("SZ", "斯威士兰");
        countryMap.put("SY", "叙利亚");
        countryMap.put("TJ", "塔吉克斯坦");
        countryMap.put("TZ", "坦桑尼亚");
        countryMap.put("TG", "多哥");
        countryMap.put("TK", "托克劳群岛");
        countryMap.put("TO", "汤加");
        countryMap.put("TT", "特立尼达和多巴哥");
        countryMap.put("TR", "土尔其");
        countryMap.put("TM", "土库曼斯坦");
        countryMap.put("TC", "特克斯和凯科斯群岛");
        countryMap.put("TV", "图瓦卢");
        countryMap.put("UG", "乌干达");
        countryMap.put("UY", "乌拉圭");
        countryMap.put("UZ", "乌兹别克斯坦");
        countryMap.put("VU", "瓦努阿鲁");
        countryMap.put("VA", "梵蒂岗");
        countryMap.put("VG", "英属维京群岛");
        countryMap.put("VI", "美属维京群岛");
        countryMap.put("WF", "瓦里斯和福图纳群岛");
        countryMap.put("EH", "西撒哈拉");
        countryMap.put("YE", "也门");
        countryMap.put("YU", "南斯拉夫");
        countryMap.put("ZM", "赞比亚");
    }

    public static String getCountryName(String countryKey) {
        if (ReaderFileUtil.isChinese(countryKey)) {
            return countryKey;
        }
        String name = countryMap.get(countryKey);
        if (StringUtils.isNotBlank(name)) {
            return name;
        }else {
            String upperName = countryMap.get(countryKey.toUpperCase());
            if (StringUtils.isNotBlank(upperName)) {
                return upperName;
            }
        }
        return "";
    }

    /**
     * 处理用户名字符串
     * @param str
     * @return
     */
    public static String handleStr(String str) {
        if (StringUtils.isBlank(str)) {
            return "";
        }

        String string[] = str.split("\\ ");
        if (string.length == 0) {
            return "";
        }

        if (string.length == 1) {
            return string[0];
        }

        StringBuffer stringBuffer = new StringBuffer(string[string.length-1]);
        for (int i=0;i<string.length-1;i++) {
            stringBuffer.append(" ").append(string[i]);
        }
        return stringBuffer.toString();
    }

    public static void main(String[] args) {

//        String str = "abcde";
//        String [] arr = str.split("\\ ");
//
//        StringBuffer stringBuffer = new StringBuffer(arr[arr.length-1]);
//        for (int i=0;i<arr.length-1;i++) {
//            stringBuffer.append(" ").append(arr[i]);
//        }
//        System.out.println(stringBuffer.toString());




    }
}
