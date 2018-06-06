package pe.com.talma.apptalma.Fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import pe.com.talma.apptalma.R;

public class Fragment2 extends Fragment{


    private static final String Param2 = "parametro2";

    private String mParam2;
    private View view;

    public static Fragment1 newInstance(String param2){
        Fragment1 fragment1 = new Fragment1();
        Bundle arg = new Bundle();
        arg.putString(Param2, param2);
        fragment1.setArguments(arg);
        return fragment1;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //return super.onCreateView(inflater, container, savedInstanceState);
        view = inflater.inflate(R.layout.layout_fragment2, container, false);
        return view;
    }
}
