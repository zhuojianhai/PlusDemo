package com.hencoder.a07;

import android.animation.TypeEvaluator;

import java.util.Arrays;
import java.util.List;

public class NameEvaluator implements TypeEvaluator<String> {
    List<String> names = Arrays.asList("1-001-京哈线",
            "1-002-Durian",
            "1-003-溜溜线",
            "1-004-晓童",
            "1-005-铁物线",
            "1-006-贝塞尔曲线",
            "1-007-刀刀",
            "1-008-翻越",
            "1-009-张磊",
            "1-010-废物线",
            "1-011-丢毛线",
            "1-012-线物扔",
            "1-013-Jet啟思",
            "1-014-诗思线",
            "1-015-渣物线",
            "1-016-发际线",
            "1-017-*物线-刘思奇",
            "1-018-揉物线",
            "1-019-templefck",
            "1-020-赵晓磊",
            "1-021-跑物线",
            "1-022-longertimer",
            "1-023-小雨",
            "1-024-詹徐照",
            "1-025-甩物线",
            "1-026-宏雷",
            "1-027-小译",
            "1-028-猎物线",
            "1-029-幻海流心",
            "1-030-zhangbz",
            "1-031-lber",
            "1-032-滑物线",
            "1-033-高杰",
            "1-034-动物线",
            "1-035-子物线",
            "1-036-Ryan",
            "1-037-hellen",
            "1-038-一坨线",
            "1-039-狠物线",
            "1-040-陆",
            "1-041-Don",
            "1-042-walker",
            "1-043-Rhodey",
            "1-044-tallfish",
            "1-045-赵志鹏",
            "1-046-三个点",
            "1-047-曹永沣",
            "1-048-Choice",
            "1-049-Taylor",
            "1-050-酷乐",
            "1-051-炒米线",
            "1-052-王泽",
            "1-053-导火线",
            "1-054-一针一线",
            "1-055-ChrongLiu",
            "1-056-人鱼线",
            "1-057-天际线",
            "1-058-Martin Tung",
            "1-059-中轴线",
            "1-060-双曲线",
            "1-061-白毛线",
            "1-062-游物线",
            "1-063-北回归线",
            "1-064-米线",
            "1-065-一条线",
            "1-066-嗷～呜啦啦",
            "1-067-Deadline",
            "1-068-QRS心电曲线",
            "1-069-李宇德",
            "1-070-任务线",
            "1-071-斑马线",
            "1-072-八通线",
            "1-073-DsH",
            "1-074-张瑞JerrySher",
            "1-075-jeffrey",
            "1-076-西湖沿线",
            "1-077-JackRo",
            "1-078-Jim.Yu",
            "1-079-petma",
            "1-080-揉物线",
            "1-081-李晓神",
            "1-082-海岸线",
            "1-083-汤宇奥",
            "1-084-yatoooon",
            "1-085-数据线",
            "1-086-拽物线",
            "1-087-伽玛线",
            "1-088-无底线",
            "1-089-马甲线",
            "1-090-怪兽",
            "1-091-坏小桃",
            "1-092-警戒线",
            "1-093-海平线",
            "1-094-格格",
            "1-095 Oven",
            "1-096-儿童购票线",
            "1-097-YQ",
            "1-098-事业线",
            "1-099-纵贯线",
            "1-100-昊",
            "1-101-Shawn");

    @Override
    public String evaluate(float fraction, String startValue, String endValue) {
        if (!names.contains(startValue)) {
            throw new IllegalArgumentException("Start value not existed");
        }
        if (!names.contains(endValue)) {
            throw new IllegalArgumentException("End value not existed");
        }
        int index = (int) ((names.indexOf(endValue) - names.indexOf(startValue)) * fraction);
        return names.get(index);
    }
}