package pe.edu.tecsup.practicacalificada2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class SearchResultActivity extends AppCompatActivity {

    private HeaderAdapter headerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_result);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);

        ArrayList<Header> myDataset = new ArrayList<>();
        myDataset.add(new Header("Taxi Beat", "33, Calle Los Antares 320, Santiago de Surco", "(01) 3586146"));
        myDataset.add(new Header("Uber", "Av. Alfredo Benavides 4883, Santiago de Surco 15039", " 938 119 820"));
        myDataset.add(new Header("Easy Taxi", "Av Pershing 417, San Isidro Lima 27", "(01) 7164600"));
        myDataset.add(new Header("Taxi Satelital", "07041, Vía Expresa Elmer Faucett 2880, Callao", "(01) 3555555"));
        myDataset.add(new Header("Bembos", "Av. Javier Prado Este 4200, Santiago de Surco 15023", "(01) 7162000"));
        myDataset.add(new Header("Pizza Hut", " Av. Javier Prado Este 4200, Santiago de Surco 15023", "(01) 5055115"));
        myDataset.add(new Header("KFC", "Av. Javier Prado Este 4200, Santiago de Surco 15023", "(01) 5050505"));
        myDataset.add(new Header("McDonald's", "Av. Javier Prado Este 130, San Isidro 15036", "(01) 7173493"));
        myDataset.add(new Header("Plaza Norte", "Tomas Valle, Cercado de Lima 15311", "(01) 2021111"));
        myDataset.add(new Header("Mega Plaza", "Alfredo Mendiola 3698, Independencia 15311", "(01) 6139500"));
        myDataset.add(new Header("Mall Aventura Plaza", "Av. Nicolás Ayllón, Santa Anita 15008", "(01) 5133350"));
        myDataset.add(new Header("Real Plaza", "Av Inca Garcilaso de la Vega 1337, Cercado de Lima 15001", "(01) 6118200"));
        myDataset.add(new Header("Hilton", "Av. la Paz 1099, Miraflores Lima 18", "(01) 2008000"));
        myDataset.add(new Header("Marriot", "Calle Schell No 400, Miraflores 15074", "(01) 6253838"));
        myDataset.add(new Header("Sheraton", "Av Paseo de la República 170, Cercado de Lima 15001", "(01) 3155000"));
        myDataset.add(new Header("Westin", "Calle Las Begonias 450. San Isidro, Lima 15001", "(01) 2015000"));
        myDataset.add(new Header("Roll Star Sushi", "Av San Luis 2515, San Borja 15037", "(01) 4762469"));
        myDataset.add(new Header("La Bisteca", "Av. Los Conquistadores 1048, San Isidro 15073", "(01) 4217555"));
        myDataset.add(new Header("Canastas", "Av. Flora Tristan 682, Lima 15026", "(01) 5183000"));
        myDataset.add(new Header("Nanka", "Jr. Los Bambúes 198 (a la espalda del CC Molina Plaza, La Molina 15024", "(01) 3697297"));

        headerAdapter = new HeaderAdapter(myDataset);
        recyclerView.setAdapter(headerAdapter);
    }
}
