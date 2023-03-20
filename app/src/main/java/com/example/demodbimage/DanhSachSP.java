package com.example.demodbimage;

import android.database.Cursor;
import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class DanhSachSP extends AppCompatActivity {
    ArrayList<SanPham> list = new ArrayList<>();
    RecyclerView lvDanhsach;
    DAO dao;
    CusAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_danh_sach_sp);
        lvDanhsach = findViewById(R.id.lvDanhsach);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        lvDanhsach.setLayoutManager(layoutManager);
        dao = new DAO(this);
        list = dao.getAll();
        adapter = new CusAdapter(this, list);
        lvDanhsach.setAdapter(adapter);
    }
}