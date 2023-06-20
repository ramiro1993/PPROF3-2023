package com.example.proyectofinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

public class DoctorDetailsActivity extends AppCompatActivity {



    private String [][] doctor_details1 =
            {
                    {"Doctor Name : Ajit Saste", "Hospital Address : Pimpri", "Exp : 5yrs", "Mobile No: 9898989898", "600"},
                    {"Doctor Name : ramiro gomez", "Hospital Address : allende", "Exp : 2yrs", "Mobile No: 9898969898", "300"},
                    {"Doctor Name : bauti gutierrez", "Hospital Address : italiano", "Exp : 4yrs", "Mobile No: 9398969898", "400"},
                    {"Doctor Name : Miqueas Peralta", "Hospital Address : Pueyrredon", "Exp : 6yrs", "Mobile No: 9498969898", "500"},
                    {"Doctor Name : Alicia Niella", "Hospital Address : Oulton", "Exp : 3yrs", "Mobile No: 9598969898", "600"}

            };

    private String [][] doctor_details2 =
            {
                    {"Doctor Name : Ajit Saste", "Hospital Address : Pimpri", "Exp : 5yrs", "Mobile No: 9898989898", "600"},
                    {"Doctor Name : ramiro gomez", "Hospital Address : allende", "Exp : 2yrs", "Mobile No: 9898969898", "300"},
                    {"Doctor Name : bauti gutierrez", "Hospital Address : italiano", "Exp : 4yrs", "Mobile No: 9398969898", "400"},
                    {"Doctor Name : Miqueas Peralta", "Hospital Address : Pueyrredon", "Exp : 6yrs", "Mobile No: 9498969898", "500"},
                    {"Doctor Name : Alicia Niella", "Hospital Address : Oulton", "Exp : 3yrs", "Mobile No: 9598969898", "600"}

            };

    private String [][] doctor_details3 =
            {
                    {"Doctor Name : Ajit Saste", "Hospital Address : Pimpri", "Exp : 5yrs", "Mobile No: 9898989898", "600"},
                    {"Doctor Name : ramiro gomez", "Hospital Address : allende", "Exp : 2yrs", "Mobile No: 9898969898", "300"},
                    {"Doctor Name : bauti gutierrez", "Hospital Address : italiano", "Exp : 4yrs", "Mobile No: 9398969898", "400"},
                    {"Doctor Name : Miqueas Peralta", "Hospital Address : Pueyrredon", "Exp : 6yrs", "Mobile No: 9498969898", "500"},
                    {"Doctor Name : Alicia Niella", "Hospital Address : Oulton", "Exp : 3yrs", "Mobile No: 9598969898", "600"}

            };

    private String [][] doctor_details4 =
            {
                    {"Doctor Name : Ajit Saste", "Hospital Address : Pimpri", "Exp : 5yrs", "Mobile No: 9898989898", "600"},
                    {"Doctor Name : ramiro gomez", "Hospital Address : allende", "Exp : 2yrs", "Mobile No: 9898969898", "300"},
                    {"Doctor Name : bauti gutierrez", "Hospital Address : italiano", "Exp : 4yrs", "Mobile No: 9398969898", "400"},
                    {"Doctor Name : Miqueas Peralta", "Hospital Address : Pueyrredon", "Exp : 6yrs", "Mobile No: 9498969898", "500"},
                    {"Doctor Name : Alicia Niella", "Hospital Address : Oulton", "Exp : 3yrs", "Mobile No: 9598969898", "600"}

            };

    private String [][] doctor_details5 =
            {
                    {"Doctor Name : Ajit Saste", "Hospital Address : Pimpri", "Exp : 5yrs", "Mobile No: 9898989898", "600"},
                    {"Doctor Name : ramiro gomez", "Hospital Address : allende", "Exp : 2yrs", "Mobile No: 9898969898", "300"},
                    {"Doctor Name : bauti gutierrez", "Hospital Address : italiano", "Exp : 4yrs", "Mobile No: 9398969898", "400"},
                    {"Doctor Name : Miqueas Peralta", "Hospital Address : Pueyrredon", "Exp : 6yrs", "Mobile No: 9498969898", "500"},
                    {"Doctor Name : Alicia Niella", "Hospital Address : Oulton", "Exp : 3yrs", "Mobile No: 9598969898", "600"}

            };
    Button btn;
    TextView tv;
    String [][] doctor_details = {};
    HashMap<String, String> item;
    ArrayList list;
    SimpleAdapter sa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor_details);

        tv = findViewById(R.id.detalle);
        btn = findViewById(R.id.buttonDDBack);

        Intent it = getIntent();
        String title = it.getStringExtra("title");
        tv.setText(title);

        if (title.compareTo("Family Physicians")==0)
            doctor_details = doctor_details1;
        else
        if (title.compareTo("Dietician")==0)
            doctor_details = doctor_details2;
        else
        if (title.compareTo("Dentist")==0)
            doctor_details = doctor_details3;
        else
        if (title.compareTo("Surgeon")==0)
            doctor_details = doctor_details4;
        else
            doctor_details = doctor_details5;

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DoctorDetailsActivity.this,FindDoctorActivity.class));
            }
        });
        list = new ArrayList();
        for (int i = 0; i<doctor_details.length; i++) {
            item = new HashMap<String, String>();
            item.put("line1", doctor_details[i][0]);
            item.put("line2", doctor_details[i][1]);
            item.put("line3", doctor_details[i][2]);
            item.put("line4", doctor_details[i][3]);
            item.put("line5", "Cons Fees"+doctor_details[i][4] + "/-");
            list.add( item );
        }
        sa = new SimpleAdapter(this,list,
                R.layout.multi_lines,
                new String[]{"line1", "line2", "line3", "line4", "line5"},
                new int []{R.id.line_a, R.id.line_b, R.id.line_c, R.id.line_d, R.id.line_e}
        );
        ListView lst = findViewById(R.id.listViewDD);
        lst.setAdapter(sa);

    }
}