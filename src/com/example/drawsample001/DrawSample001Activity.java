package com.example.drawsample001;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;

public class DrawSample001Activity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
		// �N���X�̃C���X�^���X�𐶐�
		MyView mView = new MyView( this );

		// View�ɐݒ�
		setContentView( mView );
	}
}

/**
 * �`��p�̃N���X�B
 */
class MyView extends View {

	/**
	 * �R���X�g���N�^�B
	 * @param context �R���e�L�X�g
	 */
	public MyView( Context context ) {
		super( context );
		setFocusable( true );
	}

	/**
	 * �`�揈�����s���B
	 */
	@Override
	protected void onDraw( Canvas canvas ) {
		super.onDraw( canvas );

		// �w�i�F��ݒ�
		canvas.drawColor( Color.BLUE );

		// �`�悷�邽�߂̐�̐F��ݒ�
		Paint mPaint = new Paint();
		mPaint.setStyle( Paint.Style.FILL );
		mPaint.setARGB( 255, 255, 255, 100 );

		// ��ŕ`��
		canvas.drawLine( 0, 0, 50, 50, mPaint );
	}
}