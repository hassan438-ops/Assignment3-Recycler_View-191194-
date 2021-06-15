package com.example.assignment3;

import android.content.Context;
import android.icu.text.Transliterator;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {
   private List<Employee> EmployeeList;
   private Context context;
    private OnItemClickListener listener;

    public interface OnItemClickListener
    {
        void onDeleteClick(int position);
    }

    public void setOnItemClickListener(OnItemClickListener lis)
    {
         listener =lis;
    }
    public RecyclerAdapter(List<Employee> employeeList, Context context) {
       EmployeeList=employeeList;
       this.context=context;
    }




    @NonNull
    @Override
    public RecyclerAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater=LayoutInflater.from(parent.getContext());
        View view=layoutInflater.inflate(R.layout.recycle_view_item,parent,false);
        ViewHolder viewHolder= new ViewHolder (view,listener);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerAdapter.ViewHolder holder, int position) {
        Employee emp;
        emp=EmployeeList.get(position);
        holder.tv.setText(emp.getName());
        holder.tv1.setText(emp.getCity());
    }

    @Override
    public int getItemCount() {
        return EmployeeList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener  {
        TextView tv;
        TextView tv1;
        ImageView iv;
        public ViewHolder( View itemView,OnItemClickListener lis)
        {

            super(itemView);
            tv=itemView.findViewById(R.id.tv);
            tv1=itemView.findViewById(R.id.tv1);
            iv=itemView.findViewById(R.id.iv);
            iv.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(lis!= null)
                    {
                        int loc=getAdapterPosition();
                        if(loc!=RecyclerView.NO_POSITION)
                        {
                            lis.onDeleteClick(loc);
                        }
                    }

                }
            });

    }


        @Override
        public void onClick(View v) {

        }
    }
}
