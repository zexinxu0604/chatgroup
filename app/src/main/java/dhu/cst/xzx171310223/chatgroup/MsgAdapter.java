package dhu.cst.xzx171310223.chatgroup;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;


public class MsgAdapter extends ArrayAdapter<Msg> {


    private int resourceId;
    public MsgAdapter(Context context,int resourceId,List<Msg> list){
        super(context,resourceId,list);
        this.resourceId=resourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //
        ViewHolder viewHolder;
        View view;
        Msg msg=getItem(position);
        if (convertView==null){
            //加载布局
            view=LayoutInflater.from(getContext()).inflate(R.layout.chat_item,null);
            viewHolder=new ViewHolder();
            //查找控件
            viewHolder.left_layout=(LinearLayout)view.findViewById(R.id.left_layout);
            viewHolder.tv_left=(TextView)view.findViewById(R.id.tv_left);
            viewHolder.username=view.findViewById(R.id.username);
            view.setTag(viewHolder);
        }else{
            //直接获取
            view = convertView;
            viewHolder = (ViewHolder)view.getTag();
        }
        //设置左边的内容
        viewHolder.username.setText(msg.getuser());
        viewHolder.tv_left.setText(msg.getContent());
        return view;
    }

    static class ViewHolder{
         TextView username;
         LinearLayout left_layout;
         TextView tv_left;
    }
}

