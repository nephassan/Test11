package com.example.test1.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.test1.R;

import java.util.List;

public class Adapter1 extends RecyclerView.Adapter<Adapter1.ViewHolderClass> {


    Context context;
    List<String> list;

    public Adapter1(Context context, List<String> list) {
        this.context = context;
        this.list = list;
    }


    @Override
    public ViewHolderClass onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.model_list, parent, false);
        //   view.findViewById(R.id.txt1).setMinimumHeight(560);
        // view.setMinimumHeight(160);
        //   View rootView = LayoutInflater.from(context).inflate(R.layout.itemLayout, parent, false);
        return new ViewHolderClass(view,viewType);

    }

    @Override
    public void onBindViewHolder(@NonNull Adapter1.ViewHolderClass holder, int position) {

        final String item = list.get(position);

        holder.txt1.setText(item);

    }

    @Override
    public int getItemCount() {
        return list.size();
    }





    public class ViewHolderClass extends RecyclerView.ViewHolder {




        TextView txt1;




        public ViewHolderClass(View itemView, int viewType) {
            super(itemView);






          //  txt1=itemView.findViewById(R.id.txt1);


        }
    }



}
