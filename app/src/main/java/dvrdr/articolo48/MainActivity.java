package dvrdr.articolo48;

import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;


public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener, Home.OnFragmentInteractionListener,
        Coalizioni.OnFragmentInteractionListener, Partiti.OnFragmentInteractionListener, Programmi.OnFragmentInteractionListener, ComeSiVota.OnFragmentInteractionListener,
        Centro_Destra.OnFragmentInteractionListener, Centro_Sinistra.OnFragmentInteractionListener,
        Pd.OnFragmentInteractionListener, Pd_Tema.OnFragmentInteractionListener,
        PiuEuropa.OnFragmentInteractionListener, PiuEuropa_Tema.OnFragmentInteractionListener,
        Insieme.OnFragmentInteractionListener, Insieme_Tema.OnFragmentInteractionListener,
        CivicaPopolareLorenzin.OnFragmentInteractionListener,CivicaPopolareLorenzin_Tema.OnFragmentInteractionListener,
        Lega.OnFragmentInteractionListener, Lega_Tema.OnFragmentInteractionListener,
        ForzaItalia.OnFragmentInteractionListener,ForzaItalia_Tema.OnFragmentInteractionListener,
        FratelliDItalia.OnFragmentInteractionListener, FratelliDItalia_Tema.OnFragmentInteractionListener,
        NoiConLItalia.OnFragmentInteractionListener, NoiConLItalia_Tema.OnFragmentInteractionListener,
        Autodeterminazione.OnFragmentInteractionListener, Autodeterminazione_Tema.OnFragmentInteractionListener,
        BloccoNazionale.OnFragmentInteractionListener, BloccoNazionale_Tema.OnFragmentInteractionListener,
        CasaPound.OnFragmentInteractionListener,CasaPound_Tema.OnFragmentInteractionListener,
        DemocraziaCristiana.OnFragmentInteractionListener, DemocraziaCristiana_Tema.OnFragmentInteractionListener,
        DestreUnite.OnFragmentInteractionListener, DestreUnite_Tema.OnFragmentInteractionListener,
        DieciVolteMeglio.OnFragmentInteractionListener, DieciVolteMeglio_Tema.OnFragmentInteractionListener,
        FreeFlightsToItaly.OnFragmentInteractionListener,
        FronteFriuliano.OnFragmentInteractionListener, FronteFriuliano_Tema.OnFragmentInteractionListener,
        GrandeNord.OnFragmentInteractionListener, GrandeNord_Tema.OnFragmentInteractionListener,
        IlPopoloDellaFamiglia.OnFragmentInteractionListener, IlPopoloDellaFamiglia_Tema.OnFragmentInteractionListener,
        ItaliaAgliItaliani.OnFragmentInteractionListener, ItaliaAgliItaliani_Tema.OnFragmentInteractionListener,
        LiberiUguali.OnFragmentInteractionListener, LiberiUguali_Tema.OnFragmentInteractionListener,
        ListaDelPopoloDellaCostituzione.OnFragmentInteractionListener, ListaDelPopoloDellaCostituzione_Tema.OnFragmentInteractionListener,
        Maie.OnFragmentInteractionListener, Maie_Tema.OnFragmentInteractionListener,
        Mic.OnFragmentInteractionListener, Mic_Tema.OnFragmentInteractionListener,
        Movimento5Stelle.OnFragmentInteractionListener,Movimento5Stelle_Tema.OnFragmentInteractionListener,
        MovimentoDellaLiberta.OnFragmentInteractionListener,
        PartitoComunista.OnFragmentInteractionListener, PartitoComunista_Tema.OnFragmentInteractionListener,
        PartitoRepubblicanoItaliano.OnFragmentInteractionListener, PartitoRepubblicano_Tema.OnFragmentInteractionListener,
        PartitoValoreUmano.OnFragmentInteractionListener, PartitoValoreUmano_Tema.OnFragmentInteractionListener,
        PattoPerLAutonomia.OnFragmentInteractionListener, PattoPerLAutonomia_Tema.OnFragmentInteractionListener,
        PotereAlPopolo.OnFragmentInteractionListener, PotereAlPopolo_Tema.OnFragmentInteractionListener,
        Ppa.OnFragmentInteractionListener, Ppa_Tema.OnFragmentInteractionListener,
        Rinascimento.OnFragmentInteractionListener, Rinascimento_Tema.OnFragmentInteractionListener,
        Siamo.OnFragmentInteractionListener, Siamo_Tema.OnFragmentInteractionListener,
        SinistraRivoluzionaria.OnFragmentInteractionListener, SinistraRivoluzionaria_Tema.OnFragmentInteractionListener,
        Sms.OnFragmentInteractionListener, Sms_Tema.OnFragmentInteractionListener,
        Svp.OnFragmentInteractionListener, Svp_Tema.OnFragmentInteractionListener,
        Unital.OnFragmentInteractionListener,
        Usei.OnFragmentInteractionListener,
        Prog_Agroalimentare.OnFragmentInteractionListener, Prog_Ambiente.OnFragmentInteractionListener, Prog_Banche.OnFragmentInteractionListener, Prog_Cultura.OnFragmentInteractionListener,
        Prog_Diritti.OnFragmentInteractionListener, Prog_Donne.OnFragmentInteractionListener, Prog_Energia.OnFragmentInteractionListener, Prog_Estero.OnFragmentInteractionListener,
        Prog_Europa.OnFragmentInteractionListener, Prog_Famiglia.OnFragmentInteractionListener, Prog_Fisco.OnFragmentInteractionListener, Prog_Giovani.OnFragmentInteractionListener,
        Prog_Giustizia.OnFragmentInteractionListener, Prog_Governo.OnFragmentInteractionListener, Prog_Immigrazione.OnFragmentInteractionListener, Prog_Impresa.OnFragmentInteractionListener,
        Prog_Infrastruttura.OnFragmentInteractionListener, Prog_Istruzione.OnFragmentInteractionListener, Prog_Lavoro.OnFragmentInteractionListener, Prog_Previdenza.OnFragmentInteractionListener,
        Prog_Sociale.OnFragmentInteractionListener, Prog_Sanita.OnFragmentInteractionListener, Prog_Sicurezza.OnFragmentInteractionListener, Prog_Sud.OnFragmentInteractionListener,
        Prog_Tecnologia.OnFragmentInteractionListener,Prog_Turismo.OnFragmentInteractionListener
{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        if (savedInstanceState == null) {
            Fragment fragment = null;
            Class fragmentClass = null;
            fragmentClass = Home.class;
            try {
                fragment = (Fragment) fragmentClass.newInstance();
            } catch (Exception e) {
                e.printStackTrace();
            }

            FragmentManager fragmentManager = getSupportFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.flContent, fragment).commit();
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        /*if (id == R.id.action_settings) {
            return true;
        }*/

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        Fragment fragment = null;

        Class fragmentClass = null;

        switch (id){
            case R.id.nav_home:
                fragmentClass = Home.class;
                break;
            case R.id.nav_coalizioni:
                fragmentClass = Coalizioni.class;
                break;
            case R.id.nav_partiti:
                fragmentClass = Partiti.class;
                break;
            case R.id.nav_programmi:
                fragmentClass = Programmi.class;
                break;
            case R.id.nav_comesivota:
                fragmentClass = ComeSiVota.class;
                break;
            default:
                fragmentClass = Home.class;
        }

        try {
            fragment = (Fragment) fragmentClass.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.flContent, fragment).addToBackStack(null) .commit();

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
