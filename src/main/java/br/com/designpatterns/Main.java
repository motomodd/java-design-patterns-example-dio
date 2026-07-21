package br.com.designpatterns;
import br.com.designpatterns.factory.*;
import br.com.designpatterns.singleton.*;
public class Main{
 public static void main(String[] args){
  System.out.println(DatabaseConnection.getInstance().connect());
  Animal a=AnimalFactory.create("dog");
  System.out.println(a.speak());
 }
}