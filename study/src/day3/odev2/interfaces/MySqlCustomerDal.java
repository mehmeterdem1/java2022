package day3.odev2.interfaces;

public class MySqlCustomerDal extends OracleCustomerDal implements ICustomerDal, IRepository {
    @Override
    public void Add() {
        System.out.println("My sql eklendi");
    }
}
