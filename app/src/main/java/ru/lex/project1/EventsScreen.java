package ru.lex.project1;

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

public class EventsScreen extends ListFragment {

    String data[] = {"one", "two", "three", "four", "five",
            "six", "seven", "eight", "nine", "ten"};

    public EventsScreen() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.events_screen, container,false);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1, data);
        setListAdapter(adapter);

        return rootView;
    }


}
