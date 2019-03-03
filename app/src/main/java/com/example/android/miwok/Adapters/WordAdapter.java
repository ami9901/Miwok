package com.example.android.miwok.Adapters;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.miwok.R;
import com.example.android.miwok.Extras.Word;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {
    private int mColorResourceId;

    public WordAdapter(Context context, ArrayList<Word> pWords,int mResourceId) {

        super(context,0, pWords);
        mColorResourceId=mResourceId;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;

        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        //Get the data item associated with the specified position in the data set.
        Word local_word = getItem(position);
        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_textView);
        miwokTextView.setText(local_word.getMiwokTranslation());
        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.default_textView);
        defaultTextView.setText(local_word.getDefaultTranslation());

        ImageView image =(ImageView)listItemView.findViewById(R.id.image);

        if(local_word.hasImage()){

        image.setImageResource(local_word.getImageResourceId());
        }
        else{
            image.setVisibility(View.GONE);
            //gone completely disables images unlike invisible which leaves blank space in place of image
        }
        View textContainer = listItemView.findViewById(R.id.linear2);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);

        return listItemView;
}

}
