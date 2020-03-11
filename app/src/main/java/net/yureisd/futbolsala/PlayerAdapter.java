package net.yureisd.futbolsala;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class PlayerAdapter extends ArrayAdapter<Player> {

    Activity context;

    public PlayerAdapter(ArrayList<Player> players, Activity context) {
        super(context, R.layout.player_card, players);
        this.context = context;
    }

    @Override
    public View getView(int objeto, View view, ViewGroup viewGroup){
        if (view==null){
            LayoutInflater inflater = context.getLayoutInflater();
            view = inflater.inflate(R.layout.player_card, null);
        }

        Player player = getItem(objeto);
        TextView tv = view.findViewById((R.id.txtPlayerNumberName));
        tv.setText(player.getDorsal() + " - " + player.getNombre());
        return view;
    }

}
