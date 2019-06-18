package com.example.deletefiles.controller;

import com.example.deletefiles.service.IDeleteService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 删除控制层
 */
@RestController("/deleteFiles")
public class DeleteController {

    @Resource
    private IDeleteService deleteService;

    @PostMapping("/delete")
    public Map<String,Integer> deleteFiles(List<String> filesName){
        return deleteService.deleteFiles(filesName);

    }





}
