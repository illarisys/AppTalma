package pe.com.talma.apptalma;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import pe.com.talma.apptalma.Fragment.FragmentAdapter;

public class TabLayoutActivity extends AppCompatActivity {

    ViewPager viewPager;
    FragmentAdapter fragmentAdapter;
    TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab_layout);

        viewPager = findViewById(R.id.vpFragment);
        tabLayout = findViewById(R.id.tabs);
        iniUI();
    }

    //drawable, new vector asset
    private void iniUI(){
        fragmentAdapter = new FragmentAdapter(getSupportFragmentManager());
        viewPager.setAdapter(fragmentAdapter);
        int pageCount = fragmentAdapter.getCount();

        viewPager.setOffscreenPageLimit(pageCount);

        TabLayout.TabLayoutOnPageChangeListener changeListener = new TabLayout.TabLayoutOnPageChangeListener(tabLayout);

        TabLayout.Tab tab1 = tabLayout.newTab();
        tab1.setText(R.string.name1);
        tabLayout.addTab(tab1);
        TabLayout.Tab tab2 = tabLayout.newTab();
        tab2.setText(R.string.name2);
        //tab2.setIcon(R.drawable.ic_);
        tabLayout.addTab(tab2);

        viewPager.addOnPageChangeListener(changeListener);
        tabLayout.addOnTabSelectedListener(new TabLayout.ViewPagerOnTabSelectedListener(viewPager));
    }
}
