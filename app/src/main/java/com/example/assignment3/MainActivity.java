package com.example.assignment3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    RecyclerView rv;
    RecyclerAdapter recyclerViewAdapter;
    List<Employee> EmployeeList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rv=findViewById(R.id.rv);
        EmployeeList.add(new Employee("Ahmed Hassan "," Sialkot"));
        EmployeeList.add(new Employee("Ali Hassan "," Islamabad"));
        EmployeeList.add(new Employee("Osama Zaid "," Sialkot"));
        EmployeeList.add(new Employee("Ali Zia"," Lahore"));
        EmployeeList.add(new Employee("Ahsan Usman"," Rawalpindi"));
        EmployeeList.add(new Employee("Zain Ali"," Peshawar"));
        EmployeeList.add(new Employee("Adil Khan"," Lahore"));
        EmployeeList.add(new Employee("Saqib Nadeem"," Karachi"));
        EmployeeList.add(new Employee("Usman Rao"," Multan"));
        EmployeeList.add(new Employee("Sajawal Shamsi"," Sialkot"));
        rv.setLayoutManager(new LinearLayoutManager(this));
        recyclerViewAdapter= new RecyclerAdapter(EmployeeList,this);
        rv.setHasFixedSize(true);
        rv.setAdapter(recyclerViewAdapter);

    }
}