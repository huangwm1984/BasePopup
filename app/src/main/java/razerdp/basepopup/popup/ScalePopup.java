package razerdp.basepopup.popup;

import android.animation.Animator;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import com.nineoldandroids.view.ViewHelper;
import razerdp.basepopup.R;
import razerdp.basepopup.base.BasePopupWindow;
import razerdp.basepopup.utils.ToastUtils;

/**
 * Created by 大灯泡 on 2016/1/15.
 * 普通的popup
 */
public class ScalePopup extends BasePopupWindow implements View.OnClickListener{

    private View popupView;

    public ScalePopup(Activity context) {
        super(context);
        bindEvent();
    }



    @Override
    protected Animation getAnimation() {
        return getDefaultScaleAnimation();
    }

    @Override
    protected Animator getAnimator() {
        return null;
    }

    @Override
    protected View getInputView() {
        return null;
    }

    @Override
    protected View getDismissView() {
        return popupView.findViewById(R.id.click_to_dismiss);
    }

    @Override
    public View getPopupView() {
        popupView= LayoutInflater.from(mContext).inflate(R.layout.popup_normal,null);
        return popupView;
    }

    @Override
    public View getAnimaView() {
        return popupView.findViewById(R.id.popup_anima);
    }

    private void bindEvent() {
        if (popupView!=null){
            popupView.findViewById(R.id.tx_1).setOnClickListener(this);
            popupView.findViewById(R.id.tx_2).setOnClickListener(this);
            popupView.findViewById(R.id.tx_3).setOnClickListener(this);
        }

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.tx_1:
                ToastUtils.ToastMessage(mContext,"click tx_1");
                break;
            case R.id.tx_2:
                ToastUtils.ToastMessage(mContext,"click tx_2");
                break;
            case R.id.tx_3:
                ToastUtils.ToastMessage(mContext,"click tx_3");
                break;
            default:
                break;
        }

    }
}
