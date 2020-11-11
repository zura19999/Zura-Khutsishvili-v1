package ge.edu.btu.currency.service.impl;
import ge.edu.btu.currency.service.CurrencyService;
import org.apache.log4j.Logger;

public class CurrencyServiceImpl implements CurrencyService {
    final static Logger Logger = org.apache.log4j.Logger.getLogger(CurrencyServiceImpl.class);

    int exchangeRate;

    public CurrencyServiceImpl() {
    }

    @Override
    public int convert(int amount) {
        Logger.info("კონვერტაცია შესრულდა");
        return amount/exchangeRate;
    }

    @Override
    public double convert(double amount) {
        Logger.info("კონვერტაცია შესრულდა");
        return amount/exchangeRate;
    }

    @Override
    public void setExchangeRate(int exchangeRate) {
        this.exchangeRate = exchangeRate;
    }
}