package br.com.designpatterns.builder;
public class ComputerBuilder{
 private String cpu,ram;
 public ComputerBuilder cpu(String c){cpu=c;return this;}
 public ComputerBuilder ram(String r){ram=r;return this;}
 public Computer build(){return new Computer(cpu,ram);}
}