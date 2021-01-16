package com.liang.controller;

import org.apache.http.HttpResponse;
import org.jetbrains.annotations.NotNull;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.*;
import java.net.URLEncoder;

@Controller
@Scope("prototype")
@RequestMapping("free")
public class FunctionController {
    @Resource
    HttpSession session;

    //springboot实现文件上传
    @RequestMapping("upload")
    public String upload(@RequestParam MultipartFile upload) throws IOException {

        //1.获取文件的原始 名字
        String fileName = upload.getOriginalFilename();
        //2. 获取保存文件的真实路径
        String realPath = session.getServletContext().getRealPath("/upload");
        //3. 将文件上传到服务器的指定位置
        upload.transferTo(new File(realPath+"/"+fileName));
        return "redirect:/index.jsp";
    }

    //springboot实现文件下载
    @RequestMapping("download")
    public void download( HttpServletResponse response) throws IOException {
        // 下载本地文件
        String fileName = "Operator.doc".toString(); // 文件的默认保存名
        // 读到流中
        InputStream inStream = new FileInputStream("c:/Operator.doc");// 文件的存放路径
        // 设置输出的格式
        response.reset();
        response.setContentType("bin");
        response.addHeader("Content-Disposition", "attachment; filename=\"" + fileName + "\"");
        // 循环取出流中的数据
        byte[] b = new byte[100];
        int len;
        try {
            while ((len = inStream.read(b)) > 0)
                response.getOutputStream().write(b, 0, len);
            inStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
 /*// 下载网络文件
        int bytesum = 0;
        int byteread = 0;
        URL url = new URL("windine.blogdriver.com/logo.gif");
        try {
            URLConnection conn = url.openConnection();
            InputStream inStream = conn.getInputStream();
            FileOutputStream fs = new FileOutputStream("c:/abc.gif");
            byte[] buffer = new byte[1204];
            int length;
            while ((byteread = inStream.read(buffer)) != -1) {
                bytesum += byteread;
                System.out.println(bytesum);
                fs.write(buffer, 0, byteread);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }*/