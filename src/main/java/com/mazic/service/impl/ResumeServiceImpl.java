package com.mazic.service.impl;

import com.mazic.dao.ResumeDao;
import com.mazic.entity.Resume;
import com.mazic.service.ResumeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
@Service
public class ResumeServiceImpl implements ResumeService {
    @Resource
    private ResumeDao resumeDao;

    @Override
    public Resume seeResume() {
        Resume resume = resumeDao.queryResume(1);
        return resume;
    }
}
