package top.eatup.restaurant.entity;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *   菜单类别
 */
public class MenuType {
    /**
     *   主键
     */
    @NotNull(message = "主键不能为空")
    @Size(min = 0, max = 32, message = "主键长度必须在{min}和{max}之间")
    private String id;

    /**
     *   菜单名称
     */
    @NotNull(message = "菜单名称不能为空")
    @Size(min = 0, max = 50, message = "菜单名称长度必须在{min}和{max}之间")
    private String name;

    /**
     *   菜单类别排序
     */
    private Integer sort;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }
}