package com.example.test1;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.test1.databse.Appdb;
import com.example.test1.databse.entity.ContactEntity;

import java.util.Calendar;

public class HomeActivity extends AppCompatActivity {

    private DatePicker datePicker;
    private Calendar calendar;
    private Button btnSave;
    private EditText edtName,edtDate,edtID;
    private int year, month, day;
    private Appdb db;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        db = Appdb.getDb_instance(getApplicationContext());




        init();


        edtID.setOnKeyListener(new View.OnKeyListener() {
            public boolean onKey(View view, int keyCode, KeyEvent keyevent) {
                //If the keyevent is a key-down event on the "enter" button
                if ((keyevent.getAction() == KeyEvent.ACTION_DOWN) && (keyCode == KeyEvent.KEYCODE_ENTER)) {

                    Log.d("favas","reacher here");
                 //   Toast.makeText(getApplicationContext(),"Bismillah",Toast.LENGTH_LONG).show();

                    if(db.getContactDao().get_count_specific()>0)
                    {
                        showData();
                    }


                    return true;
                }
                return false;
            }
        });

        edtDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setDate(view);
                Toast.makeText(getApplicationContext(),edtName.getText().toString(),Toast.LENGTH_LONG).show();

            }
        });


        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(!edtID.getText().toString().trim().equals("")   && !edtName.getText().toString().trim().equals("")  )
                {
                 long cnt=   db.getContactDao().insert_contact(new ContactEntity(0,edtID.getText().toString(),edtName.getText().toString().trim()));
                 if(cnt==1)
                 {
                     Toast.makeText(getApplicationContext(),"Saved data",Toast.LENGTH_LONG).show();
                 }
                 else
                 {

                   ContactEntity contactEntity=  db.getContactDao().get_specific_data(edtID.getText().toString());
                   int update_cnt=  db.getContactDao().update(new ContactEntity(contactEntity.getId(),edtID.getText().toString(),edtName.getText().toString().trim()));

                     if(update_cnt==1)
                     {
                         Toast.makeText(getApplicationContext(),"Saved data",Toast.LENGTH_LONG).show();
                     }
                     else
                     {
                         Toast.makeText(getApplicationContext(),"Failed to save data",Toast.LENGTH_LONG).show();
                     }

                 }

                }
                else
                {
                    Toast.makeText(getApplicationContext(),"Plz enter all fields",Toast.LENGTH_LONG).show();



                }


            }
        });



    }


    private void init()
    {
        btnSave=findViewById(R.id.btnSave);
        edtName=findViewById(R.id.edtIDNo);
        edtDate=findViewById(R.id.edtDate);
        edtID=findViewById(R.id.edtID);


    }

    private void showData()
    {
       String idno=  edtID.getText().toString();

   ContactEntity entity=     db.getContactDao().get_specific_data(idno);

   if(entity!=null)
   {
       edtName.setText(entity.getName());
   }
   else
   {
       Toast.makeText(getApplicationContext(),"empty ",Toast.LENGTH_LONG).show();
   }



    }


    @SuppressWarnings("deprecation")
    public void setDate(View view) {
        showDialog(999);
        Toast.makeText(getApplicationContext(), "ca",
                        Toast.LENGTH_SHORT)
                .show();
    }

    @Override
    protected Dialog onCreateDialog(int id) {
        // TODO Auto-generated method stub
        if (id == 999) {
            return new DatePickerDialog(this,
                    myDateListener, year, month, day);
        }
        return null;
    }


    private DatePickerDialog.OnDateSetListener myDateListener = new
            DatePickerDialog.OnDateSetListener() {
                @Override
                public void onDateSet(DatePicker arg0,
                                      int arg1, int arg2, int arg3) {
                    // TODO Auto-generated method stub
                    // arg1 = year
                    // arg2 = month
                    // arg3 = day
                    showDate(arg1, arg2+1, arg3);
                }
            };

    private void showDate(int year, int month, int day) {
        edtDate.setText(new StringBuilder().append(day).append("/")
                .append(month).append("/").append(year));
    }


}
