package com.example.finext;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class DummyExpensesAdapter extends RecyclerView.Adapter<DummyExpensesAdapter.DummyViewHolder> {

    Context context;
    ArrayList<ExpensesModel> expensesModels;
    public DummyExpensesAdapter(Context context, ArrayList<ExpensesModel> expenseModels) {
        this.context = context;
        this.expensesModels = expenseModels;
    }
    @NonNull
    @Override
    public DummyExpensesAdapter.DummyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.dummy_history_view, parent, false);
        return new DummyExpensesAdapter.DummyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DummyExpensesAdapter.DummyViewHolder holder, int position) {
        holder.tvItem.setText(expensesModels.get(position).getItem());
        holder.tvCost.setText(expensesModels.get(position).getCost());
        holder.tvFrom.setText(expensesModels.get(position).getFrom());
        holder.imageView.setImageResource(expensesModels.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return expensesModels.size();
    }

    public static class DummyViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView tvItem, tvFrom, tvCost;
        public DummyViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.customImage);
            tvItem = itemView.findViewById(R.id.item);
            tvFrom = itemView.findViewById(R.id.whereFrom);
            tvCost = itemView.findViewById(R.id.cost);
        }
    }
}
