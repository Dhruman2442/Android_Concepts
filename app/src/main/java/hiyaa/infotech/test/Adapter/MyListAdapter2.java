package hiyaa.infotech.test.Adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import hiyaa.infotech.test.R;

public class MyListAdapter2 extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] maintitle;
    private final String[] subtitle;
    private final Integer[] imgid;

    public MyListAdapter2(Activity context, String[] maintitle,String[] subtitle, Integer[] imgid) {
        super(context, R.layout.list_item, maintitle);
        // TODO Auto-generated constructor stub

        this.context=context;
        this.maintitle=maintitle;
        this.subtitle=subtitle;
        this.imgid=imgid;

    }

    public View getView(int position, View view, ViewGroup parent) {

        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.list_item, null,true);

        TextView titleText =  rowView.findViewById(R.id.name);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.imageView);
        TextView textView2 = (TextView) rowView.findViewById(R.id.number);

        titleText.setText(maintitle[position]);
        imageView.setImageResource(imgid[position]);
        textView2.setText(subtitle[position]);

        return rowView;

    };
}
