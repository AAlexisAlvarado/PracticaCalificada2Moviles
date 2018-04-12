package pe.edu.tecsup.practicacalificada2;

import android.content.Context;
import android.content.Intent;
import android.preference.PreferenceActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;


public class HeaderAdapter extends RecyclerView.Adapter<HeaderAdapter.ViewHolder> {
    private ArrayList<Header> mDataset;



    static class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        //context
        Context context;
        // text views
        TextView nombre;
        TextView direccion;
        TextView telefono;

        //botones
        Button btnDetails;


         ViewHolder(View v) {
            super(v);
            context = v.getContext();

            nombre = (TextView) v.findViewById(R.id.nombre);
            direccion = (TextView) v.findViewById(R.id.direccion);
            telefono = (TextView) v.findViewById(R.id.telefono);

            btnDetails = (Button) v.findViewById(R.id.btnDetails);
        }

        void setOnclickListeners(){
            btnDetails.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            switch (view.getId()) {
                    case R.id.btnDetails:
                        Intent intent = new Intent(context, DetailsActivity.class);
                        intent.putExtra("nombre", nombre.getText());
                        context.startActivity(intent);
                        break;
                }
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

        holder.setOnClickListeners();

    }


    @Override
    public int getItemCount() {
        return mDataset.size();
    }
}
