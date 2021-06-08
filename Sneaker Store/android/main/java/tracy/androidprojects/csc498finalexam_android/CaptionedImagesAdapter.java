package tracy.androidprojects.csc498finalexam_android;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class CaptionedImagesAdapter extends RecyclerView.Adapter<CaptionedImagesAdapter.ViewHolder> {
    private String[] captions;
    private int[] imageIds;
    private OnPlaceListener onPlaceListener;

    public CaptionedImagesAdapter(String[] captions, int[] imageIds, OnPlaceListener onPlaceListener) {
        this.captions = captions;
        this.imageIds = imageIds;
        this.onPlaceListener = onPlaceListener;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private CardView cardView;
        OnPlaceListener onPlaceListener;

        public ViewHolder(@NonNull CardView cv, OnPlaceListener onPlaceListener) {
            super(cv);
            cardView = cv;
            this.onPlaceListener = onPlaceListener;
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    onPlaceListener.onPlaceClick(getAdapterPosition());
                }
            });
        }
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        CardView cv = (CardView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card_captioned_image, viewGroup, false);
        return new ViewHolder(cv, onPlaceListener);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {
        CardView cardView = viewHolder.cardView;
        ImageView imageView = cardView.findViewById(R.id.card_image_view);
        imageView.setImageResource(imageIds[position]);
        TextView nameTextView = cardView.findViewById(R.id.card_text_view);
        nameTextView.setText(captions[position]);
    }

    @Override
    public int getItemCount() {
        return captions.length;
    }

    public interface OnPlaceListener {
        void onPlaceClick(int position);
    }

}

