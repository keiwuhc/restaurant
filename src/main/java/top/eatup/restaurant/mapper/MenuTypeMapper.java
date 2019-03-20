package top.eatup.restaurant.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import top.eatup.restaurant.entity.MenuType;
import top.eatup.restaurant.entity.MenuTypeExample;

public interface MenuTypeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_menu_type
     *
     * @mbg.generated Wed Mar 20 21:25:38 CST 2019
     */
    long countByExample(MenuTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_menu_type
     *
     * @mbg.generated Wed Mar 20 21:25:38 CST 2019
     */
    int deleteByExample(MenuTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_menu_type
     *
     * @mbg.generated Wed Mar 20 21:25:38 CST 2019
     */
    int insert(MenuType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_menu_type
     *
     * @mbg.generated Wed Mar 20 21:25:38 CST 2019
     */
    int insertSelective(MenuType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_menu_type
     *
     * @mbg.generated Wed Mar 20 21:25:38 CST 2019
     */
    List<MenuType> selectByExample(MenuTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_menu_type
     *
     * @mbg.generated Wed Mar 20 21:25:38 CST 2019
     */
    int updateByExampleSelective(@Param("record") MenuType record, @Param("example") MenuTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_menu_type
     *
     * @mbg.generated Wed Mar 20 21:25:38 CST 2019
     */
    int updateByExample(@Param("record") MenuType record, @Param("example") MenuTypeExample example);
}