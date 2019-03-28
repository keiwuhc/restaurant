package top.eatup.restaurant.entity;

import javax.validation.constraints.NotNull;

/**
 *   菜单类别
 */
public class MenuType {
    /**
     *   主键
     */
    @NotNull
    private String id;

    /**
     *   菜单名称
     */
    @NotNull
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