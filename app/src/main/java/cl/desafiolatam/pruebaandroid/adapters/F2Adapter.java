package cl.desafiolatam.pruebaandroid.adapters;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class F2Adapter extends RecyclerView.Adapter<F2Adapter.F2Holder> {

    @NonNull
    @Override
    public F2Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull F2Holder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class F2Holder extends RecyclerView.ViewHolder{
        ImageView listImage;

        public F2Holder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
