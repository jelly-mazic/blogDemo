package com.mazic;

import com.mazic.dao.ResumeDao;
import com.mazic.entity.Resume;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by codingBoy on 16/11/27.
 * 配置spring和junit整合，这样junit在启动时就会加载spring容器
 */
@RunWith(SpringJUnit4ClassRunner.class)
//告诉junit spring的配置文件
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class ResumeDaoTest {
    @Resource
    private ResumeDao resumeDao;

    @Test
    public void queryById() throws Exception {
        int id = 1;
        Resume result = resumeDao.queryResume(id);
        System.out.println(result.getSelfIntroduce());
    }

    @Test
    public void saveResume() {
        String intrduce = "dsfakdjflkad";
        String hobby = "game";
        resumeDao.insertResume(intrduce, "1", "2", "3", "4", hobby);

    }@Test
    public void saveResume1() {
        Resume r  = new Resume();
        r.setSelfAbility("123");
        r.setSelfEducation("123");
        r.setSelfExperience("er");
        r.setSelfIntroduce("er");
        r.setSelfLanguage("er");
        r.setSelfHobby("er");
        resumeDao.insertResume2(r);
    }
    @Test
    public void changResume() {
        resumeDao.updateResume(2, "我爱生活", "yu", "444", "rf", "56", "123");

    }


}

