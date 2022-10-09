package day3.odev2.interfaces;

public class MySqlServerDal implements ICustomerDal{
    @Override
    public void Add() {
        System.out.println("My Sql eklendi");
    }
}
