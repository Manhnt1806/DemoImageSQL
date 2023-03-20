package com.example.demodbimage;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;

public class DAO {
    SQLiteDatabase db;
    DbHelper dbHelper;
    public DAO(Context context) {
        dbHelper = new DbHelper(context);
    }
    public ArrayList<SanPham> getAll() {
        ArrayList<SanPham> list = new ArrayList<>();
        db = dbHelper.getReadableDatabase();
        String sql = "SELECT * FROM SanPham";
        Cursor cs = db.rawQuery(sql, null);
        if (cs.getCount() > 0) {
            cs.moveToFirst();
            do {
                int _id = cs.getInt(0);
                String _tensp = cs.getString(1);
                int _gia = cs.getInt(2);
                byte[] _anh = cs.getBlob(3);
                list.add(new SanPham(_id, _tensp, _gia, _anh));
            } while (cs.moveToNext());
        }
        cs.close();
        db.close();
        return list;
    }

    public boolean insertRow(SanPham obj) {
        db = dbHelper.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("TenSP", obj.getTensp());
        values.put("Gia", obj.getGia());
        values.put("HinhMh", obj.getHinhanh());

        long row = db.insert("SanPham", null, values);
        return (row > 0);
    }
}
