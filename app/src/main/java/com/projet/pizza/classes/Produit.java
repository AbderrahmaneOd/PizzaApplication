package com.projet.pizza.classes;

public class Produit {

    private static int comp;
    private int id;
    private String nom;
    private int nbrIngredients;
    private int photo;
    private String durree;
    private String detailIngred;
    private String description;
    private String preparation;

    public Produit(String nom, int nbrIngredients, int photo, String durree, String detailIngred, String description, String preparation) {
        this.id = ++comp;
        this.nom = nom;
        this.nbrIngredients = nbrIngredients;
        this.photo = photo;
        this.durree = durree;
        this.detailIngred = detailIngred;
        this.description = description;
        this.preparation = preparation;
    }

    public static int getComp() {
        return comp;
    }

    public static void setComp(int comp) {
        Produit.comp = comp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNbrIngredients() {
        return nbrIngredients;
    }

    public void setNbrIngredients(int nbrIngredients) {
        this.nbrIngredients = nbrIngredients;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public String getDurree() {
        return durree;
    }

    public void setDurree(String durree) {
        this.durree = durree;
    }

    public String getDetailIngred() {
        return detailIngred;
    }

    public void setDetailIngred(String detailIngred) {
        this.detailIngred = detailIngred;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPreparation() {
        return preparation;
    }

    public void setPreparation(String preparation) {
        this.preparation = preparation;
    }

    @Override
    public String toString() {
        return "Produit{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", nbrIngredients=" + nbrIngredients +
                ", photo=" + photo +
                ", durree=" + durree +
                ", detailIngred='" + detailIngred + '\'' +
                ", description='" + description + '\'' +
                ", preparation='" + preparation + '\'' +
                '}';
    }
}
