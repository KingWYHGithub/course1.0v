package com.course.server.service;

import com.course.server.domain.Chapter;
import com.course.server.domain.ChapterExample;
import com.course.server.mapper.ChapterMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * ///////////////////////////////////////
 * <p>
 * 作为一个真正的程序员，首先应该尊重编程，<br/>
 * 热爱你所写下的程序，他是你的伙伴，而不是工具。
 * </p>
 * ///////////////////////////////////////
 * _____       _______   __     _______ _   _
 * |  __ \   /\|__   __|/\\ \   / /_   _| \ | |
 * | |  | | /  \  | |  /  \\ \_/ /  | | |  \| |
 * | |  | |/ /\ \ | | / /\ \\   /   | | | . ` |
 * | |__| / ____ \| |/ ____ \| |   _| |_| |\  |
 * |_____/_/    \_\_/_/    \_\_|  |_____|_| \_|
 *
 * @author :wangyuhong
 * @date : 2020/11/16 - 5:15
 */
@Service
public class ChapterService {
    @Resource
    private ChapterMapper ChapterMapper;

    public List<Chapter> list(){

        ChapterExample example=new ChapterExample();
        example.createCriteria().andIdEqualTo("1");
       // example.setOrderByClause("id desc");
        return ChapterMapper.selectByExample(example);
    }
}
