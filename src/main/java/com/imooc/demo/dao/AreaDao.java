package com.imooc.demo.dao;

import com.imooc.demo.entity.Area;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface AreaDao {
    List<Area> queryArea();
    Area queryAreaById(int areaId);
    int insertArea(Area area);
    int updateArea(Area areaId);
    int deleteArea(int areaId);
}
