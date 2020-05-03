package com.moudles.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 日志表
 * </p>
 *
 * @author zhaohuan
 * @since 2020-05-03
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Log implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 自增唯一主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 操作用户
     */
    private Integer userId;

    /**
     * 操作内容
     */
    private String message;

    /**
     * 操作类型
     */
    private Integer type;

    /**
     * 操作时间
     */
    private Integer time;

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
