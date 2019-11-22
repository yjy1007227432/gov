package org.competition.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.competition.bean.Information;
import org.competition.bean.Strategy;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
public interface StrategyMapper {

    void pvIncrement(Long aid);

    List<Strategy> getStrategyByState(@Param("state") Integer state, @Param("start") Integer start, @Param("count") Integer count, @Param("uid") Long uid, @Param("keywords") String keywords);

    int deleteStrategyById(Long[] aids);

    int updateStrategyState(Long[] aids, int i);

    Strategy getStrategyById(Long aid);

    int getStrategyCountByState(Integer state, Long uid, String keywords);

    void pvStatisticsPerDay();

    int updateStrategy(Strategy information);

    int addNewStrategy(Strategy information);

    List<String> getCategories(Long id);

    List<Integer> getDataStatistics(Long uid);

    List<Strategy> getStrategyByStateByAdmin(int start, Integer count, String keywords);
}
