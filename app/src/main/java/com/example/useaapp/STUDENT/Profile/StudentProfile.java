package com.example.useaapp.STUDENT.Profile;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.useaapp.R;
import com.github.drjacky.imagepicker.ImagePicker;

import java.util.Objects;

import de.hdodenhof.circleimageview.CircleImageView;

public class StudentProfile extends AppCompatActivity {

    SharedPreferences sharedPreferences;
    private final static String SHARE_PREFNAME = "Student_Name";

    TextView student_name_profile, student_ID;
    ImageView change_image_in_profile;
    CircleImageView profile_image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_profile);
        Toolbar actionbar = findViewById(R.id.CustomActionbarStudentProfile);
        setSupportActionBar(actionbar);
        setTitle(R.string.StudentInformation);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        actionbar.setNavigationOnClickListener(view -> finish());


        student_name_profile = findViewById(R.id.student_name_profile);
        student_ID = findViewById(R.id.student_ID);
        sharedPreferences = getSharedPreferences(SHARE_PREFNAME, Context.MODE_PRIVATE);
        String Student_name = sharedPreferences.getString("name","");
        String Student_ID = sharedPreferences.getString("Student_ID","");
        if (Student_name !=null && Student_ID !=null){
            student_name_profile.setText(Student_name);
            student_ID.setText(Student_ID.toUpperCase());
        }

        //image picker n change profile
        change_image_in_profile = findViewById(R.id.change_image_in_profile);
        profile_image = findViewById(R.id.profile_image);

        //Major, promotion, academic year
        TextView major_in_profile = findViewById(R.id.major_in_profile);
        TextView promotion_in_profile = findViewById(R.id.promotion_in_profile);
        TextView academic_year_profile = findViewById(R.id.academic_year_profile);
        //set text
        major_in_profile.setText("IT");
        promotion_in_profile.setText("13");
        academic_year_profile.setText("2018-2022");

        //shift, date of birth, phone number
        TextView shift_in_profile = findViewById(R.id.shift_in_profile);
        TextView date_of_birth_profile = findViewById(R.id.date_of_birth_profile);
        TextView phone_number_profile = findViewById(R.id.phone_number_profile);
        //set text
        shift_in_profile.setText("ល្ងាច");
        date_of_birth_profile.setText("11-07-2000");
        phone_number_profile.setText("093794815");

        //change password btn

        change_image_in_profile.setOnClickListener(v -> ImagePicker.Companion.with(StudentProfile.this)
                .maxResultSize(1080, 1080)
                .crop().cropOval().compress(1024)
                .start(20));


    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        assert data != null;
        Uri uri = data.getData();
        profile_image.setImageURI(uri);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId()==R.id.profile_setting){
            startActivity(new Intent(StudentProfile.this,StudentSetting.class));
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.profile_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }
}