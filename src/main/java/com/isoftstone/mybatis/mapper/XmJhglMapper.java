package com.isoftstone.mybatis.mapper;


import com.isoftstone.mybatis.entity.XmJhgl;

public interface XmJhglMapper {
    XmJhgl queryXmjhglNestedResult(XmJhgl xmJhgl);

    XmJhgl queryXmjhglNestedSelect(XmJhgl xmJhgl);
}