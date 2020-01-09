package org.competition.control;

import com.alibaba.druid.util.StringUtils;
import org.competition.domain.User;
import org.competition.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@Controller
public class LoginController {

    @Autowired
    UserService userService;

    @RequestMapping("login")
    public String gologin()
    {
        return "login";
    }

    @PostMapping(value="/login")
    public String login(@RequestParam("username") String username, @RequestParam("password") String password, Map<String,Object> map,
                        HttpSession session){
        //验证用户名和密码，输入正确，跳转到dashboard
        List<User> userList = userService.findUserByPhone(username);
        if(userList==null){
            session.invalidate();
            map.put("msg","用户名密码错误");
            return "login";
        }
        if(Objects.equals(userList.size(),1)&&Objects.equals(userList.get(0).getPassword(),password)){
            session.setAttribute("userName",username);
            System.out.println("----" + username);
            map.put("age",30);
            return "redirect:/dashboard";
        }
        else  //输入错误，清空session，提示用户名密码错误
        {
            session.invalidate();
            map.put("msg","用户名密码错误");
            return "login";
        }
    }


    @RequestMapping("dashboard")
    public String goMain(Map<String,Object> map)
    {
        map.put("name","zhangfang");
        map.put("age",28);
        map.put("sex","女");
        return "dashboard";
    }
}

