package org.competition.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.competition.domain.Dictvalue;
import org.competition.domain.DictvalueExample;

public interface DictvalueMapper {
    int countByExample(DictvalueExample example);

    int deleteByExample(DictvalueExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Dictvalue record);

    int insertSelective(Dictvalue record);

    List<Dictvalue> selectByExample(DictvalueExample example);

    List<Dictvalue> selectByDictvalue(Dictvalue dictvalue);

    Dictvalue selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Dictvalue record, @Param("example") DictvalueExample example);

    int updateByExample(@Param("record") Dictvalue record, @Param("example") DictvalueExample example);

    int updateByPrimaryKeySelective(Dictvalue record);

    int updateByPrimaryKey(Dictvalue record);
}