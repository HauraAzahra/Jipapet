package com.haurasalsabila.jipapet.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.haurasalsabila.jipapet.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class DzikirPagi extends Fragment {


    public DzikirPagi() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_dzikir_pagi, container, false);
    }

}
