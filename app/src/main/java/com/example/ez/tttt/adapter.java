package com.example.ez.tttt;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class adapter extends  RecyclerView.Adapter<adapter.holder>  {
      Context context;
      List<String> data;
      public   TextView one;
      public   TextView two;

    public adapter(Context context , List<String> data) {
        this.context = context;
        this.data = data;
    }

    public class holder extends  RecyclerView.ViewHolder {
        public holder(@NonNull View itemView) {
            super(itemView);
        }
    }
    @NonNull
    @Override
    public holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.mylayout,parent,false);
        holder v = new holder(view);
        return v;
    }

    @Override
    public void onBindViewHolder(@NonNull holder holder, final int position) {
        one = holder.itemView.findViewById(R.id.one);
        two = holder.itemView.findViewById(R.id.two);

        one.setText(data.get(position));
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context,"左邊"+ data.get(position),Toast.LENGTH_SHORT).show();
            }
        });
        two.setText(data.get(position));
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context,"右邊"+ data.get(position),Toast.LENGTH_SHORT).show();
            }
        });
    }
    @Override
    public int getItemCount() {
        return data.size();
    }

}
