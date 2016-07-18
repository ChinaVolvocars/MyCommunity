package com.xylife.community.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.xylife.community.R;
import com.xylife.community.base.BaseActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by SK on 2016-05-27.
 */
public class UserInfoActivity extends BaseActivity {

    @BindView(R.id.back_img)
    ImageView backImg;
    @BindView(R.id.title_text)
    TextView titleText;
    @BindView(R.id.right_img)
    ImageView rightImg;
    @BindView(R.id.title_bar_view)
    RelativeLayout titleBarView;
    @BindView(R.id.avatar_image)
    ImageView avatarImage;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_user_info;
    }

    @Override
    public void initView() {
        mTitleText.setText("资料修改");
    }

    @Override
    public void initData() {

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);
    }

    @OnClick({R.id.back_img, R.id.title_text, R.id.right_img, R.id.title_bar_view, R.id.avatar_image})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.back_img:
                break;
            case R.id.title_text:
                break;
            case R.id.right_img:
                break;
            case R.id.title_bar_view:
                break;
            case R.id.avatar_image:
                break;
        }
    }
}
