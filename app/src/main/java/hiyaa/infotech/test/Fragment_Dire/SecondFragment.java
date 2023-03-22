package hiyaa.infotech.test.Fragment_Dire;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import hiyaa.infotech.test.R;

public class SecondFragment  extends Fragment {

    View view;
    Button secondButton;
TextView text;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
// Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_second, container, false);
// get the reference of Button


        return view;
    }

}