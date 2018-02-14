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
 * {@link Movimento5Stelle.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link Movimento5Stelle#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Movimento5Stelle extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public Movimento5Stelle() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Movimento5Stelle.
     */
    // TODO: Rename and change types and number of parameters
    public static Movimento5Stelle newInstance(String param1, String param2) {
        Movimento5Stelle fragment = new Movimento5Stelle();
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
        getActivity().setTitle("Movimento 5 Stelle");

        View view = inflater.inflate(R.layout.fragment_movimento5_stelle, container, false);

        final Button agroalimentare  = (Button) view.findViewById(R.id.But_Agroalimentare);
        final Button ambiente        = (Button) view.findViewById(R.id.But_Ambiente);
        final Button cultura         = (Button) view.findViewById(R.id.But_Cultura);
        final Button diritti         = (Button) view.findViewById(R.id.But_Diritti);
        final Button estero          = (Button) view.findViewById(R.id.But_Estero);
        final Button famiglia        = (Button) view.findViewById(R.id.But_Famiglia);
        final Button fisco           = (Button) view.findViewById(R.id.But_Fisco);
        final Button banche          = (Button) view.findViewById(R.id.But_Banche);
        final Button giustizia       = (Button) view.findViewById(R.id.But_Giustizia);
        final Button governo         = (Button) view.findViewById(R.id.But_Governo);
        final Button immigrazione    = (Button) view.findViewById(R.id.But_Immigrazione);
        final Button impresa         = (Button) view.findViewById(R.id.But_Impresa);
        final Button infrastruttura  = (Button) view.findViewById(R.id.But_Instrastruttura);
        final Button istruzione      = (Button) view.findViewById(R.id.But_Istruzione);
        final Button lavoro          = (Button) view.findViewById(R.id.But_Lavoro);
        final Button previdenza      = (Button) view.findViewById(R.id.But_Previdenza);
        final Button societa         = (Button) view.findViewById(R.id.But_Sociale);
        final Button salute          = (Button) view.findViewById(R.id.But_Salute);
        final Button sicurezza       = (Button) view.findViewById(R.id.But_Sicurezza);
        final Button tecnologia      = (Button) view.findViewById(R.id.But_Tecnologia);
        final Button europa          = (Button) view.findViewById(R.id.But_Europa);


        agroalimentare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment frag = new Movimento5Stelle_Agroalimentare();

                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.flContent, frag).addToBackStack(null) .commit();
            }
        });

        ambiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment frag = new Movimento5Stelle_Ambiente();

                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.flContent, frag).addToBackStack(null) .commit();
            }
        });

        cultura.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment frag = new Movimento5Stelle_Cultura();

                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.flContent, frag).addToBackStack(null) .commit();
            }
        });

        diritti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment frag = new Movimento5Stelle_Diritti();

                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.flContent, frag).addToBackStack(null) .commit();
            }
        });

        estero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment frag = new Movimento5Stelle_Estero();

                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.flContent, frag).addToBackStack(null) .commit();
            }
        });

        famiglia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment frag = new Movimento5Stelle_Famiglia();

                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.flContent, frag).addToBackStack(null) .commit();
            }
        });

        fisco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment frag = new Movimento5Stelle_Fisco();

                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.flContent, frag).addToBackStack(null) .commit();
            }
        });

        banche.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment frag = new Movimento5Stelle_Banche();

                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.flContent, frag).addToBackStack(null) .commit();
            }
        });

        giustizia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment frag = new Movimento5Stelle_Giustizia();

                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.flContent, frag).addToBackStack(null) .commit();
            }
        });

        governo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment frag = new Movimento5Stelle_Governo();

                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.flContent, frag).addToBackStack(null) .commit();
            }
        });

        immigrazione.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment frag = new Movimento5Stelle_Immigrazione();

                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.flContent, frag).addToBackStack(null) .commit();
            }
        });

        impresa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment frag = new Movimento5Stelle_Impresa();

                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.flContent, frag).addToBackStack(null) .commit();
            }
        });

        infrastruttura.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment frag = new Movimento5Stelle_Infrastruttura();

                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.flContent, frag).addToBackStack(null) .commit();
            }
        });

        istruzione.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment frag = new Movimento5Stelle_Istruzione();

                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.flContent, frag).addToBackStack(null) .commit();
            }
        });

        lavoro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment frag = new Movimento5Stelle_Lavoro();

                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.flContent, frag).addToBackStack(null) .commit();
            }
        });

        previdenza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment frag = new Movimento5Stelle_Previdenza();

                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.flContent, frag).addToBackStack(null) .commit();
            }
        });

        societa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment frag = new Movimento5Stelle_Protezione_Sociale();

                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.flContent, frag).addToBackStack(null) .commit();
            }
        });

        salute.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment frag = new Movimento5Stelle_Salute();

                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.flContent, frag).addToBackStack(null) .commit();
            }
        });

        sicurezza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment frag = new Movimento5Stelle_Sicurezza();

                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.flContent, frag).addToBackStack(null) .commit();
            }
        });

        tecnologia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment frag = new Movimento5Stelle_Tecnologia();

                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.flContent, frag).addToBackStack(null) .commit();
            }
        });

        europa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment frag = new Movimento5Stelle_Unione_Europa();

                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
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
