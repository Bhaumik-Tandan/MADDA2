package com.example.madda219bit0292;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView r;
    LinearLayoutManager lm;
    List<Cardview>ul;
    RecycleView a;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initData();
        initRecylerView();
           }
           private void  initData()
           {
               ul=new ArrayList<>();
               ul.add(new Cardview(R.drawable.rg,"RAMYA.G","ITE1006 - Theory of Computation","F1+TF1"));
               ul.add(new Cardview(R.drawable.mgk,"MANGAYARKARASI R","ITE1008 - Open Source programming","C1+TC1"));
               ul.add(new Cardview(R.drawable.rc,"RAJESWARI C","ITE1014 - Human Computer Interaction","G1+TG1"));
               ul.add(new Cardview(R.drawable.sp,"SRINIVASAN P","ITE1016 - Mobile Application Development","B1+TB1"));
               ul.add(new Cardview(R.drawable.dm,"DEEPA M","ITE2001 - Computer Architecture and Organization","A1+TA1"));
               ul.add(new Cardview(R.drawable.sk,"SENTHIL KUMAR P","ITE2002 - Operating Systems","B2+TB2"));
               ul.add(new Cardview(R.drawable.rn,"RANICHANDRA C","ITE2006 - Data Mining Techniques","D1+TD1"));
               ul.add(new Cardview(R.drawable.e,"ETHNUS (APT)","STS2202 - Advanced Aptitude and Reasoning Skills","E1+TE1"));
           }
           private void initRecylerView(){
        r=findViewById(R.id.rv);
        lm=new LinearLayoutManager(this);
        lm.setOrientation(RecyclerView.VERTICAL);
        r.setLayoutManager(lm);
        a=new RecycleView(ul);
        r.setAdapter(a);
        a.notifyDataSetChanged();

           }
}