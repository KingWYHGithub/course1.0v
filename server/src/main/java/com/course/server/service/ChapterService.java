package com.course.server.service;

import com.course.server.domain.Chapter;
import com.course.server.domain.ChapterExample;
import com.course.server.dto.ChapterDto;
import com.course.server.mapper.ChapterMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import sun.text.resources.iw.FormatData_iw_IL;

import javax.annotation.Resource;
import java.util.ArrayList;
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

    public List<ChapterDto> list(){

        ChapterExample example=new ChapterExample();
        List<Chapter> chaptersList = ChapterMapper.selectByExample(example);
        List<ChapterDto> chapterDtoList = new ArrayList<>();
        for (int i = 0,l = chaptersList.size(); i<l; i++) {
            Chapter chapter=chaptersList.get(i);
            ChapterDto chapterDto=new ChapterDto();
            BeanUtils.copyProperties(chapter,chapterDto);//对象的拷贝
            chapterDtoList.add(chapterDto);
        }
        return chapterDtoList;
    }
}
