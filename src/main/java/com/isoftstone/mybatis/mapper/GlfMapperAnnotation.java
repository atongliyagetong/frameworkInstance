package com.isoftstone.mybatis.mapper;

import com.isoftstone.mybatis.entity.Glf;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface GlfMapperAnnotation {
    @Select("select * from CK_GLF where bfh=#{bfh}")
    public List<Glf> queryGlf(Glf ck_glf);
}
