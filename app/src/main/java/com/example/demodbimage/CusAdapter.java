package com.example.demodbimage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class CusAdapter extends RecyclerView.Adapter<CusAdapter.SanPhamViewHolder>{
    Context context;
    ArrayList<SanPham> list;
    DAO kcDAO;
    public CusAdapter(Context context, ArrayList<SanPham> list) {
        this.context = context;
        this.list = list;
        kcDAO = new DAO(context);
    }

    @NonNull
    @Override
    public CusAdapter.SanPhamViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.row_listiew, parent, false);
        SanPhamViewHolder viewHolder = new SanPhamViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull CusAdapter.SanPhamViewHolder holder, int position) {
        SanPham kc = list.get(position);
        holder.tvTen.setText(kc.getTensp());
        Bitmap bitmap= BitmapFactory.decodeByteArray(kc.hinhanh, 0, kc.hinhanh.length);
        holder.imgAnh.setImageBitmap(bitmap);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class SanPhamViewHolder extends RecyclerView.ViewHolder {
        TextView tvTen;
        ImageView imgAnh;
        public SanPhamViewHolder(@NonNull View itemView) {
            super(itemView);
            tvTen = itemView.findViewById(R.id.txtTen);
            imgAnh = itemView.findViewById(R.id.imgAnhDaiDien);
        }
    }

}
