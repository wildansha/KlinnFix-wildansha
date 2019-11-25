package com.gandawijaya.klinfix.view.Patner.PatnerHistory;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.gandawijaya.klinfix.R;
import com.gandawijaya.klinfix.view.User.HistoryUser.ModelFix;

import java.util.ArrayList;
import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class AdapterPatnerFix extends ArrayAdapter<ModelPatnerFix> {

    private Context context;
    private List<ModelPatnerFix> dataSet = null;
    private ArrayList<ModelPatnerFix> originDataSet = null;
    LayoutInflater inflater;

    private static class ViewHolder {
        CircleImageView idProfilFix;
        TextView idTitleAndSubtitle;
        TextView idDescripFix;
    }

    public AdapterPatnerFix(ArrayList<ModelPatnerFix> data, Context context) {
        super(context, R.layout.row_user_history_fix, data);
        this.dataSet = data;
        this.context = context;
        inflater = LayoutInflater.from(getContext());
        this.originDataSet = new ArrayList<>();
        this.originDataSet.addAll(data);
    }

    @Override
    public int getCount() {
        return dataSet.size();
    }

    @Override
    public ModelPatnerFix getItem(int position) {
        return dataSet.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @SuppressLint("SetTextI18n")
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final ModelPatnerFix dataModel = getItem(position);
        ViewHolder viewHolder;
        final View result;
        if (convertView == null) {
            viewHolder = new ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.row_user_history_fix, parent, false);
            viewHolder.idProfilFix = convertView.findViewById(R.id.idProfilFix);
            viewHolder.idTitleAndSubtitle = convertView.findViewById(R.id.idTitleAndSubtitle);
            viewHolder.idDescripFix = convertView.findViewById(R.id.idDescripFix);
            result = convertView;
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
            result = convertView;
        }
        viewHolder.idTitleAndSubtitle.setText(""+dataModel.titleHeader+" "+dataModel.codeTitleHeader);
        viewHolder.idDescripFix.setText(""+dataModel.description);
        return convertView;
    }

}

