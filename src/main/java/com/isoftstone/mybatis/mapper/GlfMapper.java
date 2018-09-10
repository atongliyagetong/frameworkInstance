package com.isoftstone.mybatis.mapper;

import com.isoftstone.mybatis.entity.Glf;
import com.isoftstone.mybatis.entity.Mybatis;

import java.util.List;

public interface GlfMapper {
     List<Glf> queryGlf(Glf ck_glf);

     List<GlfResultMap> findGlf(Glf ck_glf);

     List<GlfResultMap> findGlfByConstructResultMap(Glf ck_glf);

     Integer insertMybatis(Mybatis mybatis);
}
