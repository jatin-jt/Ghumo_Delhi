package com.jatin.ghumodelhi;

import java.util.ArrayList;

/**
 * Created by Dell on 29-06-2016.
 */
public class Places {

    public static class Place {
        int imageID;
        int entryFees;
        String name;
        String timings;
        String description;
        String location;
        String mapLocation;
        String webLink;
        String contact;

        public Place(int imageID, int entryFees, String name, String timings, String description, String location,String mapLocation, String webLink, String contact) {
            this.imageID = imageID;
            this.entryFees = entryFees;
            this.name = name;
            this.timings = timings;
            this.description = description;
            this.location = location;
            this.mapLocation = mapLocation;
            this.webLink = webLink;
            this.contact = contact;
        }
    }

    public static ArrayList<Place> getPlaces(){
        ArrayList<Place> placeList = new ArrayList<>();
        placeList.add(new Place(R.drawable.india_gate,20,"India Gate","8:00-22:00","bla bla bla","Janpath","geo:28.6124081,77.2281149?z=17","http://www.delhitourism.gov.in/delhitourism/tourist_place/india_gate.jsp","01127670032"));
//        placeList.add(new Place("Akshardham Temple",R.drawable.akshardham_temple));
//        placeList.add(new Place("Hauz Khas Complex",R.drawable.hauz_khas_complex));
//        placeList.add(new Place("Humayun's Tomb",R.drawable.humayun_tomb));
//        placeList.add(new Place("Jama Masjid",R.drawable.jama_masjid));
//        placeList.add(new Place("Jantar Mantar",R.drawable.jantar_mantar));
//        placeList.add(new Place("Lodi Gardens",R.drawable.lodi_gardens));
//        placeList.add(new Place("Lotus Temple",R.drawable.lotus_temple));
//        placeList.add(new Place("Qutub Mminar",R.drawable.qutub_minar));
//        placeList.add(new Place("Red Fort",R.drawable.red_fort));
        return placeList;
    }

}
