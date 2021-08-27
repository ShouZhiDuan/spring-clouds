package com.clouds.dsz.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @Auther: ShouZhi@Duan
 * @Description: 消息数据
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MessageDTO<T> {
    /**
     * 消息ID
     */
    private int msgId;
    /**
     * 发送时间
     */
    private Date tm;
    /**
     * 消息内容
     */
    private T payLoad;
}
