package example.traductor.com.fragments3;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

/**
 * A placeholder fragment containing a simple view.
 */
public class Fragment_A extends Fragment
{

    public Fragment_A()
    {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        Button llamaFragment=(Button)rootView.findViewById(R.id.llamaFragment);

        llamaFragment.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(getActivity().findViewById(R.id.containerB)!=null)
                {
                    abreFragment();

                }else{
                    abreFragmentVentana();
                }
            }
        });
        return rootView;
    }

    private void abreFragment()
    {
        //ponemos una TOAST para probar
       // CharSequence text = "Abriendooooo...";
        //int duration = Toast.LENGTH_SHORT;
        // utilizamos getActivity ya que el contexto es el de la Activity que tiene al fragment
        //Toast toast = Toast.makeText(getActivity(), text, duration);
        //toast.show();

        getFragmentManager().beginTransaction().add(R.id.containerB,new Fragment_B()).commit();
      //  Intent intento = new Intent(getActivity(),MainActivity2.class);

        //startActivityForResult(intento,1);
    }

    private void abreFragmentVentana()
    {
        //ponemos una TOAST para probar
        // CharSequence text = "Abriendooooo...";
        //int duration = Toast.LENGTH_SHORT;
        // utilizamos getActivity ya que el contexto es el de la Activity que tiene al fragment
        //Toast toast = Toast.makeText(getActivity(), text, duration);
        //toast.show();

        //getFragmentManager().beginTransaction().add(R.id.containerB,new Fragment_B()).commit();
          Intent intento = new Intent(getActivity(),MainActivity2.class);

        startActivityForResult(intento,1);
    }
}
