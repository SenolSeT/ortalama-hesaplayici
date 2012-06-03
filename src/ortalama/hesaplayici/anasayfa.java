package ortalama.hesaplayici;

import android.app.Activity;
import android.app.Dialog;
import android.graphics.Color;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

public class anasayfa extends Activity {
	private Boolean zayifnot = false;
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.anasayfa);
        
        // "derssaati" isimli EditText araçları tanımlanıyor
        final EditText[] derssaati = new EditText[20];
        derssaati[0] = (EditText)findViewById(R.id.derssaati1);
        derssaati[1] = (EditText)findViewById(R.id.derssaati2);
        derssaati[2] = (EditText)findViewById(R.id.derssaati3);
        derssaati[3] = (EditText)findViewById(R.id.derssaati4);
        derssaati[4] = (EditText)findViewById(R.id.derssaati5);
        derssaati[5] = (EditText)findViewById(R.id.derssaati6);
        derssaati[6] = (EditText)findViewById(R.id.derssaati7);
        derssaati[7] = (EditText)findViewById(R.id.derssaati8);
        derssaati[8] = (EditText)findViewById(R.id.derssaati9);
        derssaati[9] = (EditText)findViewById(R.id.derssaati10);
        derssaati[10] = (EditText)findViewById(R.id.derssaati11);
        derssaati[11] = (EditText)findViewById(R.id.derssaati12);
        derssaati[12] = (EditText)findViewById(R.id.derssaati13);
        derssaati[13] = (EditText)findViewById(R.id.derssaati14);
        derssaati[14] = (EditText)findViewById(R.id.derssaati15);
        derssaati[15] = (EditText)findViewById(R.id.derssaati16);
        derssaati[16] = (EditText)findViewById(R.id.derssaati17);
        derssaati[17] = (EditText)findViewById(R.id.derssaati18);
        derssaati[18] = (EditText)findViewById(R.id.derssaati19);
        derssaati[19] = (EditText)findViewById(R.id.derssaati20);
        
        // "dersnotu" isimli EditText araçları tanımlanıyor
        final EditText[] dersnotu = new EditText[20];
        dersnotu[0] = (EditText)findViewById(R.id.dersnotu1);
        dersnotu[1] = (EditText)findViewById(R.id.dersnotu2);
        dersnotu[2] = (EditText)findViewById(R.id.dersnotu3);
        dersnotu[3] = (EditText)findViewById(R.id.dersnotu4);
        dersnotu[4] = (EditText)findViewById(R.id.dersnotu5);
        dersnotu[5] = (EditText)findViewById(R.id.dersnotu6);
        dersnotu[6] = (EditText)findViewById(R.id.dersnotu7);
        dersnotu[7] = (EditText)findViewById(R.id.dersnotu8);
        dersnotu[8] = (EditText)findViewById(R.id.dersnotu9);
        dersnotu[9] = (EditText)findViewById(R.id.dersnotu10);
        dersnotu[10] = (EditText)findViewById(R.id.dersnotu11);
        dersnotu[11] = (EditText)findViewById(R.id.dersnotu12);
        dersnotu[12] = (EditText)findViewById(R.id.dersnotu13);
        dersnotu[13] = (EditText)findViewById(R.id.dersnotu14);
        dersnotu[14] = (EditText)findViewById(R.id.dersnotu15);
        dersnotu[15] = (EditText)findViewById(R.id.dersnotu16);
        dersnotu[16] = (EditText)findViewById(R.id.dersnotu17);
        dersnotu[17] = (EditText)findViewById(R.id.dersnotu18);
        dersnotu[18] = (EditText)findViewById(R.id.dersnotu19);
        dersnotu[19] = (EditText)findViewById(R.id.dersnotu20);
        
        // Düğmeler ve sonuç ekranı tanımlanıyor
        Button hesapla = (Button) findViewById(R.id.hesapla);
		Button temizle = (Button) findViewById(R.id.temizle);
        final TextView ortalama = (TextView) findViewById(R.id.ortalama);
        final TextView belge = (TextView) findViewById(R.id.belge);
        
		// Spinner araçları tanımlanıyor
        final Spinner[] derssec = new Spinner[20];
        derssec[0] = (Spinner) findViewById(R.id.derssec1);
        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(
                this, R.array.derslistesi, android.R.layout.simple_spinner_item);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        derssec[0].setAdapter(adapter1);
        
        derssec[1] = (Spinner) findViewById(R.id.derssec2);
        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(
                this, R.array.derslistesi, android.R.layout.simple_spinner_item);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        derssec[1].setAdapter(adapter2);
        
        derssec[2] = (Spinner) findViewById(R.id.derssec3);
        ArrayAdapter<CharSequence> adapter3 = ArrayAdapter.createFromResource(
                this, R.array.derslistesi, android.R.layout.simple_spinner_item);
        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        derssec[2].setAdapter(adapter3);
        
        derssec[3] = (Spinner) findViewById(R.id.derssec4);
        ArrayAdapter<CharSequence> adapter4 = ArrayAdapter.createFromResource(
                this, R.array.derslistesi, android.R.layout.simple_spinner_item);
        adapter4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        derssec[3].setAdapter(adapter4);
		
        derssec[4] = (Spinner) findViewById(R.id.derssec5);
        ArrayAdapter<CharSequence> adapter5 = ArrayAdapter.createFromResource(
                this, R.array.derslistesi, android.R.layout.simple_spinner_item);
        adapter5.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        derssec[4].setAdapter(adapter5);
        
        derssec[5] = (Spinner) findViewById(R.id.derssec6);
        ArrayAdapter<CharSequence> adapter6 = ArrayAdapter.createFromResource(
                this, R.array.derslistesi, android.R.layout.simple_spinner_item);
        adapter6.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        derssec[5].setAdapter(adapter6);
        
        derssec[6] = (Spinner) findViewById(R.id.derssec7);
        ArrayAdapter<CharSequence> adapter7 = ArrayAdapter.createFromResource(
                this, R.array.derslistesi, android.R.layout.simple_spinner_item);
        adapter7.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        derssec[6].setAdapter(adapter7);
        
        derssec[7] = (Spinner) findViewById(R.id.derssec8);
        ArrayAdapter<CharSequence> adapter8 = ArrayAdapter.createFromResource(
                this, R.array.derslistesi, android.R.layout.simple_spinner_item);
        adapter8.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        derssec[7].setAdapter(adapter8);
        
        derssec[8] = (Spinner) findViewById(R.id.derssec9);
        ArrayAdapter<CharSequence> adapter9 = ArrayAdapter.createFromResource(
                this, R.array.derslistesi, android.R.layout.simple_spinner_item);
        adapter9.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        derssec[8].setAdapter(adapter9);
        
        derssec[9] = (Spinner) findViewById(R.id.derssec10);
        ArrayAdapter<CharSequence> adapter10 = ArrayAdapter.createFromResource(
                this, R.array.derslistesi, android.R.layout.simple_spinner_item);
        adapter10.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        derssec[9].setAdapter(adapter10);
        
        derssec[10] = (Spinner) findViewById(R.id.derssec11);
        ArrayAdapter<CharSequence> adapter11 = ArrayAdapter.createFromResource(
                this, R.array.derslistesi, android.R.layout.simple_spinner_item);
        adapter11.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        derssec[10].setAdapter(adapter11);
        
        derssec[11] = (Spinner) findViewById(R.id.derssec12);
        ArrayAdapter<CharSequence> adapter12 = ArrayAdapter.createFromResource(
                this, R.array.derslistesi, android.R.layout.simple_spinner_item);
        adapter12.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        derssec[11].setAdapter(adapter12);
        
        derssec[12] = (Spinner) findViewById(R.id.derssec13);
        ArrayAdapter<CharSequence> adapter13 = ArrayAdapter.createFromResource(
                this, R.array.derslistesi, android.R.layout.simple_spinner_item);
        adapter13.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        derssec[12].setAdapter(adapter13);
        
        derssec[13] = (Spinner) findViewById(R.id.derssec14);
        ArrayAdapter<CharSequence> adapter14 = ArrayAdapter.createFromResource(
                this, R.array.derslistesi, android.R.layout.simple_spinner_item);
        adapter14.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        derssec[13].setAdapter(adapter14);
        
        derssec[14] = (Spinner) findViewById(R.id.derssec15);
        ArrayAdapter<CharSequence> adapter15 = ArrayAdapter.createFromResource(
                this, R.array.derslistesi, android.R.layout.simple_spinner_item);
        adapter15.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        derssec[14].setAdapter(adapter15);
        
        derssec[15] = (Spinner) findViewById(R.id.derssec16);
        ArrayAdapter<CharSequence> adapter16 = ArrayAdapter.createFromResource(
                this, R.array.derslistesi, android.R.layout.simple_spinner_item);
        adapter16.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        derssec[15].setAdapter(adapter16);
        
        derssec[16] = (Spinner) findViewById(R.id.derssec17);
        ArrayAdapter<CharSequence> adapter17 = ArrayAdapter.createFromResource(
                this, R.array.derslistesi, android.R.layout.simple_spinner_item);
        adapter17.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        derssec[16].setAdapter(adapter17);
        
        derssec[17] = (Spinner) findViewById(R.id.derssec18);
        ArrayAdapter<CharSequence> adapter18 = ArrayAdapter.createFromResource(
                this, R.array.derslistesi, android.R.layout.simple_spinner_item);
        adapter18.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        derssec[17].setAdapter(adapter18);
        
        derssec[18] = (Spinner) findViewById(R.id.derssec19);
        ArrayAdapter<CharSequence> adapter19 = ArrayAdapter.createFromResource(
                this, R.array.derslistesi, android.R.layout.simple_spinner_item);
        adapter19.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        derssec[18].setAdapter(adapter19);
        
        derssec[19] = (Spinner) findViewById(R.id.derssec20);
        ArrayAdapter<CharSequence> adapter20 = ArrayAdapter.createFromResource(
                this, R.array.derslistesi, android.R.layout.simple_spinner_item);
        adapter20.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        derssec[19].setAdapter(adapter20);
        
        // "hesapla" isimli butonun görevi tanımlanıyor
        hesapla.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				for (int i = 0; i < dersnotu.length; i++) {
					derssaati[i].clearFocus();
					dersnotu[i].clearFocus();
					if (dersnotu[i].getText().toString().equals("") || derssaati[i].getText().toString().equals("")) {
						dersnotu[i].setText("0");
						derssaati[i].setText("0");
					}
					else {
						if (Double.parseDouble(dersnotu[i].getText().toString()) <= 44)
						zayifnot = true;
					}
					
					if (Double.parseDouble(dersnotu[i].getText().toString()) > 100 || Double.parseDouble(dersnotu[i].getText().toString()) < 0) {
						ortalama.setTextColor(Color.parseColor("#FF0000"));
						ortalama.setText(R.string.hata);
						belge.setText(R.string.hata_metni);
						return;
					}
				}
				
				double derssayisi = (new Double(derssaati[0].getText().toString()) + new Double(derssaati[1].getText().toString()) + new Double(derssaati[2].getText().toString()) + new Double(derssaati[3].getText().toString()) + new Double(derssaati[4].getText().toString()) + new Double(derssaati[5].getText().toString()) + new Double(derssaati[6].getText().toString()) + new Double(derssaati[7].getText().toString()) + new Double(derssaati[8].getText().toString()) + new Double(derssaati[9].getText().toString()) + new Double(derssaati[10].getText().toString()) + new Double(derssaati[11].getText().toString()) + new Double(derssaati[12].getText().toString()) + new Double(derssaati[13].getText().toString()) + new Double(derssaati[14].getText().toString()) + new Double(derssaati[15].getText().toString()) + new Double(derssaati[16].getText().toString()) + new Double(derssaati[17].getText().toString()) + new Double(derssaati[18].getText().toString()) + new Double(derssaati[19].getText().toString()));
				double hesap = (new Double(derssaati[0].getText().toString()) * new Double(dersnotu[0].getText().toString()) + new Double(derssaati[1].getText().toString()) * new Double(dersnotu[1].getText().toString()) + new Double(derssaati[2].getText().toString()) * new Double(dersnotu[2].getText().toString()) + new Double(derssaati[3].getText().toString()) * new Double(dersnotu[3].getText().toString()) + new Double(derssaati[4].getText().toString()) * new Double(dersnotu[4].getText().toString()) + new Double(derssaati[5].getText().toString())  * new Double(dersnotu[5].getText().toString()) + new Double(derssaati[6].getText().toString()) * new Double(dersnotu[6].getText().toString()) + new Double(derssaati[7].getText().toString()) * new Double(dersnotu[7].getText().toString()) + new Double(derssaati[8].getText().toString()) * new Double(dersnotu[8].getText().toString()) + new Double(derssaati[9].getText().toString()) * new Double(dersnotu[9].getText().toString()) + new Double(derssaati[10].getText().toString()) * new Double(dersnotu[10].getText().toString()) + new Double(derssaati[11].getText().toString()) * new Double(dersnotu[11].getText().toString()) + new Double(derssaati[12].getText().toString()) * new Double(dersnotu[12].getText().toString()) + new Double(derssaati[13].getText().toString()) * new Double(dersnotu[13].getText().toString()) + new Double(derssaati[14].getText().toString()) * new Double(dersnotu[14].getText().toString()) + new Double(derssaati[15].getText().toString()) * new Double(dersnotu[15].getText().toString()) + new Double(derssaati[16].getText().toString()) * new Double(dersnotu[16].getText().toString()) + new Double(derssaati[17].getText().toString()) * new Double(dersnotu[17].getText().toString()) + new Double(derssaati[18].getText().toString()) * new Double(dersnotu[18].getText().toString()) + new Double(derssaati[19].getText().toString()) * new Double(dersnotu[19].getText().toString())) / derssayisi;
				ortalama.setText(Double.toString(hesap));
				
				if (!zayifnot && hesap >= 85) {
					ortalama.setTextColor(Color.parseColor("#19FC00"));
                	belge.setText(R.string.takdir);
                }
                else if (!zayifnot && hesap >= 70 && hesap < 85)  {
                	ortalama.setTextColor(Color.parseColor("#CDFF00"));
                	belge.setText(R.string.tesekkur);
                }
                else {
                	ortalama.setTextColor(Color.parseColor("#FF4D00"));
                	if (hesap >= 70 && zayifnot) {
                		belge.setText(R.string.zayifnot);
                    }
                	else {
                		belge.setText(R.string.belgeyok);
                	}
                }
			}
		});        
        // "temizle" isimli butonun görevi tanımlanıyor
        temizle.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				for (int i = 0; i < dersnotu.length; i++) {
					derssaati[i].clearFocus();
					dersnotu[i].clearFocus();
					dersnotu[i].setText("");
					derssaati[i].setText("");
					derssec[i].setSelection(0);
					ortalama.setText("");
					belge.setText("");
				}				
			}
		});
    }
    // Menu tanımlanıyor
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
        case R.id.hakkinda:
        	Dialog hakkinda = new Dialog(anasayfa.this);
        	hakkinda.setContentView(R.layout.hakkinda);
        	hakkinda.setTitle(R.string.hakkinda_basligi);
        	TextView yazi = (TextView) hakkinda.findViewById(R.id.yazi);
        	yazi.setMovementMethod(LinkMovementMethod.getInstance());
        	yazi.setText(R.string.hakkinda_metni);
        	TextView link = (TextView) hakkinda.findViewById(R.id.link);
        	link.setText(R.string.link);
        	ImageView simge = (ImageView) hakkinda.findViewById(R.id.simge);
        	simge.setImageResource(R.drawable.simge);
        	hakkinda.show();
            return true;
        case R.id.cikis:
        	int pid = android.os.Process.myPid(); 
        	android.os.Process.killProcess(pid);
        	return true;
        default:
            return super.onOptionsItemSelected(item);
        }
    }
}