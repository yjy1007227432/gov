/*     */
package org.competition.control;
/*     */

import com.alibaba.fastjson.JSONObject;
/*     */ import java.io.BufferedInputStream;
/*     */ import java.io.File;
/*     */ import java.io.FileInputStream;
/*     */ import java.io.IOException;
/*     */ import javax.servlet.ServletOutputStream;
/*     */ import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/*     */ import org.slf4j.Logger;
/*     */ import org.slf4j.LoggerFactory;
/*     */ import org.springframework.web.bind.annotation.*;
/*     */
/*     */
/*     */ import org.springframework.web.multipart.MultipartFile;

/*     */
/*     */
@RestController
/*     */
@RequestMapping({"uploadDownload"})
/*     */
@CrossOrigin(allowCredentials = "true", allowedHeaders = {"*"})
/*     */ public class UploadDownloadController {
    /*  20 */   private static final Logger logger = LoggerFactory.getLogger(UploadDownloadController.class);
    /*     */
    /*  22 */   private static String uploadDir = "D:/Download";

    /*     */
    /*     */
    @RequestMapping({"/uploadImage"})
    /*     */ public JSONObject uploadImage(@RequestParam("file") MultipartFile file) throws RuntimeException {
        /*  26 */
        if (file.isEmpty()) {
            /*  27 */
            logger.error("上传的文件名为空");
            /*     */
        }
        /*     */
        /*  30 */
        String fileName = file.getOriginalFilename();
        /*  31 */
        logger.info("上传的文件名为：" + fileName);
        /*     */
        /*  33 */
        String suffixName = fileName.substring(fileName.lastIndexOf("."));
        /*  34 */
        logger.info("上传的后缀名为：" + suffixName);
        /*     */
        /*  36 */
        String filePath = uploadDir;
        /*     */
        /*     */
        /*  39 */
        File dest = new File(filePath + fileName);
        /*     */
        /*  41 */
        if (!dest.getParentFile().exists()) {
            /*  42 */
            dest.getParentFile().mkdirs();
            /*     */
        }
        /*     */
        try {
            /*  45 */
            file.transferTo(dest);
            /*  46 */
            logger.info("上传成功后的文件路径未：" + filePath + fileName);
            /*  47 */
            return null;
            /*  48 */
        } catch (IllegalStateException e) {
            /*  49 */
            e.printStackTrace();
            /*  50 */
        } catch (IOException e) {
            /*  51 */
            e.printStackTrace();
            /*     */
        }
        /*  53 */
        return null;
        /*     */
    }

    /*     */
    /*     */
    /*     */
    /*     */
    @RequestMapping(value = {"/downloadImage"}, method = {RequestMethod.GET})
    /*     */ public String downloadImage(String imageName, HttpServletRequest request, HttpServletResponse response) {
        /*  60 */
        logger.debug("the imageName is : " + imageName);
        /*  61 */
        String fileUrl = uploadDir + imageName;
        /*  62 */
        if (fileUrl != null) {
            /*     */
            /*     */
            /*     */
            /*     */
            /*  67 */
            File file = new File(fileUrl);
            /*  68 */
            if (file.exists()) {
                /*  69 */
                response.setContentType("application/force-download");
                /*  70 */
                response.addHeader("Content-Disposition", "attachment;fileName=" + imageName);
                /*     */
                /*  72 */
                byte[] buffer = new byte[1024];
                /*  73 */
                FileInputStream fis = null;
                /*  74 */
                BufferedInputStream bis = null;
                /*     */
                try {
                    /*  76 */
                    fis = new FileInputStream(file);
                    /*  77 */
                    bis = new BufferedInputStream(fis);
                    /*  78 */
                    ServletOutputStream servletOutputStream = response.getOutputStream();
                    /*  79 */
                    int i = bis.read(buffer);
                    /*  80 */
                    while (i != -1) {
                        /*  81 */
                        servletOutputStream.write(buffer, 0, i);
                        /*  82 */
                        i = bis.read(buffer);
                        /*     */
                    }
                    /*  84 */
                    System.out.println("success");
                    /*  85 */
                } catch (Exception e) {
                    /*  86 */
                    e.printStackTrace();
                    /*     */
                } finally {
                    /*  88 */
                    if (bis != null) {
                        /*     */
                        try {
                            /*  90 */
                            bis.close();
                            /*  91 */
                        } catch (IOException e) {
                            /*  92 */
                            e.printStackTrace();
                            /*     */
                        }
                        /*     */
                    }
                    /*  95 */
                    if (fis != null) {
                        /*     */
                        try {
                            /*  97 */
                            fis.close();
                            /*  98 */
                        } catch (IOException e) {
                            /*  99 */
                            e.printStackTrace();
                            /*     */
                        }
                        /*     */
                    }
                    /*     */
                }
                /*     */
            }
            /*     */
        }
        /* 105 */
        return null;
        /*     */
    }
    /*     */
}