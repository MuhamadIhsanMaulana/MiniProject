package com.smkalihsan.javaminiproject.kredit;

public class kreditCard {
//    field
    private String kreditBCA, kreditMANDIRI, kreditBRI;
    private int noPinBCA, noPinMANDIRI, noPinBRI;
    private double saldoBCA, saldoMANDIRI, saldoBRI;
    private double bungaBCA, bungaMANDIRI, bungaBRI;

//    Constructor
    public kreditCard(String kreditBCA, String kreditMANDIRI, String kreditBRI, int noPinBCA, int noPinMANDIRI, int noPinBRI, double saldoBCA, double saldoMANDIRI, double saldoBRI, double bungaBCA, double bungaMANDIRI, double bungaBRI) {
        this.kreditBCA = kreditBCA;
        this.kreditMANDIRI = kreditMANDIRI;
        this.kreditBRI = kreditBRI;
        this.noPinBCA = noPinBCA;
        this.noPinMANDIRI = noPinMANDIRI;
        this.noPinBRI = noPinBRI;
        this.saldoBCA = saldoBCA;
        this.saldoMANDIRI = saldoMANDIRI;
        this.saldoBRI = saldoBRI;
        this.bungaBCA = bungaBCA;
        this.bungaMANDIRI = bungaMANDIRI;
        this.bungaBRI = bungaBRI;
    }

//    Method Declaration
//    BANK BCA
    public String getKreditBCA() { return kreditBCA; }
    public void setKStreditBCA(String kreditBCA) {this.kreditBCA = kreditBCA; }
    public int getNoPinBCA() { return noPinBCA; }
    public void setNoPinBCA(int noPinBCA) { this.noPinBCA = noPinBCA; }
    public double getSaldoBCA() { return saldoBCA; }
    public void setSaldoBCA(double saldoBCA) { this.saldoBCA = saldoBCA; }

//    BANK MANDIRI
    public String getKreditMANDIRI() { return kreditMANDIRI; }
    public void setKStreditMANDIRI(String kreditMANDIRI) {this.kreditMANDIRI = kreditMANDIRI; }
    public int getNoPinMANDIRI() { return noPinMANDIRI; }
    public void setNoPinMANDIRI(int noPinMANDIRI) { this.noPinMANDIRI = noPinMANDIRI; }
    public double getSaldoMANDIRI() { return saldoMANDIRI; }
    public void setSaldoMANDIRI(double saldoMANDIRI) { this.saldoMANDIRI = saldoMANDIRI; }

//    BANK BRI
    public String getKreditBRI() { return kreditBRI; }
    public void setKStreditBRI(String kreditBRI) {this.kreditBRI = kreditBRI; }
    public int getNoPinBRI() { return noPinBRI; }
    public void setNoPinBRI(int noPinBRI) { this.noPinBRI = noPinBRI; }
    public double getSaldoBRI() { return saldoBRI; }
    public void setSaldoBRI(double saldoBRI) { this.saldoBRI = saldoBRI; }


    public void BCA() {
        System.out.println(kreditBCA);
        System.out.println(noPinBCA);
        System.out.println(saldoBCA);
        System.out.println(bungaBCA);
    }

    public void MANDIRI() {
        System.out.println(kreditMANDIRI);
        System.out.println(noPinMANDIRI);
        System.out.println(saldoMANDIRI);
        System.out.println(bungaMANDIRI);
    }

    public void BRI() {
        System.out.println(kreditBRI);
        System.out.println(noPinMANDIRI);
        System.out.println(saldoBRI);
        System.out.println(bungaBRI);
    }
}
