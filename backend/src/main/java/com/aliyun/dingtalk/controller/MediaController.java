package com.aliyun.dingtalk.controller;

import com.aliyun.dingtalk.model.RpcServiceResult;
import com.aliyun.dingtalk.service.MediaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 上传媒体文件
 */
@RestController
public class MediaController {

    @Autowired
    private MediaService mediaService;

    /**
     * 发送工作通知
     *
     * @return
     */
    @PostMapping("/upload")
    public RpcServiceResult uploadMedia() {

        return RpcServiceResult.getSuccessResult(mediaService.uploadMedia());

    }

}
