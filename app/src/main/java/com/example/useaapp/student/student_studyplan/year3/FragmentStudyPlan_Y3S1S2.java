package com.example.useaapp.student.student_studyplan.year3;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import com.example.useaapp.R;
import com.example.useaapp.student.student_adapter.ListviewHelper;
import com.example.useaapp.student.student_studyplan.Semester;
import com.example.useaapp.student.student_studyplan.year1.Adapter_semester1;
import com.example.useaapp.student.student_studyplan.year1.Adapter_semester2;
import com.example.useaapp.student.student_studyplan.year1.FragmentStudyPlan_Y1S1S2;

import java.util.ArrayList;

public class FragmentStudyPlan_Y3S1S2 extends Fragment {
    TextView Total_hour_s1, Total_credit_s1, Total_hour_s2, Total_credit_s2;
    ListView listView_s1,listView_s2;
    ArrayList<Semester> semester1,semester2;
    Semester semester;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_study_plan__y3_s1_s2, container, false);
        listView_s1 = view.findViewById(R.id.student_study_plan_list_y3s1);
        listView_s2 = view.findViewById(R.id.student_study_plan_list_y3s2);
        //semester 1,2 listview with array list
        addDataToListS1();
        addDataToListS2();

        //calculate total hour
        //setAdapter
        listView_s1.setAdapter(new Adapter_semester1(getContext(),semester1));
        ListviewHelper.getLisViewSize(listView_s1);
        listView_s2.setAdapter(new Adapter_semester2(getContext(),semester2));
        ListviewHelper.getLisViewSize(listView_s2);

        Total_hour_s1 = view.findViewById(R.id.student_study_plan_total_hour_y3s1);
        Total_credit_s1 = view.findViewById(R.id.student_study_plan_total_credit_y3s1);
        Total_hour_s2 = view.findViewById(R.id.student_study_plan_total_hour_y3s2);
        Total_credit_s2 = view.findViewById(R.id.student_study_plan_total_credit_y3s2);

        totalHour_Credit_S1();
        totalHour_Credit_S2();

        return view;
    }

    private void addDataToListS1() {
        semester1 = new ArrayList<>();
        semester1.add(new Semester("1.","Java Programing","45","3"));
        semester1.add(new Semester("2.","ប្រវត្តិ និងវប្បធម៍អាស៊ីអាគ្នេយ៍","45","3"));
        semester1.add(new Semester("3.","រដ្ឋបាយសាធារណៈ","45","3"));
        semester1.add(new Semester("4.","កុំព្យូទ័រសម្រាប់រដ្ខបាល","45","3"));
        semester1.add(new Semester("5.","ភាសាអង់គ្លេស","45","3"));
        semester1.add(new Semester("6.","ភាសាចិន","45","0"));
    }

    private void addDataToListS2() {

        semester2 = new ArrayList<>();
        semester2.add(new Semester("1.","សេដ្ឋកិច្ចវិទ្យា","45","3"));
        semester2.add(new Semester("2.","ប្រវត្តិ និងវប្បធម៍អាស៊ីអាគ្នេយ៍","45","3"));
        semester2.add(new Semester("3.","រដ្ឋបាយសាធារណៈ","45","3"));
        semester2.add(new Semester("4.","កុំព្យូទ័រសម្រាប់រដ្ខបាល","45","3"));
        semester2.add(new Semester("5.","ភាសាអង់គ្លេស","45","3"));
        semester2.add(new Semester("6.","ភាសាចិន","45","0"));

    }

    void totalHour_Credit_S1(){
        int totalHour = 0;
        int totalCredit = 0;
        int sumHour = 0;
        int sumCredit = 0;
        for (int i=0; i<semester1.size(); i++){
            semester = semester1.get(i);
            sumHour = Integer.parseInt(semester.getHour());
            totalHour += sumHour;
        }
        for (int i=0; i<semester1.size(); i++){
            semester = semester1.get(i);
            sumCredit = Integer.parseInt(semester.getCredit());
            totalCredit += sumCredit;
        }
        Total_hour_s1.setText(String.valueOf(totalHour));
        Total_credit_s1.setText(String.valueOf(totalCredit));
    }

    void totalHour_Credit_S2(){
        int totalHour = 0; int totalCredit = 0;
        int sumHour = 0; int sumCredit = 0;
        for (int i=0; i<semester2.size(); i++){
            semester = semester2.get(i);
            sumHour = Integer.parseInt(semester.getHour());
            totalHour += sumHour;
        }
        for (int i=0; i<semester2.size(); i++){
            semester = semester2.get(i);
            sumCredit = Integer.parseInt(semester.getCredit());
            totalCredit += sumCredit;
        }
        Total_hour_s2.setText(String.valueOf(totalHour));
        Total_credit_s2.setText(String.valueOf(totalCredit));
    }
}