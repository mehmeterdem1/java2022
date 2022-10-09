package day3.odev2.interfaces;

public class OracleCustomerDal implements ICustomerDal{
    @Override
    public void Add() {
        System.out.println("Oracle eklendi");
    }
}
