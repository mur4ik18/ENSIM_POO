package org.kotov.td1.service;

import org.kotov.td1.model.Compte;

import java.util.ArrayList;
import java.util.Comparator;

public class BanqueService {


    // méthode sortBySolde qui prend en paramètre une liste de comptes et qui trie cette liste par solde croissant
    public ArrayList<Compte> sortBySolde(ArrayList<Compte> comptes) {
        comptes.sort(Comparator.comparing(Compte::getSolde));
        return comptes;
    }
}
