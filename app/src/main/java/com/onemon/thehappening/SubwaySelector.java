package com.onemon.thehappening;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by OneMonster on 4/1/16.
 */
public class SubwaySelector extends Fragment {

    private List<HorizontalScrollView> hosun;
    private List<LinearLayout> hosunLinearLayout;
    private List<Button> stationButton;
    private List<String> stationNameTemp;

    /*@Override public void onCreate(Bundle savedInstanceState) {


    }*/

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.subway_selector,container,false);
        hosun = new ArrayList<HorizontalScrollView>();
        hosun.add((HorizontalScrollView)view.findViewById(R.id.hosun1));
        hosun.add((HorizontalScrollView)view.findViewById(R.id.hosun2));
        hosun.add((HorizontalScrollView)view.findViewById(R.id.hosun2_1));
        hosun.add((HorizontalScrollView)view.findViewById(R.id.hosun3));
        hosun.add((HorizontalScrollView)view.findViewById(R.id.hosun4));
        hosun.add((HorizontalScrollView)view.findViewById(R.id.hosun5));
        hosun.add((HorizontalScrollView)view.findViewById(R.id.hosun6));
        hosun.add((HorizontalScrollView)view.findViewById(R.id.hosun7));
        hosun.add((HorizontalScrollView)view.findViewById(R.id.hosun8));
        hosun.add((HorizontalScrollView)view.findViewById(R.id.hosun9));
        hosun.add((HorizontalScrollView) view.findViewById(R.id.hosun10));

        hosunLinearLayout = new ArrayList<LinearLayout>();
        hosunLinearLayout.add((LinearLayout)view.findViewById(R.id.hosun1_linear_layout));
        hosunLinearLayout.add((LinearLayout)view.findViewById(R.id.hosun2_linear_layout));
        hosunLinearLayout.add((LinearLayout)view.findViewById(R.id.hosun2_1_linear_layout));
        hosunLinearLayout.add((LinearLayout)view.findViewById(R.id.hosun3_linear_layout));
        hosunLinearLayout.add((LinearLayout)view.findViewById(R.id.hosun4_linear_layout));
        hosunLinearLayout.add((LinearLayout)view.findViewById(R.id.hosun5_linear_layout));
        hosunLinearLayout.add((LinearLayout)view.findViewById(R.id.hosun6_linear_layout));
        hosunLinearLayout.add((LinearLayout)view.findViewById(R.id.hosun7_linear_layout));
        hosunLinearLayout.add((LinearLayout)view.findViewById(R.id.hosun8_linear_layout));
        hosunLinearLayout.add((LinearLayout)view.findViewById(R.id.hosun9_linear_layout));
        hosunLinearLayout.add((LinearLayout)view.findViewById(R.id.hosun10_linear_layout));

        stationNameTemp = Arrays.asList("이번역","다음역","세번째역","홍대입구","이번역","다음역","세번째역","홍대입구","이번역","다음역","세번째역","홍대입구","이번역","다음역","세번째역","홍대입구");
        stationButton = new ArrayList<Button>();
        for(int i=0;i<stationNameTemp.size();i++) {
            stationButton.add(new Button(getActivity()));
            stationButton.get(i).setText(stationNameTemp.get(i));
        }
        for(int i=0;i<stationNameTemp.size();i++) {
            hosunLinearLayout.get(0).addView(stationButton.get(i));
        }
        hosun.get(0).setHorizontalScrollBarEnabled(false);
        return view;
    }
}
