package ParkingLot.models;

import ParkingLot.models.enums.PaymentMode;
import ParkingLot.models.enums.PaymentStatus;

public class Payment extends BaseModel {
    private double amount;
    private PaymentMode paymentMode;
    private PaymentStatus paymentStatus;
    private String refNo;

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public PaymentMode getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(PaymentMode paymentMode) {
        this.paymentMode = paymentMode;
    }

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public String getRefNo() {
        return refNo;
    }

    public void setRefNo(String refNo) {
        this.refNo = refNo;
    }
}
