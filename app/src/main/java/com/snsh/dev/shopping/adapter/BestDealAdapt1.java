package com.snsh.dev.shopping.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.snsh.dev.shopping.App;
import com.snsh.dev.shopping.R;
import com.snsh.dev.shopping.model.BestDealModel;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by android_development on 14/10/2017.
 */

public class BestDealAdapt1 extends RecyclerView.Adapter<BestDealAdapt1.MyViewHolder> {

    private List<BestDealModel> dataList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView tv1, tv2;
        ImageView iv1;

        public MyViewHolder(View view) {
            super(view);
            tv1 = (TextView) view.findViewById(R.id.tv1);
            tv2 = (TextView) view.findViewById(R.id.tv2);
            iv1 = (ImageView) view.findViewById(R.id.iv1);
        }
    }

    public void addData(List<BestDealModel> dataList) {
        this.dataList = dataList;
        notifyData();
    }

    public void notifyData() {
        notifyDataSetChanged();
    }

    public BestDealAdapt1(List<BestDealModel> moviesList) {
        this.dataList = moviesList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.layout_best_deal, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        BestDealModel data = dataList.get(position);
        holder.tv1.setText(data.getText1());
        holder.tv2.setText(data.getText2());
        Picasso.with(App.getAppContext())
                .load(data.getImageUrl())
                .placeholder(R.mipmap.ic_launcher)
                .error(R.mipmap.ic_launcher)
                .into(holder.iv1);
        /*Picasso.with(App.getAppContext())
                .load(movie.getImageUrl())
                .memoryPolicy(MemoryPolicy.NO_CACHE)
                .networkPolicy(NetworkPolicy.NO_CACHE)
                .resize(512, 512)
                .error(R.mipmap.ic_launcher)
                .noFade()
                .into(holder.iv1);*/
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }
}
