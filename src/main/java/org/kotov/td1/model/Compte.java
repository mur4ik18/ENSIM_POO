package org.kotov.td1.model;

import java.util.ArrayList;

public class Compte {
    private String numero;
    private double solde;

    private Client client;


    public Compte(String numero, double solde, Client client) {
        this.numero = numero;
        this.solde = solde;
        this.client = client;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public Client getClient() {
        return client;
    }

    public String toString() {
        return "Compte [numero=" + numero + ", solde=" + solde + ", client=" + getClient().toString() + "]";
    }
}
