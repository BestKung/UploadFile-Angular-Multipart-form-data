/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.uploadfile.controller;

import com.mycompany.uploadfile.model.StudentImage;
import com.mycompany.uploadfile.repo.StudentImageRepo;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartRequest;

/**
 *
 * @author Best
 */
@RestController
//@Controller
public class StudentImageController {

    @Autowired
    private StudentImageRepo imageRepo;

    @RequestMapping(value = "/savefile", method = RequestMethod.POST)
//     @RequestMapping(value = "/savefile", method = RequestMethod.POST)
//    @ResponseBody
    public void saveImage(MultipartRequest file) throws IOException {
        System.out.println("------------------------------------------------------------->" + file.getMultiFileMap());
        System.out.println("------------------------------------------------------------->" + file.getFile("file"));
        StudentImage image = new StudentImage();
        image.setContent(file.getFile("file").getBytes());
        image.setName(file.getFile("file").getOriginalFilename());
        image.setMimeType(file.getFile("file").getName());
        imageRepo.save(image);
    }

      @RequestMapping(value = "/getfile", method = RequestMethod.GET)
    public Integer getImage(){
         // System.out.println(uploadFile);
//          System.out.println("---------------------------------------------->Start get");
//        ResponseEntity<InputStreamResource> body = ResponseEntity.ok().contentLength(uploadFile.getContent().length)
//                .contentType(MediaType.parseMediaType(uploadFile.getMimeType()))
//                .header("Content-Disposition", "attachment; filename=\""+ uploadFile.getName()+"\"")
//                .body(new InputStreamResource(new ByteArrayInputStream(uploadFile.getContent())));
//        return body;
          return 123;
    }
}
