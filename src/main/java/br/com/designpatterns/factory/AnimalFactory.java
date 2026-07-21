package br.com.designpatterns.factory;
public class AnimalFactory{
 public static Animal create(String t){
  if("dog".equalsIgnoreCase(t)) return new Dog();
  return new Cat();
 }
}