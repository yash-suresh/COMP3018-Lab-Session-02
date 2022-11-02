package com.example.lab1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CatRecyclerViewAdapter extends
        RecyclerView.Adapter<CatRecyclerViewAdapter.CatViewHolder>
{

    private List<CatCard> data;
    private Context context;
    private LayoutInflater layoutInflater;
    public CatRecyclerViewAdapter(Context context, List<CatCard> data) {
        this.data = data;
        this.context = context;
        this.layoutInflater = (LayoutInflater)
                context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    class CatViewHolder extends RecyclerView.ViewHolder
    {


        // keep a reference to the image view and text view here
        CatViewHolder(View itemView)
        {
            super(itemView);
            // retrieve image and text views by resource ID
        }
        void bind(final CatCard cat)
        {
            catImage.setImageResource(cat.resourceID);
            // do the same with the cat name
        }
    }

    @NonNull
    @Override
    public CatRecyclerViewAdapter.CatViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull CatRecyclerViewAdapter.CatViewHolder holder, int position)
    {

    }

    @Override
    public int getItemCount()
    {
        return 0;
    }


}
