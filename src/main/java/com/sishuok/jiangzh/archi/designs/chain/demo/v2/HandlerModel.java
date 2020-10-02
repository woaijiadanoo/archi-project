package com.sishuok.jiangzh.archi.designs.chain.demo.v2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class HandlerModel {

    private String handlerType;

    // 业务属性
    private String userName;
    private double fee;

}
