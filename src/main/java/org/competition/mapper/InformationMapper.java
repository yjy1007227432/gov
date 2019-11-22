package org.competition.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.competition.bean.Information;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
public interface InformationMapper {

    void pvIncrement(Long aid);

    List<Information> getInformationByStateByAdmin(@Param("start") int start, @Param("count") Integer count, @Param("keywords") String keywords);

    List<Information> getInformationByState(@Param("state") Integer state, @Param("start") Integer start, @Param("count") Integer count, @Param("uid") Long uid, @Param("keywords") String keywords);

    int deleteInformationById(Long[] aids);

    int updateInformationState(Long[] aids, int i);

    Information getInformationById(Long aid);

    int getInformationCountByState(Integer state, Long uid, String keywords);

    void pvStatisticsPerDay();

    int updateInformation(Information information);

    int addNewInformation(Information information);

    List<String> getCategories(Long id);

    List<Integer> getDataStatistics(Long uid);
}
