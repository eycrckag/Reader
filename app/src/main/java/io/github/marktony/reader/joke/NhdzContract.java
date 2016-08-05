package io.github.marktony.reader.joke;

import java.util.ArrayList;

import io.github.marktony.reader.BasePresenter;
import io.github.marktony.reader.BaseView;
import io.github.marktony.reader.data.NhdzArticle;

/**
 * Created by Lizhaotailang on 2016/8/5.
 */

public interface NhdzContract {

    interface View extends BaseView<NhdzContract.Presenter> {
        void showArticle(ArrayList<NhdzArticle> articleList);
    }

    interface Presenter extends BasePresenter {

        void loadArticle(Boolean forceRefresh);

        void loadMore();
    }

}
