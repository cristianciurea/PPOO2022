package ro.ase.course4.collections;

import java.util.ArrayList;
import java.util.HashMap;

public class Colectii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<HashMap<String, String>> movieList = 
				new ArrayList<HashMap<String, String>>();
		
		final String TAG_ID = "id";
		final String TAG_TITLE = "title";
		final String TAG_DURATION = "duration";
		final String TAG_RELEASE = "release";
		
		HashMap<String, String> movie =  new HashMap<String, String>();

        //adding 1st element
        movie.put(TAG_ID, "100");
        movie.put(TAG_TITLE, "Spiderman");
        movie.put(TAG_DURATION, "90");
        movie.put(TAG_RELEASE, "12-12-2018");
        // adding a movie to movie list
        movieList.add(movie);
        
        movie =  new HashMap<String, String>();
        //adding 2nd element
        movie.put(TAG_ID, "200");
        movie.put(TAG_TITLE, "Batman");
        movie.put(TAG_DURATION, "70");
        movie.put(TAG_RELEASE, "11-01-2017");
        // adding a movie to movie list
        movieList.add(movie);
        
        for(HashMap<String, String> m : movieList)
        	System.out.println(m.get(TAG_ID)+" "+m.get(TAG_TITLE)+" "+
        			m.get(TAG_DURATION)+" "+m.get(TAG_RELEASE));
	}

}
