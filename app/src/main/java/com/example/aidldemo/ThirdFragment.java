package com.example.aidldemo;


import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


public class ThirdFragment extends Fragment {


    private ImageView iv;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_third, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        iv = getView().findViewById(R.id.imageView);
        final ObjectAnimator oaX = ObjectAnimator.ofFloat(iv,"scaleX",0);
        final ObjectAnimator oaY = ObjectAnimator.ofFloat(iv,"scaleY",0);
        oaX.setDuration(500);
        oaY.setDuration(500);
        iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!oaX.isRunning()){
                    oaX.setFloatValues(iv.getScaleX()+0.1f);
                    oaY.setFloatValues(iv.getScaleY()+0.1f);
                    oaX.start();
                    oaY.start();
                }

            }
        });
    }


}
