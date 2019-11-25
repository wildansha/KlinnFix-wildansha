package com.gandawijaya.klinfix.view.Patner.PatnerProfil;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.gandawijaya.klinfix.R;
import com.gandawijaya.klinfix.view.Patner.PatnerHistory.AdapterPatnerKlin;
import com.gandawijaya.klinfix.view.Patner.PatnerHistory.ModelPatnerFix;

import java.util.ArrayList;
import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class AdapterHistoryTransaksi extends ArrayAdapter<ModelHistoryTransaksi> {

    private Context context;
    private List<ModelHistoryTransaksi> dataSet = null;
    private ArrayList<ModelHistoryTransaksi> originDataSet = null;
    LayoutInflater inflater;

    private static class ViewHolder {
        TextView idTitle;
        TextView idSubTitle;
        TextView idTotal;
    }

    public AdapterHistoryTransaksi(ArrayList<ModelHistoryTransaksi> data, Context context) {
        super(context, R.layout.activity_history_transaksi_row, data);
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
    public ModelHistoryTransaksi getItem(int position) {
        return dataSet.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @SuppressLint("SetTextI18n")
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final ModelHistoryTransaksi dataModel = getItem(position);
        ViewHolder viewHolder;
        final View result;
        if (convertView == null) {
            viewHolder = new ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.activity_history_transaksi_row, parent, false);
            viewHolder.idTitle = convertView.findViewById(R.id.idTitle);
            viewHolder.idSubTitle = convertView.findViewById(R.id.idSubTitle);
            viewHolder.idTotal = convertView.findViewById(R.id.idTotal);
            result = convertView;
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
            result = convertView;
        }

        viewHolder.idTitle.setText(dataModel.Title);
        viewHolder.idSubTitle.setText(dataModel.SubTitle);
        viewHolder.idTotal.setText(dataModel.Total);

        return convertView;
    }

}


