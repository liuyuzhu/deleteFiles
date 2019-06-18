package com.example.deletefiles.service;

import java.util.List;
import java.util.Map;

/**
 * 删除文件接口
 */
public interface IDeleteService {

    public Map<String,Integer> deleteFiles(List<String> filesName);
}
