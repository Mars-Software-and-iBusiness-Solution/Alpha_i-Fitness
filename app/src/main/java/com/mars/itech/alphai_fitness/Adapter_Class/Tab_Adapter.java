package com.mars.itech.alphai_fitness.Adapter_Class;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.mars.itech.alphai_fitness.Home_Directory.Shops_iFit;
import com.mars.itech.alphai_fitness.feed_fragment.Human_Health_Fragment;
import com.mars.itech.alphai_fitness.feed_fragment.Meal_Paln_Fragment;
import com.mars.itech.alphai_fitness.feed_fragment.Workouts_Feed_Fragment;
import com.mars.itech.alphai_fitness.shop_fragments.Equipment;
import com.mars.itech.alphai_fitness.shop_fragments.Sportswear;
import com.mars.itech.alphai_fitness.shop_fragments.Supplement;

import java.util.ArrayList;

public class Tab_Adapter extends FragmentStateAdapter {

    public Tab_Adapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position)
    {
        switch (position) {

            case 0:
                return new Supplement();
            case 1:
                return new Sportswear();
            default:
                return new Equipment();


        }
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
