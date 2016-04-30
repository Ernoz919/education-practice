package com.example.jv_jo.educationpratice.views;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.jv_jo.educationpratice.R;

public class Science extends AppCompatActivity {

    TextView physical;
    TextView chemistry;
    TextView astronomy;
    TextView biology;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_science);
        getSupportActionBar().hide();

        physical = (TextView) findViewById(R.id.physical);
        physical.setText("  Physical incorporates the study of the fundamental constituents of the universe, the forces and interactions that they exert on each other, and the results produced by these interactions.");

        chemistry = (TextView) findViewById(R.id.chemistry);
        chemistry.setText(" Constituting the scientific study of the subject in the atomic and molecular scale, the chemical binds primarily with collections of atoms, such as gases, molecules, crystals, and metals.");

        astronomy = (TextView) findViewById(R.id.astronomy);
        astronomy.setText(" This discipline is the science of celestial objects and phenomena that originate outside the Earth's atmosphere. It is concerned with the evolution, physics, chemistry, meteorology, and motion of celestial objects, as well as the formation and development of the universe.");

        biology = (TextView) findViewById(R.id.biology);
        biology.setText("   This field encompassa a group of disciplines that examine the phenomena related to living organisms. The studies of scale can range from biophysical subcomponents to complete ecological systems.");

    }
}
