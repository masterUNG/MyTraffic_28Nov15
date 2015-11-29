package appewtc.masterung.mytraffic;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    //Explicit
    private ListView trafficListView;
    private Button aboutMeButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Bind Widget
        bindWidget();

        //Button Controller
        buttonController();

        //Create ListView
        createListView();

    }   // Main Method

    private void createListView() {

        //Icon
        int[] intIcon = new int[20];
        intIcon[0] = R.drawable.traffic_01;
        intIcon[1] = R.drawable.traffic_02;
        intIcon[2] = R.drawable.traffic_03;
        intIcon[3] = R.drawable.traffic_04;
        intIcon[4] = R.drawable.traffic_05;
        intIcon[5] = R.drawable.traffic_06;
        intIcon[6] = R.drawable.traffic_07;
        intIcon[7] = R.drawable.traffic_08;
        intIcon[8] = R.drawable.traffic_09;
        intIcon[9] = R.drawable.traffic_10;
        intIcon[10] = R.drawable.traffic_11;
        intIcon[11] = R.drawable.traffic_12;
        intIcon[12] = R.drawable.traffic_13;
        intIcon[13] = R.drawable.traffic_14;
        intIcon[14] = R.drawable.traffic_15;
        intIcon[15] = R.drawable.traffic_16;
        intIcon[16] = R.drawable.traffic_17;
        intIcon[17] = R.drawable.traffic_18;
        intIcon[18] = R.drawable.traffic_19;
        intIcon[19] = R.drawable.traffic_20;

        //Title
        String[] strTitle = new String[20];
        strTitle[0] = "หัวข้อที่ 1";
        strTitle[1] = "หัวข้อที่ 2";
        strTitle[2] = "หัวข้อที่ 3";
        strTitle[3] = "หัวข้อที่ 4";
        strTitle[4] = "หัวข้อที่ 5";
        strTitle[5] = "หัวข้อที่ 6";
        strTitle[6] = "หัวข้อที่ 7";
        strTitle[7] = "หัวข้อที่ 8";
        strTitle[8] = "หัวข้อที่ 9";
        strTitle[9] = "หัวข้อที่ 10";
        strTitle[10] = "หัวข้อที่ 11";
        strTitle[11] = "หัวข้อที่ 12";
        strTitle[12] = "หัวข้อที่ 13";
        strTitle[13] = "หัวข้อที่ 14";
        strTitle[14] = "หัวข้อที่ 15";
        strTitle[15] = "หัวข้อที่ 16";
        strTitle[16] = "หัวข้อที่ 17";
        strTitle[17] = "หัวข้อที่ 18";
        strTitle[18] = "หัวข้อที่ 19";
        strTitle[19] = "หัวข้อที่ 20";

        //Detail
        String[] strDetail = new String[20];
        strDetail[0] = "รายละเอียดที่ 1";
        strDetail[1] = "รายละเอียดที่ 2";
        strDetail[2] = "รายละเอียดที่ 3";
        strDetail[3] = "รายละเอียดที่ 4";
        strDetail[4] = "รายละเอียดที่ 5";
        strDetail[5] = "รายละเอียดที่ 6";
        strDetail[6] = "รายละเอียดที่ 7";
        strDetail[7] = "รายละเอียดที่ 8";
        strDetail[8] = "รายละเอียดที่ 9";
        strDetail[9] = "รายละเอียดที่ 10";
        strDetail[10] = "รายละเอียดที่ 11";
        strDetail[11] = "รายละเอียดที่ 12";
        strDetail[12] = "รายละเอียดที่ 13";
        strDetail[13] = "รายละเอียดที่ 14";
        strDetail[14] = "รายละเอียดที่ 15";
        strDetail[15] = "รายละเอียดที่ 16";
        strDetail[16] = "รายละเอียดที่ 17";
        strDetail[17] = "รายละเอียดที่ 18";
        strDetail[18] = "รายละเอียดที่ 19";
        strDetail[19] = "รายละเอียดที่ 20";


        MyAdapter objMyAdapter = new MyAdapter(MainActivity.this, intIcon, strTitle, strDetail);
        trafficListView.setAdapter(objMyAdapter);

    }   // createListView

    private void buttonController() {

        aboutMeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Sound Effect
                MediaPlayer buttonPlayer = MediaPlayer.create(getBaseContext(), R.raw.effect_btn_long);
                buttonPlayer.start();

                //Web View
                Intent objIntent = new Intent(Intent.ACTION_VIEW);
                objIntent.setData(Uri.parse("https://youtu.be/uzSKvYbd1XQ"));
                startActivity(objIntent);


            }   //event
        });

    }

    private void bindWidget() {

        trafficListView = (ListView) findViewById(R.id.listView);
        aboutMeButton = (Button) findViewById(R.id.button);

    }   // bindWidget

}   // Main Class นี่คือคลาสหลัก นะคะ
