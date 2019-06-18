package com.example.deletefiles.service.impl;

import com.example.deletefiles.service.IDeleteService;
import com.example.deletefiles.util.Delete;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 删除服务实现类
 *
 * @author deyong_tong 童德勇 2019/6/18 23:20
 * @version V1.0
 */
@Service("DeleteServiceImpl")
public class DeleteServiceImpl implements IDeleteService {

    @Resource
    public Delete delete;

    @Override
    public Map<String, Integer> deleteFiles(List<String> filesName, String projectName) {

        return null;
    }
}
