package com.example.madda219bit0292;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;
public class RecycleView extends RecyclerView.Adapter<RecycleView.ViewHolder> {
    private List<Cardview> teacherList;
    public RecycleView(List<Cardview> teacherList) {
        this.teacherList = teacherList;
    }

    @NonNull
    @Override
    public RecycleView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.design,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecycleView.ViewHolder holder, int position) {
        int ph=teacherList.get(position).getImageView2();
        String n=teacherList.get(position).getTv1();
        String sh=teacherList.get(position).getTv2();
        String r=teacherList.get(position).getTv3();
        holder.setData(ph,n,sh,r);
    }

    @Override
    public int getItemCount() {
        return teacherList.size();
    }
    public class ViewHolder extends  RecyclerView.ViewHolder{
        private ImageView i;
        private TextView n;
        private TextView sh;
        private TextView r;
        public ViewHolder(@NonNull View iv) {
            super(iv);
            i = iv.findViewById(R.id.imageview2);
            n = iv.findViewById(R.id.tv1);
            sh =iv.findViewById(R.id.tv2);
            r =iv.findViewById(R.id.tv3);
        }
public void setData(int ik,String nk,String shk,String rk){

    i.setImageResource(ik);
    n.setText(nk);
    sh.setText(shk);
    r.setText(rk);
}
    }
}
