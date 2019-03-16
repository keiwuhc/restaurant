package top.eatup.restaurant.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import top.eatup.restaurant.entity.MenuType;

@Mapper
public interface MenuTypeMapper {

    @Select("SELECT * FROM T_MENU_TYPE WHERE ID = #{id}")
    public MenuType findById(@Param("id") String id);

}
