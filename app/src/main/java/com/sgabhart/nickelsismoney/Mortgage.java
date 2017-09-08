package com.sgabhart.nickelsismoney;

/**
 * Created by Admin on 9/8/2017.
 */

import java.text.DecimalFormat;

public class Mortgage {
    public final DecimalFormat MONEY = new DecimalFormat("#,##0.00");

    private float amount, rate;
    private int years;

    public Mortgage(){
        setAmount(100000.0f);
        setYears(30);
        setRate(0.035f);
    } // constructor

    public void setAmount(float newAmount){
        if (newAmount >= 0) amount = newAmount;
    } // setAmount

    public void setYears(int newYears) {
        if(newYears >= 0) years = newYears;
    } // setYears

    public void setRate(float newRate) {
        if(newRate >= 0) rate = newRate;
    } // setRate

    public float getAmount() {
        return amount;
    } // getAmount

    public String getFormattedAmount(){
        return MONEY.format(amount);
    } // formatted

    public int getYears(){
        return years;
    } // getYears

    public float getRate(){
        return rate;
    } // getRate

    public float monthlyPayment(){
        float mRate = rate / 12;
        double temp = Math.pow(1 / 1 + mRate, years * 12);
        return amount * mRate / (float)(1 - temp);
    } // monthlyPayment

    public String formattedMonthly() {
        return MONEY.format(monthlyPayment());
    } // formattedMonthly

    public float totalPayment(){
        return  monthlyPayment() * years * 12;
    } // totalPayment

    public String formattedTotal(){
        return MONEY.format(totalPayment());
    } // formattedTotal
}
