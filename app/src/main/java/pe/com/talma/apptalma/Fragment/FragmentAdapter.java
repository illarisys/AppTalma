package pe.com.talma.apptalma.Fragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class FragmentAdapter extends FragmentPagerAdapter{

    public FragmentAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                    return  Fragment1.newInstance("Fragment_1");
            case 1:
                return  Fragment2.newInstance("Fragment_2");
            default:
                return  Fragment1.newInstance("Fragment");
        }
    }

    @Override
    public int getCount() {
        return 2;//tengo 2
    }
}
