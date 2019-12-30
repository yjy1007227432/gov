package org.competition.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.competition.domain.Product;
import org.competition.domain.Solution;
import org.competition.mapper.SolutionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@Component
@RestController
@RequestMapping("/gov/solution")
@CrossOrigin
public class SolutionService {

    public static final Logger LOGGER = LogManager.getLogger(SolutionService.class);

    @Autowired
    private SolutionMapper solutionMapper;

    @GetMapping(value = "/add")
    public int addSolution(String name, String content, String createUser){
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
    public int updateByPrimaryKeySelective(String name,String content,String updateUser,int id){
        Solution solution = new Solution().setName(name).setContent(content).
                setUpdateUser(updateUser).setId(id);
        int result = 0;
        try {
            result = solutionMapper.updateByPrimaryKey(solution);
        } catch (Exception e) {
            LOGGER.error("solutionMapper.updateByPrimaryKey 更新数据失败", e);
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
        return solution;
    }

}
