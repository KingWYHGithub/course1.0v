package com.course.business.controller;

import com.course.server.domain.Chapter;
import com.course.server.service.ChapterService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
 * @date : 2020/11/15 - 3:15
 */
@RestController
public class ChapterController {

    @Resource
    private ChapterService ChapterService;

    @RequestMapping("/chapter")
    public List<Chapter> chapter(){

        return ChapterService.list();
    }
}
