package com.lemonpay.lemonpayvas.electricity.ekedc.responsedto;

import lombok.Data;

@Data
public class EkoProcessResponse {

    private String code;
    private String response_description;
    private String requestId;
    private Double amount;
    private String transaction_date;
    private String customerName;
    private String customerAddress;
    private String mainToken;
    private String mainTokenDescription;
    private String mainTokenUnits;
    private String mainTokenTax;
    private String mainsTokenAmount;
    private String bonusToken;
    private String bonusTokenDescription;
    private String bonusTokenUnits;
    private String bonusTokenTax;
    private String bonusTokenAmount;
    private String tariffIndex;
    private String debtTariff;
    private String debtAmount;
    private String debtDescription;
    private String purchased_code;
    private String exchangeReference;
    private String arrearsBalance;
    private String appliedToArrears;
    private String wallet;
    private Double vat;
    private String invoiceNumber;
    private String appliedToWallet;
    private Double units;
    private String token;
    private String kct1;
    private String kct2;
    private ProcessContent content;
}
