package com.sec.ggkt.vod.controller;

import com.sec.ggkt.vod.service.TeacherService;
import com.sec.model.vod.Teacher;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 * 讲师 前端控制器
 * </p>
 *
 * @author sec
 * @since 2023-05-11
 */
@Api(tags = "讲师接口")
@RestController
@RequestMapping("/vod/teacher")
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    /**
     * 查询所有讲师
     * @return 讲师集合
     */
    @ApiOperation("查询所有讲师")
    @GetMapping("/findAll")
    public List<Teacher> findAllTeacher(){
        return teacherService.list();
    }

    /**
     * 逻辑删除讲师
     * @param id 讲师id
     * @return 是否删除
     */
    @ApiOperation("逻辑删除讲师")
    @DeleteMapping("/remove/{id}")
    public boolean removeTeacher(@ApiParam(name="id",value="讲师id",required = true) @PathVariable("id")Long id){
        return teacherService.removeById(id);
    }
}

