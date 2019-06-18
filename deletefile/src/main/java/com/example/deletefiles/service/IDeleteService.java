package com.example.deletefiles.service;

import java.util.List;
import java.util.Map;

/**
 * 删除文件接口
 * @author deyong_tong
 */
public interface IDeleteService {

    Map<String,Integer> deleteFiles(List<String> filesName,String projectName);
}
