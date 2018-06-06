package pe.com.talma.apptalma;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    //material design
    //MODEL VIEW PRESENTATION, solo para mantenimientos
    //drawable-> son vectores
    //EN VALUES dimens.xml
    //Pagina Android developers

    //==================
    //SUBIR AL GIT DESDE ANDROID STUDIO
    //FILE-> SETTING->GITHUB(VERIFICAR SI SE TIENE GIT INSTALADO EN LA OPCION GIT)
    //VCS -> IMPORT INTO VERSION CONTROL -> SHARE PROJECT ON GITHUB
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = (Button)findViewById(R.id.btnIngresar);
        //btn.setOnClickListener();
    }
}
