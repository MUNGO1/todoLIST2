package klonit.mynotes;

import androidx.cardview.widget.CardView;

import klonit.mynotes.Models.Notes;

public interface NotesClickListener {

    void onClick (Notes notes);
    void onLongCLick (Notes notes, CardView cardView);





}
