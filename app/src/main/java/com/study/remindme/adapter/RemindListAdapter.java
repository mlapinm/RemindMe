package com.study.remindme.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.study.remindme.R;
import com.study.remindme.dto.RemindDTO;

import java.util.List;

public class RemindListAdapter extends RecyclerView.Adapter<RemindListAdapter.RemindViewHolder> {

    private List<RemindDTO> data;

    public RemindListAdapter(List<RemindDTO> data) {
        this.data = data;
    }


    @NonNull
    @Override
    public RemindViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.remind_item, viewGroup, false);
        return new RemindViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RemindViewHolder holder, int i) {
        //holder.title.setText(data.get(i).getTitle());
        RemindDTO item = data.get(i);
        holder.title.setText(item.getTitle());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public static class RemindViewHolder extends RecyclerView.ViewHolder{

        CardView cardView;
        TextView title;

        public RemindViewHolder(@NonNull View itemView) {
            super(itemView);

            cardView = itemView.findViewById(R.id.cardView);
            title = (TextView) itemView.findViewById(R.id.title);


        }
    }
}
