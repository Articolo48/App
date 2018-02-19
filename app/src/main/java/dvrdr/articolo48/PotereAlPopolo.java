package dvrdr.articolo48;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link PotereAlPopolo.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link PotereAlPopolo#newInstance} factory method to
 * create an instance of this fragment.
 */
public class PotereAlPopolo extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public PotereAlPopolo() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment PotereAlPopolo.
     */
    // TODO: Rename and change types and number of parameters
    public static PotereAlPopolo newInstance(String param1, String param2) {
        PotereAlPopolo fragment = new PotereAlPopolo();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        getActivity().setTitle("Potere Al Popolo!");
        View view = inflater.inflate(R.layout.fragment_potere_al_popolo, container, false);

        final Button ambiente        = (Button) view.findViewById(R.id.But_Ambiente);
        final Button cultura         = (Button) view.findViewById(R.id.But_Cultura);
        final Button donne           = (Button) view.findViewById(R.id.But_Donne);
        final Button europa          = (Button) view.findViewById(R.id.But_Europa);
        final Button economia        = (Button) view.findViewById(R.id.But_Economia);
        final Button giustizia       = (Button) view.findViewById(R.id.But_Giustizia);
        final Button immigrazione    = (Button) view.findViewById(R.id.But_Immigrazione);
        final Button instratrutture  = (Button) view.findViewById(R.id.But_Infrastrutture);
        final Button istruzione      = (Button) view.findViewById(R.id.But_Istruzione);
        final Button lavoro          = (Button) view.findViewById(R.id.But_Lavoro);
        final Button previdenza      = (Button) view.findViewById(R.id.But_Previdenza);
        final Button sanita          = (Button) view.findViewById(R.id.But_Sanita);
        final Button sicurezza       = (Button) view.findViewById(R.id.But_Sicurezza);
        final Button sud             = (Button) view.findViewById(R.id.But_Sud);
        final Fragment frag          = new PotereAlPopolo_Tema();
        final Bundle args            = new Bundle();
        final FragmentManager fragmentManager = getActivity().getSupportFragmentManager();

        ambiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                args.putString("tema", "PotereAlPopolo_Ambiente");
                args.putString("titolo", "Ambiente");
                frag.setArguments(args);
                fragmentManager.beginTransaction().replace(R.id.flContent, frag).addToBackStack(null) .commit();
            }
        });

        cultura.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                args.putString("tema", "PotereAlPopolo_Cultura");
                args.putString("titolo", "Cultura");
                frag.setArguments(args);
                fragmentManager.beginTransaction().replace(R.id.flContent, frag).addToBackStack(null) .commit();
            }
        });

  /*      donne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                args.putString("tema", "PotereAlPopolo_Donne");
                args.putString("titolo", "Donne");
                frag.setArguments(args);
                fragmentManager.beginTransaction().replace(R.id.flContent, frag).addToBackStack(null) .commit();
            }
        });
*/
        economia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                args.putString("tema", "PotereAlPopolo_Economia");
                args.putString("titolo", "Economia");
                frag.setArguments(args);
                fragmentManager.beginTransaction().replace(R.id.flContent, frag).addToBackStack(null) .commit();
            }
        });

        giustizia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                args.putString("tema", "PotereAlPopolo_Giustizia");
                args.putString("titolo", "Giustizia");
                frag.setArguments(args);
                fragmentManager.beginTransaction().replace(R.id.flContent, frag).addToBackStack(null) .commit();
            }
        });

        immigrazione.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                args.putString("tema", "PotereAlPopolo_Immigrazione");
                args.putString("titolo", "Immigrazione");
                frag.setArguments(args);
                fragmentManager.beginTransaction().replace(R.id.flContent, frag).addToBackStack(null) .commit();
            }
        });


        istruzione.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                args.putString("tema", "PotereAlPopolo_Istruzione");
                args.putString("titolo", "Istruzione");
                frag.setArguments(args);
                fragmentManager.beginTransaction().replace(R.id.flContent, frag).addToBackStack(null) .commit();
            }
        });



        lavoro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                args.putString("tema", "PotereAlPopolo_Lavoro");
                args.putString("titolo", "Lavoro");
                frag.setArguments(args);
                fragmentManager.beginTransaction().replace(R.id.flContent, frag).addToBackStack(null) .commit();
            }
        });

        previdenza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                args.putString("tema", "PotereAlPopolo_Previdenza");
                args.putString("titolo", "Previdenza");
                frag.setArguments(args);
                fragmentManager.beginTransaction().replace(R.id.flContent, frag).addToBackStack(null) .commit();
            }
        });

        sanita.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                args.putString("tema", "PotereAlPopolo_Sanita");
                args.putString("titolo", "Sanità");
                frag.setArguments(args);
                fragmentManager.beginTransaction().replace(R.id.flContent, frag).addToBackStack(null) .commit();
            }
        });

        sicurezza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                args.putString("tema", "PotereAlPopolo_Sicurezza");
                args.putString("titolo", "Sicurezza");
                frag.setArguments(args);
                fragmentManager.beginTransaction().replace(R.id.flContent, frag).addToBackStack(null) .commit();
            }
        });

        sud.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                args.putString("tema", "PotereAlPopolo_Sud");
                args.putString("titolo", "Sud");
                frag.setArguments(args);
                fragmentManager.beginTransaction().replace(R.id.flContent, frag).addToBackStack(null) .commit();
            }
        });

        europa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                args.putString("tema", "PotereAlPopolo_Europa");
                args.putString("titolo", "Europa");
                frag.setArguments(args);
                fragmentManager.beginTransaction().replace(R.id.flContent, frag).addToBackStack(null) .commit();
            }
        });

        return view;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
