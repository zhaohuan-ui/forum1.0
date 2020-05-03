package com.moudles.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 文章表
 * </p>
 *
 * @author zhaohuan
 * @since 2020-05-03
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Article implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 自增唯一主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 标题
     */
    private String title;

    /**
     * 内容
     */
    private String content;

    /**
     * 浏览量
     */
    private Integer views;

    /**
     * 作者
     */
    private Integer author;

    /**
     * 是否可见
     */
    private Integer visible;

    /**
     * 创建时间
     */
    private Integer createTime;

    /**
     * 发布时间
     */
    private Integer releaseTime;

    /**
     * 最新更新时间
     */
    private Integer updateTime;

    /**
     * 备用字段一
     */
    private String spare1;

    /**
     * 备用字段二
     */
    private String spare2;

    /**
     * 备用字段三
     */
    private String spare3;

    /**
     * 备用字段四
     */
    private Integer spare4;

    /**
     * 备用字段五
     */
    private Integer spare5;


}
