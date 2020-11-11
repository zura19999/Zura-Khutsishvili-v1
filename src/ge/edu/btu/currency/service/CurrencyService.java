package ge.edu.btu.currency.service;

public interface CurrencyService {
    int convert(int amount);
    double convert(double amount);
    void setExchangeRate(int value);
}