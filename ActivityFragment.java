

//No XML: Remova o "onClick" do botão e adicione um ID para ele.

//No Fragment, faça:




@Override
public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
    final View view = inflater.inflate(R.layout.fragment, container, false);

    Button btn = view.findViewById(R.id.id_btn);

     /*
     * Define a ação do Botão, é o mesmo que você está fazendo através do 
     * onClick no XML.
     */
    btn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            FragmentActivity act = getActivity();

            if (act != null) {
                startActivity(new Intent(act, OutraActivity.class));
            }
        }
    });

    return view;
}
