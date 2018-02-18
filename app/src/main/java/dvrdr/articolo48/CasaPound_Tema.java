package dvrdr.articolo48;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link CasaPound_Tema.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link CasaPound_Tema#newInstance} factory method to
 * create an instance of this fragment.
 */
public class CasaPound_Tema extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public CasaPound_Tema() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment CasaPound_Tema.
     */
    // TODO: Rename and change types and number of parameters
    public static CasaPound_Tema newInstance(String param1, String param2) {
        CasaPound_Tema fragment = new CasaPound_Tema();
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
        View view = inflater.inflate(R.layout.fragment_casa_pound__tema, container, false);
        Bundle args = getArguments();
        String tema = args.getString("tema");
        String titolo = args.getString("titolo");

        getActivity().setTitle(titolo.toString());

        final TextView testo_tema = (TextView) view.findViewById(R.id.CasaPound_Tema);

        if(tema.equals("CasaPound_Ambiente"))
            testo_tema.setText(R.string.CasaPound_Ambiente);
        else if (tema.equals("CasaPound_Cultura"))
            testo_tema.setText(R.string.CasaPound_Cultura);
        else if (tema.equals("CasaPound_Diritti"))
            testo_tema.setText(R.string.CasaPound_Diritti);
        else if (tema.equals("CasaPound_Energia"))
            testo_tema.setText(R.string.CasaPound_Energia);
        else if (tema.equals("CasaPound_Famiglia"))
            testo_tema.setText(R.string.CasaPound_Famiglia);
        else if (tema.equals("CasaPound_Economia"))
            testo_tema.setText(R.string.CasaPound_Economia);
        else if (tema.equals("CasaPound_Giustizia"))
            testo_tema.setText(R.string.CasaPound_Giustizia);
        else if (tema.equals("CasaPound_Sicurezza"))
            testo_tema.setText(R.string.CasaPound_Sicurezza);
        else if (tema.equals("CasaPound_Immigrazione"))
            testo_tema.setText(R.string.CasaPound_Immigrazione);
        else if (tema.equals("CasaPound_Istruzione"))
            testo_tema.setText(R.string.CasaPound_Istruzione);
        else if (tema.equals("CasaPound_Lavoro"))
            testo_tema.setText(R.string.CasaPound_Lavoro);
        else if (tema.equals("CasaPound_Salute"))
            testo_tema.setText(R.string.CasaPound_Sanita);
        else if (tema.equals("CasaPound_Europa"))
            testo_tema.setText(R.string.CasaPound_Europa);
        else
            testo_tema.setText("Tema non trovato. Ci scusiamo per l'errore.");

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
