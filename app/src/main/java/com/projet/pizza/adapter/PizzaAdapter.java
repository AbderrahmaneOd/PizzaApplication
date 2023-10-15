package com.projet.pizza.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.projet.pizza.R;
import com.projet.pizza.classes.Produit;

import java.util.List;

public class PizzaAdapter extends BaseAdapter {

    private List<Produit> produits;
    private LayoutInflater inflater;

    public PizzaAdapter(Activity activity, List<Produit> produits) {
        this.produits = produits;
        inflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }


    @Override
    public int getCount() {
        return produits.size();
    }

    @Override
    public Object getItem(int i) {
        return produits.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i+1;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        if(view == null)
            view = inflater.inflate(R.layout.produit_item, null);

        TextView pizzaNomItem = view.findViewById(R.id.idPizzaNomItem);
        TextView PizzaNbrIngrediantsItem = view.findViewById(R.id.idPizzaNbrIngrediantsItem);
        TextView PizzaDurreeItem = view.findViewById(R.id.idPizzaDurreeItem);
        ImageView pizzaIconItem = view.findViewById(R.id.idPizzaIconItem);
        TextView pizzaId = view.findViewById(R.id.idPizzaId);

        pizzaNomItem.setText(produits.get(i).getNom());
        PizzaNbrIngrediantsItem.setText(produits.get(i).getNbrIngredients()+" Ingredients");
        PizzaDurreeItem.setText(produits.get(i).getDurree());
        pizzaIconItem.setImageResource(produits.get(i).getPhoto());
        pizzaId.setText(produits.get(i).getId()+"");


        return view;
    }
}
