package com.example.jv_jo.educationpratice.views;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.jv_jo.educationpratice.R;

public class Geography extends AppCompatActivity {

    TextView extensao;
    TextView analogia;
    TextView causalidade;
    TextView conexidade;
    TextView atividade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_geography);
        getSupportActionBar().hide();

        extensao = (TextView) findViewById(R.id.extensão);
        extensao.setText("  Understanding this principle is the fact that a behavioral territory during the natural selection of animal and plant species, in other words, a territory in the process of developing its economy, culture and government needs to establish its final expansion.");

        analogia = (TextView) findViewById(R.id.analogia);
        analogia.setText("  The understanding of this principle states that the duty of the geographical discipline is a description of different topics such as weather types, vegetation types, geomorphological accidents and economic activities and thus, the beginning of comparability.");

        causalidade = (TextView) findViewById(R.id.causalidade);
        causalidade.setText("   The understanding this principle is that any cause leads to effect; and any effect causes concerned; the occurrence of things in accordance with the law; the simplicity of chance do you give a name to a non-recognition of the law; There are a variety of planes of causation, but there is no leakage of law.");

        conexidade = (TextView) findViewById(R.id.conexidade);
        conexidade.setText("    The geographical analysis of the principle of connectedness comes from the link between fields of study and particular events that have occurred in history.\n" +
                "\n" +
                "   For example, deforestation of the Northeastern Zona da Mata was a very serious situation. At that time, the solution of OPEC countries was the decline in oil production in the year 1973. Thus, there was Brazilian government incentives to replace the original native forest for sugarcane planting for the development of fuel alcohol.");

        atividade = (TextView) findViewById(R.id.atividade);
        atividade.setText("    Understanding this principle is the analytical task of geography to life. It considers that the facts remain and that the continuity and non-interruption exists on the link between society and nature.");

    }
}
