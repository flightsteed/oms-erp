package org.skyer.order.api.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 三方订单支付信息
 * @author zlb
 */
@Data
public class ThirdOrderPaymentInfoDTO {


    @ApiModelProperty("支付状态")
    @NotBlank(message = "支付状态不能为空")
    private String payStatus;

    @ApiModelProperty("支付类型")
    @NotBlank(message = "支付类型不能为空")
    private String payType;

    @ApiModelProperty("支付金额")
    @NotBlank(message = "支付金额不能为空")
    private BigDecimal payAmount;

    @ApiModelProperty("商品总金额")
    @NotBlank(message = "商品总金额不能为空")
    private BigDecimal goodsTotalAmount;

    @ApiModelProperty("商品总成本")
    @NotBlank(message = "商品总成本不能为空")
    private BigDecimal costTotalAmount;


    @ApiModelProperty("支付时间")
    @NotBlank(message = "支付时间不能为空")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date payTime;
}
