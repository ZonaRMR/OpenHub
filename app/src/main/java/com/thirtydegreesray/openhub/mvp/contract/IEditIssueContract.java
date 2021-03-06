

package com.thirtydegreesray.openhub.mvp.contract;

import android.support.annotation.NonNull;

import com.thirtydegreesray.openhub.mvp.contract.base.IBaseContract;
import com.thirtydegreesray.openhub.mvp.model.Issue;

/**
 * Created by ThirtyDegreesRay on 2017/10/14 16:48:20
 */

public interface IEditIssueContract {

    interface View extends IBaseContract.View{
        void showNewIssue(@NonNull Issue issue);
    }

    interface Presenter extends IBaseContract.Presenter<IEditIssueContract.View>{
        void commitIssue(@NonNull String title, @NonNull String comment);
    }

}
