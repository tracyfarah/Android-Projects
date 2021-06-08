package tracy.androidprojects.csc498finalexam_android;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class ListFragment extends Fragment implements CaptionedImagesAdapter.OnPlaceListener {

    public ListFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        RecyclerView recyclerView = (RecyclerView) inflater.inflate(R.layout.fragment_list, container, false);
        int n = Sneaker.sneakers.length;
        String[] sneakerNames = new String[n];
        for (int i = 0; i < n; i++)
            sneakerNames[i] = Sneaker.sneakers[i].getName();
        int[] sneakerImages = new int[n];
        for (int i = 0; i < n; i++)
            sneakerImages[i] = Sneaker.sneakers[i].getImageResource();
        CaptionedImagesAdapter captionedImagesAdapter = new CaptionedImagesAdapter(sneakerNames, sneakerImages, this);
        recyclerView.setAdapter(captionedImagesAdapter);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);
        return recyclerView;
    }

    @Override
    public void onPlaceClick(int position) {
        DetailFragment detailFragment = new DetailFragment(position);
        FragmentTransaction ft = getFragmentManager().beginTransaction();
        ft.replace(R.id.fragment_container, detailFragment);
        ft.addToBackStack(null);
        ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
        ft.commit();
    }
}