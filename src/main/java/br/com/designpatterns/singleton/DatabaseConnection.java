package br.com.designpatterns.singleton;
public class DatabaseConnection{
 private static final DatabaseConnection INSTANCE=new DatabaseConnection();
 private DatabaseConnection(){}
 public static DatabaseConnection getInstance(){return INSTANCE;}
 public String connect(){return "Singleton connected";}
}