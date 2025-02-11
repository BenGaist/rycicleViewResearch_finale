package com.example.rycicleviewresearch;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.MenuView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder>
{

    private List<DataItem> dataList;
    private Context context;

    public MyAdapter(List<DataItem> dataList,Context context)
    {
        this.context = context;
        this.dataList = dataList;
    }


    public MyAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.data_item, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter.ViewHolder holder, int position) {
        holder.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = holder.editText.getText().toString();
                Toast.makeText(v.getContext(), text, Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }




    public class ViewHolder extends RecyclerView.ViewHolder {
        EditText editText;
        Button button;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
             editText = itemView.findViewById(R.id.editText_item);
             button = itemView.findViewById(R.id.button_submit);
        }


    }

}
