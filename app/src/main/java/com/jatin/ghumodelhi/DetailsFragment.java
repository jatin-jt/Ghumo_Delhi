package com.jatin.ghumodelhi;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsFragment extends Fragment {

    public static final String PLACE_ID = "anything bro";

    ImageView imgVar;
    TextView tvNameVar, tvDescriptionVar, tvTimingsVar, tvEntryFeesVar, tvlocationVar, tvWebLinkVar, tvContactVar;

    public DetailsFragment() {
        // Required empty public constructor
    }

    public static DetailsFragment newInstance(int placeId) {

        Bundle args = new Bundle();
        DetailsFragment fragment = new DetailsFragment();
        args.putInt(PLACE_ID, placeId);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_details, container, false);
        imgVar = (ImageView) rootView.findViewById(R.id.img_var);
        tvNameVar = (TextView) rootView.findViewById(R.id.tv_name_var);
        tvDescriptionVar = (TextView) rootView.findViewById(R.id.tv_description_var);
        tvTimingsVar = (TextView) rootView.findViewById(R.id.tv_timings_var);
        tvEntryFeesVar = (TextView) rootView.findViewById(R.id.tv_entry_fees_var);
        tvlocationVar = (TextView) rootView.findViewById(R.id.tv_location_var);
        tvWebLinkVar = (TextView) rootView.findViewById(R.id.tv_web_link_var);
        tvContactVar = (TextView) rootView.findViewById(R.id.tv_contact_var);

        int a = getArguments().getInt(PLACE_ID, 0);

        final Places.Place place = MainActivity.abc.get(a);

        imgVar.setImageResource(place.imageID);
        tvNameVar.setText(place.name);
        tvDescriptionVar.setText(place.description);
        tvTimingsVar.setText(place.timings);
        tvEntryFeesVar.setText(place.entryFees+"");
        tvlocationVar.setText(place.location);
        tvWebLinkVar.setText(place.webLink);
        tvContactVar.setText(place.contact);

        tvWebLinkVar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = place.webLink;
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

        tvlocationVar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri gmmIntentUri = Uri.parse(place.mapLocation);
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);

            }
        });

        tvContactVar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:"+place.contact));
                startActivity(intent);
            }
        });

        return rootView;
    }

}