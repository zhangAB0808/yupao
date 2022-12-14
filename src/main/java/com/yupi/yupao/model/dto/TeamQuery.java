package com.yupi.yupao.model.dto;

import com.yupi.yupao.common.PageRequest;
import lombok.Data;

import java.util.List;

/**
 * 队伍查询封装类
 */
@Data
public class TeamQuery extends PageRequest {
    /**
     * id
     */
    private Long id;

    /**
     * 根据teamId列表查询
     */
    private List<Long> idList;

    /**
     * 搜索关键词 （同时对队伍名称和描述搜索）
     */
    private String searchText;

    /**
     * 队伍名称
     */
    private String name;

    /**
     * 描述
     */
    private String description;

    /**
     * 队伍头像
     */
    private String teamAvatarUrl;

    /**
     * 最大人数
     */
    private Integer maxNum;

    /**
     * 用户id
     */
    private Long userId;

    /**
     * 队伍状态 0-公开，1-私有，2-加密
     */
    private Integer status;


}
