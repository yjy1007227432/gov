package org.competition.service;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.competition.domain.Dictvalue;
import org.competition.domain.DictvalueExample;
import org.competition.domain.DictvalueKV;
import org.competition.mapper.DictvalueMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;
import java.util.stream.Collectors;

@Component
@RestController
@RequestMapping({"/gov/dictvalue"})
@CrossOrigin(allowCredentials = "true", allowedHeaders = {"*"})
public class DictvalueService {

    @Autowired
    private DictvalueMapper dictvalueMapper;

    public static final Logger LOGGER = LogManager.getLogger(DictvalueService.class);

    @RequestMapping({"/findKV"})
    public ArrayList<DictvalueKV> selectKeyValue(String table_name, String column_name) {

        List<Dictvalue> dictvalues = null;
        try {
            dictvalues = this.dictvalueMapper.selectByExample(null);
        } catch (Exception e) {
            LOGGER.error("newsMapper.selectByExample查询数据失败", e);
        }
        ArrayList<DictvalueKV> result = new ArrayList<>();
        for (Dictvalue dictvalue : dictvalues) {
            if (Objects.equals(dictvalue.getTableName(), table_name) && Objects.equals(dictvalue.getColumnName(), column_name)) {
                DictvalueKV dictvalueKV = new DictvalueKV().setKey(dictvalue.getKey())
                        .setValue(dictvalue.getValue());
                result.add(dictvalueKV);
            }
        }
        return result;
    }

    @RequestMapping({"/delete"})
    public int deleteDictvalueById(int id) {
        int result = 0;
        try {
            result = this.dictvalueMapper.deleteByPrimaryKey(Integer.valueOf(id));
        } catch (Exception e) {
            LOGGER.error("dictvalueMapper.deleteByPrimaryKey 删除数据失败", e);
        }
        if (Objects.equals(Integer.valueOf(result), Integer.valueOf(0))) {
            LOGGER.error("无法删除不存在的数据");
        }
        return result;
    }

    @RequestMapping({"/find"})
    public Dictvalue findDicctvalueById(int id) {
        Dictvalue dictvalue = null;
        try {
            dictvalue = this.dictvalueMapper.selectByPrimaryKey(Integer.valueOf(id));
        } catch (Exception e) {
            LOGGER.error("productMapper.selectByPrimaryKey 查询数据失败", e);
        }
        if (Objects.equals(dictvalue, null)) {
            LOGGER.error("查询结果为空");
        }
        return dictvalue;
    }

    public List<String> vpsValue(String type, List<Integer> values){

        DictvalueExample dictvalueExample = new DictvalueExample();
        DictvalueExample.Criteria criterion = dictvalueExample.createCriteria();
        criterion.andColumnNameEqualTo(type);



        if (values!=null&&values.size()>0) {
            criterion.andKeyIn(values);
        }else {
            return new ArrayList<>();
        }

        List<Dictvalue> dictvalues = dictvalueMapper.selectByExample(dictvalueExample);

        Map<Integer,String> map = dictvalues.stream().collect(Collectors.toMap(Dictvalue::getKey, Dictvalue::getValue));

        List<String> resultValues = new ArrayList<>();

        values.stream().forEach(x->{
            resultValues.add(map.get(x));
        });


        return resultValues;


    }




}
