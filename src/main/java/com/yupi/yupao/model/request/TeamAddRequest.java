package com.yupi.yupao.model.request;

import lombok.Data;

import java.util.Date;

/**
 * 新增队伍请求体
 */
@Data
public class TeamAddRequest {

    /**
     * 队伍名称
     */
    private String name;

    /**
     * 描述
     */
    private String description;

    /**
     * 最大人数
     */
    private Integer maxNum;

    /**
     * 队伍头像
     */
    private String teamAvatarUrl;

    /**
     * 过期时间
     */
    private Date expireTime;

    /**
     * 队伍状态 0-公开，1-私有，2-加密
     */
    private Integer status;

    /**
     * 密码
     */
    private String password;


}
