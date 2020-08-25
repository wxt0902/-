package com.wxt.myapplication;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;


public class adapate extends RecyclerView.Adapter<adapate.ViewHolder>{

    private List<Fruit> afruitList;

    public adapate(List<Fruit> fruitList) {
        afruitList=fruitList;

    }

    static class ViewHolder extends RecyclerView.ViewHolder{
        ImageView fruitImage;
        TextView fruitname;
        private List<Fruit> afruitList;


        public ViewHolder(View view){
            super(view);
            fruitImage=(ImageView) view.findViewById(R.id.image_ONE);
            fruitname=(TextView) view.findViewById(R.id.text_ONE);


        }

    }
    @NonNull
    @Override
    public adapate.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.fruit,parent);
        ViewHolder holder=new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull adapate.ViewHolder holder, int position) {
        Fruit fruit=afruitList.get(position);
     holder.fruitImage.setImageResource(fruit.getID());
        holder.fruitname.setText(fruit.getName());

    }

    @Override
    public int getItemCount() {
        return afruitList.size();
    }
}
