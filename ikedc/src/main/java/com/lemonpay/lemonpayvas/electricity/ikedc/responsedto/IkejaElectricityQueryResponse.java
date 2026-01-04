package com.lemonpay.lemonpayvas.electricity.ikedc.responsedto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class IkejaElectricityQueryResponse {

    private String code;
    private String response_description;
    private QueryContent content;
}
