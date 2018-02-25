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
 * {@link Programmi.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link Programmi#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Programmi extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public Programmi() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Programmi.
     */
    // TODO: Rename and change types and number of parameters
    public static Programmi newInstance(String param1, String param2) {
        Programmi fragment = new Programmi();
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
        getActivity().setTitle("Programmi");
        View view = inflater.inflate(R.layout.fragment_programmi, container, false);
        final Button agroalimentare  = (Button) view.findViewById(R.id.But_Agroalimentare);
        final Button ambiente        = (Button) view.findViewById(R.id.But_Ambiente);
        final Button banche          = (Button) view.findViewById(R.id.But_Banche);
        final Button cultura         = (Button) view.findViewById(R.id.But_Cultura);
        final Button diritti         = (Button) view.findViewById(R.id.But_Diritti);
        final Button donne           = (Button) view.findViewById(R.id.But_Donne);
        final Button famiglia        = (Button) view.findViewById(R.id.But_Famiglia);
        final Button estero          = (Button) view.findViewById(R.id.But_Estero);
        final Button energia         = (Button) view.findViewById(R.id.But_Energia);
        final Button economia        = (Button) view.findViewById(R.id.But_Economia);
        final Button giovani         = (Button) view.findViewById(R.id.But_Giovani);
        final Button giustizia       = (Button) view.findViewById(R.id.But_Giustizia);
        final Button governo         = (Button) view.findViewById(R.id.But_Governo);
        final Button immigrazione    = (Button) view.findViewById(R.id.But_Immigrazione);
        final Button impresa         = (Button) view.findViewById(R.id.But_Impresa);
        final Button infrastrutture  = (Button) view.findViewById(R.id.But_Instrastrutture);
        final Button istruzione      = (Button) view.findViewById(R.id.But_Istruzione);
        final Button lavoro          = (Button) view.findViewById(R.id.But_Lavoro);
        final Button previdenza      = (Button) view.findViewById(R.id.But_Previdenza);
        final Button societa         = (Button) view.findViewById(R.id.But_Sociale);
        final Button sanita          = (Button) view.findViewById(R.id.But_Sanita);
        final Button sicurezza       = (Button) view.findViewById(R.id.But_Sicurezza);
        final Button sud             = (Button) view.findViewById(R.id.But_Sud);
        final Button tecnologia      = (Button) view.findViewById(R.id.But_Tecnologia);
        final Button turismo         = (Button) view.findViewById(R.id.But_Turismo);
        final Button europa          = (Button) view.findViewById(R.id.But_Europa);
        final Bundle args            = new Bundle();
        final FragmentManager fragmentManager = getActivity().getSupportFragmentManager();


        energia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment frag = new Prog_Agroalimentare();
                args.putString("tema", "Prog_Energia");
                args.putString("titolo", "Energia");
                frag.setArguments(args);

                fragmentManager.beginTransaction().replace(R.id.flContent, frag).addToBackStack(null) .commit();
            }
        });

        agroalimentare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment frag = new Prog_Agroalimentare();
                args.putString("tema", "Prog_Agroalimentare");
                args.putString("titolo", "Agroalimentare");
                frag.setArguments(args);

                fragmentManager.beginTransaction().replace(R.id.flContent, frag).addToBackStack(null) .commit();
            }
        });

        ambiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment frag = new Prog_Ambiente();
                args.putString("tema", "Prog_Ambiente");
                args.putString("titolo", "Ambiente");
                frag.setArguments(args);
                fragmentManager.beginTransaction().replace(R.id.flContent, frag).addToBackStack(null) .commit();
            }
        });


        banche.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment frag = new Prog_Banche();
                args.putString("tema", "Prog_Banche");
                args.putString("titolo", "Banche");
                frag.setArguments(args);
                fragmentManager.beginTransaction().replace(R.id.flContent, frag).addToBackStack(null) .commit();
            }
        });

        cultura.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment frag = new Prog_Cultura();
                args.putString("tema", "Prog_Cultura");
                args.putString("titolo", "Cultura");
                frag.setArguments(args);
                fragmentManager.beginTransaction().replace(R.id.flContent, frag).addToBackStack(null) .commit();
            }
        });

        diritti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment frag = new Prog_Diritti();
                args.putString("tema", "Prog_Diritti");
                args.putString("titolo", "Diritti");
                frag.setArguments(args);
                fragmentManager.beginTransaction().replace(R.id.flContent, frag).addToBackStack(null) .commit();
            }
        });

        donne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment frag = new Prog_Donne();
                args.putString("tema", "Prog_Donne");
                args.putString("titolo", "Donne");
                frag.setArguments(args);
                fragmentManager.beginTransaction().replace(R.id.flContent, frag).addToBackStack(null) .commit();
            }
        });

        famiglia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment frag = new Prog_Famiglia();
                args.putString("tema", "Prog_Famiglia");
                args.putString("titolo", "Famiglia");
                frag.setArguments(args);
                fragmentManager.beginTransaction().replace(R.id.flContent, frag).addToBackStack(null) .commit();
            }
        });

        economia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment frag = new Prog_Economia();
                args.putString("tema", "Prog_Economia");
                args.putString("titolo", "Economia");
                frag.setArguments(args);
                fragmentManager.beginTransaction().replace(R.id.flContent, frag).addToBackStack(null) .commit();
            }
        });

        estero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment frag = new Prog_Estero();
                args.putString("tema", "Prog_Estero");
                args.putString("titolo", "Estero");
                frag.setArguments(args);
                fragmentManager.beginTransaction().replace(R.id.flContent, frag).addToBackStack(null) .commit();
            }
        });

        giovani.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment frag = new Prog_Giovani();
                args.putString("tema", "Prog_Giovani");
                args.putString("titolo", "Giovani");
                frag.setArguments(args);
                fragmentManager.beginTransaction().replace(R.id.flContent, frag).addToBackStack(null) .commit();
            }
        });

        giustizia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment frag = new Prog_Giustizia();
                args.putString("tema", "Prog_Giustizia");
                args.putString("titolo", "Giustizia");
                frag.setArguments(args);
                fragmentManager.beginTransaction().replace(R.id.flContent, frag).addToBackStack(null) .commit();
            }
        });

        governo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment frag = new Prog_Governo();
                args.putString("tema", "Prog_Governo");
                args.putString("titolo", "Governo");
                frag.setArguments(args);
                fragmentManager.beginTransaction().replace(R.id.flContent, frag).addToBackStack(null) .commit();
            }
        });

        immigrazione.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment frag = new Prog_Immigrazione();
                args.putString("tema", "Prog_Immigrazione");
                args.putString("titolo", "Immigrazione");
                frag.setArguments(args);
                fragmentManager.beginTransaction().replace(R.id.flContent, frag).addToBackStack(null) .commit();
            }
        });

        impresa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment frag = new Prog_Impresa();
                args.putString("tema", "Prog_Impresa");
                args.putString("titolo", "Impresa");
                frag.setArguments(args);
                fragmentManager.beginTransaction().replace(R.id.flContent, frag).addToBackStack(null) .commit();
            }
        });

        infrastrutture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment frag = new Prog_Infrastruttura();
                args.putString("tema", "Prog_Infrastrutture");
                args.putString("titolo", "Infrastrutture");
                frag.setArguments(args);
                fragmentManager.beginTransaction().replace(R.id.flContent, frag).addToBackStack(null) .commit();
            }
        });

        istruzione.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment frag = new Prog_Istruzione();
                args.putString("tema", "Prog_Istruzione");
                args.putString("titolo", "Istruzione");
                frag.setArguments(args);
                fragmentManager.beginTransaction().replace(R.id.flContent, frag).addToBackStack(null) .commit();
            }
        });

        lavoro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment frag = new Prog_Lavoro();
                args.putString("tema", "Prog_Lavoro");
                args.putString("titolo", "Lavoro");
                frag.setArguments(args);
                fragmentManager.beginTransaction().replace(R.id.flContent, frag).addToBackStack(null) .commit();
            }
        });

        previdenza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment frag = new Prog_Previdenza();
                args.putString("tema", "Prog_Previdenza");
                args.putString("titolo", "Previdenza");
                frag.setArguments(args);
                fragmentManager.beginTransaction().replace(R.id.flContent, frag).addToBackStack(null) .commit();
            }
        });

        societa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment frag = new Prog_Sociale();
                args.putString("tema", "Prog_Societa");
                args.putString("titolo", "Protezione Sociale");
                frag.setArguments(args);
                fragmentManager.beginTransaction().replace(R.id.flContent, frag).addToBackStack(null) .commit();
            }
        });

        sanita.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment frag = new Prog_Sanita();
                args.putString("tema", "Prog_Sanita");
                args.putString("titolo", "Sanità");
                frag.setArguments(args);
                fragmentManager.beginTransaction().replace(R.id.flContent, frag).addToBackStack(null) .commit();
            }
        });

        sicurezza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment frag = new Prog_Sicurezza();
                args.putString("tema", "Prog_Sicurezza");
                args.putString("titolo", "Sicurezza");
                frag.setArguments(args);
                fragmentManager.beginTransaction().replace(R.id.flContent, frag).addToBackStack(null) .commit();
            }
        });

        sud.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment frag = new Prog_Sud();
                args.putString("tema", "Prog_Sud");
                args.putString("titolo", "Sud");
                frag.setArguments(args);
                fragmentManager.beginTransaction().replace(R.id.flContent, frag).addToBackStack(null) .commit();
            }
        });

        tecnologia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment frag = new Prog_Tecnologia();
                args.putString("tema", "Prog_Tecnologia");
                args.putString("titolo", "Tecnologia");
                frag.setArguments(args);
                fragmentManager.beginTransaction().replace(R.id.flContent, frag).addToBackStack(null) .commit();
            }
        });

        europa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment frag = new Prog_Europa();
                args.putString("tema", "Prog_Europa");
                args.putString("titolo", "Europa");
                frag.setArguments(args);
                fragmentManager.beginTransaction().replace(R.id.flContent, frag).addToBackStack(null) .commit();
            }
        });

        turismo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment frag = new Prog_Turismo();
                args.putString("tema", "Prog_Turismo");
                args.putString("titolo", "Turismo");
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
