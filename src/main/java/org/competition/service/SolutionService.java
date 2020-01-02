package org.competition.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.competition.domain.Product;
import org.competition.domain.Solution;
import org.competition.mapper.SolutionMapper;
import org.omg.PortableInterceptor.INACTIVE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.net.URLDecoder;
import java.time.Instant;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@Component
@RestController
@RequestMapping("/gov/solution")
@CrossOrigin(allowCredentials = "true", allowedHeaders = "*")
public class SolutionService {

    public static final Logger LOGGER = LogManager.getLogger(SolutionService.class);

    @Autowired
    private SolutionMapper solutionMapper;

    @GetMapping(value = "/add")
    public int addSolution(@RequestParam(required=false) String name, @RequestParam(required=false) String content, @RequestParam(required=false) String createUser){
        name = URLDecoder.decode(name);
        content = URLDecoder.decode(content);
        createUser = URLDecoder.decode(createUser);
        Solution solution = new Solution().setName(name).setContent(content).
                setCreateUser(createUser).setCreateTime(Date.from(Instant.now()));
        int result = 0;
        try {
            result = solutionMapper.insert(solution);
        } catch (Exception e) {
            LOGGER.error("solutionMapper.insert 插入数据失败", e);
        }
        return result;
    }

    @GetMapping(value = "/update")
    public int updateSolution(@RequestParam(required=false) String name,@RequestParam(required=false) String content,@RequestParam(required=false) String updateUser,Integer id){
        name = URLDecoder.decode(name);
        content = URLDecoder.decode(content);
        updateUser = URLDecoder.decode(updateUser);
        Solution solution = new Solution().setName(name).setContent(content).
                setUpdateUser(updateUser).setId(id).setUpdateTime(Date.from(Instant.now()));
        int result = 0;
        try {
            result = solutionMapper.updateByPrimaryKeySelective(solution);
        } catch (Exception e) {
            LOGGER.error("solutionMapper.updateByPrimaryKeySelective 更新数据失败", e);
        }
        if(Objects.equals(result,0)){
            LOGGER.error("无法查询到需要更新的数据");
        }
        return result;
    }

    @GetMapping(value = "/delete")
    public int deleteSolutionById(int id){
        int result = 0;
        try {
            result = solutionMapper.deleteByPrimaryKey(id);
        } catch (Exception e) {
            LOGGER.error("solutionMapper.deleteByPrimaryKey 删除数据失败", e);
        }
        if(Objects.equals(result,0)){
            LOGGER.error("无法删除不存在的数据");
        }
        return result;

    }

    @GetMapping(value = "/list")
    public List<Solution> ListSolution(){
        List<Solution> solutionList = null;
        try {
            solutionList = solutionMapper.selectByExample(null);
        } catch (Exception e) {
            LOGGER.error("solutionMapper.selectByExample 查询数据失败", e);
        }
        return solutionList;
    }

    @GetMapping(value = "/find")
    public Solution findSolutionById(int id){
        Solution solution = null;
        try {
            solution = solutionMapper.selectByPrimaryKey(id);
        } catch (Exception e) {
            LOGGER.error("solutionMapper.selectByPrimaryKey 查询数据失败", e);
        }
        if(Objects.equals(solution,null)){
            LOGGER.error("查询结果为空");
        }
        return solution;
    }

}
