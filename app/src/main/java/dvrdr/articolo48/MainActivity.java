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
        Coalizioni.OnFragmentInteractionListener, Partiti.OnFragmentInteractionListener, Programmi.OnFragmentInteractionListener,
        ComeSiVota.OnFragmentInteractionListener,
        Centro_Destra.OnFragmentInteractionListener, Centro_Sinistra.OnFragmentInteractionListener,
        Pd.OnFragmentInteractionListener, Pd_Tema.OnFragmentInteractionListener,
        PiuEuropa.OnFragmentInteractionListener,
        Insieme.OnFragmentInteractionListener,
        CivicaPopolareLorenzin.OnFragmentInteractionListener,
        Lega.OnFragmentInteractionListener,
        ForzaItalia.OnFragmentInteractionListener,ForzaItalia_Tema.OnFragmentInteractionListener,
        FratelliDItalia.OnFragmentInteractionListener,
        NoiConLItalia.OnFragmentInteractionListener,
        Autodeterminazione.OnFragmentInteractionListener,
        Blocco_Nazionale.OnFragmentInteractionListener,
        CasaPound.OnFragmentInteractionListener,CasaPound_Tema.OnFragmentInteractionListener,
        DemocraziaCristiana.OnFragmentInteractionListener,
        DestreUnite.OnFragmentInteractionListener,
        DieciVolteMeglio.OnFragmentInteractionListener,
        FreeFlightsToItaly.OnFragmentInteractionListener,
        FronteFriuliano.OnFragmentInteractionListener,
        GrandeNord.OnFragmentInteractionListener,
        IlPopoloDellaFamiglia.OnFragmentInteractionListener,
        ItaliaAgliItaliani.OnFragmentInteractionListener,
        LiberiUguali.OnFragmentInteractionListener,
        ListaDelPopoloDellaCostituzione.OnFragmentInteractionListener,
        Maie.OnFragmentInteractionListener,
        Mic.OnFragmentInteractionListener,
        Movimento5Stelle.OnFragmentInteractionListener,Movimento5Stelle_Tema.OnFragmentInteractionListener,
        MovimentoDellaLiberta.OnFragmentInteractionListener,
        PartitoComunista.OnFragmentInteractionListener,
        PartitoRepubblicanoItaliano.OnFragmentInteractionListener,
        PartitoValoreUmano.OnFragmentInteractionListener,
        PattoPerLAutonomia.OnFragmentInteractionListener,
        PotereAlPopolo.OnFragmentInteractionListener,
        Ppa.OnFragmentInteractionListener,
        Rinascimento.OnFragmentInteractionListener,
        Siamo.OnFragmentInteractionListener,
        SinistraRivoluzionaria.OnFragmentInteractionListener,
        Sms.OnFragmentInteractionListener,
        Svp.OnFragmentInteractionListener,
        Unital.OnFragmentInteractionListener,
        Usei.OnFragmentInteractionListener
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


        /*if (id == R.id.nav_home) {

        } else if (id == R.id.nav_coalizioni) {
            fragmentClass = Home.class;
        } else if (id == R.id.nav_partiti) {
            fragmentClass = Home.class;
        } else if (id == R.id.nav_programmi) {
            fragmentClass = Home.class;
        }*/
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
