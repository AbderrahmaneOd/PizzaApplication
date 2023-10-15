package com.projet.pizza;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.projet.pizza.classes.Produit;
import com.projet.pizza.service.ProduitService;

public class DetailsPizza extends AppCompatActivity {

    private ProduitService ps;
    private ImageView pizzaIcon;
    private TextView pizzaingredients;
    private TextView pizzaNom;
    private TextView pizzaDescription;
    private TextView PizzaPreparation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_pizza);

        Intent intent = getIntent();
        int id = Integer.parseInt(intent.getStringExtra("pizzaId"));
        ps = ProduitService.getInstance();

        pizzaingredients = findViewById(R.id.idPizzaIngredients);
        pizzaDescription = findViewById(R.id.idPizzaDescription);
        pizzaIcon = findViewById(R.id.idPizzaIcon);
        pizzaNom = findViewById(R.id.idPizzaNom);
        PizzaPreparation = findViewById(R.id.idPizzaPreparation);


        Produit f = ps.findById(id);
        pizzaIcon.setImageResource(f.getPhoto());
        pizzaNom.setText(f.getNom());
        pizzaingredients.setText(f.getDetailIngred());
        pizzaDescription.setText(f.getDescription());
        PizzaPreparation.setText(f.getPreparation());
    }
}