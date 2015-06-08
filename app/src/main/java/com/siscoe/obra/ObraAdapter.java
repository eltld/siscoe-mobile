package com.siscoe.obra;

import android.content.Context;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.siscoe.R;

import java.util.List;

/**
 * Created by manuonda on 07/06/15.
 */
public class ObraAdapter extends ArrayAdapter<Obra> {


    private List<Obra> listData;
    private LayoutInflater layoutInflater;
    private Context mContext;
    private String TAG_TOP = "TOP";

    public ObraAdapter(Context context, int resource, List<Obra> objects) {
        super(context, resource, objects);
         this.listData=objects;
         this.mContext=context;
        layoutInflater = LayoutInflater.from(context);


    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Obra obraItem = (Obra) listData.get(position);

        //Aca especifica si es la primera posicion de la noticia
        //lo pone como banner
        if (convertView == null) {
            convertView = LayoutInflater.from(mContext).inflate(R.layout.obra_item, parent, false);
        }

        Obra obra = listData.get(position);

        if (obra != null) {

            TextView title = (TextView) convertView.findViewById(R.id.title_obra);
            TextView date = (TextView) convertView.findViewById(R.id.date_obra);

            title.setText(obra.getNombre());
            date.setText(obra.getFechaPublicacion());

            //message.setTag(tweet.getTweetId());
            ///data.setText(tweet.getData());
        }

        return convertView;
    }

    @Override
    public int getCount() {
        return super.getCount();
    }

    @Override
    public Obra getItem(int position) {
        return super.getItem(position);
    }

    @Override
    public int getPosition(Obra item) {
        return super.getPosition(item);
    }

    static class ViewHolder {
        TextView title;
        TextView fecha;
    }

}
