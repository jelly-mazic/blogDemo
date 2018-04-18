package com.mazic.dao;

import com.mazic.entity.Resume;
import org.apache.ibatis.annotations.Param;


public interface ResumeDao {
    /**
     * 查询简历内容
     *
     * @param offset sql参数
     * @param limit  sql参数
     * @return 返回简历详细信息
     */
    Resume queryResume(@Param("resumeId") int resumeId);

    /**
     * 更新简历
     * @return 如果影响行数>0,代表更新成功
     */
    int updateResume(@Param("resumeId") int resumeId,
                     @Param("selfIntroduce") String selfIntroduce,
                     @Param("selfAbility") String selfAbility,
                     @Param("selfLanguage") String selfLanguage,
                     @Param("selfEducation") String selfEducation,
                     @Param("selfExperience") String selfExperience,
                     @Param("selfHobby") String selfHobby);
    int updateResume2(@Param("updateResume") Resume updateResume);

    /**
     * 插入简历
     * @param selfIntroduce
     * @param selfAbility
     * @param selfLanguage
     * @param selfEducation
     * @param selfExperience
     * @param selfHobby
     */
    void insertResume(@Param("selfIntroduce") String selfIntroduce,
                      @Param("selfAbility") String selfAbility,
                      @Param("selfLanguage") String selfLanguage,
                      @Param("selfEducation") String selfEducation,
                      @Param("selfExperience") String selfExperience,
                      @Param("selfHobby") String selfHobby);

    /**
     * 插入实体类
     * @param selfResume
     */
    void insertResume2(@Param("selfResume") Resume selfResume);


}
