package br.com.designpatterns.observer;
import java.util.*;
public class NewsAgency implements Subject{
 List<Observer> obs=new ArrayList<>();
 public void add(Observer o){obs.add(o);}
 public void notifyAllObservers(String n){for(Observer o:obs)o.update(n);}
}