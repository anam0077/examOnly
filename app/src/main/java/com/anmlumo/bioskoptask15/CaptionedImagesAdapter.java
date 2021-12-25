package com.anmlumo.bioskoptask15;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

class CaptionedImagesAdapter extends RecyclerView.Adapter<CaptionedImagesAdapter.ViewHolder> {

        private String[] captions;
        private int[] imageId;

        public static class ViewHolder extends RecyclerView.ViewHolder{

            private CardView cardView;

            public ViewHolder(CardView v){
                super(v);
                cardView=v;
            }

        }
        public CaptionedImagesAdapter(String[] captions, int[] imageId){
            this.captions=captions;
            this.imageId=imageId;
        }

        @Override
        public int getItemCount() {
            return captions.length;
        }

    @NonNull
    @Override
    public CaptionedImagesAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

            CardView cv=(CardView) LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view,parent,false);
        return new ViewHolder(cv);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        CardView cardView=holder.cardView;
        ImageView imageView=(ImageView) cardView.findViewById(R.id.img_card);
        Drawable drawable= ContextCompat.getDrawable(cardView.getContext(),imageId[position]);
        imageView.setImageDrawable(drawable);
        imageView.setContentDescription(captions[position]);
        TextView textView=(TextView) cardView.findViewById(R.id.text_card);
        textView.setText(captions[position]);
    }
}
