package cl.desafiolatam.pruebaandroid.adapters;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class F3Adapter extends RecyclerView.Adapter<F3Adapter.F3Holder> {

    @NonNull
    @Override
    public F3Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull F3Holder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class F3Holder extends RecyclerView.ViewHolder{

        ImageView imageFav;
        TextView nameText;

        public F3Holder(@NonNull View itemView, ImageView imageFav, TextView nameText) {
            super(itemView);
            this.imageFav = imageFav;
            this.nameText = nameText;


        }
    }

}
