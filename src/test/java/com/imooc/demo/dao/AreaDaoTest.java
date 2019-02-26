package com.imooc.demo.dao;

import com.imooc.demo.entity.Area;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class AreaDaoTest {
    @Autowired
    private AreaDao areaDao;
    @Test
    public void queryArea() {
        List<Area> areaList=areaDao.queryArea();
        assertEquals(2,areaList.size());
    }

    @Test
    public void queryAreaById() {
        Area area=new Area();
        assertEquals("东苑",areaDao.queryAreaById(1).getAreaName());
    }

    @Test
    public void insertArea() {
        Area area=new Area();
        area.setAreaName("南苑");
        area.setPriority(1);
        int effecteddNum=areaDao.insertArea(area);
        System.out.println(area.getAreaId());
        assertEquals(1,effecteddNum);
    }

    @Test
    public void updateArea() {
        Area area=new Area();
        area.setAreaName("北苑");
        area.setAreaId(3);
        area.setLastEditTime(new Date());
        int effecteddNum=areaDao.updateArea(area);
        assertEquals(1,effecteddNum);
    }

    @Test
    public void deleteArea() {
       int effecteddNum=areaDao.deleteArea(3);
       assertEquals(1,effecteddNum);
    }
}