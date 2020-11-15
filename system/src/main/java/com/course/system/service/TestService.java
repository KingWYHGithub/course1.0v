package com.course.system.service;

import com.course.system.domain.Test;
import com.course.system.mapper.TestMapper;
import com.sun.org.apache.xml.internal.resolver.helpers.PublicId;
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
public class TestService {
    @Resource
    private TestMapper testMapper;

    public List<Test> list(){

        return testMapper.list();
    }
}
