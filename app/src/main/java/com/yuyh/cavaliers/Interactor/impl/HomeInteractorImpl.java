package com.yuyh.cavaliers.Interactor.impl;

import android.content.Context;

import com.yuyh.cavaliers.Interactor.HomeInteractor;
import com.yuyh.cavaliers.R;
import com.yuyh.cavaliers.base.BaseLazyFragment;
import com.yuyh.cavaliers.bean.NavigationEntity;
import com.yuyh.cavaliers.ui.fragment.NBANewsFragment;
import com.yuyh.cavaliers.ui.fragment.NBAScheduleFragment;
import com.yuyh.cavaliers.ui.fragment.NBAStatsRankFragment;
import com.yuyh.cavaliers.ui.fragment.NBATeamSortFragment;

import java.util.ArrayList;
import java.util.List;

public class HomeInteractorImpl implements HomeInteractor {

    @Override
    public List<BaseLazyFragment> getPagerFragments() {
        List<BaseLazyFragment> fragments = new ArrayList<BaseLazyFragment>() {{
            add(new NBANewsFragment());
            add(new NBAScheduleFragment());
            add(new NBATeamSortFragment());
            add(new NBAStatsRankFragment());
            add(new NBANewsFragment());
            add(new NBANewsFragment());
        }};

        return fragments;
    }

    @Override
    public List<NavigationEntity> getNavigationList(Context context) {
        List<NavigationEntity> navigationEntities = new ArrayList<NavigationEntity>() {{
            add(new NavigationEntity(R.drawable.ic_news, "头条新闻"));
            add(new NavigationEntity(R.drawable.ic_games, "赛事直播"));
            add(new NavigationEntity(R.drawable.ic_format, "球队排行"));
            add(new NavigationEntity(R.drawable.ic_format, "数据排行"));
            add(new NavigationEntity(R.drawable.ic_favorite, "骑士专区"));
            add(new NavigationEntity(R.drawable.ic_other, "其他"));
        }};
        return navigationEntities;
    }
}
