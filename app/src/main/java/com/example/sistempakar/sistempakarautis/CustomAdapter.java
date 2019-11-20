package com.example.sistempakar.sistempakarautis;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class CustomAdapter extends BaseAdapter {


    Context c;
    String[] nm = {
            "ASD(autisme)",
            "Skizofrenia",
            "Asperger",
            "ADHD(pemusatan perhatian)",
            "Keterbelakangan mental"};
    int[] ket = {R.string.ASDautsime,
            R.string.Skizofrenia,

            R.string.Asperger,

            R.string.ADHS,

            R.string.keterbelakangan
    };

    int [] img ={R.drawable.datsicon,R.drawable.datsicon,R.drawable.datsicon,R.drawable.datsicon,R.drawable.datsicon};

    CustomAdapter(Context ctx)
    {
        this.c=ctx;
    }


    @Override
    public int getCount() {
        return nm.length;
    }

    @Override
    public Object getItem(int pos) {
        return nm[pos];
    }

    @Override
    public long getItemId(int pos) {
        return pos;
    }

    @Override
    public View getView(int pos, View viewhasil, ViewGroup viewGroup) {

        if (viewhasil==null)
        {
            LayoutInflater inflater = (LayoutInflater)c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            viewhasil=inflater.inflate(R.layout.row_data,null);

        }


        //ambilisi
        TextView ambilname= (TextView) viewhasil.findViewById(R.id.nama_row);
        TextView ambilket = (TextView) viewhasil.findViewById(R.id.keterangan_row);
        ImageView ambilimg = viewhasil.findViewById(R.id.image_row);


        //mengubah data menjadi sesuai dengan yg dipilih
        ambilname.setText(nm[pos]);
        ambilket.setText(ket[pos]);
    ambilimg.setImageResource(img[pos]);

        return viewhasil;

    }


}

