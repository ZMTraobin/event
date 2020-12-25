package com.event.controller;

import com.event.util.FastDfsApiOpr;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * author:RaoB
 * date:2020/12/25 0025
 */
@RestController
public class FileController {



    @RequestMapping("upload")
    public String upload(MultipartFile file){
        try {
            String filename = file.getOriginalFilename();
            String extName = filename.substring(filename.lastIndexOf(".") + 1);
            String path = FastDfsApiOpr.upload(file.getBytes(), extName);
            return path;
        }catch (Exception e){

        }
        return null;
    }
}
