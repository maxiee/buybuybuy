package com.maxiee.buybuybuy.views.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.maxiee.buybuybuy.R;
import com.maxiee.buybuybuy.model.entities.MostBuyItem;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by maxiee on 15/11/25.
 */
public class MostBuyAdapter extends RecyclerView.Adapter<MostBuyAdapter.MostBuyViewHolder> {

    private final List<MostBuyItem> mData;
    private final Context mContext;
    private final RecyclerClickListener mListener;

    public MostBuyAdapter(List<MostBuyItem> data, Context context, RecyclerClickListener recyclerClickListener) {
        mData = data;
        mContext = context;
        mListener = recyclerClickListener;
    }

    @Override
    public MostBuyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View rootView = LayoutInflater.from(mContext).inflate(R.layout.item_mostbuy, parent, false);
        return new MostBuyViewHolder(rootView, mListener);
    }

    @Override
    public void onBindViewHolder(MostBuyViewHolder holder, int position) {
        holder.bindViews(mData.get(position));
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class MostBuyViewHolder extends RecyclerView.ViewHolder {
        @Bind(R.id.item_image) ImageView itemImage;
        @Bind(R.id.item_title) TextView itemTitle;
        @Bind(R.id.item_price) TextView itemPrice;

        public MostBuyViewHolder(View itemView, final RecyclerClickListener recyclerClickListener) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }

        public void bindViews(MostBuyItem item) {
            itemTitle.setText(item.getTitle());
            itemPrice.setText(String.valueOf(item.getPrice()) + item.getPriceunit());
            Glide.with(mContext)
                    .load(item.getImgUrl())
                    .crossFade()
                    .into(itemImage);
        }
    }

    public interface RecyclerClickListener {
        void onElementClick(int position, View sharedView);
    }
}
