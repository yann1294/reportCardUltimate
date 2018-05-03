package com.example.abrahamyann.reportcardultimate;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Abraham on 04/05/18.
 */
public class reportCardAdapter extends ArrayAdapter<reportCard> {


    public reportCardAdapter(Activity context, ArrayList<reportCard> reportCards){

        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.

        super(context,0,reportCards);


    }

    /**
     * Provides a view for an Adapter view (ListView, GridView, etc.)
     * @param position the position in the list of data that should be displayed in
     *                 the list item view
     * @param convertView the recycled view to populate
     * @param parent the parent ViewGroup that is used for inflation.
     * @return The view for the position in the AdapterView.
     */
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        //Check if existing view is being reused otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }
        //Get the{@link reportCard} object at this point in the list
        reportCard currentReportClass = getItem(position);
        // Find the TextView in the list_item.xml layout with the ID student_name
        TextView nameTextview = (TextView) listItemView.findViewById(R.id.studentName);
        // Get the version name from the current reportCard object and
        // set this text on the name TextView
        nameTextview.setText(currentReportClass.getStudentName());
        // Find the TextView in the list_item.xml layout with the ID student grade
        TextView gradeTextview = (TextView) listItemView.findViewById(R.id.studentGrade);
        // Get the version name from the current reportCard object and
        // set this text on the name TextView
        gradeTextview.setText(currentReportClass.getStudentGrade());

        // Find the ImageView in the list_item.xml layout with the ID student image
        ImageView studentImage = (ImageView) listItemView.findViewById(R.id.list_item_icon);
        // Get the image resource ID from the current reportCard object and
        // set the image to iconView
        studentImage.setImageResource(currentReportClass.getStudentImage());
        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;

    }
}
