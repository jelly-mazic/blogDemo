package com.mazic.dao;

import com.mazic.entity.Resume;
import org.apache.ibatis.annotations.Param;


public interface ResumeDao {
    /**
     * 查询简历内容
     *
     */
    Resume queryResume(@Param("resumeId") int resumeId);

    /**
     * 更新简历
     * @return 如果影响行数>0,代表更新成功
     */
    int updateResume(@Param("updateResume") Resume updateResume);

    /**
     * 插入实体类
     * @param selfResume
     */
    void insertResume(@Param("selfResume") Resume selfResume);


}
