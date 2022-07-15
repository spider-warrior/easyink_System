package com.easywecom.wecom.domain.dto.emplecode;

import com.easywecom.wecom.domain.WeEmpleCode;
import com.easywecom.wecom.domain.WeRedeemCodeWelcomeMsgAndMaterial;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * 类名：AddWeEmpleCodeDTO
 *
 * @author Society my sister Li
 * @date 2021-11-02 10:35
 */
@Data
@ApiModel("新增员工活码")
public class AddWeEmpleCodeDTO extends WeEmpleCode {

    @ApiModelProperty("是否自动通过好友")
    private Boolean isAutoPass;

    @ApiModelProperty("是否自动设置备注")
    private Boolean isAutoSetRemark;

    @ApiModelProperty("兑换码活动欢迎语及附件")
    private List<WeRedeemCodeWelcomeMsgAndMaterial> weRedeemCodeWelcomeMsgAndMaterialList;
}
