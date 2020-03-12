package cl.desafiolatam.pruebaandroid.adapters;


import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class F1Adapter extends RecyclerView.Adapter<F1Adapter.F1Holder> {

    @NonNull
    @Override
    public F1Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull F1Holder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class F1Holder extends RecyclerView.ViewHolder{

        TextView listText;

        public F1Holder(@NonNull View itemView, TextView listText) {
            super(itemView);
            this.listText = listText;
        }
    }
}
