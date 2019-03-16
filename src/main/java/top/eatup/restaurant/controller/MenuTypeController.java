package top.eatup.restaurant.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.eatup.restaurant.entity.MenuType;
import top.eatup.restaurant.mapper.MenuTypeMapper;

@RestController
public class MenuTypeController {

    @Autowired
    private MenuTypeMapper menuTypeMapper;

    @RequestMapping("/testMenuType")
    public MenuType testMenuType(String id) {
        System.out.println("###:" + id);
        return menuTypeMapper.findById(id);
    }

}
