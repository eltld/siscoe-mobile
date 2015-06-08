package com.siscoe;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.siscoe.R;
import com.siscoe.obra.Obra;
import com.siscoe.obra.ObraAdapter;

import java.lang.reflect.Array;
import java.util.ArrayList;


@SuppressWarnings("deprecation")
public class MainActivity extends ActionBarActivity {

    private ListView listViewObra;
    private ArrayList<Obra> listData;
    private ArrayAdapter<Obra> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listData=new ArrayList<Obra>();

        listData.add(new Obra(new Long(1), "obra1", "descripcion de obra1", "06/07/2015"));
        listData.add(new Obra(new Long(2), "obra2", "descripcion de obra2", "07/07/2015"));
        listData.add(new Obra(new Long(3), "obra3", "descripcion de obra1", "06/07/2015"));
        listData.add(new Obra(new Long(4), "obra4", "descripcion de obra2", "07/07/2015"));
        listData.add(new Obra(new Long(5), "obra5","descripcion de obra1","06/07/2015"));
        listData.add(new Obra(new Long(6), "obra6","descripcion de obra2","07/07/2015"));
        listData.add(new Obra(new Long(7), "obra7","descripcion de obra1","06/07/2015"));
        listData.add(new Obra(new Long(8), "obra8","descripcion de obra2","07/07/2015"));

        listViewObra=(ListView)findViewById(R.id.listObra);


        adapter=new ObraAdapter(this.getApplicationContext(),0,listData);
        listViewObra.setAdapter(adapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_addObra) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
