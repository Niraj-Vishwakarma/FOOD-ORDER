package com.madebyniraj.foodorder;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.madebyniraj.foodorder.Adapters.OrdersAdapter;
import com.madebyniraj.foodorder.Models.OrdersModel;
import com.madebyniraj.foodorder.databinding.ActivityOrdersBinding;

import java.util.ArrayList;

public class OrdersActivity extends AppCompatActivity {

    ActivityOrdersBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= ActivityOrdersBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        ArrayList<OrdersModel> list= new ArrayList<OrdersModel>();
        list.add(new OrdersModel(R.drawable.burger, "Cheese Burgur" , "50" , "1265757"));
        list.add(new OrdersModel(R.drawable.burger, "Cheese Burgur" , "50" , "1265757"));
        list.add(new OrdersModel(R.drawable.burger, "Cheese Burgur" , "50" , "1265757"));


        OrdersAdapter adapter= new OrdersAdapter(list , this);
        binding.orderRecyclerView.setAdapter(adapter);

        LinearLayoutManager layoutManager= new LinearLayoutManager(this);
        binding.orderRecyclerView.setLayoutManager(layoutManager);

    }
}