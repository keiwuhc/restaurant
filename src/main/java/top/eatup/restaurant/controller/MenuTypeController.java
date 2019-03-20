package top.eatup.restaurant.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.eatup.restaurant.entity.MenuType;
import top.eatup.restaurant.entity.MenuTypeExample;
import top.eatup.restaurant.mapper.MenuTypeMapper;

import java.util.List;

@RestController
public class MenuTypeController {

    @Autowired
    private MenuTypeMapper menuTypeMapper;

    @RequestMapping("/testMenuType")
    public List<MenuType> testMenuType(String id) {
        System.out.println("###:" + id);
        System.out.println("@@@:" + menuTypeMapper);
        MenuTypeExample mte = new MenuTypeExample();
        mte.createCriteria().andIdEqualTo("dsafdsafdsafdsafd");
        return menuTypeMapper.selectByExample(mte);
    }

}
