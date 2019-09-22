package com.feign.controller;

import com.alibaba.fastjson.JSONObject;
import com.feign.service.Client2Service;
import com.feign.tool.IOFileCopy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

/**
 * @ClassName TaskClientController
 * @Author gaoyang
 * @Date 2019/4/517:26
 * @Version 1.0
 **/
@RestController
public class TaskClientController {
    @Autowired
    private Client2Service client2Service;
    @Autowired
    private HttpServletRequest request;
    @RequestMapping("/createStuArticle")
    public String createStuArticle(){
        JSONObject json = JSONObject.parseObject(request.getParameter("jon"));
        return client2Service.createStuArticle(json);
    }

    @RequestMapping("/getMyArticleCount")
    public String getMyArticleCount(){
        JSONObject json = JSONObject.parseObject(request.getParameter("jon"));
        return client2Service.getMyArticleCount(json);
    }

    @RequestMapping("/getMyArticle")
    public String getMyArticle(){
        JSONObject json = JSONObject.parseObject(request.getParameter("jon"));
        return client2Service.getMyArticle(json);
    }

    @RequestMapping("/getMyHandlerArticleCount")
    public String getMyHandlerArticleCount(){
        JSONObject json = JSONObject.parseObject(request.getParameter("jon"));
        return client2Service.getMyHandlerArticleCount(json);
    }

    @RequestMapping("/getMyHandlerArticle")
    public String getMyHandlerArticle(){
        JSONObject json = JSONObject.parseObject(request.getParameter("jon"));
        return client2Service.getMyHandlerArticle(json);
    }

    //课题审批流程接口
    @RequestMapping("/TeaExamineArticleTask")
    public String TeaExamineArticleTask(){
        JSONObject json = JSONObject.parseObject(request.getParameter("jon"));
        return client2Service.TeaExamineArticleTask(json);
    }

    @RequestMapping("/adminExamineArticleTask")
    public String adminExamineArticleTask(){
        JSONObject json = JSONObject.parseObject(request.getParameter("jon"));
        return client2Service.adminExamineArticleTask(json);
    }

    @RequestMapping("/getArticleRecordCount")
    public String getArticleRecordCount(){
        JSONObject json = JSONObject.parseObject(request.getParameter("jon"));
        return client2Service.getArticleRecordCount(json);
    }

    @RequestMapping("/getArticleRecord")
    public String getArticleRecord(){
        JSONObject json = JSONObject.parseObject(request.getParameter("jon"));
        return client2Service.getArticleRecord(json);
    }

    @RequestMapping("/teaSubmitArticle")
    public String teaSubmitArticle(){
        JSONObject json = JSONObject.parseObject(request.getParameter("jon"));
        return client2Service.teaSubmitArticle(json);
    }

    @RequestMapping("/student/reportUpload")
    public String reportUpload(HttpServletRequest request,
                               @RequestParam("reportValue") String reportValue,
                               @RequestParam("reportFile") MultipartFile reportFile){
        // 获取文件描述参数 description，纯粹测试使用
        System.out.println("description = " + reportValue);

        // 测试MultipartFile接口的各个方法
        System.out.println("文件类型ContentType=" + reportFile.getContentType());
        System.out.println("文件组件名称Name=" + reportFile.getName());
        System.out.println("文件原名称OriginalFileName=" + reportFile.getOriginalFilename());
        System.out.println("文件大小Size=" + reportFile.getSize()/1024 + "KB");

        // 如果文件不为空，写入上传路径，进行文件上传
        if (!reportFile.isEmpty()) {

            // 构建上传文件的存放路径
            //String path = request.getServletContext().getRealPath("/upload/");
            String path = "D:\\idea workspace\\graduationManager-server-feign\\src\\main\\resources\\upload";
            System.out.println("path = " + path);

            // 获取上传的文件名称，并结合存放路径，构建新的文件名称
            String filename = reportFile.getOriginalFilename();
            File filepath = new File(path, filename);

            // 判断路径是否存在，不存在则新创建一个
            if (!filepath.getParentFile().exists()) {
                filepath.getParentFile().mkdirs();
            }

            // 将上传文件保存到目标文件目录
            try {
                reportFile.transferTo(new File(path + File.separator + filename));
            } catch (IOException e) {
                e.printStackTrace();
            }

            return "<script>alert('开题报告上传成功!!!')</script>";
        } else {
            return "<script>alert('开题报告上传失败!!!')</script>";
        }
    }

    @RequestMapping("/submitReport")
    public String submitReport(){
        JSONObject json = JSONObject.parseObject(request.getParameter("jon"));
        return client2Service.submitReport(json);
    }

    @RequestMapping("/getMyReportCount")
    public String getMyReportCount(){
        JSONObject json = JSONObject.parseObject(request.getParameter("jon"));
        return client2Service.getMyReportCount(json);
    }

    @RequestMapping("/getMyReport")
    public String getMyReport(){
        JSONObject json = JSONObject.parseObject(request.getParameter("jon"));
        return client2Service.getMyReport(json);
    }

    @RequestMapping("/downloadReport")
    public String downloadReport(HttpServletRequest request, HttpServletResponse response) {
        String addr = request.getParameter("addr");
        String name = addr.substring(addr.lastIndexOf("\\")+1);
        String fileName = name;
        if (fileName != null) {
            //设置文件路径
            String realPath = "D:\\idea workspace\\graduationManager-server-feign\\src\\main\\resources\\upload";
            File file = new File(realPath , fileName);
            if (file.exists()) {
                response.setContentType("application/force-download");// 设置强制下载不打开
                response.addHeader("Content-Disposition", "attachment;fileName=" + fileName);// 设置文件名
                byte[] buffer = new byte[1024];
                FileInputStream fis = null;
                BufferedInputStream bis = null;
                try {
                    fis = new FileInputStream(file);
                    bis = new BufferedInputStream(fis);
                    OutputStream os = response.getOutputStream();
                    int i = bis.read(buffer);
                    while (i != -1) {
                        os.write(buffer, 0, i);
                        i = bis.read(buffer);
                    }
                    System.out.println("下载成功");
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    if (bis != null) {
                        try {
                            bis.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (fis != null) {
                        try {
                            fis.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
        return null;
    }

    @RequestMapping("/getReportRecord")
    public String getReportRecord(){
        JSONObject json = JSONObject.parseObject(request.getParameter("jon"));
        return client2Service.getReportRecord(json);
    }

    @RequestMapping("/getReportByChoose")
    public String getReportByChoose(){
        JSONObject json = JSONObject.parseObject(request.getParameter("jon"));
        return client2Service.getReportByChoose(json);
    }

    @RequestMapping("/TeaExamineReportTask")
    public String TeaExamineReportTask(){
        JSONObject json = JSONObject.parseObject(request.getParameter("jon"));
        return client2Service.TeaExamineReportTask(json);
    }

    @RequestMapping("/getReportByRepId")
    public String getReportByRepId(){
        JSONObject json = JSONObject.parseObject(request.getParameter("jon"));
        return client2Service.getReportByRepId(json);
    }

    @RequestMapping("/editReport")
    public String editReport(){
        JSONObject json = JSONObject.parseObject(request.getParameter("jon"));
        return client2Service.editReport(json);
    }

    @RequestMapping("/student/subjectUpload")
    public String subjectUpload(HttpServletRequest request,
                               @RequestParam("subjectFile") MultipartFile subjectFile){
        // 获取文件描述参数 description，纯粹测试使用

        // 测试MultipartFile接口的各个方法
        System.out.println("文件类型ContentType=" + subjectFile.getContentType());
        System.out.println("文件组件名称Name=" + subjectFile.getName());
        System.out.println("文件原名称OriginalFileName=" + subjectFile.getOriginalFilename());
        System.out.println("文件大小Size=" + subjectFile.getSize()/1024 + "KB");

        // 如果文件不为空，写入上传路径，进行文件上传
        if (!subjectFile.isEmpty()) {

            // 构建上传文件的存放路径
            //String path = request.getServletContext().getRealPath("/upload/");
            String path = "D:\\idea workspace\\graduationManager-server-feign\\src\\main\\resources\\upload2";
            System.out.println("path = " + path);

            // 获取上传的文件名称，并结合存放路径，构建新的文件名称
            String filename = subjectFile.getOriginalFilename();
            File filepath = new File(path, filename);

            // 判断路径是否存在，不存在则新创建一个
            if (!filepath.getParentFile().exists()) {
                filepath.getParentFile().mkdirs();
            }

            // 将上传文件保存到目标文件目录
            try {
                subjectFile.transferTo(new File(path + File.separator + filename));
            } catch (IOException e) {
                e.printStackTrace();
            }

            return "<script>alert('论文上传成功!!!')</script>";
        } else {
            return "<script>alert('论文上传失败!!!')</script>";
        }
    }

    @RequestMapping("/submitSubject")
    public String submitSubject(){
        JSONObject json = JSONObject.parseObject(request.getParameter("jon"));
        return client2Service.submitSubject(json);
    }

    @RequestMapping("/getMySubjectCount")
    public String getMySubjectCount(){
        JSONObject json = JSONObject.parseObject(request.getParameter("jon"));
        return client2Service.getMySubjectCount(json);
    }

    @RequestMapping("/getMySubject")
    public String getMySubject(){
        JSONObject json = JSONObject.parseObject(request.getParameter("jon"));
        return client2Service.getMySubject(json);
    }

    @RequestMapping("/downloadSubject")
    public String downloadSubject(HttpServletRequest request, HttpServletResponse response) {
        String addr = request.getParameter("addr");
        String name = addr.substring(addr.lastIndexOf("\\")+1);
        String fileName = name;
        if (fileName != null) {
            //设置文件路径
            String realPath = "D:\\idea workspace\\graduationManager-server-feign\\src\\main\\resources\\upload2";
            File file = new File(realPath , fileName);
            if (file.exists()) {
                response.setContentType("application/force-download");// 设置强制下载不打开
                response.addHeader("Content-Disposition", "attachment;fileName=" + fileName);// 设置文件名
                byte[] buffer = new byte[1024];
                FileInputStream fis = null;
                BufferedInputStream bis = null;
                try {
                    fis = new FileInputStream(file);
                    bis = new BufferedInputStream(fis);
                    OutputStream os = response.getOutputStream();
                    int i = bis.read(buffer);
                    while (i != -1) {
                        os.write(buffer, 0, i);
                        i = bis.read(buffer);
                    }
                    System.out.println("下载成功");
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    if (bis != null) {
                        try {
                            bis.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (fis != null) {
                        try {
                            fis.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
        return null;
    }

    @RequestMapping("/getSubjectRecord")
    public String getSubjectRecord(){
        JSONObject json = JSONObject.parseObject(request.getParameter("jon"));
        return client2Service.getSubjectRecord(json);
    }

    @RequestMapping("/getSubjectByChoose")
    public String getSubjectByChoose(){
        JSONObject json = JSONObject.parseObject(request.getParameter("jon"));
        return client2Service.getSubjectByChoose(json);
    }

    @RequestMapping("/TeaExamineSubjectTask")
    public String TeaExamineSubjectTask(){
        JSONObject json = JSONObject.parseObject(request.getParameter("jon"));
        return client2Service.TeaExamineSubjectTask(json);
    }

    @RequestMapping("/editSubject")
    public String editSubject(){
        JSONObject json = JSONObject.parseObject(request.getParameter("jon"));
        return client2Service.editSubject(json);
    }

    @RequestMapping("/getReportFileCount")
    public String getReportFileCount(){
        return client2Service.getReportFileCount();
    }

    @RequestMapping("/getReportFile")
    public String getReportFile(){
        JSONObject json = JSONObject.parseObject(request.getParameter("jon"));
        return client2Service.getReportFile(json);
    }

    @RequestMapping("/copyReport")
    public String copyReport(){
        JSONObject json = JSONObject.parseObject(request.getParameter("jon"));
        String des = json.get("des").toString();
        String src = json.get("src").toString();
        IOFileCopy iof = new IOFileCopy();
        iof.copyFile(src,des);
        return "success";
    }

    @RequestMapping("/getSubjectFileCount")
    public String getSubjectFileCount(){
        return client2Service.getSubjectFileCount();
    }

    @RequestMapping("/getSubjectFile")
    public String getSubjectFile(){
        JSONObject json = JSONObject.parseObject(request.getParameter("jon"));
        return client2Service.getSubjectFile(json);
    }

    @RequestMapping("/downloadExcel")
    public String downloadExcel(HttpServletRequest request, HttpServletResponse response) {
        String addr = request.getParameter("addr");
        String name = addr.substring(addr.lastIndexOf("\\")+1);
        String fileName = name;
        if (fileName != null) {
            //设置文件路径
            String realPath = "D:\\idea workspace\\graduationManager-server-feign\\src\\main\\resources\\templates";
            File file = new File(realPath , fileName);
            if (file.exists()) {
                response.setContentType("application/force-download");// 设置强制下载不打开
                response.addHeader("Content-Disposition", "attachment;fileName=" + fileName);// 设置文件名
                byte[] buffer = new byte[1024];
                FileInputStream fis = null;
                BufferedInputStream bis = null;
                try {
                    fis = new FileInputStream(file);
                    bis = new BufferedInputStream(fis);
                    OutputStream os = response.getOutputStream();
                    int i = bis.read(buffer);
                    while (i != -1) {
                        os.write(buffer, 0, i);
                        i = bis.read(buffer);
                    }
                    System.out.println("下载成功");
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    if (bis != null) {
                        try {
                            bis.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (fis != null) {
                        try {
                            fis.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
        return null;
    }

    @RequestMapping("/importExcel")
    public String importExcel(){
        JSONObject json = JSONObject.parseObject(request.getParameter("jon"));
        return client2Service.importExcel(json);
    }

    @RequestMapping("/admin/excelUpload")
    public String excelUpload(HttpServletRequest request,
                                @RequestParam("excelFile") MultipartFile excelFile){
        // 获取文件描述参数 description，纯粹测试使用

        // 测试MultipartFile接口的各个方法
        System.out.println("文件类型ContentType=" + excelFile.getContentType());
        System.out.println("文件组件名称Name=" + excelFile.getName());
        System.out.println("文件原名称OriginalFileName=" + excelFile.getOriginalFilename());
        System.out.println("文件大小Size=" + excelFile.getSize()/1024 + "KB");

        // 如果文件不为空，写入上传路径，进行文件上传
        if (!excelFile.isEmpty()) {

            // 构建上传文件的存放路径
            //String path = request.getServletContext().getRealPath("/upload/");
            String path = "D:\\idea workspace\\graduationManager-server-feign\\src\\main\\resources\\upload";
            System.out.println("path = " + path);

            // 获取上传的文件名称，并结合存放路径，构建新的文件名称
            String filename = excelFile.getOriginalFilename();
            File filepath = new File(path, filename);

            // 判断路径是否存在，不存在则新创建一个
            if (!filepath.getParentFile().exists()) {
                filepath.getParentFile().mkdirs();
            }

            // 将上传文件保存到目标文件目录
            try {
                excelFile.transferTo(new File(path + File.separator + filename));
            } catch (IOException e) {
                e.printStackTrace();
            }

            return "<script>alert('导入成功!!!')</script>";
        } else {
            return "<script>alert('导入失败!!!')</script>";
        }
    }

    @RequestMapping("/downTxt")
    public String downTxt(HttpServletRequest request, HttpServletResponse response) {
        String addr = request.getParameter("addr");
        String name = addr.substring(addr.lastIndexOf("\\")+1);
        String fileName = name;
        if (fileName != null) {
            //设置文件路径
            String realPath = "D:\\idea workspace\\graduationManager-server-feign\\src\\main\\resources\\templates";
            File file = new File(realPath , fileName);
            if (file.exists()) {
                response.setContentType("application/force-download");// 设置强制下载不打开
                response.addHeader("Content-Disposition", "attachment;fileName=" + fileName);// 设置文件名
                byte[] buffer = new byte[1024];
                FileInputStream fis = null;
                BufferedInputStream bis = null;
                try {
                    fis = new FileInputStream(file);
                    bis = new BufferedInputStream(fis);
                    OutputStream os = response.getOutputStream();
                    int i = bis.read(buffer);
                    while (i != -1) {
                        os.write(buffer, 0, i);
                        i = bis.read(buffer);
                    }
                    System.out.println("下载成功");
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    if (bis != null) {
                        try {
                            bis.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (fis != null) {
                        try {
                            fis.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
        return null;
    }




































}
