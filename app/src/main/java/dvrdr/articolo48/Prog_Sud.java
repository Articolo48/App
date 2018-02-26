package dvrdr.articolo48;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link Prog_Sud.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link Prog_Sud#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Prog_Sud extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public Prog_Sud() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Prog_Sud.
     */
    // TODO: Rename and change types and number of parameters
    public static Prog_Sud newInstance(String param1, String param2) {
        Prog_Sud fragment = new Prog_Sud();
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
        getActivity().setTitle("Sud");
        View view = inflater.inflate(R.layout.fragment_prog__sud, container, false);
        final ImageButton diecivoltemeglio       = (ImageButton) view.findViewById(R.id.dieci_volte_meglio);
        final ImageButton civicapopolare         = (ImageButton) view.findViewById(R.id.civica_popolare_lorenzin);
        final ImageButton forzaitalia            = (ImageButton) view.findViewById(R.id.forzaitalia);
        final ImageButton insieme                = (ImageButton) view.findViewById(R.id.insieme);
        final ImageButton pd                     = (ImageButton) view.findViewById(R.id.pd);
        final ImageButton partitocomunista       = (ImageButton) view.findViewById(R.id.partito_comunista);
        final ImageButton poterealpopolo         = (ImageButton) view.findViewById(R.id.potere_al_popolo);
        final ImageButton sinistrarivoluzionaria = (ImageButton) view.findViewById(R.id.sinistra_rivoluzionaria);

        final Bundle args   = new Bundle();
        final FragmentManager fragmentManager = getActivity().getSupportFragmentManager();

        civicapopolare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment frag = new CivicaPopolareLorenzin_Tema();
                args.putString("tema", "CivicaPopolareLorenzin_Sud");
                args.putString("titolo", "Sud");
                frag.setArguments(args);

                fragmentManager.beginTransaction().replace(R.id.flContent, frag).addToBackStack(null) .commit();
            }
        });

        forzaitalia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment frag = new ForzaItalia_Tema();
                args.putString("tema", "ForzaItalia_Sud");
                args.putString("titolo", "Sud");
                frag.setArguments(args);

                fragmentManager.beginTransaction().replace(R.id.flContent, frag).addToBackStack(null) .commit();
            }
        });

        insieme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment frag = new Insieme_Tema();
                args.putString("tema", "Insieme_Sud");
                args.putString("titolo", "Sud");
                frag.setArguments(args);

                fragmentManager.beginTransaction().replace(R.id.flContent, frag).addToBackStack(null) .commit();
            }
        });

        pd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment frag = new Pd_Tema();
                args.putString("tema", "Pd_Sud");
                args.putString("titolo", "Sud");
                frag.setArguments(args);

                fragmentManager.beginTransaction().replace(R.id.flContent, frag).addToBackStack(null) .commit();
            }
        });

        partitocomunista.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment frag = new PartitoComunista_Tema();
                args.putString("tema", "PartitoComunista_Sud");
                args.putString("titolo", "Sud");
                frag.setArguments(args);

                fragmentManager.beginTransaction().replace(R.id.flContent, frag).addToBackStack(null) .commit();
            }
        });

        poterealpopolo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment frag = new PotereAlPopolo_Tema();
                args.putString("tema", "PotereAlPopolo_Sud");
                args.putString("titolo", "Sud");
                frag.setArguments(args);

                fragmentManager.beginTransaction().replace(R.id.flContent, frag).addToBackStack(null) .commit();
            }
        });

        sinistrarivoluzionaria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment frag = new SinistraRivoluzionaria_Tema();
                args.putString("tema", "SinistraRivoluzionaria_Sud");
                args.putString("titolo", "Sud");
                frag.setArguments(args);

                fragmentManager.beginTransaction().replace(R.id.flContent, frag).addToBackStack(null) .commit();
            }
        });

        diecivoltemeglio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment frag = new DieciVolteMeglio_Tema();
                args.putString("tema", "DieciVolteMeglio_Sud");
                args.putString("titolo", "Sud");
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
