package com.mars.itech.alphai_fitness.Adapter_Class;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.mars.itech.alphai_fitness.feed_fragment.Human_Health_Fragment;
import com.mars.itech.alphai_fitness.feed_fragment.Meal_Paln_Fragment;
import com.mars.itech.alphai_fitness.feed_fragment.Workouts_Feed_Fragment;
import com.mars.itech.alphai_fitness.shop_fragments.Equipment;
import com.mars.itech.alphai_fitness.shop_fragments.Sportswear;
import com.mars.itech.alphai_fitness.shop_fragments.Supplement;

public class Tab_Adapter_ViewPager2 extends FragmentStateAdapter
{


    public Tab_Adapter_ViewPager2(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position)
    {
        switch (position) {

            case 0:
                return new Workouts_Feed_Fragment();
            case 1:
                return new Meal_Paln_Fragment();
            default:
                return new Human_Health_Fragment();


        }
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
