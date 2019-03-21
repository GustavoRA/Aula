package br.usjt.deswebmob.servicedesk;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
public class DetalheChamadoActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe_chamado);
        TextView nome = (TextView)findViewById(R.id.chamado_selecionado);
        Intent intent = getIntent();
        nome.setText(intent.getStringExtra(ListarChamadosActivity.DESCRICAO));
        <?xml version="1.0" encoding="utf-8"?>

<LinearLayout
        xmlns:android="http://schemas.android.com/apk/res/android"
        xmlns:app="http://schemas.android.com/apk/res-auto"
        xmlns:tools="http://schemas.android.com/tools"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        tools:context=".DetalhesChamadoActivity"
        android:orientation="vertical">
 <include layout="@layout/list_item"/>
</LinearLayout>

    }
}