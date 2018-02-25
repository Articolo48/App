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
 * {@link Prog_Tecnologia.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link Prog_Tecnologia#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Prog_Tecnologia extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public Prog_Tecnologia() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Prog_Tecnologia.
     */
    // TODO: Rename and change types and number of parameters
    public static Prog_Tecnologia newInstance(String param1, String param2) {
        Prog_Tecnologia fragment = new Prog_Tecnologia();
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
        getActivity().setTitle("Tecnologia");
        View view = inflater.inflate(R.layout.fragment_prog__tecnologia, container, false);

        final ImageButton diecivoltemeglio  = (ImageButton) view.findViewById(R.id.dieci_volte_meglio);
        final ImageButton fratelliditalia   = (ImageButton) view.findViewById(R.id.fratelli_d_italia);
        final ImageButton lega              = (ImageButton) view.findViewById(R.id.lega);
        final ImageButton movimento5stelle  = (ImageButton) view.findViewById(R.id.movimento_5_stelle);
        final ImageButton pd                = (ImageButton) view.findViewById(R.id.pd);
        final ImageButton piueuropa         = (ImageButton) view.findViewById(R.id.piu_europa);

        final Bundle args   = new Bundle();
        final FragmentManager fragmentManager = getActivity().getSupportFragmentManager();

        lega.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment frag = new Lega_Tema();
                args.putString("tema", "Lega_Tecnologia");
                args.putString("titolo", "Tecnologia");
                frag.setArguments(args);

                fragmentManager.beginTransaction().replace(R.id.flContent, frag).addToBackStack(null) .commit();
            }
        });

        movimento5stelle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment frag = new Movimento5Stelle_Tema();
                args.putString("tema", "Movimento5Stelle_Tecnologia");
                args.putString("titolo", "Tecnologia");
                frag.setArguments(args);

                fragmentManager.beginTransaction().replace(R.id.flContent, frag).addToBackStack(null) .commit();
            }
        });


        pd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment frag = new Pd_Tema();
                args.putString("tema", "Pd_Tecnologia");
                args.putString("titolo", "Tecnologia");
                frag.setArguments(args);

                fragmentManager.beginTransaction().replace(R.id.flContent, frag).addToBackStack(null) .commit();
            }
        });



        piueuropa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment frag = new PiuEuropa_Tema();
                args.putString("tema", "PiuEuropa_Tecnologia");
                args.putString("titolo", "Tecnologia");
                frag.setArguments(args);

                fragmentManager.beginTransaction().replace(R.id.flContent, frag).addToBackStack(null) .commit();
            }
        });


        diecivoltemeglio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment frag = new DieciVolteMeglio_Tema();
                args.putString("tema", "DieciVolteMeglio_Tecnologia");
                args.putString("titolo", "Tecnologia");
                frag.setArguments(args);

                fragmentManager.beginTransaction().replace(R.id.flContent, frag).addToBackStack(null) .commit();
            }
        });

        fratelliditalia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment frag = new FratelliDItalia_Tema();
                args.putString("tema", "FratelliDItalia_Tecnologia");
                args.putString("titolo", "Tecnologia");
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
