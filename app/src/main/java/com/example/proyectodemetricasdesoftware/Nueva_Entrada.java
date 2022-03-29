package com.example.proyectodemetricasdesoftware;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import java.io.*;
import java.lang.*;

import org.w3c.dom.Text;

public class Nueva_Entrada extends AppCompatActivity {

    public String varibles[][];
    public String varibles_2[][];

    public int N1_total=0;
    public int total_n1=0;
    public int N2_total=0;
    public int total_n2=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nueva_entrada);

        TextView codigo = (TextView) findViewById(R.id.edit_text) ; /*TEXTAREA PARA EL CÓDIGO*/
        codigo.setText("\n");
        codigo.append("Attempt 1");
        codigo.append("\nAttempt 2");
        codigo.setGravity(Gravity.CENTER);

        /*PASAR INFORMACIÓN EN VARIABLES GLOBALES Y AGREGAR UNA VARIABLE NÚMERICA A LA FUNCIÓN PARA UBICAR EL DATO A TRABAJAR*/
        init_table_dato();
        init_table_dato2();
        init_table_resultado();
    }

    public void init_table_dato()/*TABLA 1 DE DATOS - N1*/{
        TableLayout table_1 = (TableLayout) findViewById(R.id.table_dato);
        TableRow table_row = new TableRow(this);
        table_row.setWeightSum(3);

        TableRow.LayoutParams tableRowparam = new TableRow.LayoutParams();
        tableRowparam.weight=1f;
        TextView table_info_1 = new TextView(this);
        table_info_1.setText("1");
        table_info_1.setGravity(Gravity.CENTER);
        table_info_1.setLayoutParams(tableRowparam);
        table_row.addView(table_info_1);

        TextView table_info_2 = new TextView(this);
        table_info_2.setText("2");
        table_info_2.setGravity(Gravity.CENTER);
        table_info_2.setLayoutParams(tableRowparam);
        table_row.addView(table_info_2);

        TextView table_info_3 = new TextView(this);
        table_info_3.setText("3");
        table_info_3.setGravity(Gravity.CENTER);
        table_info_3.setLayoutParams(tableRowparam);
        table_row.addView(table_info_3);

        table_1.addView(table_row);
    }

    public void init_table_dato2()/*TABLA 2 DE DATOS -N1*/{
        TableLayout table_1 = (TableLayout) findViewById(R.id.table_dato2);
        TableRow table_row = new TableRow(this);
        table_row.setWeightSum(3);

        TableRow.LayoutParams tableRowparam = new TableRow.LayoutParams();
        tableRowparam.weight=1f;
        TextView table_info_1 = new TextView(this);
        table_info_1.setText("1");
        table_info_1.setGravity(Gravity.CENTER);
        table_info_1.setLayoutParams(tableRowparam);
        table_row.addView(table_info_1);

        TextView table_info_2 = new TextView(this);
        table_info_2.setText("2");
        table_info_2.setGravity(Gravity.CENTER);
        table_info_2.setLayoutParams(tableRowparam);
        table_row.addView(table_info_2);

        TextView table_info_3 = new TextView(this);
        table_info_3.setText("3");
        table_info_3.setGravity(Gravity.CENTER);
        table_info_3.setLayoutParams(tableRowparam);
        table_row.addView(table_info_3);

        table_1.addView(table_row);
    }

    public void init_table_resultado()/*TABLA 3 DE RESULTADOS*/{
        TableLayout table_1 = (TableLayout) findViewById(R.id.table_resultado);
        TableRow table_row = new TableRow(this);
        table_row.setWeightSum(3);

        int longitud=N1_total+N2_total;
        int vocabulario=total_n1+total_n2;
        int volumen=longitud*log2(vocabulario);
        int dificultad=(total_n1/2)*(N2_total/total_n2);
        int nivel=1/dificultad;
        int esfuerzo=dificultad*volumen;
        int tiempo=esfuerzo/18;
        int bugs=(esfuerzo*((esfuerzo*2)/3))/3000;

        TableRow.LayoutParams tableRowparam = new TableRow.LayoutParams();
        tableRowparam.weight=1f;
        TextView table_info_1 = new TextView(this);
        table_info_1.setText("Longitud [L]");
        table_info_1.setGravity(Gravity.CENTER);
        table_info_1.setLayoutParams(tableRowparam);
        table_row.addView(table_info_1);

        TextView table_info_2 = new TextView(this);
        table_info_2.setText(""+longitud);
        table_info_2.setGravity(Gravity.CENTER);
        table_info_2.setLayoutParams(tableRowparam);
        table_row.addView(table_info_2);

        table_1.addView(table_row); /* LONGITUD */

        table_info_1.setText("Vocabulario [B]");
        table_row.addView(table_info_1);

        table_info_2.setText(""+vocabulario);
        table_row.addView(table_info_2);

        table_1.addView(table_row); /* VOCABULARIO */

        table_info_1.setText("Volumen [B]");
        table_row.addView(table_info_1);

        table_info_2.setText(""+volumen);
        table_row.addView(table_info_2);

        table_1.addView(table_row); /* VOLUMEN */

        table_info_1.setText("dificultad [B]");
        table_row.addView(table_info_1);

        table_info_2.setText(""+dificultad);
        table_row.addView(table_info_2);

        table_1.addView(table_row); /* DIFICULTAD */

        table_info_1.setText("nivel [B]");
        table_row.addView(table_info_1);

        table_info_2.setText(""+nivel);
        table_row.addView(table_info_2);

        table_1.addView(table_row); /* NIVEL */

        table_info_1.setText("esfuerzo [B]");
        table_row.addView(table_info_1);

        table_info_2.setText(""+esfuerzo);
        table_row.addView(table_info_2);

        table_1.addView(table_row); /* ESFUERZO */

        table_info_1.setText("tiempo [B]");
        table_row.addView(table_info_1);

        table_info_2.setText(""+tiempo);
        table_row.addView(table_info_2);

        table_1.addView(table_row); /* TIEMPO */

        table_info_1.setText("bugs [B]");
        table_row.addView(table_info_1);

        table_info_2.setText(""+bugs);
        table_row.addView(table_info_2);

        table_1.addView(table_row); /* BUGS */
    }

    public static int log2(int N) {
        int result = (int)(Math.log(N) / Math.log(2));

        return result;
    }

}