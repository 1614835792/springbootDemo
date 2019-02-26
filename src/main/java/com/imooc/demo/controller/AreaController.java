package com.imooc.demo.controller;

import com.imooc.demo.entity.Area;
import com.imooc.demo.result.Result;
import com.imooc.demo.util.ResultUtil;
import com.imooc.demo.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/superadmin")
public class AreaController {
    @Autowired
    private AreaService areaService;
    @GetMapping("/area")
    public Result<Area> areaList(){
      return ResultUtil.sucess(areaService.getAreaList());
    }
    @GetMapping("/area/{id}")
    public Result findOne(@PathVariable("id")Integer id){
        return ResultUtil.sucess(areaService.getAreaById(id));
    }
    @PostMapping("/area")
    public Result addArea(@RequestBody Area area){
        if(areaService.addArea(area)==true){
            return ResultUtil.sucess();
        }else{
            return ResultUtil.error();
        }
    }
    @PutMapping("/area")
    public Result modifyArea(@RequestBody Area area){
        if(areaService.modifyArea(area)==true){
            return ResultUtil.sucess();
        }else{
            return ResultUtil.error();
        }

    }
    @DeleteMapping("/area")
    public Result removeArea(@RequestParam("id")Integer id){
        if(areaService.deleteArea(id)==true){
            return ResultUtil.sucess(null);
        }else {
            return ResultUtil.error();
        }
    }
}
