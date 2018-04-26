package com.mazic;

import com.mazic.entity.Resume;
import com.mazic.service.ResumeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by codingBoy on 16/11/27.
 * 配置spring和junit整合，这样junit在启动时就会加载spring容器
 */
@RunWith(SpringJUnit4ClassRunner.class)
//告诉junit spring的配置文件
@ContextConfiguration({"classpath:spring/spring-dao.xml", "classpath:spring/spring-service.xml"})

public class ResumeServiceTest {
    @Autowired
    private ResumeService resumeService;

    @Test
    public void testQueryResueme() {
        Resume r = resumeService.seeResume(1);
        System.out.println("result:"+r.getSelfIntroduce());

    }


}
