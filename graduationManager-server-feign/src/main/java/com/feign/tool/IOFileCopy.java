package com.feign.tool;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * @ClassName io操作磁盘文件工具类
 * @Author 高阳
 * @Date 2019/4/2220:50
 * @Version 1.0
 **/

/*************************************************
 *                使用须知：
 *
 * 源文件路径：srcPathStr
 * 目标文件路径：desPathStr
 * 源文件路径必须包含文件名，不然会复制文件夹过去
 * 目标路径必须是文件夹路径，不能包含文件路径
 * 所有路径必须"\\"转义
 *
 *************************************************/
public class IOFileCopy {
    public void copyFile(String srcPathStr, String desPathStr) {
        //1.获取源文件的名称
        String newFileName = srcPathStr.substring(srcPathStr.lastIndexOf("\\")+1); //目标文件地址
        System.out.println(newFileName);
        desPathStr = desPathStr + File.separator + newFileName; //源文件地址
        System.out.println(desPathStr);

        try{
            //2.创建输入输出流对象
            FileInputStream fis = new FileInputStream(srcPathStr);
            FileOutputStream fos = new FileOutputStream(desPathStr);

            //创建搬运工具
            byte datas[] = new byte[1024*8];
            //创建长度
            int len = 0;
            //循环读取数据
            while((len = fis.read(datas))!=-1){
                fos.write(datas,0,len);
            }
            //3.释放资源
            fis.close();
            fos.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
