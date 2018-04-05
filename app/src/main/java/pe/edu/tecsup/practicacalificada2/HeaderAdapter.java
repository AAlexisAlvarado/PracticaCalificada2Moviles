package pe.edu.tecsup.practicacalificada2;

import android.preference.PreferenceActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;


public class HeaderAdapter extends RecyclerView.Adapter<HeaderAdapter.ViewHolder> {
    private ArrayList<Header> mDataset;


     static class ViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        TextView nombre;
        TextView direccion;
        TextView telefono;

         ViewHolder(View v) {
            super(v);
            nombre = (TextView) v.findViewById(R.id.nombre);
            direccion = (TextView) v.findViewById(R.id.direccion);
            telefono = (TextView) v.findViewById(R.id.telefono);
        }
    }

    public HeaderAdapter(ArrayList<Header> myDataset) {
        mDataset = myDataset;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public HeaderAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                   int viewType) {
        // create a new view
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_header, parent, false);

        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        holder.nombre.setText(mDataset.get(position).getNombre());
        holder.direccion.setText(mDataset.get(position).getDireccion());
        holder.telefono.setText(mDataset.get(position).getTelefono());

    }

    @Override
    public int getItemCount() {
        return mDataset.size();
    }
}
