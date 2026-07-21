package br.com.designpatterns.strategy;
public class ShoppingCart{
 private PaymentStrategy s;
 public void setStrategy(PaymentStrategy s){this.s=s;}
 public String checkout(double v){return s.pay(v);}
}