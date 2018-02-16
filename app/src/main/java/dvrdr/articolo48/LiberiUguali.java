package dvrdr.articolo48;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link LiberiUguali.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link LiberiUguali#newInstance} factory method to
 * create an instance of this fragment.
 */
public class LiberiUguali extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public LiberiUguali() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment LiberiUguali.
     */
    // TODO: Rename and change types and number of parameters
    public static LiberiUguali newInstance(String param1, String param2) {
        LiberiUguali fragment = new LiberiUguali();
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
        getActivity().setTitle("Liberi E Uguali");
        View  view = inflater.inflate(R.layout.fragment_liberi_uguali, container, false);

        final Button agroalimentare = (Button) view.findViewById(R.id.But_Agroalimentare);
        final Button ambiente       = (Button) view.findViewById(R.id.But_Ambiente);
        final Button diritti        = (Button) view.findViewById(R.id.But_Diritti);
        final Button fisco          = (Button) view.findViewById(R.id.But_Fisco);
        final Button immigrazione   = (Button) view.findViewById(R.id.But_Immigrazione);
        final Button istruzione     = (Button) view.findViewById(R.id.But_Istruzione);
        final Button lavoro         = (Button) view.findViewById(R.id.But_Lavoro);
        final Button previdenza     = (Button) view.findViewById(R.id.But_Previdenza);
        final Button sociale        = (Button) view.findViewById(R.id.But_Sociale);
        final Button salute         = (Button) view.findViewById(R.id.But_Salute);
        final Button sicurezza      = (Button) view.findViewById(R.id.But_Sicurezza);
        final Button europa         = (Button) view.findViewById(R.id.But_Europa);
        final Fragment frag          = new LiberiUguali_Tema();
        final Bundle args            = new Bundle();
        final FragmentManager fragmentManager = getActivity().getSupportFragmentManager();

        agroalimentare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                args.putString("tema", "LiberiUguali_Agroalimentare");
                args.putString("titolo", "Agroalimentare");
                frag.setArguments(args);

                fragmentManager.beginTransaction().replace(R.id.flContent, frag).addToBackStack(null) .commit();
            }
        });

        ambiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                args.putString("tema", "LiberiUguali_Ambiente");
                args.putString("titolo", "Ambiente");
                frag.setArguments(args);

                fragmentManager.beginTransaction().replace(R.id.flContent, frag).addToBackStack(null) .commit();
            }
        });

        diritti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                args.putString("tema", "LiberiUguali_Diritti");
                args.putString("titolo", "Diritti");
                frag.setArguments(args);

                fragmentManager.beginTransaction().replace(R.id.flContent, frag).addToBackStack(null) .commit();
            }
        });

        fisco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                args.putString("tema", "LiberiUguali_Fisco");
                args.putString("titolo", "Fisco");
                frag.setArguments(args);

                fragmentManager.beginTransaction().replace(R.id.flContent, frag).addToBackStack(null) .commit();
            }
        });

        immigrazione.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                args.putString("tema", "LiberiUguali_Immigrazione");
                args.putString("titolo", "Immigrazione");
                frag.setArguments(args);

                fragmentManager.beginTransaction().replace(R.id.flContent, frag).addToBackStack(null) .commit();
            }
        });

        istruzione.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                args.putString("tema", "LiberiUguali_Istruzione");
                args.putString("titolo", "Istruzione");
                frag.setArguments(args);

                fragmentManager.beginTransaction().replace(R.id.flContent, frag).addToBackStack(null) .commit();
            }
        });

        lavoro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                args.putString("tema", "LiberiUguali_Lavoro");
                args.putString("titolo", "Lavoro");
                frag.setArguments(args);

                fragmentManager.beginTransaction().replace(R.id.flContent, frag).addToBackStack(null) .commit();
            }
        });

        previdenza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                args.putString("tema", "LiberiUguali_Previdenza");
                args.putString("titolo", "Previdenza");
                frag.setArguments(args);

                fragmentManager.beginTransaction().replace(R.id.flContent, frag).addToBackStack(null) .commit();
            }
        });

        sociale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                args.putString("tema", "LiberiUguali_Sociale");
                args.putString("titolo", "Protezione Sociale");
                frag.setArguments(args);

                fragmentManager.beginTransaction().replace(R.id.flContent, frag).addToBackStack(null) .commit();
            }
        });

        salute.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                args.putString("tema", "LiberiUguali_Salute");
                args.putString("titolo", "Salute");
                frag.setArguments(args);

                fragmentManager.beginTransaction().replace(R.id.flContent, frag).addToBackStack(null) .commit();
            }
        });

        sicurezza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                args.putString("tema", "LiberiUguali_Sicurezza");
                args.putString("titolo", "Sicurezza");
                frag.setArguments(args);

                fragmentManager.beginTransaction().replace(R.id.flContent, frag).addToBackStack(null) .commit();
            }
        });

        europa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                args.putString("tema", "LiberiUguali_Europa");
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
