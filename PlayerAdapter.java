package com.example.sql;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.view.menu.MenuView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class PlayerAdapter extends RecyclerView.Adapter<PlayerAdapter.ViewHolder> {

    private ArrayList<Player> players;

    ItemClicked activity;

    public interface ItemClicked{
        void onItemClicked(int index);
    }

    public PlayerAdapter(Context context,ArrayList<Player> list){
        players=list;
        activity=(ItemClicked) context;
    }

    /**
     * Think about this class when implmenting the interface
     */
    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView tvPlayersName;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvPlayersName=itemView.findViewById(R.id.tvPlayersName);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    activity.onItemClicked(players.indexOf((Player)v.getTag()));
                }
            });

        }
    }

    @NonNull
    @Override
    public PlayerAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.row_layout,viewGroup,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PlayerAdapter.ViewHolder viewHolder, int i) {
        viewHolder.itemView.setTag(players.get(i));
        viewHolder.tvPlayersName.setText(players.get(i).getName());
    }

    @Override
    public int getItemCount() {
        return players.size();
    }
}
