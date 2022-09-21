package services;

public interface OnlinePaymentService {

    double payment(double amount);
    double interest(double amount, int months);
}
