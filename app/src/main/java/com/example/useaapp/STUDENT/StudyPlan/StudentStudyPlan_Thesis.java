package com.example.useaapp.STUDENT.StudyPlan;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;

import com.example.useaapp.R;
import com.example.useaapp.STUDENT.StudyPlan.year1.Fragment_student_Studyplan_y1s1s2_Thesis;
import com.example.useaapp.STUDENT.StudyPlan.year2.Fragment_student_Studyplan_y2s1s2_Thesis;
import com.example.useaapp.STUDENT.StudyPlan.year3.Fragment_student_Studyplan_y3s1s2_Thesis;
import com.google.android.material.tabs.TabLayout;

public class StudentStudyPlan_Thesis extends AppCompatActivity {
    public static final String text = "txt";
    TabLayout tabLayout;
    Toolbar toolbar;
    String txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_study_plan_thesis);
        toolbar = findViewById(R.id.CustomActionbarStudentStudyPlan_th);
        setSupportActionBar(toolbar);
        setTitle(R.string.Studyplan);
        assert getSupportActionBar() != null;
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar.setNavigationOnClickListener(v -> finish());
        tabLayout = findViewById(R.id.tab_menu_studyPlan_th);

        txt = getIntent().getStringExtra(text);

        if (txt.equals("19")) {
            tabLayout.addTab(tabLayout.newTab().setText("ឆ្នាំទី១"));
            ChangeFragment(new Fragment_student_Studyplan_y1s1s2_Thesis());
            tabLayout.addTab(tabLayout.newTab().setText("ឆ្នាំទី២"));
            tabLayout.addTab(tabLayout.newTab().setText("ឆ្នាំទី៣"));
        }

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {

                switch (tab.getPosition()) {
                    case 0:
                        ChangeFragment(new Fragment_student_Studyplan_y1s1s2_Thesis());
                        break;
                    case 1:
                        ChangeFragment(new Fragment_student_Studyplan_y2s1s2_Thesis());
                        break;
                    case 2:
                        ChangeFragment(new Fragment_student_Studyplan_y3s1s2_Thesis());
                        break;
                    default:
                        Toast.makeText(StudentStudyPlan_Thesis.this, "Hi", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

    public void ChangeFragment(Fragment fragment) {
        getSupportFragmentManager().beginTransaction().replace(R.id.frame_menu_student_studyplan_th, fragment).commit();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }
}