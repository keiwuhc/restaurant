package top.eatup.restaurant.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import top.eatup.restaurant.entity.MenuType;
import top.eatup.restaurant.entity.MenuTypeExample;

public interface MenuTypeMapper {
    long countByExample(MenuTypeExample example);

    int deleteByExample(MenuTypeExample example);

    int deleteByPrimaryKey(String id);

    int insert(MenuType record);

    int insertSelective(MenuType record);

    List<MenuType> selectByExample(MenuTypeExample example);

    MenuType selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") MenuType record, @Param("example") MenuTypeExample example);

    int updateByExample(@Param("record") MenuType record, @Param("example") MenuTypeExample example);

    int updateByPrimaryKeySelective(MenuType record);

    int updateByPrimaryKey(MenuType record);
}