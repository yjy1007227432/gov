package org.competition.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.competition.domain.News;
import org.competition.mapper.NewsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;
import sun.security.jca.GetInstance;

import java.net.URLDecoder;
import java.time.Instant;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@Component
@RestController
@RequestMapping("/gov/news")
@CrossOrigin(allowCredentials = "true", allowedHeaders = "*")
public class NewsService {

    public static final Logger LOGGER = LogManager.getLogger(NewsService.class);

    @Autowired
    private NewsMapper newsMapper;

    @GetMapping(value = "/add")
    public int addNews(@RequestParam(required=false) String title, @RequestParam(required=false) String content, @RequestParam(required=false) String createUser) {
        title = URLDecoder.decode(title);
        content = URLDecoder.decode(content);
        createUser = URLDecoder.decode(createUser);
        News news = new News();
        news.setContent(content).setCreateUser(createUser).setTitle(title).setCreateTime(Date.from(Instant.now()));
        int result = 0;
        try {
            result = newsMapper.insert(news);
        } catch (Exception e) {
            LOGGER.error("newsMapper.insert插入数据失败", e);
        }
        return result;
    }

    @GetMapping(value = "/update")
    public int updateNews(@RequestParam(required=false) String title,@RequestParam(required=false) String content,@RequestParam(required=false)  String updateUser, int id) {
        title = URLDecoder.decode(title);
        content = URLDecoder.decode(content);
        updateUser = URLDecoder.decode(updateUser);
        News news = new News();
        news.setContent(content).setUpdateUser(updateUser).setTitle(title).setId(id).setUpdateTime(Date.from(Instant.now()));
        int result = 0;
        try {
            result = newsMapper.updateByPrimaryKeySelective(news);
        } catch (Exception e) {
            LOGGER.error("newsMapper.updateByPrimaryKey更新数据失败", e);
        }
        if(Objects.equals(result,0)){
            LOGGER.error("无法查询到需要更新的数据");
        }
        return result;
    }

    @GetMapping(value = "/delete")
    public int deleteNewsById(int id) {
        int result = 0;
        try {
            result = newsMapper.deleteByPrimaryKey(id);
        } catch (Exception e) {
            LOGGER.error("newsMapper.deleteByPrimaryKey删除数据失败", e);
        }
        if(Objects.equals(result,0)){
            LOGGER.error("无法删除不存在的数据");
        }
        return result;
    }

    @GetMapping(value = "/list")
    public List<News> ListNews() {
        List<News> newsList = null;
        try {
            newsList = newsMapper.selectByExample(null);
        } catch (Exception e) {
            LOGGER.error("newsMapper.selectByExample查询数据失败", e);
        }
        return newsList;
    }

    @GetMapping(value = "/find")
    public News findNewsById(int id) {
        News news = null;
        try {
            news = newsMapper.selectByPrimaryKey(id);
        } catch (Exception e) {
            LOGGER.error("newsMapper.selectByExample查询数据失败", e);
        }
        if(Objects.equals(news,null)){
            LOGGER.error("查询结果为空");
        }
        return news;
    }

}
