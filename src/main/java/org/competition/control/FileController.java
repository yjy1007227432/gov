/*     */
package org.competition.control;
/*     */

import java.io.File;
/*     */ import java.io.FileInputStream;
/*     */ import java.io.FileOutputStream;
/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
/*     */ import java.io.OutputStream;
/*     */ import javax.servlet.ServletOutputStream;
/*     */ import javax.servlet.http.HttpServletRequest;
/*     */ import javax.servlet.http.HttpServletResponse;
/*     */ import org.apache.commons.lang.exception.ExceptionUtils;
/*     */ import org.apache.tomcat.util.http.fileupload.IOUtils;
/*     */ import org.apache.tomcat.util.http.fileupload.util.Streams;
import org.competition.domain.ResultUtil;
/*     */ import org.slf4j.Logger;
/*     */ import org.slf4j.LoggerFactory;
/*     */ import org.springframework.web.bind.annotation.*;
/*     */
/*     */
/*     */
/*     */
/*     */ import org.springframework.web.multipart.MultipartFile;

/*     */
/*     */
@CrossOrigin(allowCredentials = "true", allowedHeaders = {"*"})
/*     */
@RestController
/*     */
@RequestMapping(method = {RequestMethod.POST}, value = {"/file"})
/*     */ public class FileController {
    /*  27 */   private static final Logger logger = LoggerFactory.getLogger(FileController.class);
    /*     */
    /*     */   private static final String fileDir = "files";
    /*  30 */   private static final String rootPath = System.getProperty("user.home") + File.separator + "files" + File.separator;

    /*     */
    @RequestMapping(method = {RequestMethod.POST}, value = {"/upload"})
    /*     */ public Object uploadFile(@RequestParam("file") MultipartFile[] multipartFiles, HttpServletResponse response, HttpServletRequest request) {
        /*  33 */
        File fileDir = new File(rootPath);
        /*  34 */
        if (!fileDir.exists() && !fileDir.isDirectory()) {
            /*  35 */
            fileDir.mkdirs();
            /*     */
        }
        /*     */
        try {
            /*  38 */
            if (multipartFiles != null && multipartFiles.length > 0) {
                /*  39 */
                for (int i = 0; i < multipartFiles.length; i++) {
                    /*     */
                    /*     */
                    try {
                        /*  42 */
                        String storagePath = rootPath + multipartFiles[i].getOriginalFilename();
                        /*  43 */
                        logger.info("上传的文件：" + multipartFiles[i].getName() + "," + multipartFiles[i].getContentType() + "," + multipartFiles[i].getOriginalFilename() + "，保存的路径为：" + storagePath);
                        /*     */
                        /*  45 */
                        Streams.copy(multipartFiles[i].getInputStream(), new FileOutputStream(storagePath), true);
                        /*     */
                        /*     */
                        /*     */
                    }
                    /*  49 */ catch (IOException e) {
                        /*  50 */
                        logger.error(ExceptionUtils.getFullStackTrace(e));
                        /*     */
                    }
                    /*     */
                    /*     */
                }
                /*     */
            }
            /*  55 */
        } catch (Exception e) {
            /*  56 */
            return ResultUtil.error(e.getMessage());
            /*     */
        }
        /*  58 */
        return ResultUtil.success("上传成功!");
        /*     */
    }

    @GetMapping({"/download"})
    /*     */ public Object downloadFile(@RequestParam String fileName, HttpServletResponse response, HttpServletRequest request) {
        /*     */
        ServletOutputStream servletOutputStream = null;
        /*  70 */
        OutputStream os = null;
        /*  71 */
        InputStream is = null;
        /*     */
        /*     */
        try {
            /*  74 */
            servletOutputStream = response.getOutputStream();
            /*     */
            /*  76 */
            response.reset();
            /*  77 */
            response.setContentType("application/x-download;charset=GBK");
            /*  78 */
            response.setHeader("Content-Disposition", "attachment;filename=" + new String(fileName.getBytes("utf-8"), "iso-8859-1"));
            /*     */
            /*  80 */
            File f = new File(rootPath + fileName);
            /*  81 */
            is = new FileInputStream(f);
            /*  82 */
            if (is == null) {
                /*  83 */
                logger.error("下载附件失败，请检查文件“" + fileName + "”是否存在");
                /*  84 */
                return ResultUtil.error("下载附件失败，请检查文件“" + fileName + "”是否存在");
                /*     */
            }
            /*     */
            /*  87 */
            IOUtils.copy(is, (OutputStream) response.getOutputStream());
            /*  88 */
            response.getOutputStream().flush();
            /*  89 */
        } catch (IOException e) {
            /*  90 */
            return ResultUtil.error("下载附件失败,error:" + e.getMessage());
            /*     */
        } finally {
            /*     */
            /*     */
            /*     */
            try {
                /*     */
                /*  96 */
                if (is != null) {
                    /*  97 */
                    is.close();
                    /*     */
                }
                /*  99 */
            } catch (IOException e) {
                /* 100 */
                logger.error(ExceptionUtils.getFullStackTrace(e));
                /*     */
            }
            /*     */
            try {
                /* 103 */
                if (servletOutputStream != null) {
                    /* 104 */
                    servletOutputStream.close();
                    /*     */
                }
                /* 106 */
            } catch (IOException e) {
                /* 107 */
                logger.error(ExceptionUtils.getFullStackTrace(e));
                /*     */
            }
            /*     */
        }
        /* 110 */
        return null;
        /*     */
    }
    /*     */
}


/* Location:              C:\Users\Administrator\Desktop\gov1\WEB-INF\classes\!\org\competition\control\FileController.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */