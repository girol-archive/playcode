public class MainActivity extends AppCompatActivity {

	Calculadora calc = new Calculadora();
	
	Button btSomar;
	EditText etxtN1, etxtN2;
	TextView txvResultado;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		btSomar = (Button) findViewById(R.id.btSomar);
		txvResultado = (TextView) findViewById(R.id.txvResultado);
		etxtN1 = (EditText) findViewById(R.id.etxtN1);
		etxtN2 = (EditText) findViewById(R.id.etxtN2);

		btSomar.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				calc.n1 = Integer.parseInt(etxtN1.getText().toString());
				calc.n2 = Integer.parseInt(etxtN2.getText().toString());
				txvResultado.setText("O resultado da soma é "+calc.somar());
			}
		});
	} 
}