package com.moudles.user.VO;

import com.moudles.user.entity.User;

import java.io.Serializable;
import java.util.List;

public class SessionInfo implements Serializable {
    private User user ;
    private String authority;
    private List<String> departs;

    public User getUser() {
        return this.user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getAuthority() {
        return this.authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }

    public List<String> getDeparts() {
        return this.departs;
    }

    public void setDeparts(List<String> departs) {
        this.departs = departs;
    }
}

