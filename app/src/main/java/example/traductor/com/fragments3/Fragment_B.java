package example.traductor.com.fragments3;

/**
 * Created by nelson on 23/01/15.
 */

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A placeholder fragment containing a simple view.
 */
public class Fragment_B extends Fragment
{

    public Fragment_B()
    {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        View rootView = inflater.inflate(R.layout.fragment_main_activity2, container, false);
        return rootView;
    }
}