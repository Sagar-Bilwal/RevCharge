package com.example.sagar.evhack.Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.sagar.evhack.R;
import com.example.sagar.evhack.model.Costumer;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by SAGAR on 15-04-2018.
 */

public class BookingAdapter extends RecyclerView.Adapter<BookingAdapter.MovieViewHolder>
{

    List<Costumer> costumers;
    Context context;
    public BookingAdapter(Context context,List<Costumer> costumers)
    {
        this.costumers=costumers;
        this.context=context;
    }
    @Override
    public MovieViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        LayoutInflater layoutInflater=(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        assert layoutInflater != null;
        View view=layoutInflater.inflate(R.layout.booking_row,parent,false);
        MovieViewHolder viewHolder=new MovieViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(final BookingAdapter.MovieViewHolder holder, int position)
    {
        Costumer costumer=costumers.get(position);
        holder.date.setText(costumer.getDate());
        holder.time.setText(costumer.getTime());
        holder.name.setText(costumer.getStation());
        holder.location.setText(costumer.getLocation());
    }

    @Override
    public int getItemCount() {
        return costumers.size();
    }

    class MovieViewHolder extends RecyclerView.ViewHolder
    {
        View itemView;
        TextView date;
        TextView time;
        TextView name;
        TextView location;
        public MovieViewHolder(View itemView) {
            super(itemView);
            this.itemView=itemView;
            date=itemView.findViewById(R.id.date);
            time=itemView.findViewById(R.id.time);
            name=itemView.findViewById(R.id.name);
            location =itemView.findViewById(R.id.location);
        }
    }
}
