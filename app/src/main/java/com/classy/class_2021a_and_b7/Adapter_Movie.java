package com.classy.class_2021a_and_b7;

import android.content.Context;
import android.media.Image;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;

import com.bumptech.glide.Glide;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.imageview.ShapeableImageView;

import java.util.List;

public class Adapter_Movie extends RecyclerView.Adapter<Adapter_Movie.MyViewHolder> {

    private List<Movie> movies;
    private LayoutInflater mInflater;
    private MyItemClickListener mClickListener;

    // data is passed into the constructor
    Adapter_Movie(Context context, List<Movie> _movies) {
        this.mInflater = LayoutInflater.from(context);
        this.movies = _movies;
    }

    // inflates the row layout from xml when needed
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.list_movie, parent, false);
        return new MyViewHolder(view);
    }



    /*
    movie_IMG_cover
    movie_IMG_star
    main_BTN_readMore
    movie_LBL_actors
    movie_LBL_content
    movie_LBL_year
    movie_LBL_name
     */

    // binds the data to the TextView in each row
    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Log.d("pttt", "Position = " + position);
        Movie m = movies.get(position);
        holder.movie_LBL_name.setText(position + m.getName());
        holder.movie_LBL_year.setText("" + m.getYear());
        holder.movie_LBL_actors.setText(m.getActors());
        holder.movie_LBL_content.setText(m.getContent());

        Glide
                .with(mInflater.getContext())
                .load(m.getImageLink())
                .centerCrop()
                .into(holder.movie_IMG_cover);

        Glide
                .with(mInflater.getContext())
                .load(m.getStarImageLink())
                .centerCrop()
                .into(holder.movie_IMG_star);

        holder.main_BTN_readMore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mClickListener != null) {
                    mClickListener.onReadMoreClicked(v, m);
                }
            }
        });
    }

    // total number of rows
    @Override
    public int getItemCount() {
        return movies.size();
    }
    
    // convenience method for getting data at click position
    Movie getItem(int id) {
        return movies.get(id);
    }

    // allows clicks events to be caught
    public void setClickListener(MyItemClickListener itemClickListener) {
        this.mClickListener = itemClickListener;
    }

    // parent activity will implement this method to respond to click events
    public interface MyItemClickListener {
        void onItemClick(View view, int position);
        void onReadMoreClicked(View view, Movie movie);
    }



    // stores and recycles views as they are scrolled off screen
    public class MyViewHolder extends ViewHolder {

        ImageView movie_IMG_cover;
        ShapeableImageView movie_IMG_star;
        MaterialButton main_BTN_readMore;
        TextView movie_LBL_actors;
        TextView movie_LBL_content;
        TextView movie_LBL_year;
        TextView movie_LBL_name;

        MyViewHolder(View itemView) {
            super(itemView);
            movie_IMG_cover = itemView.findViewById(R.id.movie_IMG_cover);
            movie_IMG_star = itemView.findViewById(R.id.movie_IMG_star);
            main_BTN_readMore = itemView.findViewById(R.id.main_BTN_readMore);
            movie_LBL_actors = itemView.findViewById(R.id.movie_LBL_actors);
            movie_LBL_content = itemView.findViewById(R.id.movie_LBL_content);
            movie_LBL_year = itemView.findViewById(R.id.movie_LBL_year);
            movie_LBL_name = itemView.findViewById(R.id.movie_LBL_name);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (mClickListener != null) {
                        mClickListener.onItemClick(view, getAdapterPosition());
                    }
                }
            });
        }
    }

}