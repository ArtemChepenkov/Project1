package ru.samsung.lesson12032021;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

public class DrawView extends View {
    public DrawView(Context context) {
        super(context);
    }

    Paint paint = new Paint();

    static long nFib(int n) {
        if (n == 0 || n == 1)
            return 1;// Условие завершения рекурсии – «заглушка»
        return nFib(n - 1) + nFib(n - 2);//возвращаем сумму предыдущих чисел
    }

    @Override
    protected void onDraw(Canvas canvas) {
        paint.setColor(Color.BLUE);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(10.f);
        canvas.drawCircle(canvas.getWidth()/2,
                canvas.getHeight()/2,
                100,paint);
        paint.setTextSize(100);
        canvas.drawText(""+nFib(10),10,100,paint);
    }
}
