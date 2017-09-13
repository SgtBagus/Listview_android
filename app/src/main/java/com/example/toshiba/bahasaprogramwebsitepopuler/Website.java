package com.example.toshiba.bahasaprogramwebsitepopuler;

        import android.content.Context;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.BaseAdapter;
        import android.widget.ImageView;
        import android.widget.TextView;


/**
 * Created by Toshiba on 13/09/2017.
 */
public class Website extends BaseAdapter {

    Context context;
    String[] Website;
    String[] Bahasa;

    Integer[] Gambar;
    private  static LayoutInflater inflater = null;

    public  Website(Context context,String[] Website ,String[] Bahasa,Integer[] Gambar){
        this.context = context;
        this.Website = Website;
        this.Bahasa = Bahasa;
        this.Gambar = Gambar;
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return  Website.length;
    }

    @Override
    public Object getItem(int position) {
        return  Bahasa[position];
    }

    @Override
    public long getItemId(int position) {
        return  position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        if (view == null)
            view = inflater.inflate(R.layout.listofwebsite,null);
        TextView web = (TextView) view.findViewById(R.id.txt1);
        TextView bhs = (TextView) view.findViewById(R.id.txt2);
        ImageView gmr = (ImageView) view.findViewById(R.id.img);

        web.setText(Website[position]);
        bhs.setText(Bahasa[position]);
        gmr.setImageResource(Gambar[position]);

        return  view;
    }
}
