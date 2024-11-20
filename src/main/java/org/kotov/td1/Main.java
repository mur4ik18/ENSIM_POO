package org.kotov.td1;

import org.kotov.td1.model.Client;
import org.kotov.td1.model.Compte;
import org.kotov.td1.service.BanqueService;
import com.google.gson.Gson;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Compte> comptes = new ArrayList<Compte>();

        Client client = new Client("Kotov", "Dmitry");
        Compte compte = new Compte("123456789", 1000, client);
        comptes.add(compte);
        Client client2 = new Client("Kotov", "Alexey");
        Compte compte2 = new Compte("987654321", 2000, client2);
        comptes.add(compte2);
        Client client3 = new Client("Kotov", "Pavel");
        Compte compte3 = new Compte("123456789", 100, client3);
        comptes.add(compte3);
        Client client4 = new Client("Kotov", "Vladimir");
        Compte compte4 = new Compte("123456789", 500, client4);
        comptes.add(compte4);

        // ask user to enter the name
        for (Compte c : comptes) {
            System.out.println(c);
        }

        System.out.println("Sorted by solde:");
        BanqueService banqueService = new BanqueService();
        ArrayList<Compte> sortedComptes = banqueService.sortBySolde(comptes);

        for (Compte c : sortedComptes) {
            System.out.println(c);
        }

        // afficher json avec gson
        Gson gson = new Gson();
        String json = gson.toJson(comptes);
        System.out.println(json);
    }
}
