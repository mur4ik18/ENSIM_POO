package org.kotov.td1.model;

public class Client {
    private String nom;
    private String prenom;

    public Client(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String toString() {
        return "Client [nom=" + nom + ", prenom=" + prenom + "]";
    }
}
