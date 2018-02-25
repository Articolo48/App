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
 * {@link Prog_Sanita.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link Prog_Sanita#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Prog_Sanita extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public Prog_Sanita() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Prog_Sanita.
     */
    // TODO: Rename and change types and number of parameters
    public static Prog_Sanita newInstance(String param1, String param2) {
        Prog_Sanita fragment = new Prog_Sanita();
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
        getActivity().setTitle("Sanità");
        View view = inflater.inflate(R.layout.fragment_prog__sanita, container, false);

        final ImageButton autodeterminazione     = (ImageButton) view.findViewById(R.id.autodeterminazione);
        final ImageButton casapound              = (ImageButton) view.findViewById(R.id.casa_pound);
        final ImageButton civicapopolare         = (ImageButton) view.findViewById(R.id.civica_popolare_lorenzin);
        final ImageButton democraziacristiana    = (ImageButton) view.findViewById(R.id.democrazia_cristiana);
        final ImageButton diecivoltemeglio       = (ImageButton) view.findViewById(R.id.dieci_volte_meglio);
        final ImageButton fratelliditalia        = (ImageButton) view.findViewById(R.id.fratelli_d_italia);
        final ImageButton frontefriulano         = (ImageButton) view.findViewById(R.id.fronte_friulano);
        final ImageButton popolofamiglia         = (ImageButton) view.findViewById(R.id.il_popolo_della_famiglia);
        final ImageButton italiaagliitaliani     = (ImageButton) view.findViewById(R.id.italia_agli_italiani);
        final ImageButton lega                   = (ImageButton) view.findViewById(R.id.lega);
        final ImageButton liberiuguali           = (ImageButton) view.findViewById(R.id.liberi_uguali);
        final ImageButton popolocostituzione     = (ImageButton) view.findViewById(R.id.lista_del_popolo_della_costituzione);
        final ImageButton maie                   = (ImageButton) view.findViewById(R.id.maie);
        final ImageButton movimento5stelle       = (ImageButton) view.findViewById(R.id.movimento_5_stelle);
        final ImageButton noiconlitalia          = (ImageButton) view.findViewById(R.id.noi_con_l_italia);
        final ImageButton partitocomunista       = (ImageButton) view.findViewById(R.id.partito_comunista);
        final ImageButton partitorepubblicano    = (ImageButton) view.findViewById(R.id.partito_repubblicano_italiano);
        final ImageButton partitovaloreumano     = (ImageButton) view.findViewById(R.id.partito_valore_umano);
        final ImageButton pd                     = (ImageButton) view.findViewById(R.id.pd);
        final ImageButton piueuropa              = (ImageButton) view.findViewById(R.id.piu_europa);
        final ImageButton poterepopolo           = (ImageButton) view.findViewById(R.id.potere_al_popolo);
        final ImageButton sinistrarivoluzionaria = (ImageButton) view.findViewById(R.id.sinistra_rivoluzionaria);
        final ImageButton siamo                  = (ImageButton) view.findViewById(R.id.siamo);

        final Bundle args   = new Bundle();
        final FragmentManager fragmentManager = getActivity().getSupportFragmentManager();

        siamo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment frag = new Siamo_Tema();
                args.putString("tema", "Siamo_Sanita");
                args.putString("titolo", "Sanita");
                frag.setArguments(args);

                fragmentManager.beginTransaction().replace(R.id.flContent, frag).addToBackStack(null) .commit();
            }
        });

        partitovaloreumano.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment frag = new PartitoValoreUmano_Tema();
                args.putString("tema", "PartitoValoreUmano_Sanita");
                args.putString("titolo", "Sanita");
                frag.setArguments(args);

                fragmentManager.beginTransaction().replace(R.id.flContent, frag).addToBackStack(null) .commit();
            }
        });

        maie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment frag = new Maie_Tema();
                args.putString("tema", "Maie_Sanita");
                args.putString("titolo", "Sanita");
                frag.setArguments(args);

                fragmentManager.beginTransaction().replace(R.id.flContent, frag).addToBackStack(null) .commit();
            }
        });

        italiaagliitaliani.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment frag = new ItaliaAgliItaliani_Tema();
                args.putString("tema", "ItaliaAgliItaliani_Sanita");
                args.putString("titolo", "Sanita");
                frag.setArguments(args);

                fragmentManager.beginTransaction().replace(R.id.flContent, frag).addToBackStack(null) .commit();
            }
        });

        frontefriulano.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment frag = new FronteFriuliano_Tema();
                args.putString("tema", "FronteFriuliano_Sanita");
                args.putString("titolo", "Sanita");
                frag.setArguments(args);

                fragmentManager.beginTransaction().replace(R.id.flContent, frag).addToBackStack(null) .commit();
            }
        });

        autodeterminazione.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment frag = new Autodeterminazione_Tema();
                args.putString("tema", "Autodeterminazione_Sanita");
                args.putString("titolo", "Sanita");
                frag.setArguments(args);

                fragmentManager.beginTransaction().replace(R.id.flContent, frag).addToBackStack(null) .commit();
            }
        });

        casapound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment frag = new CasaPound_Tema();
                args.putString("tema", "CasaPound_Sanita");
                args.putString("titolo", "Sanita");
                frag.setArguments(args);

                fragmentManager.beginTransaction().replace(R.id.flContent, frag).addToBackStack(null) .commit();
            }
        });

        civicapopolare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment frag = new CivicaPopolareLorenzin_Tema();
                args.putString("tema", "CivicaPopolareLorenzin_Sanita");
                args.putString("titolo", "Sanita");
                frag.setArguments(args);

                fragmentManager.beginTransaction().replace(R.id.flContent, frag).addToBackStack(null) .commit();
            }
        });

        democraziacristiana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment frag = new DemocraziaCristiana_Tema();
                args.putString("tema", "DemocraziaCristiana_Sanita");
                args.putString("titolo", "Sanita");
                frag.setArguments(args);

                fragmentManager.beginTransaction().replace(R.id.flContent, frag).addToBackStack(null) .commit();
            }
        });

        diecivoltemeglio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment frag = new DieciVolteMeglio_Tema();
                args.putString("tema", "DieciVolteMeglio_Sanita");
                args.putString("titolo", "Sanita");
                frag.setArguments(args);

                fragmentManager.beginTransaction().replace(R.id.flContent, frag).addToBackStack(null) .commit();
            }
        });

        fratelliditalia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment frag = new FratelliDItalia_Tema();
                args.putString("tema", "FratelliDItalia_Sanita");
                args.putString("titolo", "Sanita");
                frag.setArguments(args);

                fragmentManager.beginTransaction().replace(R.id.flContent, frag).addToBackStack(null) .commit();
            }
        });

        popolofamiglia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment frag = new IlPopoloDellaFamiglia_Tema();
                args.putString("tema", "IlPopoloDellaFamiglia_Sanita");
                args.putString("titolo", "Sanita");
                frag.setArguments(args);

                fragmentManager.beginTransaction().replace(R.id.flContent, frag).addToBackStack(null) .commit();
            }
        });

        lega.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment frag = new Lega_Tema();
                args.putString("tema", "Lega_Sanita");
                args.putString("titolo", "Sanita");
                frag.setArguments(args);

                fragmentManager.beginTransaction().replace(R.id.flContent, frag).addToBackStack(null) .commit();
            }
        });

        liberiuguali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment frag = new LiberiUguali_Tema();
                args.putString("tema", "LiberiUguali_Sanita");
                args.putString("titolo", "Sanita");
                frag.setArguments(args);

                fragmentManager.beginTransaction().replace(R.id.flContent, frag).addToBackStack(null) .commit();
            }
        });

        popolocostituzione.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment frag = new ListaDelPopoloDellaCostituzione_Tema();
                args.putString("tema", "ListaDelPopoloDellaCostituzione_Sanita");
                args.putString("titolo", "Sanita");
                frag.setArguments(args);

                fragmentManager.beginTransaction().replace(R.id.flContent, frag).addToBackStack(null) .commit();
            }
        });

        movimento5stelle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment frag = new Movimento5Stelle_Tema();
                args.putString("tema", "Movimento5Stelle_Sanita");
                args.putString("titolo", "Sanita");
                frag.setArguments(args);

                fragmentManager.beginTransaction().replace(R.id.flContent, frag).addToBackStack(null) .commit();
            }
        });

        noiconlitalia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment frag = new NoiConLItalia_Tema();
                args.putString("tema", "NoiConLItalia_Sanita");
                args.putString("titolo", "Sanita");
                frag.setArguments(args);

                fragmentManager.beginTransaction().replace(R.id.flContent, frag).addToBackStack(null) .commit();
            }
        });

        partitocomunista.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment frag = new PartitoComunista_Tema();
                args.putString("tema", "PartitoComunista_Sanita");
                args.putString("titolo", "Sanita");
                frag.setArguments(args);

                fragmentManager.beginTransaction().replace(R.id.flContent, frag).addToBackStack(null) .commit();
            }
        });

        partitorepubblicano.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment frag = new PartitoRepubblicano_Tema();
                args.putString("tema", "PartitoRepubblicano_Sanita");
                args.putString("titolo", "Sanita");
                frag.setArguments(args);

                fragmentManager.beginTransaction().replace(R.id.flContent, frag).addToBackStack(null) .commit();
            }
        });

        pd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment frag = new Pd_Tema();
                args.putString("tema", "Pd_Sanita");
                args.putString("titolo", "Sanita");
                frag.setArguments(args);

                fragmentManager.beginTransaction().replace(R.id.flContent, frag).addToBackStack(null) .commit();
            }
        });

        piueuropa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment frag = new PiuEuropa_Tema();
                args.putString("tema", "PiuEuropa_Sanita");
                args.putString("titolo", "Sanita");
                frag.setArguments(args);

                fragmentManager.beginTransaction().replace(R.id.flContent, frag).addToBackStack(null) .commit();
            }
        });

        poterepopolo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment frag = new PotereAlPopolo_Tema();
                args.putString("tema", "PotereAlPopolo_Sanita");
                args.putString("titolo", "Sanita");
                frag.setArguments(args);

                fragmentManager.beginTransaction().replace(R.id.flContent, frag).addToBackStack(null) .commit();
            }
        });

        sinistrarivoluzionaria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment frag = new SinistraRivoluzionaria_Tema();
                args.putString("tema", "SinistraRivoluzionaria_Sanita");
                args.putString("titolo", "Sanita");
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
