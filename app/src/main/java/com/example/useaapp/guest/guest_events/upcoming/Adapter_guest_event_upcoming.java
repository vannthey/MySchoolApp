package com.example.useaapp.guest.guest_events.upcoming;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.useaapp.R;

import java.util.List;

public class Adapter_guest_event_upcoming extends RecyclerView.Adapter<Adapter_guest_event_upcoming.ViewHolder> {
    List<Response_model_guest_event_upcoming> data;
    public Adapter_guest_event_upcoming(List<Response_model_guest_event_upcoming> data) {
        this.data = data;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_items_guest_event, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.Title_guest_event_item.setText(data.get(position).getUpcoming_title());
        holder.Detail_guest_event_item.setText(data.get(position).getUpcoming_detail());
        holder.Day_guest_event_item.setText(data.get(position).getUpcoming_day());
        holder.Month_guest_event_item.setText(data.get(position).getUpcoming_month());
        holder.Date_guest_event_item.setText(data.get(position).getUpcoming_date());
        holder.Year_guest_event_item.setText(data.get(position).getUpcoming_year());
        holder.Time_guest_event_item.setText(data.get(position).getUpcoming_time());
        Glide.with(holder.Title_guest_event_item.getContext()).load("http://172.17.19.186/usea_app/event_image/" + data.get(position).getUpcoming_image()).into(holder.eventImg);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        TextView Title_guest_event_item, Detail_guest_event_item, Day_guest_event_item, Month_guest_event_item, Date_guest_event_item, Year_guest_event_item, Time_guest_event_item;
        ImageView eventImg;

        public ViewHolder(@NonNull View itemView){
            super(itemView);
            Title_guest_event_item = itemView.findViewById(R.id.Title_guest_event_item);
            Detail_guest_event_item = itemView.findViewById(R.id.Detail_guest_event_item);
            Day_guest_event_item = itemView.findViewById(R.id.Day_guest_event_item);
            Month_guest_event_item = itemView.findViewById(R.id.Month_guest_event_item);
            Date_guest_event_item = itemView.findViewById(R.id.Date_guest_event_item);
            Year_guest_event_item = itemView.findViewById(R.id.Year_guest_event_item);
            Time_guest_event_item = itemView.findViewById(R.id.Time_guest_event_item);
            eventImg = itemView.findViewById(R.id.eventImg);
        }
    }
}