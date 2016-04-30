package com.example.jv_jo.educationpratice.views;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.jv_jo.educationpratice.R;

public class History extends AppCompatActivity {
    TextView history;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);
        getSupportActionBar().hide();

        history = (TextView) findViewById(R.id.history);
        history.setText("   History is the science that studies the man and his action in time and space, concurrent with the analysis of processes and events in the past. But here we will see a brief summary of the darkest event in human history: World War II.\n" +
                "\n" +
                "   The Second World War was a global military conflict that lasted from 1939 to 1945, involving most of the world's nations - including all the major powers - organized into two opposing military alliances: the Allies and the Axis. It was the most comprehensive war in history, with over 100 million mobilized military. In a state of \"total war,\" the major players devoted all their economic capacity, industry and science in the service of the war effort, leaving aside the distinction between civilian and military resources. Marked by a significant number of attacks on civilians, including the Holocaust and the only time nuclear weapons were used in combat, it was the deadliest conflict in human history, resulting from 50 to more than 70 million deaths.\n" +
                "\n" +
                "   It is generally considered the starting point of the war as the invasion of Poland by Nazi Germany on September 1, 1939 and subsequent declarations of war against Germany by France and most of the British Empire and Commonwealth countries. Some countries were already at war at this time, such as Ethiopia and the Kingdom of Italy in the Second Italo-Ethiopian War and China and Japan in the Second Sino-Japanese War. Many who were not involved ended up initially adhering to the conflict in response to events such as the invasion of the Soviet Union by the Germans and the Japanese attacks on US forces in the Pacific in Pearl Harbor and British ultramarítimas colonies, which resulted in declarations of war against Japan by the United States, the Netherlands and the Commonwealth British.\n" +
                "\n" +
                "   The war ended with the victory of the Allies in 1945, significantly changed the political alignment and the global social structure. While the United Nations (UN) was established to encourage global cooperation and prevent future conflicts, the Soviet Union and the United States emerged as rival superpowers, setting the stage for a Cold War that would last for the next forty-six years ( 1945-1991). Meanwhile, the acceptance of the principle of self-determination accelerated decolonization movements in Asia and Africa, while Western Europe initiating a movement of economic recovery and political integration.\n" +
                "\n" +
                "\"May the example of those who were exterminated here between 1933-1945 for resisting the Nazis help unite the living to the defense of peace and freedom and respect for its like.\"\n" +
                "\n" +
                "- Concentration camp Dachau, Germany");
    }
}
