package home.sunshine;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mainView;
    private MyRecyclerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //// TODO: 9/29/2016 this is just for testing, remove it later
        String [] arr = {"andrew", "ahmed", "david", "alson", "andrew", "ahmed", "david", "alson","andrew", "ahmed", "david", "alson","andrew", "ahmed", "david", "alson","andrew", "ahmed", "david", "alson","andrew", "ahmed", "david", "alson","andrew", "ahmed", "david", "alson","andrew", "ahmed", "david", "alson","andrew", "ahmed", "david", "alson"};
        mainView = (RecyclerView)findViewById(R.id.recycler_view_forecast);
        adapter = new MyRecyclerAdapter(getBaseContext(), arr);
        mainView.setAdapter(adapter);
        mainView.setLayoutManager(new LinearLayoutManager(this));
    }
}
