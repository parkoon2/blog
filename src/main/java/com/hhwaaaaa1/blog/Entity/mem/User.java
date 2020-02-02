package com.hhwaaaaa1.blog.Entity.mem;

import com.hhwaaaaa1.blog.Entity.BaseEntity;

import javax.persistence.*;

@Entity
@Table(name = "TB_MEM_USER")
public class User extends BaseEntity {
    @Id
    @GeneratedValue(
            strategy = GenerationType.AUTO
    )
    @Column(name = "user_no", nullable = false)
    private long userNo;

    @Column(name = "user_id", length = 50, unique = true)
    private String userId;

    @Column(name = "user_nm", length = 50)
    private String userNm;

    @Column(name = "user_pwd", length = 100)
    private String userPwd;

    @Column(name = "email", length = 100)
    private String email;

    @Column(name = "hp", length = 20)
    private String hp;


    public long getUserNo() {
        return userNo;
    }

    public void setUserNo(long userNo) {
        this.userNo = userNo;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserNm() {
        return userNm;
    }

    public void setUserNm(String userNm) {
        this.userNm = userNm;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHp() {
        return hp;
    }

    public void setHp(String hp) {
        this.hp = hp;
    }
}
