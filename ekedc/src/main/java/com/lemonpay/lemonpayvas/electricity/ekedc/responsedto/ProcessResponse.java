package com.lemonpay.lemonpayvas.electricity.ekedc.responsedto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProcessResponse {

    private String code;
    private ProcessContent content;
    private String response_description;
    private CommissionDetails commission_details;
    private String customerName;
    private String customerAddress;
    private String requestId;
    private Double amount;
    private String transaction_date;
    private String purchased_code;
    private String exchangeReference;
    private String arrearsBalance;
    private String appliedToArrears;
    private String wallet;
    private Double vat;
    private Double debtAmount;
    private Double taxAmount;
    private String invoiceNumber;
    private String appliedToWallet;
    private Double units;
    private String token;
    private Double balance;
    private String kct1;
    private String kct2;
    private double penalty;
    private double administrativeCharge;
    private double meterServiceCharge;
    private double reconnectionFee;
    private double installationFee;
    private double tariffBaseRate;
    private double lossOfRevenue;
    private double currentCharge;
    private double meterCoset;
    private double costOfUnit;
    private Double fixedCharge;
    private double fixChargeAmount;

}
