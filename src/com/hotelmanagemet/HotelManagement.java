package com.hotelmanagemet;
public class HotelManagement {
    private String typeAc;
    private String typeOfNonAc;
    private int price;
    private int bed;
    private String city;
    HotelManagement(String typeAc,String typeOfNonAc,int price,int bed,String city){
        this.typeAc=typeAc;
        this.typeOfNonAc=typeOfNonAc;
        this.price=price;
        this.bed=bed;
        this.city=city;
    }
    public String getTypeAc(){
        return typeAc;
    }
    public void setTypeAc(String typeAc){
        this.typeAc=typeAc;
    }
    public String getTypeOfNonAcAc(){
        return typeOfNonAc;
    }
    public void setTypeOfNonAcAc(String typeOfNonAc){
        this.typeOfNonAc=typeOfNonAc;
    }
    public int getPrice(){
        return price;
    }
    public void setPrice(int price){
        this.price=price;
    }
    public int getBed(){
        return bed;
    }
    public void setBed(int bed){
        this.bed=bed;
    }
    public String getCity(){
        return city;
    }
    public void setCity(String city){
        this.city=city;
    }
    public String toString(){
        return  "HotelManagement: typeAc : "+typeAc+ " typeOfNonAc : "+typeOfNonAc+ " Price : "+price+" Bed : "+bed+" City : "+city;
    }
}
