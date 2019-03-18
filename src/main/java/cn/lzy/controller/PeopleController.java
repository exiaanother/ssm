package cn.lzy.controller;

import cn.lzy.pojo.People;
import cn.lzy.service.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;
@Controller
public class PeopleController {
    private final PeopleService peopleService;
    @Autowired
    public PeopleController(PeopleService peopleService) {
        System.out.println("-------------1111111111111-------------PeopleAction构造函数");
        this.peopleService = peopleService;
    }



    @RequestMapping(value = "/selectPeople", method = RequestMethod.GET)
    public String selectUser(ModelMap modelMap) {
        System.out.println("UserAction -------------------------- selectUser");

//        List<People> list = new ArrayList<>();
//        People people = new People();
//        people.setName("kkk");
//        people.setId(3330);
//        list.add(people);
//
//        people = new People();
//        people.setName("jjj");
//        people.setId(4440);
//        list.add(people);
//
//        people = new People();
//        people.setName("iii");
//        people.setId(5550);
//        list.add(people);

        try {
            List<People> list = peopleService.selectPeople();
            System.out.println(list);
        } catch (Exception e) {
            System.out.println("---------------------------------------------------sql出错");
            e.printStackTrace();
        }

//        userService.updateUser(user);
//        modelMap.addAttribute("list_user", "en~~~");
        return "success";
    }
}
