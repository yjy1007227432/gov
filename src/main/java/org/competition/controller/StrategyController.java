package org.competition.controller;
import org.competition.bean.Strategy;
import org.competition.bean.Information;
import org.competition.bean.RespBean;
import org.competition.service.InformationService;
import org.competition.service.StrategyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 策略信息controller
 */
@RestController
@RequestMapping("/strategy")
public class StrategyController {
    @Autowired
    StrategyService strategyService;

    @RequestMapping(value = "/strategy/add",method = RequestMethod.POST)
    public RespBean addNewStrategy(Strategy strategy){
        int result = strategyService.addNewStrategy(strategy);
        if (result == 1) {
            return new RespBean("success", strategy.getId() + "");
        } else {
            return new RespBean("error", strategy.getState() == 0 ? "竞争信息保存失败!" : "竞争信息发表失败!");
        }
    }

}
