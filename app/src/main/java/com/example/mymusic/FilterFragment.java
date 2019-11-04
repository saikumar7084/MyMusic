package com.example.mymusic;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.fragment.app.Fragment;

public class FilterFragment extends Fragment {

    public FilterFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.filter, container, false);

        initUI(view);

        return view;


    }

    private void initUI(View view){

        ImageView imageView1 = view.findViewById(R.id.chatimage1);
        Utils.setCircleImageToImageView(getActivity(), imageView1, R.drawable.academic, 0, 0);

        ImageView imageView2 = view.findViewById(R.id.chatimage2);
        Utils.setCircleImageToImageView(getActivity(), imageView2, R.drawable.financial, 0, 0);

        ImageView imageView3 = view.findViewById(R.id.chatimage3);
        Utils.setCircleImageToImageView(getActivity(), imageView3, R.drawable.healthwellnes, 0, 0);

        ImageView imageView4 = view.findViewById(R.id.chatimage4);
        Utils.setCircleImageToImageView(getActivity(), imageView4, R.drawable.academic, 0, 0);

        ImageView imageView5 = view.findViewById(R.id.chatimage5);
        Utils.setCircleImageToImageView(getActivity(), imageView5, R.drawable.financial, 0, 0);

        ImageView imageView6 = view.findViewById(R.id.chatimage6);
        Utils.setCircleImageToImageView(getActivity(), imageView6, R.drawable.healthwellnes, 0, 0);





    }

}
