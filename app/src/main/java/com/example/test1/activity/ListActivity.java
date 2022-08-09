package com.example.test1.activity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.test1.R;
import com.example.test1.adapter.Adapter1;
import com.example.test1.databse.Appdb;
import com.example.test1.databse.entity.ContactEntity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class ListActivity extends AppCompatActivity {

  //  private RecyclerView recv;
    private ListView lv1;
    Adapter1 adp;
    private List<String> list;
    SimpleAdapter    AD;
    private Appdb db;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);



        init();


        if(db.getContactDao().get_count_specific()>0)
        {
            showList();
        }


//        list=new ArrayList<>();
//
//        for(int j=0;j<10;j++)
//        {
//         list.add(""+j) ;
//        }

    //    adp=new Adapter1(getApplicationContext(),list);


//        LinearLayoutManager lm = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false);
//        recv.setLayoutManager(lm);
//        recv.setAdapter(adp);












    }

    private  void init()
    {
        db = Appdb.getDb_instance(getApplicationContext());
        //recv=findViewById(R.id.recv);
        lv1=findViewById(R.id.lv1);



    }


    private  void showList()
    {
        List<Map<String, String>> data = null;
        data = new ArrayList<Map<String,String>>();
        data.clear();


        List<ContactEntity> list_entity =  db.getContactDao().get_full_records();

           for(int j=0;j< list_entity.size();j++)
           {
               Map<String, String> datanum = new HashMap<String, String>();

               datanum.put("Name",list_entity.get(j).getName());
               datanum.put("No",list_entity.get(j).getNo());


               data.add(datanum);



               String[] from = {"No","Name"};
               int[] views = {R.id.txtNo,R.id.txtName};

               AD = new SimpleAdapter(ListActivity.this, data, R.layout.model_list, from, views);
               lv1.setAdapter(AD);



           }






    }





}
