package model;

import java.io.Serializable;

public class CD implements Serializable{
    private static final long serialVersionUID = -5083759422249745403L;
    private String cdName;
    private int cdYear;
    private int cdId;
   public static int x=0;
    private int cdQuantity;
    private double cdPrice;
    private String cdCategory;
    private String cdAuthor;
    private long cdUPC;


    public CD() {
        this("","",0,0,0,0,"",x++);
    }

    public CD(String cdName,String cdCategory,double cdPrice,int Year,int cdQuantity,long cdUPC,String cdAuthor,int id){
        super();
        this.cdId = id;
        this.cdAuthor = cdAuthor;
        this.cdName = cdName;
        this.cdCategory = cdCategory;
        this.cdPrice = cdPrice;
        this.cdYear = Year;
        this.cdQuantity = cdQuantity;
        this.cdUPC = cdUPC;
    }



    public String getCdName(){
        return cdName;
    }

    public String getCdAuthor(){
        return cdAuthor;
    }

    public String getCdCategory(){
        return cdCategory;
    }

    public int getCdId(){
        return cdId;
    }

    public double getCdPrice(){
        return cdPrice;
    }
    public int getCdQuantity(){
        return cdQuantity;
    }
    public int getCdYear(){
        return cdYear;
    }
   public long getCdUPC(){return  cdUPC;}

    public void setCdName(String name){
        this.cdName = name;
    }

    public void setcdId(int id){
        this.cdId = id;
    }
   public void setCdAuthor(String name){
        this.cdAuthor = name;
    }

    public void setCdYear(int Year){
        this.cdYear = Year;
    }

    public void setCdUPC(long upc){
        this.cdUPC = upc;
    }

    public void setCdQuantity(int quantity) {
	    if (quantity < 0) {
	        throw new IllegalArgumentException("Quantity must be a positive number");
	    }else {
	    this.cdQuantity = quantity;}
	    
	}

    
    public void setCdPrice(double price) {
        if (price < 0) {
            throw new IllegalArgumentException("Price must be a positive number");
        }else {
        this.cdPrice = price;}
    }

    public void setCdCategory(String cat){
        this.cdCategory = cat;
    }

}
