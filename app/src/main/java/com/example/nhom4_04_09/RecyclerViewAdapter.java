package com.example.nhom4_04_09;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.nhom4_04_09.model.Cat;

import java.util.List;

public class RecyclerViewAdapter extends
        RecyclerView.Adapter<RecyclerViewAdapter.CatViewHolder> {
    private Activity activity;
    private List<Cat> mlist;

    public RecyclerViewAdapter(Activity activity) {
        this.activity = activity;
    }
    public void setData(List<Cat> list){
        this.mlist=list;
        notifyDataSetChanged();
    }
    @NonNull
    @Override
    public CatViewHolder onCreateViewHolder(@NonNull ViewGroup parent,
                                            int viewType) {
        View v=activity.getLayoutInflater().inflate(R.layout.item_cat,
                parent,false);
        return new CatViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull CatViewHolder holder,
                                 int position) {
           Cat c=mlist.get(position);
           holder.img.setImageResource(c.getSourceImg());
           holder.txtName.setText(c.getName());
    }

    @Override
    public int getItemCount() {
        if(mlist!=null)
           return mlist.size();
        else
            return 0;
    }

    public class CatViewHolder extends RecyclerView.ViewHolder{
        ImageView img;
        TextView txtName;
        public CatViewHolder(@NonNull View v) {
            super(v);
            img=v.findViewById(R.id.img);
            txtName=v.findViewById(R.id.tv);
        }
    }

}
