package pl.katarzynaskowronska.learning.classandobject;

public class Invoice {

//    public final static String COMPANY_NAME = "INVOICEX";
//
//    private double invoiceNetValue;
//    private double invoiceGrossValue;
//    private String invoiceDate;
//    private String invoiceNumber;
//
//    public String getInvoiceNumber() {
//        return invoiceNumber;
//    }
//
//    public void setInvoiceNumber(String invoiceNumber) {
//        this.invoiceNumber = invoiceNumber;
//    }
//
//
//    public double getInvoiceNetValue() {
//        return invoiceNetValue;
//    }
//
//    public void setInvoiceNetValue(double invoiceNetValue) {
//        this.invoiceNetValue = invoiceNetValue;
//    }
//
//    public double getInvoiceGrossValue() {
//        return invoiceGrossValue;
//    }
//
//    public void setInvoiceGrossValue(double invoiceGrossValue) {
//        this.invoiceGrossValue = invoiceGrossValue;
//    }
//
//    public String getInvoiceDate() {
//        return invoiceDate;
//    }
//
//    public void setInvoiceDate(String invoiceDate) {
//        this.invoiceDate = invoiceDate;
//    }
//
//    public void calculateTax() {
//        double tax = invoiceGrossValue/invoiceNetValue;
//        System.out.println("Wartość podatku: " + tax);
//
//    }

    public static double VAT = 0.19;
    public Invoice(Client client, int id, String date, int income){
        this.client = client;
        this.id = id;
        this.date = date;
        this.income = income;
    }

    private Client client;
    private int id;
    private String date;
    private int income;

    public double calculateTax(){
        return(0.19*income);
    }
    @Override
    public  String toString(){
        return super.toString();
    }
}
