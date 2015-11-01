package com.msgSystem.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by yh on 2015/11/1.
 */
@Entity(name = "GroupMember")
@Table(name = "tb_group_member")
public class GroupMember {
    private int id;
    private int user_id;
    private int group_id;
    private int state;
    private String join_date;

    @Id
    @GeneratedValue
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getGroup_id() {
        return group_id;
    }

    public void setGroup_id(int group_id) {
        this.group_id = group_id;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getJoin_date() {
        return join_date;
    }

    public void setJoin_date(String join_date) {
        this.join_date = join_date;
    }

    @Override
    public String toString() {
        return "GroupMember{" +
                "id=" + id +
                ", user_id=" + user_id +
                ", group_id=" + group_id +
                ", state=" + state +
                ", join_date='" + join_date + '\'' +
                '}';
    }
}
