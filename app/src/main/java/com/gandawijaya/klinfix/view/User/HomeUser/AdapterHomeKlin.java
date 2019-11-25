package com.gandawijaya.klinfix.view.User.HomeUser;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.gandawijaya.klinfix.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class AdapterHomeKlin extends ArrayAdapter<ModelHomeKlin> {

    private Context context;
    private List<ModelHomeKlin> dataSet = null;
    private ArrayList<ModelHomeKlin> originDataSet = null;
    LayoutInflater inflater;

    private static class ViewHolder {
        ImageView idImageView;
        TextView idTxtDeskripsion;
    }

    public AdapterHomeKlin(ArrayList<ModelHomeKlin> data, Context context) {
        super(context, R.layout.fragment_user_home_klin_row, data);
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
    public ModelHomeKlin getItem(int position) {
        return dataSet.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @SuppressLint("SetTextI18n")
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final ModelHomeKlin dataModel = getItem(position);
        ViewHolder viewHolder;
        final View result;
        if (convertView == null) {
            viewHolder = new ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.fragment_user_home_klin_row, parent, false);
            viewHolder.idImageView = convertView.findViewById(R.id.idImageView);
            viewHolder.idTxtDeskripsion = convertView.findViewById(R.id.idTxtDeskripsion);
            result = convertView;
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
            result = convertView;
        }

        assert dataModel != null;

        Picasso.get()
                .load(dataModel.urlImage)
                .placeholder(R.drawable.ic_noimage)
                .error(R.drawable.ic_noimage)
                .into(viewHolder.idImageView);

        viewHolder.idTxtDeskripsion.setText(""+dataModel.descImage);
        return convertView;
    }

}
