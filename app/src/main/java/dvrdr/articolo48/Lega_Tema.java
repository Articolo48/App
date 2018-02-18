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
 * {@link Lega_Tema.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link Lega_Tema#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Lega_Tema extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public Lega_Tema() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Lega_Tema.
     */
    // TODO: Rename and change types and number of parameters
    public static Lega_Tema newInstance(String param1, String param2) {
        Lega_Tema fragment = new Lega_Tema();
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
        View view = inflater.inflate(R.layout.fragment_lega__tema, container, false);

        Bundle args = getArguments();
        String tema = args.getString("tema");
        String titolo = args.getString("titolo");

        getActivity().setTitle(titolo.toString());

        final TextView testo_tema = (TextView) view.findViewById(R.id.Lega_Tema);

        if(tema.equals("Lega_Agroalimentare"))
            testo_tema.setText(R.string.Lega_Agroalimentare);
        else if (tema.equals("Lega_Ambiente"))
            testo_tema.setText(R.string.Lega_Ambiente);
        else if (tema.equals("Lega_Cultura"))
            testo_tema.setText(R.string.Lega_Cultura);
        else if (tema.equals("Lega_Diritti"))
            testo_tema.setText(R.string.Lega_Diritti);
        else if (tema.equals("Lega_Economia"))
            testo_tema.setText(R.string.Lega_Economia);
        else if (tema.equals("Lega_Giustizia"))
            testo_tema.setText(R.string.Lega_Giustizia);
        else if (tema.equals("Lega_Governo"))
            testo_tema.setText(R.string.Lega_Governo);
        else if (tema.equals("Lega_Immigrazione"))
            testo_tema.setText(R.string.Lega_Immigrazione);
        else if (tema.equals("Lega_Impresa"))
            testo_tema.setText(R.string.Lega_Impresa);
        else if (tema.equals("Lega_Infrastrutture"))
            testo_tema.setText(R.string.Lega_Infrastrutture);
        else if (tema.equals("Lega_Istruzione"))
            testo_tema.setText(R.string.Lega_Istruzione);
        else if (tema.equals("Lega_Lavoro"))
            testo_tema.setText(R.string.Lega_Lavoro);
        else if (tema.equals("Lega_Previdenza"))
            testo_tema.setText(R.string.Lega_Previdenza);
        else if (tema.equals("Lega_Sicurezza"))
            testo_tema.setText(R.string.Lega_Sicurezza);
        else if (tema.equals("Lega_Sanita"))
            testo_tema.setText(R.string.Lega_Sanita);
        else if (tema.equals("Lega_Tecnologia"))
            testo_tema.setText(R.string.Lega_Tecnologia);
        else if (tema.equals("Lega_Europa"))
            testo_tema.setText(R.string.Lega_Europa);
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
