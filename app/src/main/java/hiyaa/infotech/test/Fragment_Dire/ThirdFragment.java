package hiyaa.infotech.test.Fragment_Dire;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import hiyaa.infotech.test.R;

public class ThirdFragment extends Fragment {

    View view;
    Button secondButton;
TextView text;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
// Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_third, container, false);


        return view;
    }

}