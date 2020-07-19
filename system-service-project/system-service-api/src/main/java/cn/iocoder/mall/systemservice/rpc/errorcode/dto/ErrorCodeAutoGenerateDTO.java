package cn.iocoder.mall.systemservice.rpc.errorcode.dto;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@Accessors(chain = true)
public class ErrorCodeAutoGenerateDTO implements Serializable {

    /**
     * 错误码编码
     */
    private Integer code;
    /**
     * 错误码错误提示
     */
    private String message;
    /**
     * 错误码分组
     */
    private String group;

}
