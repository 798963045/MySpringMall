package com.mmall.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * Created by hao on 2017/8/20.
 */
public interface IFileService {
    String upload(MultipartFile file,String path);
}
