package com.blacksteel.deneb.character.model;

import java.util.Objects;

/**
 * Based on Item class.
 *
 * @see com.blacksteel.deneb.item.model.Item
 */
public class ItemVo {

    private Long id;
    private String name;

    public ItemVo(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ItemVo itemVo = (ItemVo) o;
        return Objects.equals(id, itemVo.id) &&
                Objects.equals(name, itemVo.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ItemVo{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
