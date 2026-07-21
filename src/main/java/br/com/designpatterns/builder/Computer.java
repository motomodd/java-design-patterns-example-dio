package br.com.designpatterns.builder;
public class Computer{
 String cpu,ram;
 Computer(String c,String r){cpu=c;ram=r;}
 public String toString(){return cpu+" "+ram;}
}