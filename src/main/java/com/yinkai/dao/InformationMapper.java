package com.yinkai.dao;

import com.yinkai.entity.Information;

import java.util.List;

public interface InformationMapper {
    List<Information> getInformationLike(String value);

    List<Information> getInformation();
}
