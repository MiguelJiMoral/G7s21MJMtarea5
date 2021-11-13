package mx.edu.tesoem.isc.g7s21mjmtarea5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.google.gson.Gson;

public class MainActivity extends AppCompatActivity {
    EditText txtNombre, txtEdad, txtCorreo, txtGson, txtEstado, txtCurp, txtTel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNombre = findViewById(R.id.txtNombre);
        txtCorreo = findViewById(R.id.txtCorreo);
        txtEstado = findViewById(R.id.txtEstado);
        txtTel = findViewById(R.id.txtTel);
        txtEdad = findViewById(R.id.txtEdad);
        txtCurp = findViewById(R.id.txtCURP);
        txtGson = findViewById(R.id.txtGson);
    }
    public void presiona(View v){
        switch (v.getId()){
            case R.id.btnConvertir: agson();
                break;
        }
    }
    private void agson(){
        Datos datos =new Datos();
        Gson gson = new Gson();
        String cgson;
        datos.setNombre(txtNombre.getText().toString());
        datos.setEdad(Integer.parseInt(txtEdad.getText().toString()));
        datos.setCurp(txtCurp.getText().toString());
        datos.setEstado(txtEstado.getText().toString());
        datos.setCorreo(txtCorreo.getText().toString());
        datos.setTelefono(Integer.parseInt(txtTel.getText().toString()));
        cgson = gson.toJson(datos);
        txtGson.setText(cgson);

    }
}