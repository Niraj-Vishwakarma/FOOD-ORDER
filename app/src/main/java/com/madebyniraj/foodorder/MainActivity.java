package com.madebyniraj.foodorder;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.madebyniraj.foodorder.Adapters.MainAdapter;
import com.madebyniraj.foodorder.Models.MainModel;
import com.madebyniraj.foodorder.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

ActivityMainBinding binding ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());   // changed setContentView(R.layout.activity_main)

        ArrayList<MainModel> list = new ArrayList<>();

        list.add(new MainModel(R.drawable.burger1, "burger", "Hot and spicy, fresh as always aloo fried","50" ));
        list.add(new MainModel(R.drawable.burger2, "burger", "Hot and spicy, fresh as always aloo fried","50" ));
        list.add(new MainModel(R.drawable.pizza, "burger", "Hot and spicy, fresh as always aloo fried","50" ));
        list.add(new MainModel(R.drawable.burger, "burger", "Hot and spicy, fresh as always aloo fried","50" ));
        list.add(new MainModel(R.drawable.vadapav, "burger", "Hot and spicy, fresh as always aloo fried","50" ));
        list.add(new MainModel(R.drawable.burger, "burger", "Hot and spicy, fresh as always aloo fried","50" ));

        //set adapter
        MainAdapter adapter = new MainAdapter(list, this);
        binding.recyclerview.setAdapter(adapter);

        //set layoutmanager
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        binding.recyclerview.setLayoutManager(layoutManager);
    }
}
