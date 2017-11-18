package com.example.danielfigueiredo.trooperapp.Util;

import com.example.danielfigueiredo.trooperapp.Model.Tropper.Affiliation;
import com.example.danielfigueiredo.trooperapp.Model.Tropper.Trooper;
import com.example.danielfigueiredo.trooperapp.R;

/**
 * Created by daniel.figueiredo on 18/11/2017.
 */

public class ResourceUtil {

    public static int getResourceBaseOnAffiliation(Affiliation affiliation) {
        switch (affiliation) {
            case FIRST_ORDER:
                return R.drawable.first_order;
            case GALACTIC_EMPIRE:
                return R.drawable.galactic_empire;
            case GALACTIC_REPUBLIC:
                return R.drawable.galactic_republic;
            default:
                return 0;
        }
    }
}
