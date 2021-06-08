package tracy.androidprojects.csc498finalexam_android;

import android.app.ActionBar;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class DetailFragment extends Fragment {
    final int position;

    public DetailFragment(int position) {
        this.position = position;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_detail, container, false);
        ImageView imageView = view.findViewById(R.id.detail_image_view);
        TextView textViewName = view.findViewById(R.id.detail_name_text_view);
        TextView textViewDesc = view.findViewById(R.id.detail_desc_text_view);
        imageView.setImageResource(Sneaker.sneakers[position].getImageResource());
        textViewName.setText(Sneaker.sneakers[position].getName());
        textViewDesc.setText(Sneaker.sneakers[position].toString());
        return view;
    }
}