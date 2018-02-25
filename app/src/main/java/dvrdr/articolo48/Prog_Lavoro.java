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
 * {@link Prog_Lavoro.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link Prog_Lavoro#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Prog_Lavoro extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public Prog_Lavoro() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Prog_Lavoro.
     */
    // TODO: Rename and change types and number of parameters
    public static Prog_Lavoro newInstance(String param1, String param2) {
        Prog_Lavoro fragment = new Prog_Lavoro();
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
        getActivity().setTitle("Lavoro");
        View view = inflater.inflate(R.layout.fragment_prog__lavoro, container, false);

        final ImageButton blocconazionale        = (ImageButton) view.findViewById(R.id.blocco_nazionale_per_la_liberta);
        final ImageButton casapound              = (ImageButton) view.findViewById(R.id.casa_pound);
        final ImageButton civicapopolare         = (ImageButton) view.findViewById(R.id.civica_popolare_lorenzin);
        final ImageButton democraziacristiana    = (ImageButton) view.findViewById(R.id.democrazia_cristiana);
        final ImageButton diecivoltemeglio       = (ImageButton) view.findViewById(R.id.dieci_volte_meglio);
        final ImageButton forzaitalia            = (ImageButton) view.findViewById(R.id.forza_italia);
        final ImageButton fratelliditalia        = (ImageButton) view.findViewById(R.id.fratelli_d_italia);
        final ImageButton frontefriulano         = (ImageButton) view.findViewById(R.id.fronte_friulano);
        final ImageButton grandenord             = (ImageButton) view.findViewById(R.id.grande_nord);
        final ImageButton popolofamiglia         = (ImageButton) view.findViewById(R.id.il_popolo_della_famiglia);
        final ImageButton insieme                = (ImageButton) view.findViewById(R.id.insieme);
        final ImageButton lega                   = (ImageButton) view.findViewById(R.id.lega);
        final ImageButton liberiuguali           = (ImageButton) view.findViewById(R.id.liberi_uguali);
        final ImageButton popolocostituzione     = (ImageButton) view.findViewById(R.id.lista_del_popolo_della_costituzione);
        final ImageButton mic                    = (ImageButton) view.findViewById(R.id.mic);
        final ImageButton movimento5stelle       = (ImageButton) view.findViewById(R.id.movimento_5_stelle);
        final ImageButton noiconlitalia          = (ImageButton) view.findViewById(R.id.noi_con_l_italia);
        final ImageButton partitocomunista       = (ImageButton) view.findViewById(R.id.partito_comunista);
        final ImageButton partitorepubblicano    = (ImageButton) view.findViewById(R.id.partito_repubblicano_italiano);
        final ImageButton partitovaloreumano     = (ImageButton) view.findViewById(R.id.partito_valore_umano);
        final ImageButton pd                     = (ImageButton) view.findViewById(R.id.pd);
        final ImageButton piueuropa              = (ImageButton) view.findViewById(R.id.piu_europa);
        final ImageButton poterepopolo           = (ImageButton) view.findViewById(R.id.potere_al_popolo);
        final ImageButton rinascimento           = (ImageButton) view.findViewById(R.id.rinascimento);
        final ImageButton sinistrarivoluzionaria = (ImageButton) view.findViewById(R.id.sinistra_rivoluzionaria);
        final ImageButton sms                    = (ImageButton) view.findViewById(R.id.sms);
        final ImageButton siamo                  = (ImageButton) view.findViewById(R.id.siamo);

        final Bundle args   = new Bundle();
        final FragmentManager fragmentManager = getActivity().getSupportFragmentManager();


        blocconazionale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment frag = new BloccoNazionale_Tema();
                args.putString("tema", "BloccoNazionale_Lavoro");
                args.putString("titolo", "Lavoro");
                frag.setArguments(args);

                fragmentManager.beginTransaction().replace(R.id.flContent, frag).addToBackStack(null) .commit();
            }
        });

        diecivoltemeglio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment frag = new DieciVolteMeglio_Tema();
                args.putString("tema", "DieciVolteMeglio_Lavoro");
                args.putString("titolo", "Lavoro");
                frag.setArguments(args);

                fragmentManager.beginTransaction().replace(R.id.flContent, frag).addToBackStack(null) .commit();
            }
        });


        casapound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment frag = new CasaPound_Tema();
                args.putString("tema", "CasaPound_Lavoro");
                args.putString("titolo", "Lavoro");
                frag.setArguments(args);

                fragmentManager.beginTransaction().replace(R.id.flContent, frag).addToBackStack(null) .commit();
            }
        });

        civicapopolare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment frag = new CivicaPopolareLorenzin_Tema();
                args.putString("tema", "CivicaPopolareLorenzin_Lavoro");
                args.putString("titolo", "Lavoro");
                frag.setArguments(args);

                fragmentManager.beginTransaction().replace(R.id.flContent, frag).addToBackStack(null) .commit();
            }
        });

        democraziacristiana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment frag = new DemocraziaCristiana_Tema();
                args.putString("tema", "DemocraziaCristiana_Lavoro");
                args.putString("titolo", "Lavoro");
                frag.setArguments(args);

                fragmentManager.beginTransaction().replace(R.id.flContent, frag).addToBackStack(null) .commit();
            }
        });

        forzaitalia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment frag = new ForzaItalia_Tema();
                args.putString("tema", "ForzaItalia_Lavoro");
                args.putString("titolo", "Lavoro");
                frag.setArguments(args);

                fragmentManager.beginTransaction().replace(R.id.flContent, frag).addToBackStack(null) .commit();
            }
        });

        fratelliditalia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment frag = new FratelliDItalia_Tema();
                args.putString("tema", "FratelliDItalia_Lavoro");
                args.putString("titolo", "Lavoro");
                frag.setArguments(args);

                fragmentManager.beginTransaction().replace(R.id.flContent, frag).addToBackStack(null) .commit();
            }
        });

        frontefriulano.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment frag = new FronteFriuliano_Tema();
                args.putString("tema", "FronteFriuliano_Lavoro");
                args.putString("titolo", "Lavoro");
                frag.setArguments(args);

                fragmentManager.beginTransaction().replace(R.id.flContent, frag).addToBackStack(null) .commit();
            }
        });

        grandenord.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment frag = new GrandeNord_Tema();
                args.putString("tema", "GrandeNord_Lavoro");
                args.putString("titolo", "Lavoro");
                frag.setArguments(args);

                fragmentManager.beginTransaction().replace(R.id.flContent, frag).addToBackStack(null) .commit();
            }
        });

        popolofamiglia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment frag = new IlPopoloDellaFamiglia_Tema();
                args.putString("tema", "IlPopoloDellaFamiglia_Lavoro");
                args.putString("titolo", "Lavoro");
                frag.setArguments(args);

                fragmentManager.beginTransaction().replace(R.id.flContent, frag).addToBackStack(null) .commit();
            }
        });

        insieme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment frag = new Insieme_Tema();
                args.putString("tema", "Insieme_Lavoro");
                args.putString("titolo", "Lavoro");
                frag.setArguments(args);

                fragmentManager.beginTransaction().replace(R.id.flContent, frag).addToBackStack(null) .commit();
            }
        });

        lega.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment frag = new Lega_Tema();
                args.putString("tema", "Lega_Lavoro");
                args.putString("titolo", "Lavoro");
                frag.setArguments(args);

                fragmentManager.beginTransaction().replace(R.id.flContent, frag).addToBackStack(null) .commit();
            }
        });

        liberiuguali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment frag = new LiberiUguali_Tema();
                args.putString("tema", "LiberiUguali_Lavoro");
                args.putString("titolo", "Lavoro");
                frag.setArguments(args);

                fragmentManager.beginTransaction().replace(R.id.flContent, frag).addToBackStack(null) .commit();
            }
        });

        popolocostituzione.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment frag = new ListaDelPopoloDellaCostituzione_Tema();
                args.putString("tema", "ListaDelPopoloDellaCostituzione_Lavoro");
                args.putString("titolo", "Lavoro");
                frag.setArguments(args);

                fragmentManager.beginTransaction().replace(R.id.flContent, frag).addToBackStack(null) .commit();
            }
        });

        mic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment frag = new Mic_Tema();
                args.putString("tema", "Mic_Lavoro");
                args.putString("titolo", "Lavoro");
                frag.setArguments(args);

                fragmentManager.beginTransaction().replace(R.id.flContent, frag).addToBackStack(null) .commit();
            }
        });

        movimento5stelle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment frag = new Movimento5Stelle_Tema();
                args.putString("tema", "Movimento5Stelle_Lavoro");
                args.putString("titolo", "Lavoro");
                frag.setArguments(args);

                fragmentManager.beginTransaction().replace(R.id.flContent, frag).addToBackStack(null) .commit();
            }
        });

        noiconlitalia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment frag = new NoiConLItalia_Tema();
                args.putString("tema", "NoiConLItalia_Lavoro");
                args.putString("titolo", "Lavoro");
                frag.setArguments(args);

                fragmentManager.beginTransaction().replace(R.id.flContent, frag).addToBackStack(null) .commit();
            }
        });

        partitocomunista.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment frag = new PartitoComunista_Tema();
                args.putString("tema", "PartitoComunista_Lavoro");
                args.putString("titolo", "Lavoro");
                frag.setArguments(args);

                fragmentManager.beginTransaction().replace(R.id.flContent, frag).addToBackStack(null) .commit();
            }
        });

        partitorepubblicano.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment frag = new PartitoRepubblicano_Tema();
                args.putString("tema", "PartitoRepubblicano_Lavoro");
                args.putString("titolo", "Lavoro");
                frag.setArguments(args);

                fragmentManager.beginTransaction().replace(R.id.flContent, frag).addToBackStack(null) .commit();
            }
        });

        partitovaloreumano.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment frag = new PartitoValoreUmano_Tema();
                args.putString("tema", "PartitoValoreUmano_Lavoro");
                args.putString("titolo", "Lavoro");
                frag.setArguments(args);

                fragmentManager.beginTransaction().replace(R.id.flContent, frag).addToBackStack(null) .commit();
            }
        });

        pd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment frag = new Pd_Tema();
                args.putString("tema", "Pd_Lavoro");
                args.putString("titolo", "Lavoro");
                frag.setArguments(args);

                fragmentManager.beginTransaction().replace(R.id.flContent, frag).addToBackStack(null) .commit();
            }
        });

        piueuropa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment frag = new PiuEuropa_Tema();
                args.putString("tema", "PiuEuropa_Lavoro");
                args.putString("titolo", "Lavoro");
                frag.setArguments(args);

                fragmentManager.beginTransaction().replace(R.id.flContent, frag).addToBackStack(null) .commit();
            }
        });

        poterepopolo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment frag = new PotereAlPopolo_Tema();
                args.putString("tema", "PotereAlPopolo_Lavoro");
                args.putString("titolo", "Lavoro");
                frag.setArguments(args);

                fragmentManager.beginTransaction().replace(R.id.flContent, frag).addToBackStack(null) .commit();
            }
        });

        rinascimento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment frag = new Rinascimento_Tema();
                args.putString("tema", "Rinascimento_Lavoro");
                args.putString("titolo", "Lavoro");
                frag.setArguments(args);

                fragmentManager.beginTransaction().replace(R.id.flContent, frag).addToBackStack(null) .commit();
            }
        });

        sinistrarivoluzionaria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment frag = new SinistraRivoluzionaria_Tema();
                args.putString("tema", "SinistraRivoluzionaria_Lavoro");
                args.putString("titolo", "Lavoro");
                frag.setArguments(args);

                fragmentManager.beginTransaction().replace(R.id.flContent, frag).addToBackStack(null) .commit();
            }
        });

        sms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment frag = new Sms_Tema();
                args.putString("tema", "Sms_Lavoro");
                args.putString("titolo", "Lavoro");
                frag.setArguments(args);

                fragmentManager.beginTransaction().replace(R.id.flContent, frag).addToBackStack(null) .commit();
            }
        });

        siamo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment frag = new Siamo_Tema();
                args.putString("tema", "Siamo_Lavoro");
                args.putString("titolo", "Lavoro");
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
