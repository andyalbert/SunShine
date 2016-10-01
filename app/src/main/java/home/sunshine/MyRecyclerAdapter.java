package home.sunshine;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Andrew on 9/29/2016.
 */
public class MyRecyclerAdapter extends RecyclerView.Adapter<MyRecyclerAdapter.CustomViewHolder>{
    private Context context;
    private String[] arr;

    public MyRecyclerAdapter(Context context, String[] arr) {
        this.context = context;
        this.arr = arr;
    }
    public void updateData(String[] arr){
        this.arr = arr;
    }

    @Override
    public CustomViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_forecast, null);

        CustomViewHolder holder = new CustomViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(CustomViewHolder holder, int position) {
        holder.textView.setText(arr[position]);
    }

    @Override
    public int getItemCount() {
        return arr.length;
    }

    public class CustomViewHolder extends RecyclerView.ViewHolder {
        private TextView textView;
        public CustomViewHolder(View textView) {
            super(textView);
            this.textView = (TextView) textView.findViewById(R.id.list_item_forecast_textview);
        }
    }
}
