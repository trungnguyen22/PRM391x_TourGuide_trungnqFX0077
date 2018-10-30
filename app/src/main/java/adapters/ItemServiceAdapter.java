package adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.dell.prm391x_tourguide_trungnqfx0077.R;

import java.util.List;

import models.ItemDto;

public class ItemServiceAdapter extends RecyclerView.Adapter<ItemServiceAdapter.ItemServiceViewHolder> {

    private Context mContext;
    private List<ItemDto> mItemDtoList;
    private int mResIcon;
    private int mResColor;

    public ItemServiceAdapter(Context context, List<ItemDto> itemDtoList, int resIcon, int resColor) {
        mContext = context;
        mItemDtoList = itemDtoList;
        mResIcon = resIcon;
        mResColor = resColor;
    }

    @NonNull
    @Override
    public ItemServiceViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(mContext).inflate(R.layout.item_of_service, viewGroup, false);
        return new ItemServiceViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemServiceViewHolder itemServiceViewHolder, int i) {
        itemServiceViewHolder.bindData(i);
    }

    @Override
    public int getItemCount() {
        return mItemDtoList.size();
    }

    class ItemServiceViewHolder extends RecyclerView.ViewHolder {
        CardView mItemCV;
        LinearLayout mItemContentLN;
        ImageView mItemServiceImg;
        TextView mItemName;
        TextView mItemAddress;

        ItemServiceViewHolder(@NonNull View itemView) {
            super(itemView);
            mItemCV = itemView.findViewById(R.id.mItemCV);
            mItemServiceImg = itemView.findViewById(R.id.mItemServiceImg);
            mItemName = itemView.findViewById(R.id.mItemNameTV);
            mItemAddress = itemView.findViewById(R.id.mItemAddress);
            mItemContentLN = itemView.findViewById(R.id.mItemContentLN);
        }

        void bindData(int position) {
            ItemDto itemDto = mItemDtoList.get(position);
            mItemServiceImg.setImageResource(mResIcon);
            mItemName.setText(itemDto.getItemName());
            mItemAddress.setText(itemDto.getItemAddress());
            mItemContentLN.setBackgroundColor(mResColor);
            Log.d("Debug-Color-Code: ", String.valueOf(mResColor));
        }

    }
}
