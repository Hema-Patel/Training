package com.mindsprint.project1;
interface Paypal{
    public void paypal();
}
interface RazorPay{
    public void pay();
}
class PayPalImpt implements Paypal{
    @Override
    public void pay()
    {
        System.out.println("Pay Implemnt");
    }
}
public class Payment {
}
