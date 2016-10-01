package home.sunshine;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Andrew on 9/30/2016.
 */

public class ForecastFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState) {
        View view = inflater.inflate();
        String [] arr = {"andrew", "ahmed", "david", "alson", "andrew", "ahmed", "david", "alson","andrew", "ahmed", "david", "alson","andrew", "ahmed", "david", "alson","andrew", "ahmed", "david", "alson","andrew", "ahmed", "david", "alson","andrew", "ahmed", "david", "alson","andrew", "ahmed", "david", "alson","andrew", "ahmed", "david", "alson"};
        mainView = (RecyclerView)findViewById(R.id.recycler_view_forecast);
        adapter = new MyRecyclerAdapter(getBaseContext(), arr);
        mainView.setAdapter(adapter);
        mainView.setLayoutManager(new LinearLayoutManager(this));
        getForecastData();
        return super.onCreateView(inflater, container, savedInstanceState);
    }
}
