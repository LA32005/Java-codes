/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrayclass;

/**
 *
 * @author louis
 */
public class Product {
    String nameprod;
    double price_prod;
    int id_prod;
    
    public void setProdname(String prodname){
        nameprod=prodname;
    }
    public void setprodprice(double prodprice){
        price_prod = prodprice;
    }
    public void setprod_id(int prod_id){
        id_prod = prod_id;
    }
    public String getProdname(){
        return nameprod;
    }
    public double getprodprice(){
        return price_prod;
    }
    public int getprod_id(){
        return id_prod;
    }
}
